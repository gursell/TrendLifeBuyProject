@SystemTest
Feature: US00_08 Track Your Order (As a user, I would like to have a section on the site where I shop from, where I can inquire about the latest status of my orders.)

  Scenario: [TC_0801] It should be verified that inquiries can be made by typing the Secret ID number into the Secret ID (Only For Guest User) textbox for purchases made without registering to the site (in visitor mode).

    Given Open browser go to url "userUrl"
    Then User clicks the TRACK YOUR ORDER link and enters an "OrderIDGuest" and clicks TRACK NOW button
    Then User verifies being redirected to Orders page
    And Closes the page



  Scenario: [TC_0802] It should be verified that users registered on the site can query their orders by typing the Order Tracking Number into the Order Tracking Number TextBox.


    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User clicks the TRACK YOUR ORDER link and enters an "OrderIDUser" and clicks TRACK NOW button
    Then User verifies being redirected to Orders page
    And Closes the page


