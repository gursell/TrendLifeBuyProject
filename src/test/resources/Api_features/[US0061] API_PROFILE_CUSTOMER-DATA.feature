@api
Feature: API_PROFILE_CUSTOMER-DATA

    Scenario:When a GET Request is sent to the /api/profile/get-customer-data endpoint, it should be checked that the status code returned is 200 and that the user information in the Response Body is correct.

      Given User sets the necessary "ilkdata1" "fatihdata" path param
      Then  User sends GET request and gets response
      Then  User Verifies user status is "200"
      Then  UserF verifies the returned response body