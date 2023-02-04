
Feature: US00_09 Compare (As a user, I would like to have a page where I can compare similar products on the site.)

  Scenario: [TC_0901] It should be verified that inquiries can be made by typing the Secret ID number into the Secret ID (Only For Guest User) textbox for purchases made without registering to the site (in visitor mode).

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the COMPARE link
    Then User should verify that the products are displayed side by side with pictures and content information.
    And Closes the page



  Scenario: [TC_0902] It should be verified that users registered on the site can query their orders by typing the Order Tracking Number into the Order Tracking Number TextBox.


    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the COMPARE link
    Then User clicks RESET COMPARE button
    Then User verifies that (Compare list is empty.) text is visible
    And Closes the page


