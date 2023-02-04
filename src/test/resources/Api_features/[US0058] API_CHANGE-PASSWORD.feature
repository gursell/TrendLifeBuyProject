@api
Feature:

  Scenario:When a Request Body is sent to the /api/change-password endpoint with incorrect information, the status code returned is 409 Conflict and the message information in the Response Body is "Invalid Credintials." must be verified

    Given User sets Post the necessary "ilkdata1" "nevzatdata1" path param
    Then  UserNN sends Post request and gets response
    Then  User Verifies Post user status is "409"
    Then  User Verifies Post returned "message" "Invalid Credintials." response body