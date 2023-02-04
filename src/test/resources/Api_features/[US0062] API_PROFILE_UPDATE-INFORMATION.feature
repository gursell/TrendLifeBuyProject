@api #status code bug
Feature: API_PROFILE_UPDATE-INFORMATION

  Scenario:When a POST Request Body is sent to the /api/profile/update-information endpoint with the correct information, it should be verified that the status code returned is 200 and that the message information in the Response Body is "profile updated successfully".

    Given User sets Post the necessary "ilkdata1" "zeynepData2" path param
    Then  UserZZ sends Post request and gets response
    Then  User Verifies Post user status is "200"
    Then  User Verifies Post returned "message" "profile updated successfully" response body