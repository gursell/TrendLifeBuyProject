
Feature:  API_COUPON
# Kupon bulunamadi hatasi mevcut oldugundan dolayi post islemi ile delete kupon YAPILAMAZ
  Scenario: When a GET request is sent to the /api/coupon endpoint, it should be checked that the status code returned is 200 and that the information in the Response Body is correct.

    Given User sets the necessary "ilkdata1" "yakupdata2" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserY verifies the returned response body
