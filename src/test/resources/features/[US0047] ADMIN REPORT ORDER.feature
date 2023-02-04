Feature: US0047 As an administrator, I want the Order page to be able to see the reports about the orders on the site

  Scenario: TC_4701 It must be verified that the page related to the Order Link can be accessed

    Given Open browser go to url "adminUrl"
    Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
    Then Admin clicks Admin Reports link
    Then page related to the Order Link can be accessed
    And Closes the page

    Scenario: TC_4702 In order to filter the product on the page that opens, it must be verified that the Type and Date are selectable

      Given Open browser go to url "adminUrl"
      Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
      Then Admin clicks Admin Reports link
      Then Click order link
      Then Click type and Date
      Then Verify Type and Date List from admin
      And Closes the page

      Scenario: TC_4703 t should be verified that one of them can be selected ( Select One, All Order, Pending Orders, Confirmed Orders, Copmleted Orders, Inhouse Orders) as the type.
        Given Open browser go to url "adminUrl"
        Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
        Then Admin clicks Admin Reports link
        Then Click order link
        Then Click Type Section
        Then Verify All Order
        Then Verify Pending Orders
        Then Verify Confirmed Order
        Then Verify Completed Orders
        Then Verify Inhouse Orders
        And Closes the page

        Scenario: TC_4704 Verify that Today, Yesterday, Last 7 Days, Last 30 Days, This Month, Last Month, This Year, Last Year, Custom Range are selectable as a date.
          Given Open browser go to url "adminUrl"
          Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
          Then Admin clicks Admin Reports link
          Then Click order link
          Then Click Date Section
          Then Verify Today
          Then Verify Yesterday
          Then Verify Last 7 Days
          Then Verify Last 30 Days
          Then Verify This Month
          Then Verify Last Month
          Then Verify This Year
          Then Verify Last Year
          Then Verify Custom Range
          And Closes the page

          Scenario: TC_4705 When Custom Range is selected as the date, it should be verified that the desired date range can be selected manually.
            Given Open browser go to url "adminUrl"
            Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
            Then Admin clicks Admin Reports link
            Then Click order link
            Then Click Date Section
            Then verified that the desired date range can be selected manually.
            And Closes the page

            Scenario: TC_4706 When selecting Today, Yesterday, Last 7 Days, Last 30 Days, This Month, Last Month, This Year, Last Year from the Date tab, it should be verified that the correct date is shown in the Date TextBox
              Given Open browser go to url "adminUrl"
              Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
              Then Admin clicks Admin Reports link
              Then Click order link
              Then Click Date Section
              Then Verified today section correct date is shown in the Date TextBox
              Then Verified Yesterday section correct date is shown in the Date TextBox
              Then Verified Last 7 day section correct date is shown in the Date TextBox
              Then Verified Last 30 Day section correct date is shown in the Date TextBox
              Then Verified This Month section correct date is shown in the Date TextBox
              Then Verified Last Month section correct date is shown in the Date TextBox
              Then Verified This Year section correct date is shown in the Date TextBox
              Then Verified Last Year section correct date is shown in the Date TextBox
              And Closes the page


              Scenario: TC_4707 Verify that the products are listed under the headings Date, Order ID, Email, Product QTY, Total Amount, Order Status, Work Paid in the opened Order Lists.
                Given Open browser go to url "adminUrl"
                Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
                Then Admin clicks Admin Reports link
                Then Click order link
                Then Click Search Button
                Then Verify Date that the products are listed under the headings
                Then Verify Order ID that the products are listed under the headings
                Then Verify E mail that the products are listed under the headings
                Then Verify Product QTY that the products are listed under the headings
                Then Verify Total Amount that the products are listed under the headings
                Then Verify Order ID that the products are listed under the headings
                Then Verify IS PAID that the products are listed under the headings
                And Closes the page


                Scenario: TC_4708 It should be verified that it is possible to search in the Orders Lists from the Quick Search TextBox
                  Given Open browser go to url "adminUrl"
                  Then Admin enters an "admintalhamail", a "password" and then clicks sign in link on admin page to login
                  Then Admin clicks Admin Reports link
                  Then Click order link
                  Then Click This Month from Date list
                  Then Click Search Button
                  Then should be verified that it is possible to search in the Orders Lists from the Quick Search TextBox
                  And Closes the page






















