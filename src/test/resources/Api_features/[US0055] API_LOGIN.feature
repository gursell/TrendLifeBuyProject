@api
  Feature: API_LOGIN POST

    Scenario: When sending POST Request to the /api/login endpoint, it should be verified that the status code returned is 200 and the message information in the Response Body is "Successfully logged In".

      Given User sets Post the necessary "ilkdata1" "gurseldata2" path param
      Then  User sends Post request with "test@test.com" and "123123123" and gets response
      Then  User Verifies Post user status is "200"
      Then  UserG verifies the returned response body

      Scenario:It should be verified that the token used in API Authorization transactions is in the returned response.

        Given User sets Post the necessary "ilkdata1" "gurseldata2" path param
        Then  User sends Post request with "test@test.com" and "123123123" and gets response
        Then  User Verifies Post user status is "200"
        Then  User verifies the token response body