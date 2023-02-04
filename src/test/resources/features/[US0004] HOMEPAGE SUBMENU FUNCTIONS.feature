@SystemTest
Feature: US 0004 Home Page Submenu Functions Test

  Scenario: TC 0401 Verify that My Account, Order Status, Referral, Coupons links are visible

    Given  Open browser go to "userUrl"
    Then   Check if my account, order status, referral, coupons links are visible at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0402 As a user, verify that clicking the My Account, Order Status, Referral, Coupons links redirects to the relevant page

    Given  Open browser go to "userUrl"
    And    Check if  my account, order status, referral, coupons links redirect to relevant pages after clicking to my account, order status, referral, coupons links.
    And    The user closes "userUrl"

  Scenario: TC 0403 Verify that the About Us, Contact Us, Career, Refund Policy, Terms & Condition links are visible

    Given  Open browser go to "userUrl"
    Then   Check if about us, contact us, career, refund policy, terms & condition links are visible at the "userUrl"
    And    The user closes "userUrl"


  Scenario: TC 0404 As a visitor, verify that clicking on About Us, Contact Us, Career, Refund Policy, Terms & Condition links redirects to the relevant pages

    Given  Open browser go to "userUrl"
    And    Check if  about us, contact us, career, refund policy, terms & condition links redirect to relevant pages after clicking on about us, contact us, career, refund policy, terms & condition links
    And    The user closes "userUrl"

  Scenario: TC 0405 Verify that the Google Play Store and Apple Store buttons are visible

    Given  Open browser go to "userUrl"
    Then   Check if google play store and apple store buttons are visible at the "userUrl"
    And    The user closes "userUrl"


  Scenario: TC 0406 Verify as a visitor that Google Play and Apple Store buttons redirect to their relevant pages

    Given  Open browser go to "userUrl"
    And    Check if google play store and apple store redirect to relevant pages after clicking on google play store and apple store
    And    The user closes "userUrl"

  Scenario: TC 0407 Verify that clicking the Go to Top button goes to the top of the home page

    Given  Open browser go to "userUrl"
    And    Click the go to top button
    And    Check if go to top button moves the page up
    And    The user closes "userUrl"

  Scenario: TC 0408 Verify that facebook, twitter, linkedin and instagram icons are visible

    Given  Open browser go to "userUrl"
    Then   Check if facebook, twitter, linkedin and instagram icons are visible at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0409 Verify that clicking on facebook, twitter, linkedin and instagram icons redirects to relevant page

    Given  Open browser go to "userUrl"
    And    Check if facebook, twitter, linkedin and instagram icons redirect to relevant pages after clicking on facebook, twitter, linkedin and instagram icons
    And    The user closes "userUrl"