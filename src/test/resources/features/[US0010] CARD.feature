
Feature: US00_10 Card (As a user, I would like to have a cart page where I can send the products I intend to buy while shopping and then do my shopping.)

  Scenario: [TC_1001] It should be verified that the number of the product to be purchased from the Quantity section can be changed.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the CART link
    Then User clicks + sign for the first product
    Then User verifies + sign can be clickable
    And Closes the page


  Scenario: [TC_1002] It should be verified that the Total fee changes according to the number of pieces in the Quantity section.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the CART link
    Then User clicks - sign for the first product and verifies total fee has changed
    And Closes the page


  Scenario: [TC_1003] It should be verified that the unit price of the product and the amount of discount, if any, are written in the Price section.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the CART link
    Then User clicks - sign for the second product
    Then User verifies unit price of the product is visible
    Then User verifies  the amount of discount is visible
    And Closes the page


  Scenario: [TC_1004] When the Proceed to checkout button is clicked, it should be verified that it redirects to the relevant page.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the CART link
    Then User clicks PROCEED TO CHECKOUT button
    Then User verifies being redirected to Checkout page
    And Closes the page


  Scenario: [TC_1005] When the Continue Shopping button is pressed, it should be verified that it redirects to the homepage.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the CART link
    Then User clicks CONTINUE SHOPPING button
    Then User verifies being redirected to Home page
    And Closes the page


  Scenario: [TC_1006] When the delete icon in the Remove section is clicked, it should be verified that the product in the basket has been deleted and the total price has changed.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the CART link
    Then User clicks delete icon
    Then User verifies that (Product succesfully deleted from cart) message appears in the corner
    Then User clicks - sign for the first product and verifies total fee has changed
    And Closes the page


  Scenario: [TC_1007] It should be verified that the texts Shipping charge free from,Order Summary,Subtotal,Shipping Charge,Discount,VAT/TAX/GST and Total are visible.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the CART link
    Then User verifies that (Shipping charge free from) text is visible
    Then User verifies that (Order Summary) text is visible
    Then User verifies that (Subtotal) text is visible
    Then User verifies that (Shipping Charge) text is visible
    Then User verifies that (Discount) text is visible
    Then User verifies that VAT_TAX_GST text is visible
    Then User verifies that (Total) text is visible
    And Closes the page

