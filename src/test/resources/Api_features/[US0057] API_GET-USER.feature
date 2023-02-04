@api
 Feature: API_GET-USER

   Scenario: When a Get Request is sent to the api/get-user endpoint, the status code should be 200 and the user information in the Response Body should be verified.

     Given User sets the necessary "ilkdata1" "nesedata2" path param
     Then  User sends GET request and gets response
     Then  User Verifies user status is "200"
     Then  UserN verifies the returned response body
