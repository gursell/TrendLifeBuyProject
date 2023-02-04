
Feature: US00_06 Login (As a user, I want to be able to login with my registered email and password information.)
  @SmokeTest
  Scenario: [TC_0601] When clicking the Click Here link next to Forgot Password? text, verify that it redirects to the relevant page

    Given Open browser go to url "userUrl"
    Then User clicks the LOGIN link
    Then User clicks the Click Here link next to Forgot Password? text
    Then User verifies being redirected to Password Reset page
    And Closes the page


  Scenario: [TC_0602] Verify that when the Sign Up link next to Don't have an Account? text is clicked, it redirects to the relevant page.

    Given Open browser go to url "userUrl"
    Then User clicks the LOGIN link
    Then User clicks the Sign Up link next to Don't have an Account? text
    Then User verifies being redirected to Register page
    And Closes the page


  Scenario: [TC_0603] verify that when logged in correctly, it redirects to Home and a welcome message appears in the corner

    Given Open browser go to url "userUrl"
    Then User clicks on the login link, enters "leventmail" and "password" and logs in
    Then User verifies that (Logged In Succesfully!) message appears in the corner
    Then User verifies being redirected to Home page
    And Closes the page


  Scenario Outline: [TC_0604] "These credentials do not match our records." Verify that the message is seen when trying to log in with wrong data

    Given Open browser go to url "userUrl"
    Then User clicks the LOGIN link
    Then User enters "<requested e-mail>" and "<requested password>" and logs in
    Then User verifies that (These credentials do not match our records.) message appears
    And Closes the page
    Examples:
      | requested e-mail  | requested password  |
      | ab@gmail.com      | 12345678            |
      | abc@gmail.com     | requested           |
      | abcd@gmail.com    | requestedpassword   |
      | abcde@gmailcom    | requested12345678   |


  Scenario Outline: [TC_0605] The Password Must be entered in accordance the criterias

    Given Open browser go to url "userUrl"
    Then User clicks the LOGIN link
    Then User enters "leventmail" and "<requested password>" and logs in
    Then User verifies that (These credentials do not match our records.) message appears
    And Closes the page
    Examples:
      | requested password |
      | 1 |
      | 12 |
      | 123 |
      | 1234 |
      | 12345 |
      | 123456 |
      | 1234567 |
      | a |
      | ab |
      | abc |
      | abcd |
      | abcde |
      | abcdef |
      | abcdefg |


  Scenario Outline: [TC_0606] The E-mail must be entered in accordance with the e-mail criteria

    Given Open browser go to url "userUrl"
    Then User clicks the LOGIN link
    Then User enters "<requested e-mail>" and "password" and logs in
    Then User verifies that (These credentials do not match our records.) message appears
    And Closes the page
    Examples:
      | requested e-mail |
      | abgmail.com |
      | ab@gmail@com |
      | abgmailcom |
      | ab@gmailcom |
      | ab@gmail |
      | ab@gmail.com.com |


  Scenario: [TC_0607] Verify that the Remember me checkbox is clickable

    Given Open browser go to url "userUrl"
    Then User clicks the LOGIN link
    Then User clicks the Remember me checkbox
    Then User verifies that Remember me checkbox is being clicked
    And Closes the page


  Scenario: [TC_0608] When the Sign up with Google button is pressed, it should redirect to the relevant page.

    Given Open browser go to url "userUrl"
    Then User clicks the LOGIN link
    Then User clicks the Sign up with Google button
    Then User verifies being redirected to "googleURL" page
    And Closes the page


  Scenario: [TC_0609] When the Sign up with Facebook button is pressed, it should redirect to the relevant page.

    Given Open browser go to url "userUrl"
    Then User clicks the LOGIN link
    Then User clicks the Sign up with Facebook button
    Then User verifies being redirected to "facebookURL" page
    And Closes the page












