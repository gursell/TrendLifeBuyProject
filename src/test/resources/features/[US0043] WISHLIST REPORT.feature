
  Feature: US0043 As an administrator, I would like to have a page
    where I can see the wishlist reports in order to have information about the products on the wishlist

    Scenario: TC_4301 Verify that Wishlist reports can be accessed from the Wishlist link
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminzeynepmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks on the Admin Reports
      Then Admin clicks on the WishlistButton
      Then Admin verifies that Wishlist report accesible
      And  Closes the page

    Scenario: TC_4302 Verify that the Wishlist Type can be selected with the Search TextBox
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminzeynepmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks on the Admin Reports
      Then Admin clicks on the WishlistButton
      Then Admin clicks on the wishlistSearchBox
      Then Admin select one report type
      Then Admin verifies that wishlist type can be selected
      And  Closes the page

    Scenario: TC_4303 Verify that the reports of the wishlist suitable
      for the selected Type are displayed in the WishList
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminzeynepmail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks on the Admin Reports
      Then Admin clicks on the WishlistButton
      Then Admin clicks on the wishlistSearchBox
      Then Admin select one report type
      Then Admin clicks on the wishlistSearchButton
      Then Admin verifies that selected wishlist report is displayed
      And  Closes the page




