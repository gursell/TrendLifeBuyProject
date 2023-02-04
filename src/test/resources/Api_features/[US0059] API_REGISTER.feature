@calismayacakolan
  Feature: API REGISTER

    Scenario: When a Request Body is sent to the /api/register endpoint with the necessary information, it should be verified that the status code returned is 201 Created and that the message information in the Response Body is "Successfully registered".

      Given User sets Post the necessary "ilkdata1" "nevzatdata2" path param
      Then  UserM sends Post request and gets response
      Then  User Verifies Post user status is "201"
      Then  User Verifies Post returned "message" "Successfully registered" response body