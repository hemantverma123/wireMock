package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class ResponseStepDefinitions {
    private final World world;
    private ValidatableResponse json;

    public ResponseStepDefinitions(World world) {
        this.world = world;
        json = world.response.then();
    }

    @Then("the status code is (\\d+)")
    public void verify_status_code(int statusCode) {
        json.statusCode(statusCode);
    }

    @And("response includes the following$")
    public void response_equals(Map<String, String> responseFields) {
        for (Map.Entry<String, String> field : responseFields.entrySet()) {
            if (StringUtils.isNumeric(field.getValue())) {
                json.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
            } else {
                System.out.println(field.getKey() + "hv" + field.getValue());
                json.body(field.getKey(), equalTo(field.getValue()));

            }
        }
    }

    @And("^response includes username \"([^\"]*)\" and name \"([^\"]*)\" fields$")
    public void responseIncludesUsernameAndNameFields(String username, String name) {
        json = world.response.then()
                .statusCode(Integer.parseInt("200"));
        json.assertThat().body("username[0]", equalTo(username));
        json.assertThat().body("name[0]", equalTo(name));
    }

    @Then("^response includes below (.+) and (.+) and (.+) in the posts$")
    public void response_includes_below_and_and_in_the_posts(String id, String title, String body) {

        json.body("id[1]", equalTo(2));
        json.body("title[1]",equalTo("qui est esse"));

        System.out.println(id + "  hv-int  " + title +" " +body);
            if (StringUtils.isNumeric(id)) {
                json.body("id["+Integer.parseInt(id)+1+"]", equalTo(Integer.parseInt(id)));
            } else {
                json.body("id["+Integer.parseInt(id)+1+"]", equalTo(id));
            }

            json.body("title["+Integer.parseInt(id)+1+"]", equalTo(title));
            json.body("body["+Integer.parseInt(id)+1+"]", equalTo(body));
    }

    @Then("^I should have total comments as (\\d+)")
    public void i_should_have_total_comments_as(int count)  {
        JsonPath jsonPath = world.response.jsonPath();
        List<Integer> post_id = jsonPath.getList("id");
        System.out.println("Total comments: " + post_id.size());
        Assert.assertEquals(post_id.size(),count);
    }

}
