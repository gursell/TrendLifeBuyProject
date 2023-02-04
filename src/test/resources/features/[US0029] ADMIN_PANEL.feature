

  Feature: US0029 As an administrator, I would like to have an admin panel to access site data,
            edit the site, and respond to customer requests.

    Scenario: TC_2901 Verify that the URL of the admin panel is accessible
      Given Open browser go to url "adminUrl"
      Then Admin verifies that the site is accesible
      And Closes the page

    Scenario: TC_2902 The admin Dashboard page can be logged with the valid admin email and password
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminzeynepmail", a "password" and then clicks sign in link on admin page to login
      Then Admin verifies that admin Dashboard can be logged with valid admin email and password
      And Closes the page

    Scenario: TC_2903 Verify that the Search Textbox should be visible at the top of the Dashboard and the site can be
    searched using the search TextBox.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminzeynepmail", a "password" and then clicks sign in link on admin page to login
      Then Admin verify that the Search Textbox is visible
      Then Admin clicks on the Search Textbox and search
      Then Admin verifies that the site can be searched using the Search Textbox
      And Closes the page

    Scenario: TC_2904 Verify that the Dashboard Side Bar narrows and expands
    when the menu icon is clicked on the Dashboard main page
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminzeynepmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks on the menu icon
      #Then Admin clicks on the menu icon and verifiy Bar
      Then Admin verifies that the Side Bar narrows and expands
      And Closes the page

    Scenario: TC_2905 When clicking on the Website button on the Dashboard home page,
    it should redirects to the user interface of the site
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminzeynepmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks on the Website button
      Then Admin verifies that it should redirect to the user interface of the site
      And Closes the page

    Scenario: TC_2906 When clicking the Today, This Week, This Mounth and This Year buttons on the Dashboard main page,
    Summary Board changes according to the selected value
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminzeynepmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks on Today button
      Then Admin clicks on This Week button
      Then Admin clicks on This Month button
      Then Admin clicks on This Year button
      Then Admin verifies that the data on the Summary Board changes

      And Closes the page

    Scenario: TC_2907 When the Visitor, Total Order, Total Pending Order, Total Completed Order, Total Sale,
    Total Review, Total Revenue, Active Customer, Total Subscriber buttons are clicked,
    it should be verified that they are directed to the relevant pages.
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminzeynepmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks on the Visitor
      Then Admin verifies that it redirects to the relevant page
      Then Admin clicks TrendlifeLogo
      Then Admin clicks on the Total Order
      Then Admin verifies that it redirects to the relevant page
      Then Admin clicks TrendlifeLogo
      Then Admin clicks on the Total Pending Order
      Then Admin verifies that it redirects to the relevant page
      Then Admin clicks TrendlifeLogo
      Then Admin clicks on the Total Completed Order
      Then Admin verifies that it redirects to the relevant page
      Then Admin clicks TrendlifeLogo
      Then Admin clicks on the Total Sale
      Then Admin verifies that it redirects to the relevant page
      Then Admin clicks TrendlifeLogo
      Then Admin clicks on the Total Review
      Then Admin verifies that it redirects to the relevant page
      Then Admin clicks TrendlifeLogo
      Then Admin clicks on the Total Revenue
      Then Admin verifies that it redirects to the relevant page
      Then Admin clicks TrendlifeLogo
      Then Admin clicks on the Active Customer
      Then Admin verifies that it redirects to the relevant page
      Then Admin clicks TrendlifeLogo
      Then Admin clicks on the Total Subscriber
      Then Admin verifies that it redirects to the relevant page
      And Closes the page



