@api
Feature: US0060 As a user, when I forget my password, I want the verification link to be sent to my registered E_mail.

  Scenario:When a Request Body is sent to the /api/forgot-password endpoint with valid information, it should be verified that the status code returned is 200 and the message information in the Response Body is "Reset password link sent on your email id."

    Given User sets Post the necessary "ilkdata1" "talhadata3" path param
    Then  UserT sends Post request "email" "nevzat@nevzatttt.com" and gets response
    Then  User Verifies Post user status is "200"
    Then  User Verifies Post returned "message" "Reset password link sent on your email id." response body

  Scenario:  When a Request Body is sent to the /api/forgot-password endpoint with invalid information, it should be verified that the status code returned is 404 Not Found and the message information in the Response Body is "Customer not found." it should be verified.

    Given User sets Post the necessary "ilkdata1" "talhadata3" path param
    Then  UserT sends Post request "email" "nevzat@nevzatttt.commmm" and gets response
    Then  User Verifies Post user status is "404"
    Then  User Verifies Post returned "message" "Customer not found." response body