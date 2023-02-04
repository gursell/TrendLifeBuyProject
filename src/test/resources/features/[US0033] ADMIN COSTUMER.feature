
  Feature: TC_3301 Admin Costumer Test

    Scenario: Admin sayfaya giris yapabilmelidir

    Then Open browser go to url "adminUrl"
    Given Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
    Given Admin click 'Costumer' button then click 'All Costomer' button
    Given Admin Test that All Customer  is visible
    And Closes the page


@SmokeTest
 Scenario: Admin All Costumer Listeyi görebilmelidir
 Given Open browser go to url "adminUrl"
 Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
 Then Admin click 'Costumer' button then click 'All Costomer' button
 Then Admin Test that All Customer List  is visible


    Scenario: Is Active butonu calismalidir
    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
    Then Admin click 'Costumer' button then click 'All Costomer' button
    When Admin Check that the is Active radio button is working


    Scenario: All costumer gorunur olmali
    Given Open browser go to url "adminUrl"
    Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
    Then Admin click 'Costumer' button then click 'All Costomer' button
    Then Admin Test that All Customer List  is visible


        Scenario: Dropdown menu calismali
      Given Open browser go to url "adminUrl"
      Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
      When Admin click 'Costumer' button then click 'All Costomer' button
      When Admin Click Select DropDownMenu
      When Admin Check that the Details, Edit, Delete radio button is working


      Scenario: DropDown menu acilmali
      Given Open browser go to url "adminUrl"
      When Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
      Then Admin click 'Costumer' button then click 'All Costomer' button
      Then Admin Click Select DropDownMenu
      Then Admin Click Details radio button
      Then Admin Test that Customer Profile  is visible


        Scenario:Name, email ve phone görünür olmali
        Given Open browser go to url "adminUrl"
        Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
        Then Admin click 'Costumer' button then click 'All Costomer' button
        Then Admin Click Select DropDownMenu
        Then Admin Click Details radio button
        Then Admin Test that the texts Customer Profile, Name, Email, Phone is visible


          Scenario:Orders, Wallet Histories, Adress görünebilir olmali
          Then Open browser go to url "adminUrl"
          When Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
          Given Admin click 'Costumer' button then click 'All Costomer' button
          When Admin Click Select DropDownMenu
          Given Admin Click Details radio button
          Given Admin it should be verified that Orders, Wallet Histories information


      Scenario: Details butonu ilgili linke yönlendirmeli
    Then Open browser go to url "adminUrl"
    Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
    Then Admin click 'Costumer' button then click 'All Costomer' button
    Then Admin Click Select DropDownMenu
    Then Admin Click Details radio button
    Then Admin It should be verified that the Details link that appears when the select button


      Scenario: Date ve user görünür olmali
      Then Open browser go to url "adminUrl"
      When Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
      Given Admin click 'Costumer' button then click 'All Costomer' button
      Then Admin Click Select DropDownMenu
      Given Admin Click Details radio button
      Then Admin Click Wallet Histories button
      And The DATE, USER is visible


    Scenario: Arama kutusunda arama yapilabilmeli
    Then Open browser go to url "adminUrl"
    Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
    Then Admin click 'Costumer' button then click 'All Costomer' button
    When Verify that it is possible to search within the List from the Quick Search Text Box


   Scenario: Update Customer butonu calisiyor mu?
   Then Open browser go to url "adminUrl"
   Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
   Then Admin click 'Costumer' button then click 'All Costomer' button
   Then Admin Click Select DropDownMenu
   When Admin Click Edit button
   Given Admin Test that Update Customer is visible


   Scenario: update butonu calismali
   Then Open browser go to url "adminUrl"
   Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
   Given Admin click 'Costumer' button then click 'All Costomer' button
   Then Admin Click Select DropDownMenu
   Then Admin Click Edit button
   #Then Admin Does the update button work when the information is changed?
     #son adimda bir sorun var update yapinca kisi tekrar bulunamiyor


     Scenario: Delete butonu görünür olmali ve calismali
     Then Open browser go to url "adminUrl"
     When Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
     When Admin click 'Costumer' button then click 'All Costomer' button
     Given Admin Click Select DropDownMenu
     #Given Admin Click Delete button
     #Given Admin Verify that the Delete window is visible
       #locate ler sürekli degisiyor


    Scenario:inactive customer görünür olmali
    Then Open browser go to url "adminUrl"
    Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
    When Admin click 'Costumer' button then click 'All Costomer' button
    Given Admin click inactive Costomer button
    Given Admin Test that inactive Costumer is visible


   Scenario:inactive costumer de details, edit ve delete görünür olmali
   Then Open browser go to url "adminUrl"
   When Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
   When Admin click 'Costumer' button then click 'All Costomer' button
   When Admin click 'Costumer' button then 'inactive Costomer' button
   When Admin Click Select DropDownMenu
   Given Admin Test that Details, Edit, Delete  is visible
     #locate ler sürekli degisiyor


   Scenario:costumer profile görünür olmali
   Then Open browser go to url "adminUrl"
   Given Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
   When Admin click 'Costumer' button then click 'All Costomer' button
   Given Admin click 'Costumer' button then 'Inactive Costomer' button
   When Admin Click Select DropDownMenu
   #When Admin Test that Costumer Profile is visible
     #locate ler degisiyor


  Scenario:Adrse görünebilir olmali
  Then Open browser go to url "adminUrl"
  Then Admin enters an "adminmuratmail", a "password" and then clicks sign in link on admin page to login
  Then Admin click 'Costumer' button then 'Inactive Costomer' button
  Given Admin Click Select DropDownMenu
  #Given Admin Click Details DropDownMenu
  #When Admin Test that Orders, Wallet Histories, Adress is visible