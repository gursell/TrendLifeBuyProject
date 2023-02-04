
Feature: US_0048 As an administrator, I want the Product Review page to be able to see the ratings for the products.
  @SmokeSecond
  Scenario: US_4801 It should be verified that the Product Review page can be accessed with the Product Review link.
    Given Open browser go to url "adminUrl"
    Then  Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click on the Reivew link
    Then Click on the Product Reivew link
    Then Verifies that it goes to the Product Review page.
    And Closes the page
@SmokeSecond
  Scenario: US_4802 Verify that the Product Review List is visible on the Product Review page
    Given Open browser go to url "adminUrl"
    Then  Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click on the Reivew link
    Then Click on the Product Reivew link
    Then Verify that the Product Review List appears on the Product Review page
    And Closes the page

  Scenario: US_4803 Verify that it is possible to search within the Product Review List from the Quick Search TextBox
    Given Open browser go to url "adminUrl"
    Then  Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click on the Reivew link
    Then Click on the Product Reivew link
    Then Verify that the Product Review List is searched from the Quick Search Text Box
    And Closes the page

  Scenario: US_4804 In the Product Review List, it should be verified that the products are listed under the headings Product, Rating, Number of Review.
    Given Open browser go to url "adminUrl"
    Then  Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
    Then Click on the Reivew link
    Then Click on the Product Reivew link
    Then In the Product Review List, it is verified that the products are listed under the headings of Product, Rating, Number of Comments.
    And Closes the page

