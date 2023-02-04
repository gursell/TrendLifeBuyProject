
  Feature: US_0032 As an administrator, I would like the pages to be listed in a Side Bar under categories so that I can easily access the pages in the Dashboard panel.

    Scenario: US_3201 As an administrator, I would like the pages to be listed in a Side Bar under categories so that I can easily access the pages in the Dashboard panel.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify the visibility of the Dashboard menu title in the Dashboard Sidebar.
      Then Closes the page

    Scenario: US_3202  When clicking on the Dashboard text under the Dashboard category in the Dashboard Side Bar, it should be verified that it redirects to the home page.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Click on the Dashboard text
      Then Verify that you are redirected to the homepage.
      Then Closes the page

    Scenario: US_3203 Verify that the User Manages category is visible in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that the User Manages category appears.
      Then Closes the page

    Scenario: US_3204 Verify that there are Customer and Human Resource pop-up menus under the User Manages category in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that the Customer and Human Resources drop-down menus exist under the User Managements category.
      Then Closes the page

    Scenario: US_3205 Verify that the Order Manages category is visible in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that the Order Managements category appears in the Dashboard Sidebar.
      Then Closes the page

    Scenario: US_3206  Verify that there are Order Manage and Refund Manage pop-ups under the Order Manages category in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that the Order Management and Refund Management popups exist under the Order Managements category.
      Then Closes the page

    Scenario: US_3207 Verify that the Product Manage category is visible in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that the Product Manage category is visible in the Dashboard Side Bar.
      Then Closes the page

    Scenario: US_3208  Verify that there are Products, Review, Shipping, and Media Manager pop-ups under the Product Manage category in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that there are Products, Review, Shipping, and Media Manager popups under the Product Management category.
      Then Closes the page

    Scenario: US_3209 Verify that the Promotional category is visible in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that the Promotional category is visible in the Dashboard Side Bar.
      Then Closes the page

    Scenario: US_3210  Verify that there are Marketing and Gift Card pop-ups under the Promotional category in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that there are Marketing and Gift Card pop-ups under the Promotional category in the Dashboard Side Bar.
      Then Closes the page

    Scenario: US_3211 Verify that the Finance category is visible in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that the Finance category is visible in the Dashboard Side Bar.
      Then Closes the page

    Scenario: US_3212 Verify that there are Account and Wallet Manage pop-ups under the Finance category in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that there are Account and Wallet Manage pop-ups under the Finance category in the Dashboard Side Bar.
      Then Closes the page

    Scenario: US_3213 Verify that the Content category is visible in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then Verify that the Content category is visible in the Dashboard Side Bar.
      Then Closes the page

    Scenario: US_3214 It should be verified that there are Blog, Contact Request, Admin Reports, Support Ticket and All Activity Logs pop-ups under the Content category in the Dashboard Side Bar.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "admineminemail", a "password" and then clicks sign in link on admin page to login
      Then It should be verified that there are Blog, Contact Request, Admin Reports, Support Ticket and All Activity Logs pop-ups under the Content category in the Dashboard Side Bar.
      Then Closes the page























