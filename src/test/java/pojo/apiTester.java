package pojo;

import groovy.json.JsonSlurper;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class apiTester {
    private ValidatableResponse json;

    @Test
    void playWithAPI() {
        String resp;
        String baseDir = System.getProperty("user.dir");
        String testResource = "src/test/resources/";
        String file = baseDir+"/"+testResource+"reststubs/rest2.json";
        System.out.println("file  path is = " + file);


        //String file = baseDir+"/"+testResource+"mappings/rest1.json";
        try {
            Stream<String> stream = Files.lines(Paths.get(file));
            //stream.forEach(s-> System.out.println(s));

            resp = new String(Files.readAllBytes(Paths.get(file)));
            System.out.println("data from file " + resp);

            String collect = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8).stream().collect(Collectors.joining(" "));

            JsonPath js = new JsonPath(resp);
            String jsonValue = js.getString("address");
            System.out.println("hv1 " + jsonValue);
System.exit(0);

            JsonSlurper jsp =  new JsonSlurper();
            Object parse = jsp.parse(collect.getBytes(StandardCharsets.UTF_8), "UTF-8");
            Map m = (Map) parse;
            String s = (String) m.get("name");
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }

        defaultParser = Parser.JSON;



System.exit(0);

        //String sRes = given().get().asString();
        //String sRes = given().baseUri("http://localhost:8089").basePath("/api/mytest").get().asString();
        //System.out.println(sRes);

        Response res =  given()
                .when().get("https://jsonplaceholder.typicode.com/posts");
        //System.out.println(res.asString());

        json = res.then();

        json.body("id[1]", equalTo(2));
        json.body("title[1]",equalTo("qui est esse"));
        //json.body("body[1]",contains("est rerum tempore vitae"));

        JsonPath jsonPathEvaluator = res.jsonPath();
        String s = jsonPathEvaluator.get("body[0]");
        s = jsonPathEvaluator.get("title[2]");
        List<String> ls = jsonPathEvaluator.get();
        System.out.println(ls);

//        verify(getRequestedFor(urlPathEqualTo("/"))
//                .withHeader("content-Type",equalTo("text/xml"))
//                .withRequestBody(matching(".*"))
//        );

        //verify(getRequestedFor(anyUrl()));

        //verify(getRequestedFor(anyUrl()).withRequestBody(matching("hello")));
        //verify(lessThan(5), getRequestedFor(urlEqualTo("/api/mytest")));


    }

}
