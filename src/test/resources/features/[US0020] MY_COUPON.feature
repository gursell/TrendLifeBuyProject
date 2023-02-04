  @SystemTest
  Feature: US20 Using Coupon and Adding Test in Shopping
      @US2001
      Scenario: 2001 Test to access My Coupon page

        Given Open browser go to url "userUrl"
        Then  User clicks on the login link, enters "boramail" and "password" and logs in
        Then  User clicks on dashboard link
        Then  User clicks My Coupons section on dashboard page
        Then  User confirms that the My Coupon page is accessible
        Then  Closes the page
           # My Coupon sayfasinin erisilebilir oldugu dogrulanmali

      @US2002
      Scenario: 2002 TextBox test in Add Coupons section on My Coupon page

        Given Open browser go to url "userUrl"
        Then  User clicks on the login link, enters "boramail" and "password" and logs in
        Then  User clicks on dashboard link
        Then  User clicks My Coupons section on dashboard page
        Then  User verifies that the coupon code can be entered in the textBox in the Add Coupons section of the My Coupon page
        Then  Closes the page
           # My Coupon sayfasindaki Add Coupons bölümündeki textBox'a kupon kodunun girilebilir oldugu dogrulanmali

      @US2003
      Scenario: 2003 Add Coupon button and Coupon Code test

        Given Open browser go to url "userUrl"
        Then  User clicks on the login link, enters "boramail" and "password" and logs in
        Then  User clicks on dashboard link
        Then  User clicks My Coupons section on dashboard page
        Then  User verifies that the coupon code can be added with the Add Coupon button on the My Coupons page
        Then  Closes the page
           # My Coupon sayfasindaki Add Coupons bölümündeki Add Coupon butonu ile textBox'a girilen kupon kodunun eklenebildigi dogrulanmli

      @US2004
      Scenario: 2004 Title test of information on the Collected Coupons list

        Given Open browser go to url "userUrl"
        Then  User clicks on the login link, enters "boramail" and "password" and logs in
        Then  User clicks on dashboard link
        Then  User clicks My Coupons section on dashboard page
        Then  User verifies which information the Collected Coupons list is listed
        Then  Closes the page
           # Collected Coupons listesinde toplanan kuponlar Coupon Value, Store Name, Coupon Code, Validity, Action
             # bilgilerine gore listelendigi dogrulanmali
