Feature: US 0005 Home Page Body Functions Test

  Scenario: TC 0501 Verify that Trending Products, Hot Categories, House Appliances, Recommendation For You , Top Brand, Popular Searches, Trendlifebuy | ONLINE SHOPPING is visible

    Given  Open browser go to "userUrl"
    Then   Check if trending products, hot categories, house appliances, recommendation for you, top brand,popular searches, trendlifebuy | ONLINE SHOPPING are visible at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0502 Verify that the sofa link leads to the relevant page

    Given  Open browser go to "userUrl"
    And    Click to sofa link at the "userUrl"
    Then   Verify if sofa link leads to the relevant page after clicking sofa link at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0503 Verify that the Wooden Furniture link leads to the relevant page

    Given  Open browser go to "userUrl"
    Then   Verify if wooden furniture link leads to the relevant page after clicking on wooden furniture link at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0504 Verify that the View All button redirects to the relevant page

    Given  Open browser go to "userUrl"
    Then   Verify if the view all button redirects to the relevant page after clicking on view all button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0505 Verify that the More Deals button redirects to the relevant page

    Given  Open browser go to "userUrl"
    Then   Verify if the more deals button redirects to the relevant page after clicking on more deals button at the "userUrl"
    And    The user closes "userUrl"

  Scenario: TC 0506 Verify that more products are displayed when we hit the Load More button

    Given  Open browser go to "userUrl"
    Then   Verify if more products are displayed after clicking to load more button at the "userUrl"
    And    The user closes "userUrl"
