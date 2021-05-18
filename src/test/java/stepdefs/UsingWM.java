package stepdefs;

import com.github.tomakehurst.wiremock.WireMockServer;
import static io.restassured.RestAssured.*;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

class UsingWM {
    static WireMockServer wm;
    @BeforeEach
    void setup(){
        System.out.println("one");
        String baseDir = System.getProperty("user.dir");
        String testResource = "src/test/resources/";

        String file = baseDir+"/"+testResource+"mappings/wm_stub1.json";
        System.out.println("file  path is = " + file);
        try {
            Stream<String> stream = Files.lines(Paths.get(file));
            stream.forEach(s-> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
        }


        //wm = new WireMockServer(8089);
         //wm = new WireMockServer(wireMockConfig().port(8089));
        wm = new WireMockServer(WireMockConfiguration.options().port(8089).usingFilesUnderDirectory(testResource).usingFilesUnderClasspath(testResource).disableRequestJournal());

        wm.start();
        System.out.println("after starting the server");
    }

    @Test
    void firstWire() {
//        One o = new One();
//        o.firstWire();

        //stubFor(any(anyUrl()).willReturn(ok()));

        //        stubFor(any(anyUrl())
//                .withHeader("Content-Type",containing("json"))
//                .willReturn(ok()
//                        .withHeader("Content-Type","text/xml")
//                        .withBody("<response>SUCCESS</response>")));

        //Result result = myHttpServiceCallingObject.doSomething();

        //We all know about Google whose URL is ” https://www.google.com/“. Actually this is base URI of Google. Now append “/maps” in last of base url “https://www.google.com/” as “https://www.google.com/maps“. Google will launch Google Maps. Try same with “/news”. Google will launch Google News. Here “Maps” and “News” are actually resources which are called as base path. So to summarize, BaseURI is the address where different resources are located. A Base Path which is appended with BaseURI to locate a resource.

        System.out.println("after stub");
        baseURI = "http://localhost:8089";      //these 2 are static hence should be used same if whole url is same for all requests url = baseURI+basePath
        basePath = "/api/rest1";


        System.out.println("Stub mapping size: " + wm.getStubMappings().size());

        Response res =  given().get();
        System.out.println(res.statusCode());
        System.out.println(res.getBody());
        System.out.println(res.asString());

        System.exit(0);


        //String sRes = given().get().asString();
        String sRes = given().baseUri("http://localhost:8089").basePath("/api/mytest").get().asString();
        System.out.println(sRes);

        sRes = given().basePath("/api/mytest").baseUri("http://localhost:8089").get().asString();
        System.out.println(sRes);


       res =  given()
       .when().get("https://jsonplaceholder.typicode.com/posts");
        System.out.println(res.asString());



//        verify(getRequestedFor(urlPathEqualTo("/"))
//                .withHeader("content-Type",equalTo("text/xml"))
//                .withRequestBody(matching(".*"))
//        );

        //verify(getRequestedFor(anyUrl()));

        //verify(getRequestedFor(anyUrl()).withRequestBody(matching("hello")));
        //verify(lessThan(5), getRequestedFor(urlEqualTo("/api/mytest")));


    }
@AfterEach
void tearDown(){
     wm.stop();
    System.out.println("server stopped");
}

}