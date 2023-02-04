
Feature: US0026 As a visitor, I want to be able to shop from the site without registering.




  Scenario:  Verify that the site is accessible.

    Given Open browser go to url "userUrl"
    Then Visitor verify that the site is accessible
    And Closes the page
  @SmokeTest
   Scenario: It should be verified that the products on the site are displayed without registering on the site

      Given Open browser go to url "userUrl"
      Then Visitor must see product
      And Closes the page

      Scenario: Verify that the Add to Cart button appears when hovering over a product as a visitor.

        Given Open browser go to url "userUrl"
        Then Visitor verify Add to Cart button is appear
        And Closes the page

        Scenario: When clicking the Add to Cart button that appears when hovering over the product as a visitor, it should be verified that the product has been added to the Cart page
          Given Open browser go to url "userUrl"
          Then Visitor select Add to Cart button
          And Closes the page

          Scenario: Verify that the View Cart button is visible in the Item added to your cart window and when clicked, it redirects to the Cart page
            Given Open browser go to url "userUrl"
            Then View cart should be visible
            Then in the Item added to your cart window and when clicked, it redirects to the Cart page
            And Closes the page

            Scenario: Verify that the Proceed to Checkout button is visible on the Cart page
              Given Open browser go to url "userUrl"
              Then Proceed to Checkout button is visible
              And Closes the page

              Scenario: When the Proceed to Checkout button is clicked, it should be verified that it redirects to the Checkout page
                Given Open browser go to url "userUrl"
                Then Redirecting to Checkout page when PROCEED TO CHECKOUT button is click should be verified
                And Closes the page

                Scenario: It should be verified that it is mandatory to enter E-mail in the Contact Information field on the Checkout page.
                  Given Open browser go to url "userUrl"
                  Then verified that it is mandatory to enter E-mail in the Contact Information field on the Checkout page.
                  And Closes the page

                  Scenario: Verify that the Email me with news and offers Check Box is visible and selected
                    Given Open browser go to url "userUrl"
                    Then To Checkout Page
                    Then Email me with news and offers Check Box is visible and selected
                    And Closes the page

                    Scenario: Verify that the Home delivery and Pickup Location radio buttons are visible and selectable in the Shipping Address section
                      Given Open browser go to url "userUrl"
                      Then To Checkout Page
                      Then Home delivery and Pickup Location radio buttons are visible and selectable in the Shipping Address section.
                      And Closes the page















