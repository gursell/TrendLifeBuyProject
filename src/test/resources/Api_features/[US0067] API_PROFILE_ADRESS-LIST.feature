
Feature: US0067
@api
  Scenario: When a GET Request is sent to the /api/profile/address-list endpoint, it should be checked that the status code returned is 200 and that the information in the Response Body is correct.

    Given User sets the necessary "ilkdata1" "boraData1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserB verifies the returned response body

  Scenario: When a POST Request Body is sent to the /api/profile/address-store endpoint with valid information, it should be verified that the status code returned is 201 and the message information in the Response Body is "address added successfully".
    Given User sets Post the necessary "ilkdata1" "boraData3" path param
    Then  UserB sends Post request and gets response
    Then  User Verifies Post user status is "201"
    Then  User Verifies Post returned "message" "address added successfully" response body
@api
  Scenario:When a PATCH Request Body is sent to the /api/profile/address-update/:id endpoint, it should be verified that the status code returned is 202 (Accepted) and the message information in the Response Body is "address updated successfully".

    Given User sets Patch the necessary "ilkdata1" "boradata4" path param
    Then  User sends Patch request and gets response
    Then  User Verifies Patch user status is "202"
    Then  User Verifies Patch returned "message" "address updated successfully" response body
  Scenario:When DELETE Request Body is sent to the /api/profile/address-delete endpoint with valid information, it should be verified that the status code returned is 201 and the message information in the Response Body is "address deleted successfully".
# bu seneryo sadece 1 kere calisir 2. kez calistirilmak istenildiginde id numarasi degismeli =63,64,65.....
  Given  User sets Delete the necessary "ilkdata1" "boraData2" path param
  Then   UserB sends Delete request and gets response
  Then   User Verifies Delete user status is "201"
  Then   UserB verifies the returned Deleted "message" "address deleted successfully" response body
@apii
  Scenario:When DELETE Request Body is sent to the /api/profile/address-delete endpoint with invalid information, it should be verified that the status code returned is 404 (Not Found) and the message information in the Response Body is "address not found".

    Given  User sets Delete the necessary "ilkdata1" "boraData2" path param
    Then   UserBb sends Delete request and gets response
    Then   User Verifies Delete user status is "404"
    Then   UserB verifies the returned Deleted "message" "address not found" response body






   # Given Bora gerekli path "ilkdata1" "boraData1" "" param ayarlarini yapar
   # Then  KullaniciB GET request islemi yapar ve response alir
   # Then  KullaniciB statusunun "200" oldugunu dogrular
   # And   KullaniciB Kullanici response body bilgelerini dogrular