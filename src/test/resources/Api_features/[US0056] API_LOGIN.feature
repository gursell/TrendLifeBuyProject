@api
  Feature: US0056 As a user, I shouldn't be able to connect to the API with my wrong Email and Wrong Password.


    Scenario: [TC_5601] When a request is sent with the wrong email and correct password information in the /api/login endpoint body, it should be verified that the status code of the response is 401 Unauthorized and that "Invalid Credintials" is written in the message section.

      Given User sets Post the necessary "ilkdata1" "gurseldata2" path param
      Then  User sends Post request with "test@atest.com" and "123123123" and gets response
      Then  User Verifies Post user status is "401"
      Then  User Verifies Post returned "message" "Invalid Credintials" response body


    Scenario: [TC_5602] When a request is sent with the wrong email and correct password information in the /api/login endpoint body, it should be verified that the status code of the response is 401 Unauthorized and that "Invalid Credintials" is written in the message section.

      Given User sets Post the necessary "ilkdata1" "gurseldata2" path param
      Then  User sends Post request with "test@test.com" and "123123123aa" and gets response
      Then  User Verifies Post user status is "401"
      Then  User Verifies Post returned "message" "Invalid Credintials" response body


    Scenario: [TC_5603] When a request is sent with the wrong email and correct password information in the /api/login endpoint body, it should be verified that the status code of the response is 401 Unauthorized and that "Invalid Credintials" is written in the message section.

      Given User sets Post the necessary "ilkdata1" "gurseldata2" path param
      Then  User sends Post request with "test@atest.com" and "123123123aa" and gets response
      Then  User Verifies Post user status is "401"
      Then  User Verifies Post returned "message" "Invalid Credintials" response body
