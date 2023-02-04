package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import pojos.LoginPojo;
import utilities.ApiUtils;
import utilities.ConfigReader;

import javax.swing.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utilities.ApiUtils.generateToken;

public class DELETE_REQUEST {
    public static RequestSpecification spec;

    Response response;

    LoginPojo loginPojo;

    @Given("User sets Delete the necessary {string} {string} path param")
    public void user_sets_delete_the_necessary_path_param(String param1, String param2) {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
        spec.pathParams("get1",ConfigReader.getProperty(param1),"get2",ConfigReader.getProperty(param2));
    }
    @Then("UserB sends Delete request and gets response")
    public void userbSendsDeleteRequestAndGetsResponse() {
        JSONObject json=new JSONObject();
        json.put("id",62);
        String token= ApiUtils.generateToken();
        response = given().
                headers("Authorization","Bearer "+ token).
                spec(spec).
                contentType(ContentType.JSON).accept("application/json").
                when().
                body(json.toString()).
                delete("{get1}/{get2}");
        response.prettyPrint();
    }
    @Then("User Verifies Delete user status is {string}")
    public void user_verifies_delete_user_status_is(String status) {
     response.then().assertThat().statusCode(Integer.parseInt(status));
    }
    @Then("UserB verifies the returned Deleted {string} {string} response body")
    public void user_b_verifies_the_returned_delete_response_body(String message,String messageInformation) {
        response.then().assertThat().body(message, equalTo(messageInformation));

    }


    @Then("UserBb sends Delete request and gets response")
    public void userbbSendsDeleteRequestAndGetsResponse() {
        JSONObject json=new JSONObject();
        json.put("id",500);
        String token= ApiUtils.generateToken();
        response = given().
                headers("Authorization","Bearer "+ token).
                spec(spec).
                contentType(ContentType.JSON).accept("application/json").
                when().
                body(json.toString()).
                delete("{get1}/{get2}");
        response.prettyPrint();
    }
//-----------------------------------------------------------ZEYNEP-----------------------------------------------------------------------//
    @Then("UserZ sends Delete request and gets response")
    public void userzSendsDeleteRequestAndGetsResponse() {

        JSONObject json=new JSONObject();
        json.put("id",190);
        json.put("type","product");
        String token= ApiUtils.generateToken();
        response = given().
                headers("Authorization","Bearer "+ token).
                spec(spec).
                contentType(ContentType.JSON).accept("application/json").
                when().
                body(json.toString()).
                delete("{get1}/{get2}");
        response.prettyPrint();
    }

    @Then("UserZe sends Delete request and gets response")
    public void userzeSendsDeleteRequestAndGetsResponse() {

        JSONObject json=new JSONObject();
        json.put("id",1900);
        json.put("type","product");
        String token= ApiUtils.generateToken();
        response = given().
                headers("Authorization","Bearer "+ token).
                spec(spec).
                contentType(ContentType.JSON).accept("application/json").
                when().
                body(json.toString()).
                delete("{get1}/{get2}");
        response.prettyPrint();
    }
}
