@api
Feature: US0066 As a user, I should be able to access the list of my orders and cancel my requested order.

  Scenario: TC_6601 When a GET Request is sent to the /api/order-list endpoint, it should be checked that the status code returned is 200 and that the information in the Response Body is correct.
    Given User sets the necessary "ilkdata1" "eminedata1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserE verifies the returned response body

  Scenario:When the POST Request Body is sent to the /api/order-manage/cancel-store endpoint with valid information, it should be verified that the status code returned is 202 (Accepted) and the message information in the Response Body is "Order Cancelled Successfully".

    Given User sets Post the necessary "ilkdata1" "eminedata2" path param
    Then  UserE sends Post request and gets response
    Then  User Verifies Post user status is "202"
    Then  User Verifies Post returned "message" "Order Cancelled Successfully" response body