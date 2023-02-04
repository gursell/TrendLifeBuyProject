Feature: US_0031 As an administrator, in order to access my profile information and logout, I want the profile I am logged into to be visible on the top bar of the dashboard homepage.

  Scenario: US_3101 Verify that the profile icon is visible on the top bar of the Dashboard home page.
    Given Open browser go to url "adminUrl"
    Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Verify that the profile icon appears in the top bar.
    Then Closes the page

  Scenario: US_3102 When the profile icon is clicked, it should be verified that the Name of the account that is logged in appears in the window that opens.
    Given Open browser go to url "adminUrl"
    Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click the profile icon
    Then Verify that the Name of the logged in account appears
    Then Closes the page

  Scenario: US_3103 It should be verified that the My profile and Log out links are visible in the window that opens when the profile icon is clicked.
    Given Open browser go to url "adminUrl"
    Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click the profile icon
    Then Verify that My Profile and Sign out links appear.
    Then Closes the page

  Scenario: US_3104 When you click on the My Profile link, it should be verified that you are going to the profile page.
    Given Open browser go to url "adminUrl"
    Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click the profile icon
    Then Click the My Profile link
    Then Verify that you have been to the profile page
    Then Closes the page

  Scenario: US_3105 Verify that the Basic Info section on the profile page contains First Name, Last Name, E-mail Address, Phone Number, Date of Bird information.
    Given Open browser go to url "adminUrl"
    Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click the profile icon
    Then Click the My Profile link
    Then Verify that the Basics section on the profile page includes First Name, Last Name, Email Address, Phone Number, Siege Date.
    Then Closes the page

  Scenario: US_3106 It should be verified that the First Name, Last Name, E-mail Address, Phone Number, Date of Bird information can be updated in the Basic Info section of the profile page.
    Given Open browser go to url "adminUrl"
    Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click the profile icon
    Then Click the My Profile link
    Then Verify that First Name, Last Name, Email Address, Phone Number, Siege Date can be updated in the Basics section of the profile page.
    Then Closes the page

  Scenario: US_3107 When the Address button on the profile page is clicked, it should be verified that the address information appears on the page that opens.
    Given Open browser go to url "adminUrl"
    Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click the profile icon
    Then Click the My Profile link
    Then Click the Address button on the profile page
    Then Verify that the address information appears on the page that opens.
    Then Closes the page

  Scenario: US_3108 When the Add New Address button is clicked, it should be verified that a new address can be added to the account logged in from the page that opens and that the added addresses are visible on the address page.
    Given Open browser go to url "adminUrl"
    Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click the profile icon
    Then Click the My Profile link
    Then Click the Add New Address button
    Then Verify that a new address can be added to the account logged in from the opened page and that the added addresses appear on the address page.
    Then Closes the page



