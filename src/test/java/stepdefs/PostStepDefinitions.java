package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class PostStepDefinitions {
    private final World world;
    private String uri;
    private RequestSpecification request;
    private Response response;


    public PostStepDefinitions(World world) {
        this.world = world;
    }

    @Given("^I have an end point posts$")
    public void iHaveAnEndPointPosts() {
        uri = String.format("%s/%s", world.url, "posts");
        request = given();
    }

    @When("^I request list of Posts$")
    public void irequestlistofPosts() {

        response = request
                .get(uri);
        world.response = response;
    }

//    @When("^I post with title \"([^\"]*)\" and body \"([^\"]*)\"$")
//    public void iPostWithTitleAndBody(String title, String body) {
//        Post newPost = new Post(title, body);
//        world.response = given().
//                contentType(ContentType.JSON)
//                .body(newPost.toStringJson())
//                .when()
//                .get(uri);
//        ;
//    }

}
