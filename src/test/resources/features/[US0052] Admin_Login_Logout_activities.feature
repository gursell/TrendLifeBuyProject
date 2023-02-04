

  Feature: Visibility testing of Login/Logout activities
    @SystemSecond
    Scenario: Test to access Login - Logout Activity page with Login Activity link from All Activity Logs menu

      Given Open browser go to url "adminUrl"
      Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
      Then  Admin clicks All Activity Logs and Activity Logs links in Dashboard
      Then  Admin verifies accessing Login - Logout Activity page from All Activity Logs menu
      And   Closes the page
        #All Activity Logs menusunden Login Activity linki ile Login - Logout Activity  sayfasina erisildigi dogrulanmali

    @SystemSecond
    Scenario: Test of deletion of activities in Login/Logout Activity list with Celan All button
      Given Open browser go to url "adminUrl"
      Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
      Then  Admin clicks All Activity Logs and Activity Logs links in Dashboard
      Then  Admin verifies that activities in Login - Logout Activity list are deleted with Celan All button
      And   Closes the page
         #Login - Logout Activity listesindeki aktivitelerin Celan All butonu ile temizlenebildigi / silinebildigi dogrulanmali


    Scenario: Test for listing activities in Login/Logout Activity list with User, Login AT, Logout AT, IP, Agent, Description headers

      Given Open browser go to url "adminUrl"
      Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
      Then  Admin clicks All Activity Logs and Activity Logs links in Dashboard
      Then  Admin verifies that the activities in the Login-Logout Activity list are the titles for which they are listed
      And   Closes the page
          #Login - Logout Activity listesindeki aktivitelerin User, Login AT, Logout AT, IP, Agent, Description basliklari altinda listelendigi dogrulanir


    Scenario: Search test with Quick Search Text Box in Login /Logout Activity list

      Given Open browser go to url "adminUrl"
      Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
      Then  Admin clicks All Activity Logs and Activity Logs links in Dashboard
      Then  Admin verifies that it is possible to search Login - Logout Activity list with Quick Search Text Box
      And   Closes the page
         #Quick Search Text Box'i ile Login - Logout Activity listesinde arama yapilabildigi dogrulanmali


    Scenario: Login/Logout Activity Listesindeki sayfalar arasinda gecisler testi

      Given Open browser go to url "adminUrl"
      Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
      Then  Admin clicks All Activity Logs and Activity Logs links in Dashboard
      Then  Test for transitions between pages in Login - Logout Activity List
      And   Closes the page
         #Login - Logout Activity Listesindeki sayfalar arasinda gecislerin oldugu dogrulanmali
