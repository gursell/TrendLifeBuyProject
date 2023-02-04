@SystemTest
Feature: US 0002 Home Page Functions Test

  Scenario: TC 0201 Play store and apple store buttons should redirect to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to play store button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking play store  button at the "userUrl"
    Then   Click to apple store button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking apple store button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0202 Track Your Order button should lead to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to track your order button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking track your order button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0203 Compare button should lead to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to compare button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking compare button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0204 Wishlist button should lead to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to wishlist button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking wishlist button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0205 cart button should lead to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to cart button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking cart button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0206 It should redirect to the home page when the logo is pressed

    Given  Open browser go to "userUrl"
    And    Click to logo button at the "userUrl"
    Then   Verify if visitor can redirect to the home page after clicking logo button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0207 It should be possible to search for products from the search box

    Given  Open browser go to "userUrl"
    And    Click to search box at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking computer to search box at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0208 login button should be redirect to relevant page

    Given  Open browser go to "userUrl"
    And    Click to login button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking login button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0209  The register button should lead to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to register button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking register button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0210  home button should redirect to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to home button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking home button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0211  blog button should redirect to relevant page

    Given  Open browser go to "userUrl"
    And    Click to blog button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking blog button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0212  Contact button should lead to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to contact button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking contact button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0213  About Us button should lead to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to about us button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking about us button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0214  New User Zone button should lead to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to new user zone button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking new user zone button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0215  Daily Deals button should redirect to relevant page

    Given  Open browser go to "userUrl"
    And    Click to daily deals button at the "userUrl"
    Then   Verify if visitor can redirect to the relevant page after clicking daily deals button at the "userUrl"
    And    The user closes "userUrl"