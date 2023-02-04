@api
Feature: US0064 As a user, I should be able to access my product list in the cart, add a new product to my cart or delete a product from my cart.

    Scenario:When a GET Request is sent to the /api/checkout endpoint, it should be checked that the status code returned is 200 and that the information in the Response Body is correct.

      Given User sets the necessary "ilkdata1" "talhadata2" path param
      Then  User sends GET request and gets response
      Then  User Verifies user status is "200"
      Then  UserT verifies the returned response body

    Scenario:When a POST Request Body is sent to the /api/cart endpoint with valid information, it should be verified that the status code returned is 200 and the message information in the Response Body is "product added succcessfully".
# user status code always 201. there is a bug in third scenerio
      Given User sets Post the necessary "ilkdata1" "talhadata4" path param
      Then  UserTT sends Post request and gets response
      Then  User Verifies Post user status is "200"
      Then  User Verifies Post returned "message" "product added succcessfully" response body

    # TC_3 NOT ADDED BECAUSE IT IS UNCERTAIN

    #Scenario: When a POST Request Body is sent to the /api/cart/remove endpoint with invalid information, it should be verified that the status code returned is 404 (Not Found) and the message information in the Response Body is "cart item not found".