package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import pojos.LoginPojo;
import utilities.ApiUtils;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utilities.ApiUtils.generateToken;

public class GET_REQUEST {
    public static RequestSpecification spec;
    Response response;
    LoginPojo loginPojo;



    //---------------------------------------------Fatih---------------------------------------------------------------------------//
    @Given("User sets the necessary {string} {string} path param")
    public void user_sets_the_necessary_path_param(String param1, String param2) {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
        spec.pathParams("get1",ConfigReader.getProperty(param1),"get2",ConfigReader.getProperty(param2));
    }
    @Then("User sends GET request and gets response")
    public void user_sends_get_request_and_gets_response() {
        String token = generateToken();
        loginPojo = new LoginPojo("test@test.com", "123123123");

        response = given().
                headers("Authorization","Bearer "+ token).
                spec(spec).
                contentType(ContentType.JSON).accept("application/json").
                when().
                get("{get1}/{get2}");
        response.prettyPrint();
    }
    @Then("UserFf verifies the returned response body")
    public void userffVerifiesTheReturnedResponseBody() {
        response.then().body(
                "notifications[0].user_id",equalTo(453),
                "notifications[0].notification_setting.admin_msg",equalTo("A withdraw request has been declined."),
                "notifications[1].user_id",equalTo(453),
                "notifications[1].notification_setting.admin_msg",equalTo("An order process change to Processing"),
                "notifications[2].user_id",equalTo(453),
                "notifications[2].notification_setting.admin_msg",equalTo("An order process change to Pending"),
                "notifications[3].user_id",equalTo(453),
                "notifications[3].notification_setting.admin_msg",equalTo("An order process change to Pending"),
                "notifications[4].user_id",equalTo(453),
                "notifications[4].notification_setting.admin_msg",equalTo("An order has been approved."),
                "notifications[5].user_id",equalTo(453),
                "notifications[5].notification_setting.admin_msg",equalTo("An order process change to Pending"),
                "notifications[6].user_id",equalTo(453),
                "notifications[6].notification_setting.admin_msg",equalTo("An order process change to Processing"),
                "notifications[7].user_id",equalTo(453),
                "notifications[7].notification_setting.admin_msg",equalTo("An order process change to Shipped"),
                "msg",equalTo("success")
        );
    }
    @Then("User Verifies user status is {string}")
    public void user_verifies_user_status_is(String statusCode) {
        response.then().assertThat().statusCode(Integer.parseInt(statusCode));
    }
    @Then("UserF verifies the returned response body")
    public void user_f_verifies_the_returned_response_body() {
        response.then().body(
                "wallet_running_balance",Matchers.equalTo(1949.99F),
                "wallet_pending_balance",equalTo(0),
                   "total_coupon",equalTo(0),
                   "total_wishlist",equalTo(14),
                    "total_cancel_order",equalTo(2),
                     "message",equalTo("success")
        );
    }


    //---------------------------------------------------Nese------------------------------------------------------------------------------//
    @Then("UserN verifies the returned response body")
    public void usernVerifiesTheReturnedResponseBody() {
        response.then().
                body("user.id", equalTo(453),
                        "user.customer_addresses[0].id",equalTo(48),
                        "user.currency.code",equalTo("USD"),
                        "user.language.name",equalTo("English"),
                        "message",equalTo("success"));

    }
//----------------------------------------------------Bora------------------------------------------------------------------------------//
    @Then("UserB verifies the returned response body")
    public void userbVerifiesTheReturnedResponseBody() {

        response.then().body("addresses[0].id",Matchers.equalTo(48),
                "addresses[0].get_country.name",Matchers.equalTo(null)
                ,"addresses[0].get_state.name",Matchers.equalTo(null),
                "addresses[0].get_city.created_at",Matchers.equalTo(null),
                "addresses[1].email",Matchers.equalTo("enim@enim.com"),
                "message",Matchers.equalTo("success"));

    }
//-------------------------------------------------Yakup------------------------------------------------------------------------------//
    @Then("UserY verifies the returned response body")
    public void useryVerifiesTheReturnedResponseBody() {

    }
//-------------------------------------------------Talha-----------------------------------------------------------------------------//
    @Then("UserT verifies the returned response body")
    public void usertVerifiesTheReturnedResponseBody() {

        response.then().body(
                "packages.1.items[0].id",equalTo(746),
                "packages.1.items[0].created_at",equalTo("2023-01-16T20:18:02.000000Z"),
                "packages.1.items[0].customer.customer_shipping_address.created_at",equalTo(null),
                "packages.1.items[0].product.product.product_name",equalTo("Sun glass for girls"),
                "packages.1.items[0].product.product.skus[0].id",equalTo(200),
                "packages.1.shipping[0].id",equalTo(2),
                "packages.1.shipping[0].carrier.slug",equalTo("Manual"),
                "packages.1.shipping[1].carrier.slug",equalTo("Manual"),
                 "differant_state_gst_list[0].name",equalTo("CGST"),
                  "differant_state_gst_list[1].name",equalTo("SGST"),
                "message",equalTo("success"));

    }
//-----------------------------------------------------Zeynep------------------------------------------------------------------------//
    @Then("UserZ verifies the returned response body")
    public void userzVerifiesTheReturnedResponseBody() {

        response.then().body(
                "message",equalTo("success")
        );
    }
//----------------------------------------------------Emine--------------------------------------------------------------------------//
    @Then("UserE verifies the returned response body")
    public void usereVerifiesTheReturnedResponseBody() {
        response.then().body(
                "orders[0].id",equalTo(133),
                "orders[0].customer.first_name",equalTo("testName"),
                "orders[0].packages[0].processes[0].id",equalTo(1),
                "orders[0].packages[0].processes[1].id",equalTo(2),
                "orders[0].packages[0].processes[2].id",equalTo(3),
                "orders[0].address.shipping_email",equalTo("test@test.com"),
                "message",equalTo("success")
        );
    }
}
