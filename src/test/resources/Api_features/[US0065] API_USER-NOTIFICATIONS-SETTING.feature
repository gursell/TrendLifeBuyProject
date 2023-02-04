@api
Feature: API_USER-NOTIFICATIONS-SETTING

    Scenario: When a GET Request is sent to the /api/user-notifications-setting endpoint, it should be checked that the status code returned is 200 and that the information in the Response Body is correct.


      Given User sets the necessary "ilkdata1" "fatihdata2" path param
      Then  User sends GET request and gets response
      Then  User Verifies user status is "200"
      Then  UserFf verifies the returned response body

  # Status sorgusunda bug mevcut actual=202
    Scenario: When a POST Request Body is sent to the /api/user-notifications-setting/update endpoint with valid information, it should be verified that the status code returned is 200 and the message information in the Response Body is "updated successfully".

      Given User sets Post the necessary "ilkdata1" "fatihdata3" path param
      Then  UserF sends Post request and gets response
      Then  User Verifies Post user status is "200"
      Then  User Verifies Post returned "msg" "updated successfully" response body
@api
    Scenario:When a POST Request Body is sent with invalid information to the /api/user-notifications-setting/update endpoint, it should be verified that the status code returned is 500 (Internal Server Error) and the message information in the Response Body is "Creating default object from empty value".

      Given User sets Post the necessary "ilkdata1" "fatihdata3" path param
      Then  UserFf sends Post request and gets response
      Then  User Verifies Post user status is "500"
      Then  User Verifies Post returned "message" "Creating default object from empty value" response body