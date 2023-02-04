
Feature: API.WISHLIST
@api
   Scenario: When sending GET Request to the /api/wishlist endpoint, it should be checked that the status code returned is 200 and that the information in the Response Body is correct.
    Given User sets the necessary "ilkdata1" "zeynepdata1" path param
    Then  User sends GET request and gets response
    Then  User Verifies user status is "200"
    Then  UserZ verifies the returned response body

  # Bu seneryo da olusturudugumuz objedeki id her sorguda degismeli
    Scenario: When a POST Request Body is sent to the /api/wishlist endpoint with valid information, it should be verified that the status code returned is 201 and the message information in the Response Body is "Product added to wishlist."
      Given User sets Post the necessary "ilkdata1" "zeynepdata1" path param
      Then  UserZ sends Post request and gets response
      Then  User Verifies Post user status is "201"
      Then  User Verifies Post returned "message" "Product added to wishlist." response body
@api
    Scenario: When a POST Request Body is sent to the /api/wishlist endpoint with a product information already in Wishlist, it should be verified that the status code returned is 409 Conflict and the message information in the Response Body is "Product already in wishlist".

      Given User sets Post the necessary "ilkdata1" "zeynepdata1" path param
      Then  Userzzz sends Post request and gets response
      Then  User Verifies Post user status is "409"
      Then  User Verifies Post returned "message" "Product already in wishlist" response body
   # calistirmadan once silinen degeri postmandan olustur // wishlist post ve deleteden
    Scenario: When DELETE Request Body is sent to the /api/wishlist/delete endpoint with valid information, it should be verified that the status code returned is 202 Accepted and the message information in the Response Body is "product removed from wishlist successfully."

      Given  User sets Delete the necessary "ilkdata1" "zeynepdata3" path param
      Then   UserZ sends Delete request and gets response
      Then   User Verifies Delete user status is "202"
      Then   UserB verifies the returned Deleted "message" "product removed from wishlist successfully." response body
      @api
     Scenario: When DELETE Request Body is sent to the /api/wishlist/delete endpoint with invalid information, it should be verified that the status code returned is 404 (Not Found) and the message information in the Response Body is "product not found".

       Given  User sets Delete the necessary "ilkdata1" "zeynepdata3" path param
       Then   UserZe sends Delete request and gets response
       Then   User Verifies Delete user status is "404"
       Then   UserB verifies the returned Deleted "message" "product not found" response body






  # bunlar corbadan
  Scenario: When DELETE Request Body is sent to the /api/wishlist/delete endpoint with valid information, it should be verified that the status code returned is 202 Accepted and the message information in the Response Body is "product removed from wishlist successfully."

    Given  User sets Delete the necessary "ilkdata1" "zeynepdata3" path param
    Then   UserZ sends Delete request and gets response
    Then   User Verifies Delete user status is "202"
    Then   UserB verifies the returned Deleted "message" "product removed from wishlist successfully." response body
# bunlar corbadan
  Scenario: When DELETE Request Body is sent to the /api/wishlist/delete endpoint with invalid information, it should be verified that the status code returned is 404 (Not Found) and the message information in the Response Body is "product not found".

    Given  User sets Delete the necessary "ilkdata1" "zeynepdata3" path param
    Then   UserZe sends Delete request and gets response
    Then   User Verifies Delete user status is "404"
    Then   UserB verifies the returned Deleted "message" "product not found" response body