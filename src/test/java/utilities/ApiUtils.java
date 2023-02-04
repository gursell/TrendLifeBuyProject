package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiUtils {
    public static RequestSpecification spec;

    public static String generateToken() {

        spec = new RequestSpecBuilder().setBaseUri(URI.create("https://trendlifebuy.com/api/login")).build();
        RequestSpecification requestSpec = spec;

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("email", "test@test.com");
        expectedData.put("password", "123123123");

        Response response = given().spec(requestSpec).contentType(ContentType.JSON).
                body(expectedData).when().post();

        //  response.prettyPrint();
        JsonPath json = response.jsonPath();

        return json.getString("token");

    }
}
