package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import utilities.ApiUtils;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PATCH_REQUEST {
    public static RequestSpecification spec;

    Response response;

    @Given("User sets Patch the necessary {string} {string} path param")
    public void user_sets_patch_the_necessary_path_param(String param1, String param2) {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
        spec.pathParams("get1",ConfigReader.getProperty(param1),"get2",ConfigReader.getProperty(param2));
    }
    @Then("User sends Patch request and gets response")
    public void user_sends_patch_request_and_gets_response() {
        /*
        {
  "name": "nevzat",
  "email": "d@d.com",
  "address": "11",
  "phone": "ullam",
  "city": "labore",
  "state": "omnis",
  "country": "unde",
  "postal_code": "saepe",
  "address_type":"11"

}
         */
        JSONObject json=new JSONObject();
        json.put("name","nevzat");
        json.put("email","d@d.com");
        json.put("address","11");
        json.put("phone","ullam");
        json.put("city","labore");
        json.put("state","omnis");
        json.put("country","unde");
        json.put("postal_code","saepe");
        json.put("address_type","11");

        String token= ApiUtils.generateToken();
        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
               patch("{get1}/{get2}");
        response.prettyPrint();

    }
    @Then("User Verifies Patch user status is {string}")
    public void user_verifies_patch_user_status_is(String status) {
        response.then().assertThat().statusCode(Integer.parseInt(status));
    }
    @Then("User Verifies Patch returned {string} {string} response body")
    public void user_verifies_patch_returned_response_body(String message, String messageInformation) {
        response.then().assertThat().body(message,equalTo(messageInformation));
    }
}
