
    Feature:
      @SmokeSecond
      Scenario: Accessibility test of Contact Mail page from Contact Request tab in Content menu on Dashboard Side Bar

        Given Open browser go to url "adminUrl"
        Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
        Then  Admin clicks Contact Request and contact Mail links in Dashboard
        Then  Admin verifies that Contact Mail page is accessible from Contact Request tab in Dashboard
        And   Closes the page
             #Dashboard Side Bar'indaki Content menüsündeki Contact Request sekmesinden Contact Mail sayfasina erisilebilir oldugu dogrulanmali.

      @SmokeSecond
      Scenario: Visibility test of Contact Mail LIst on Contact Mail page

        Given Open browser go to url "adminUrl"
        Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
        Then  Admin clicks Contact Request and contact Mail links in Dashboard
        Then  Admin verifies Contact Mail LIst is visible on Contact Mail page
        And   Closes the page
             #Contact Mail sayfasinda Contact Mail LIst'in görunur oldugu dogrulanmali.


      Scenario: Test of Name , Email, Message headers in Contact Mail LIst

        Given Open browser go to url "adminUrl"
        Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
        Then  Admin clicks Contact Request and contact Mail links in Dashboard
        Then  Admin verifies that messages are listed with Name , Email, Message headers in Contact Mail LIst
        And   Closes the page
             #Contact Mail LIst'te mesajlarin Name , Email, Message basliklari altinda listelendigi dogrulanmali.


      Scenario: Test to change the order of the information appearing in the List when the headings of the Contact Mail List are clicked

        Given Open browser go to url "adminUrl"
        Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
        Then  Admin clicks Contact Request and contact Mail links in Dashboard
        Then  Admin verifies that when clicking Contact Mail List headers, the order of the information is changed
        And   Closes the page
             #Contact Mail List basliklarina tiklandiginda List'te görünen bilgilerin siralanisinin degistigi dogrulanmali


      Scenario: Test to search in Contact Mail List with Quick Search Box

        Given Open browser go to url "adminUrl"
        Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
        Then  Admin clicks Contact Request and contact Mail links in Dashboard
        Then  Admin verifies that it is possible to search Contact Mail List with Quick Search Box
        And   Closes the page
             #Visibility test of Show and Delete links in Select tab under Action title


      Scenario: Visibility test of Show and Delete links in Select tab under Action title

        Given Open browser go to url "adminUrl"
        Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
        Then  Admin clicks Contact Request and contact Mail links in Dashboard
        Then  Admin verifies the visibility of Show and Delete links in Select tab under Action heading
        And   Closes the page
           #Action basligi altindaki Select sekmesinde Show ve Delete linklerinin görünür oldugu dogrulanmali.



      Scenario: Test to redirect to Contact Mail page when Show link is clicked in Select tab

        Given Open browser go to url "adminUrl"
        Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
        Then  Admin clicks Contact Request and contact Mail links in Dashboard
        Then  Admin verifies that clicking the Show link in the Select tab reaches the Contact Mail page
        And   Closes the page
           #Action basligi altindaki Select sekmesinde Show linkine tiklandiginda Contact Mail sayfasina yönlendirdigi ve Contact Mail sayfasinda ilgili mailin detaylarinin göründügü dogrulanmali



      Scenario: Mail deletion test with Delete link in Select tab under Action title

        Given Open browser go to url "adminUrl"
        Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
        Then  Admin clicks Contact Request and contact Mail links in Dashboard
        Then  Admin verifies that the mail has been deleted with the Delete link in the Select tab under the Action title
        And   Closes the page
           #Action basligi altindaki Select sekmesinde Delete linkine tiklandiginda acilan pencereden ilgili mailin silinebildigi dogrulanmali.
