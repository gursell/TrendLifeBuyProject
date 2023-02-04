
Feature: US00_07 Register As a user, I want to be able to register on the site in order to benefit from the functions of the site.
  @SmokeTest
  Scenario: TC_0701 It should be verified that it is on the Sign Up page.

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User verifies being redirected to Sign Up page
    And Closes the page


  Scenario Outline: [TC_0702] It must be verified that the First Name Text Box is registered with a name of at least 2 letters.

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User enters "<requested name>"
    Then User enters last name "lastName"
    Then User enters valid e-mail
    Then User enters "validpassword" and confirms "validpassword"
    Then User clicks SIGN UP button
    Then User verifies (Verify Your Email) message appears
    And Closes the page
    Examples:
      | requested name |
      | a |
      | a123 |
      | 123 |


  Scenario Outline: [TC_0703] It must be verified that the Last Name Text Box is registered with a name of at least 2 letters.

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User enters first "name"
    Then User enters "<requested last name>" to last name box
    Then User enters valid e-mail
    Then User enters "validpassword" and confirms "validpassword"
    Then User clicks SIGN UP button
    Then User verifies (Verify Your Email) message appears
    And Closes the page
    Examples:
      | requested last name |
      | b |
      | b123 |
      | 123 |


  Scenario Outline: [TC_0704] It should be verified that it is possible to register with the e-mail address entered in accordance with the criterias.

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User enters first "name"
    Then User enters last name "lastName"
    Then User enters "<valid e-mail>" to e-mail box
    Then User enters "validpassword" and confirms "validpassword"
    Then User clicks SIGN UP button
    Then User verifies (The email must be a valid email address.) message appears
    And Closes the page
    Examples:
      | valid e-mail |
      | ab@gmail@com |
      | ab.gmail.com |
      | ab@gmail.com.com |
      | ab.gmail@com |



  Scenario Outline: [TC_0705] It should be verified that it is possible to register with a password that meets the specified criterias.

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User enters first "name"
    Then User enters last name "lastName"
    Then User enters valid e-mail
    Then User enters a "<requested password1>" and confirms "<requested password2>"
    Then User clicks SIGN UP button
    Then User verifies (The password must be a minimum of 8 characters and a combination of uppercase letters, lowercase letters, numbers, or symbols.) message appears
    And Closes the page
    Examples:
      | requested password1 | requested password2 |
      | wisequarter | wisequarter |
      | password1$ | password1$ |
      | $$$$$11111 | $$$$$11111 |


  Scenario: [TC_0706] By signing up, you agree to Terms of Service and Privacy Policy CheckBox must be checked before it can be registered.

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User enters first "name"
    Then User enters last name "lastName"
    Then User enters valid e-mail
    Then User enters "validpassword" and confirms "validpassword"
    Then User clicks to (By signing up, you agree to Terms of Service and Privacy Policy CheckBox) to deselect it
    Then User clicks SIGN UP button
    Then User verifies (Please agree with our policy privacy) message appears in the corner
    And Closes the page


  Scenario: [TC_0707] When the information that meets the criteria is entered, the registration process should be verified when the Sign Up button is clicked..

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User enters first "name"
    Then User enters last name "lastName"
    Then User enters valid e-mail
    Then User enters "validpassword" and confirms "validpassword"
    Then User clicks SIGN UP button
    Then User verifies being logged in
    And Closes the page


  Scenario: [TC_0709] It should be verified that the Sign In link next to Already have an Account? text leads to the relevant page.

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User clicks the Sign In link
    Then User verifies being redirected to login page
    And Closes the page


  Scenario: [TC_0710] Verify that the Sign up with Google link leads to the relevant page.

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User clicks the Sign up with Google button
    Then User verifies being redirected to "googleURL" page
    And Closes the page


  Scenario: [TC_0711] It should be verified that Sign up with Facebook link leads to the relevant page.

    Given Open browser go to url "userUrl"
    Then User clicks the REGISTER link
    Then User clicks the Sign up with Facebook button
    Then User verifies being redirected to "facebookURL" page
    And Closes the page





