
Feature: US_0030 As an administrator, I would like to have the notifications section on the main page in order to be informed about the activities on the site.

  Scenario: US_3001 It should be verified that the Notifications text is visible in the window that opens when the Notifications icon is clicked.
    Given Open browser go to url "adminUrl"
    Then  Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click on the Notifications icon
    Then Verify the visibility of Notifications in the pop-up window.
    And Closes the page

  Scenario: US_3002 When the Notifications icon is clicked, it should be verified that it redirects to the user-notification page when the Setting button is clicked in the window that opens.
    Given Open browser go to url "adminUrl"
    Then  Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click on the Notifications icon
    Then Click the Settings button in the window that opens
    Then Verify redirected to user-notification page
    And Closes the page

  Scenario: US_3003 It should be verified that the information message type (active/passive) can be changed in the Personal Notification Setting List on the User-Notification page.
    Given Open browser go to url "adminUrl"
    Then  Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click on the Notifications icon
    Then Click the Settings button in the window that opens
    Then It is verified that the message type can be changed from the Personal Notification Setting List.
    And Closes the page

  Scenario: US_3004 It should be verified that the information messages (as read) are deleted from the window when the Read All button is clicked on the menu that opens when the Notifications icon is clicked.
    Given Open browser go to url "adminUrl"
    Then  Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click on the Notifications icon
    Then Click the Read All button in the menu that opens
    Then Verify that information messages (as read) are deleted from the window
    And Closes the page

  Scenario: US_3005 It should be verified that when the View All button is clicked on the menu that opens when the Notifications icon is clicked, it redirects to the relevant page.
    Given Open browser go to url "adminUrl"
    Then  Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click on the Notifications icon
    Then Click the View All button in the menu that opens.
    Then Verify that you are redirected to the relevant page.
    And Closes the page

#Eger bildirim yoksa VIEW ve READ ALL butonlari cikmiyor.