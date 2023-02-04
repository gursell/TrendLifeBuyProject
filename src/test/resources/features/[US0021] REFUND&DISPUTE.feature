
    Feature: US21 Refund&Dispute page and functions test
      @US2101
      Scenario: 2101 Accessibility test of Refund & Dispute page

        Given Open browser go to url "userUrl"
        Then  User clicks on the login link, enters "boramail" and "password" and logs in
        Then  User clicks on dashboard link
        Then  User clicks Refund & Dispute section on dashboard page
        Then  User verifies that Refund & Dispute page is accessible
        Then  Closes the page
       # Refund & Dispute sayfasinin erisilebilir oldugu dogrulanmali