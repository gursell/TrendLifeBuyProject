package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;
import pojos.LoginPojo;
import utilities.ApiUtils;
import utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utilities.ApiUtils.generateToken;

public class POST_REQUEST {
    public static RequestSpecification spec;
    Response response;
    LoginPojo loginPojo;


    @Given("User sets Post the necessary {string} {string} path param")
    public void user_sets_post_the_necessary_path_param(String param1, String param2) {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
        spec.pathParams("get1",ConfigReader.getProperty(param1),"get2",ConfigReader.getProperty(param2));
    }

    @Then("User Verifies Post user status is {string}")
    public void user_verifies_post_user_status_is(String status) {
        response.then().assertThat().statusCode(Integer.parseInt(status));
    }
    @Then("UserG verifies the returned response body")
    public void user_g_verifies_the_returned_response_body() {
        // response.then().body("user.id", equalTo(453),
        //       "user.first_name",equalTo("testName2"));
        response.then().body("message",equalTo("Successfully logged In"));
    }

    @Then("User verifies the token response body")
    public void userVerifiesTheTokenResponseBody() {
        JsonPath json=response.jsonPath();
        // String tokendata=json.getString("token");
        // Assert.assertEquals(tokendata,json.getString("token"));
        response.then().assertThat().body("token",Matchers.anything());
        // Assert.assertNotNull(json.getString("token"));
    }

    @Then("UserZ sends Post request and gets response")
    public void userzSendsPostRequestAndGetsResponse() {

        JSONObject json=new JSONObject();
        json.put("seller_id",1);
        json.put("seller_product_id", 191);
        json.put("type","product");
        System.out.println(json);
        String token= ApiUtils.generateToken();
        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();

    }
//--------------------------------------------------BORA------------------------------------------------------------------------------------//
    @Then("UserB sends Post request and gets response")
    public void userbSendsPostRequestAndGetsResponse() {
        String token= ApiUtils.generateToken();

        JSONObject json=new JSONObject();
        json.put("name","deneme22");
        json.put("email","enim@enim.com");
        json.put("address","aut");
        json.put("phone","tempore");
        json.put("city","quisquam");
        json.put("state","est");
        json.put("country","quidem");
        json.put("postal_code","mollitia");
        json.put("address_type","11");

        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();
    }

    //--------------------------------------------------EMINE------------------------------------------------------------------------------------//
    @Then("UserE sends Post request and gets response")
    public void usereSendsPostRequestAndGetsResponse() {
        /*
          "order_id": "48221222011140",
           "reason": 3
         */
        JSONObject json=new JSONObject();
        json.put("order_id","48221222011140");
        json.put("reason",3);
        String token= ApiUtils.generateToken();
        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();
    }

//---------------------------------------------------------NEVZAT---------------------------------------------------------------------------//
    @Then("UserNN sends Post request and gets response")
    public void usernnSendsPostRequestAndGetsResponse() {

        String token= ApiUtils.generateToken();
        JSONObject json=new JSONObject();
        json.put("old_password","123123123a");
        json.put("password","123123123");
        json.put("password_confirmation","123123123");
        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();
    }

    //----------------------------------------------Nevzat(meryem)-------------------------------------------------------------------//

    @Then("UserM sends Post request and gets response")
    public void usermSendsPostRequestAndGetsResponse() {

        String token= ApiUtils.generateToken();
        JSONObject json=new JSONObject();
        /*
        {
  "first_name": "nevzat",
  "last_name": "celik",
  "email": "nevzat@nevzatt.com",
  "password": "123123123",
  "password_confirmation": "123123123",
  "user_type": "customer",
  "referral_code": "0101010101"
}
         */
        json.put("first_name","nevzat");
        json.put("last_name","celik");
        json.put("email","nevzat@nevzatttt.com");
        json.put("password","123123123");
        json.put("password_confirmation","123123123");
        json.put("user_type","customer");
        json.put("referral_code","0101010101");

        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();
    }

//---------------------------------------------------------TALHA-------------------------------------------------------------------------//
    @Then("UserT sends Post request {string} {string} and gets response")
     public void usertSendsPostRequestAndGetsResponse(String email, String mail) {
    String token= ApiUtils.generateToken();
    JSONObject json=new JSONObject();
    json.put(email,mail);
    response=given().headers("Authorization","Bearer "+token).
            spec(spec).
            contentType(ContentType.JSON).
            accept("application/json").
            when().
            body(json.toString()).
            post("{get1}/{get2}");
    response.prettyPrint();
}
    @Then("UserTT sends Post request and gets response")
    public void userttSendsPostRequestAndGetsResponse() {
        /*
        {
  "product_id": 200,
  "qty": 3,
  "price": 41,
  "seller_id": 1,
  "shipping_method_id": 0,
  "product_type": 1
}
         */
        String token= ApiUtils.generateToken();
        JSONObject json=new JSONObject();
        json.put("product_id",200);
        json.put("qty",3);
        json.put("price",41);
        json.put("seller_id",1);
        json.put("shipping_method_id",0);
        json.put("product_type",1);
        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();
    }

//-------------------------------------------------------ZEYNEP---------------------------------------------------------------------------//
    @Then("UserZZ sends Post request and gets response")
    public void userzzSendsPostRequestAndGetsResponse() {
        String token= ApiUtils.generateToken();
        JSONObject json=new JSONObject();
        json.put("first_name","testName");
        json.put("last_name","testLastName");
        json.put("email","test@test.com");
        json.put("phone","1546265411");
        json.put("date_of_birth","01-02-1980");
        json.put("description","testupdate");


        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();
    }

    @Then("User Verifies Post returned {string} {string} response body")
    public void userzVerifiesPostReturnedResponseBody(String message, String messageInformation) {
        response.then().assertThat().body(message,equalTo(messageInformation));
    }

//-----------------------------------------------------FATIH---------------------------------------------------------------------------//
    @Then("UserF sends Post request and gets response")
    public void userfSendsPostRequestAndGetsResponse() {
        /*
        {
  "id": 349,
  "type": "system"
}
         */
        JSONObject json=new JSONObject();
        json.put("id",349);
        json.put("type","system");


        String token= ApiUtils.generateToken();
        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();
    }

    @Then("UserFf sends Post request and gets response")
    public void userffSendsPostRequestAndGetsResponse() {
        JSONObject json=new JSONObject();
        json.put("id",500213123);
        json.put("type","system");

        String token= ApiUtils.generateToken();
        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();
    }

    @Then("Userzzz sends Post request and gets response")
    public void userzzzSendsPostRequestAndGetsResponse() {
        /*
        {
  "seller_id": 1,
  "seller_product_id": 190,
  "type": "product"
}
         */
        JSONObject json=new JSONObject();
        json.put("seller_id",1);
        json.put("seller_product_id",190);
        json.put("type","product");

        String token= ApiUtils.generateToken();
        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();
    }

    //-----------------------------------------------------LEVENT---------------------------------------------------------------------------//

    @Then("User sends Post request with {string} and {string} and gets response")
    public void userSendsPostRequestWithAndAndGetsResponse(String arg0, String arg1) {
        JSONObject json=new JSONObject();
        json.put("email",arg0);
        json.put("password",arg1);

        String token= ApiUtils.generateToken();
        response=given().headers("Authorization","Bearer "+token).
                spec(spec).
                contentType(ContentType.JSON).
                accept("application/json").
                when().
                body(json.toString()).
                post("{get1}/{get2}");
        response.prettyPrint();

    }


}
