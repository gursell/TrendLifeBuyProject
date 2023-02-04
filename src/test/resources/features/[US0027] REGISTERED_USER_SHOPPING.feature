
  Feature: US0027 As a registered user of the site, I want to be able to shop from the site

    Scenario TC_2701 Verify that the site is accessible

      Given Open browser go to url "userUrl"
      Then User verifies that the site is accesible
      And Closes the page

    Scenario: TC_2702 Verify that the login button appear and redirects to the login page

      Given Open browser go to url "userUrl"
      Then Verify that login button appear
      Then User clicks on the login link, enters "" and "" and logs in
      Then User verifies that it redirects to the login page
      And Closes the page

    Scenario: TC_2703 The site can be logged with the correct email and password

      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User verifies that the site can be logged with correct email and password
      And Closes the page
    @SmokeTest
    Scenario: TC_2704 Verify that the products are displayed on the main page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User verifies that the products is displayed
      And Closes the page

    Scenario: TC_2705 Verify that Add to Cart button appears when the user hovers over the product
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      And Closes the page

    Scenario: TC_2706 When clicking the Add to Cart button the product has been added to the Cart Page.
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User verifies that the Item added to your cart is displayed
      And Closes the page

    Scenario: TC_2707 Verify that view cart button is visible and when clicked it redirects to the Cart page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then Verify that View Cart is displayed
      Then User clicks on the View Cart button
      Then User verifies that it redirects to the Cart page
      And Closes the page

    Scenario: TC_2708 Verify that the Proceed to Checkout button is visible on the Cart page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User verifies that the Proceed to Checkout button is displayed
      And Closes the page

    Scenario: TC_2709 Verify that When the Proceed to Checkout button is clicked,it redirects to the Checkout page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User verifies that it redirects to the Checkout page
      And Closes the page

    Scenario: TC_2710 Verify that the Continue to Shipping button is visible on the Checkout page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User verifies that the Continue to Shipping button is displayed
      And Closes the page

    Scenario: TC_2711 Verify that the Continue to Shipping button redirects to the Shipping page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User clicks on the Continue to Shipping button
      Then User verifies that it redirects to the Shipping page
      And Closes the page

    Scenario: TC_2712 Verify that the Continue to Payment button is visible on the Shipping page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User clicks on the Continue to Shipping button
      Then User verifies that the Payment button is visible
      And Closes the page

    Scenario: TC_2713 Verify that after selected Shipping Methods and the clicking the Continue to Payment button
    it should redirects to the Payment page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User clicks on the Continue to Shipping button
      Then User select Shipping Methods
      Then User clicks on the Continue to Payment button
      Then User verifies that it should redirects to the Payment page
      And Closes the page

    Scenario: TC_2714 Verify that the Pay Now button is visible on the Payment page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User clicks on the Continue to Shipping button
      Then User select Shipping Methods
      Then User clicks on the Continue to Payment button
      Then User verifies that Pay Now button is displayed
      And Closes the page

    Scenario: TC_2715 After selecting one of the payment methods and entering the required information,
    it should be verified that it redirects to the Order Summary page when the Pay Now button is clicked
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User clicks on the Continue to Shipping button
      Then User select Shipping Methods
      Then User clicks on the Continue to Payment button
      Then User selects one of the payment methods
      Then User selects one of the  billing addres
      #yukarının devamı olarak gerekli bilgiler girilmeli deniliyor ona gmre buraya adımlar ekle. action ile
      Then User clicks on the Pay Now button
      Then User verifies that it redirects to the Order Summary page
      And Closes the page

    Scenario: TC_2716 Verify that the order has been received message is seen on the Order Summary page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User clicks on the Continue to Shipping button
      Then User select Shipping Methods
      Then User clicks on the Continue to Payment button
      Then User selects one of the payment methods
      Then User selects one of the  billing addres
      Then User clicks on the Pay Now button
      Then User verifies that the order has been received message is seen
      And Closes the page

    Scenario: TC_2717 Verify that the information about the order is seen on the Order Summary page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User clicks on the Continue to Shipping button
      Then User select Shipping Methods
      Then User clicks on the Continue to Payment button
      Then User selects one of the payment methods
      Then User clicks on the Pay Now button
      Then User verifies that the information about the order is seen
      And Closes the page

    Scenario: TC_2718 Verify that the Continue Shopping button is visible on the Order Summary page.
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User clicks on the Continue to Shipping button
      Then User select Shipping Methods
      Then User clicks on the Continue to Payment button
      Then User selects one of the payment methods
      Then User clicks on the Pay Now button
      Then User verifies that the Continue Shopping button is displayed
      And Closes the page

    Scenario: TC_2719 Verify that clicking on the Continue Shopping button redirects to the home page
      Given Open browser go to url "userUrl"
      Then User clicks on the login link, enters "zeynepmail" and "password" and logs in
      Then User hovers over the product, and click the Add to Cart
      #Then User clicks on the AddToCartWindow
      Then User clicks on the Add to Cart
      Then User clicks on the View Cart button
      Then User clicks the on Proceed to Checkout button
      Then User clicks on the Continue to Shipping button
      Then User select Shipping Methods
      Then User clicks on the Continue to Payment button
      Then User selects one of the payment methods
      Then User clicks on the Pay Now button
      Then User clicks on the Continue Shopping button
      Then User verifies that the Continue Shopping button is redirects to the homepage
      And Closes the page













