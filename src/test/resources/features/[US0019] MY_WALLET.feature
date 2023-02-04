
  Feature: US19 Wallet to be used in shopping and its functions

    Scenario: 1901 My Wallet link on the Dashboard page

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks My Wallet section on dashboard page
      Then  User verifies that the My Wallet link in the sidebar on the Dashboard page is accessible
      Then  Closes the page
        #Dashboard sayfasinda bulunan side bar'daki My Wallet linkinin Wallet sayfasina yönlendirdigi dogrulanmali


    Scenario: 1902 Total Balance, Running Balance, Pending Balance sections on My Wallet page

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks My Wallet section on dashboard page
      Then  User verifies that balance statuses appear on My Wallet page
      Then  Closes the page
        # My Wallet sayfasinda Total Balance, Running Balance, Pending Balance boardlarinin görünür oldugu dogrulanmali.


    Scenario: 1903 Recharge Wallet button on My Wallet page

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks My Wallet section on dashboard page
      Then  User verifies that the Top Up My Wallet button appears and works on the My Wallet page
      Then  Closes the page
        # My Wallet sayfasinda Recharge Wallet butonunun görünür oldugu ve Recharge Amount sekmesine yönlendirdigi dogrulanmali.


    Scenario: 1904 TextBox in Recharge Amount tab

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks My Wallet section on dashboard page
      Then  User verifies that there is a TextBox where the amount can be entered in the Recharge Amount tab
      Then  Closes the page
        # Recharge Amount sekmesinde tutar girebilebilen bir TextBox'in oldugu dogrulanmali


    Scenario: 1905 Cancel button in Recharge Amount tab

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks My Wallet section on dashboard page
      Then  User verifies that the Cancel button on the Recharge Amount tab is visible and working, to cancel the operation
      Then  Closes the page
        #Islemi iptal etmek icin Recharge Amount sekmesindeki Cancel butonunun görünür oldugu ve iptal islemini yapabildigi dogrulanmali.


    Scenario: 1906 TextBox and Add Fund button on Recharge Amount tab

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks My Wallet section on dashboard page
      Then  User verifies that the Add Fund button in the Recharge Amount tab is visible and working
      Then  Closes the page
        #Recharge Amount sekmesindeki TextBox'a girilen tutari Wallet'a eklemek icin Add Fund butonunun görünür oldugu ve ilgili sayfaya yönlendirdigi dogrulanmali


    Scenario: 1907 In the Wallet Recharge History list on the My Wallet page, Date, Trx Id, Amount, Type, Payment Method, Status columns

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks My Wallet section on dashboard page
      Then  User verifies that they have corresponding columns in the Wallet Upload History list on the My Wallet page
      Then  Closes the page
        #My Wallet sayfasinda Wallet Recharge History listesinde Date, Trx Id, Amount, Type, Payment Method, Status sütunlarinin oldugu dogrulanmali


    Scenario: 1908 Wallet transactions listed in Wallet Recharge History on My Wallet

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in
      Then  User clicks on dashboard link
      Then  User clicks My Wallet section on dashboard page
      Then  User verifies Wallet transactions in the Wallet Recharge History list on the My Wallet page
      Then  Closes the page
        # My Wallet sayfasinda Wallet Recharge History listesinde Cüzdan hareketlerinin varligi dogrulanmali
