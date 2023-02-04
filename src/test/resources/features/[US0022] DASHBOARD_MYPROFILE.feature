
Feature: US0022 DASHBOARD MY PROFILE

  Scenario: TC_2201 Verify that the My Profile page is accessible.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashbord page
    Then User verifies that the page is accessibleS
    Then Closes the page


  Scenario: TC_2202 Verify that the profile picture can be updated

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then User clicks Choose File button on My Profile page and "uploadPhoto" Photo
    Then User verifies that the photo  is uploaded
    And Closes the page
  @SmokeTest
  Scenario: TC_2203 Verify that you have First Name, Last Name, Email Address, Phone Number, Date of Birth, Description, TextBox in the Basic Info tab.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then Verifies that the Basic Info tab contains First Name, Last Name,Email Address, Phone Number, Date of Birth, Description,Text Box
    And  Closes the page


  Scenario: TC_2204 Verify that the information in the Basic Info tab (First Name, Last Name, Email Address,) is the user's information.

    Given Open browser go to url "userUrl"
    Then  User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then  User clicks on dashboard link
    Then  User clicks My Account section on dashboard page
    Then  User verifies that the information in the Basic Info tab ("firstnameMyAccount","lastnameMyAccount", "emailMyAccount" "value") is the user's information.
    And   Closes the page

  Scenario: TC_2205 It should be verified that the profile can be updated by entering information in the TextBoxes in the Basic Info tab.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then User enters "newfirstname" "newLastname" "newMail" "newPhoneNumber" "newDateOfBirth" "newDescription" in textboxes and confirms that it is updateable
    And  Closes the page

  Scenario: TC_2206 Verify that Current Password, New Password, Re enter New Password TextBoxes are present in the Change Password tab.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then User clicks Change Password button on My Account page
    Then User verifies that the text boxes in the Change Password tab
     And Closes the page

    Scenario: TC_2207 It should be verified that the password can be updated

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then User clicks Change Password button on My Account page
    Then User verifies that the text boxes in the "password" "newPassword" "reNewPassword" Change Password tab
    And  Closes the page

  Scenario: TC_2208 It should be verified that the Full Name, Address, Region, E-mail, Phone Number information in the Address tab belong the user.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then User clicks Address button on My Account page
    Then User verifies that the information are  on the User Address page belong the User
    And  Closes the page

    Scenario: TC_2209 It should be verified that the Update Address tab is accessed by using the edit icon in the Address list.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then User clicks Address button on My Account page
    Then User verifies that in the address tab
    And  Closes the page

    Scenario: TC_2210 Verify that there are textBoxes in the Update Address tab.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then User clicks Address button on My Account page
    Then User clicks edit icon
    Then User verifies that there are textboxes on the page
    And  Closes the page

      Scenario: TC_2211 it should be verified that the address can be updated by using the Update button.

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
      Then User clicks on dashboard link
      Then User clicks My Account section on dashboard page
      Then User clicks Address button on My Account page
      Then User clicks edit icon
      Then User chooses Type on Update address
      Then User verifies the changes
      And Closes the page

    Scenario: TC_2212 It should be verified that a new address can be added to the profile with the Add New Address button.

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "nevzatmail" and "password" and logs in
    Then User clicks on dashboard link
    Then User clicks My Account section on dashboard page
    Then User clicks Address button on My Account page
    Then User clicks Add New Adress button on My Account page
    Then User verifies redirected to page
    And  Closes the page
