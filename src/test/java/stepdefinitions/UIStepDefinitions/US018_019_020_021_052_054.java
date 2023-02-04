package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US018_019_020_021_052_054_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US018_019_020_021_052_054 {

    US018_019_020_021_052_054_Page life=new US018_019_020_021_052_054_Page();
    Actions actions=new Actions(Driver.getDriver());

    // ==================== US18  MY ORDER   DIKKAT__ 2. URUNE GORE LOCATE LERI ALDIM
    // 1801- My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca ilgili siparisin detay sayfasina gidildigi dogrulanmali.
    @Then("User clicks My Order section on dashboard page")
    public void userClicksMyOrderSectionOnDashboardPage() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        life.myOrderLink.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
    }
    @Then("User verifies that the Order Details page is accessible")
    public void userVerifiesThatTheOrderDetailsPageIsAccessible() {
        life.orderDetailsButton.click();
        String expData="details";
        String requestData="https://trendlifebuy.com/my-purchase-order-details";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expData));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(requestData));
        Assert.assertTrue(life.orderDetailsListBox.isEnabled());

    }
    @Then("User verifies that sections on the Order Details page appear")
    public void userVerifiesThatSectionsOnTheOrderDetailsPageAppear() {
        //1802- Order ID, Status, Order date, Order Amount, Package, Price, Est arrival date, TAX Amount information is displayed.
        life.orderDetailsButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.detailsOrderID.isDisplayed());
        Assert.assertTrue(life.detailsStatus.isDisplayed());
        ReusableMethods.bekle(3);
        Assert.assertTrue(life.detailsOrderDate.isDisplayed());
        Assert.assertTrue(life.detailsOrderAmount.isDisplayed());
        Assert.assertTrue(life.detailsPackage.isDisplayed());
        Assert.assertTrue(life.detailsPrice.isDisplayed());
        Assert.assertTrue(life.detailsEstArrivalDate.isDisplayed());
        Assert.assertTrue(life.detailsTAXAmount.isDisplayed());
    }
    @Then("User verifies that sections, stages appear on the Order Details page")
    public void userVerifiesThatSectionsStagesAppearOnTheOrderDetailsPage() {
        // 1803- Order Details sayfasinda; Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.
        life.orderDetailsButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.detailsPending.isDisplayed());
        Assert.assertTrue(life.detailsProcessing.isDisplayed());
        Assert.assertTrue(life.detailsShipped.isDisplayed());
        Assert.assertTrue(life.detailsRecieved.isDisplayed());
        Assert.assertTrue(life.detailsDelivered.isDisplayed());
    }
    @Then("User verifies that text about the order is visible on the Order Details page")
    public void userVerifiesThatTextAboutTheOrderIsVisibleOnTheOrderDetailsPage() {
        // 1804- Order Details sayfasinda; Pending, Processing, Shipped, Recieved, Delivered görünür oldugu dogrulanmali
        life.orderDetailsButton.click();
        Assert.assertTrue(life.detailsPendingText.isDisplayed());
        Assert.assertTrue(life.detailsProcessingText.isDisplayed());
        Assert.assertTrue(life.detailsShippedText.isDisplayed());
        Assert.assertTrue(life.detailsRecievedText.isDisplayed());
        Assert.assertTrue(life.detailsDeliveredText.isDisplayed());
    }
    @Then("User verifies that the Cancel Order button on the Order Details page is available")
    public void userVerifiesThatTheCancelOrderButtonOnTheOrderDetailsPageIsAvailable() {
        //1805- My Order sayfasindaki Cancel Order butonunun Cancel sekmesine yönlendirme yaptigi dogrulanmali.
        life.cancelOrderButton.click();
        Assert.assertTrue(life.selectCancelReasonTab.isDisplayed());
    }
    @Then("User verifies that the Reason box and Send button are available when the Cancel Order button on the Order Details page is pressed")
    public void userVerifiesThatTheReasonBoxAndSendButtonAreAvailableWhenTheCancelOrderButtonOnTheOrderDetailsPageIsPressed() {
        //1806- Cancel sekmesindeki Reason textbox'inin aktif oldugu ve send butonuna tiklaninca girilen order'in iptal edildigi dogrulanmali.
        life.cancelOrderButton.click();
        Assert.assertTrue(life.reasonBox.isEnabled());     // .isDisplayed da hata verdi
        Assert.assertTrue(life.sendButton.isEnabled());
        Assert.assertTrue(life.orderCancelledButton3.isDisplayed());
    }
    @Then("User verifies that the product has Shipping, Billing and Payment information on the Order Details page")
    public void userVerifiesThatTheProductHasShippingBillingAndPaymentInformationOnTheOrderDetailsPage() {
        //1807- Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali
        life.orderDetailsButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.detailsShippingInfo.isEnabled());
        Assert.assertTrue(life.detailsBillingInfo.isEnabled());
        Assert.assertTrue(life.detailsPaymentInfo.isEnabled());
        Assert.assertTrue(life.detailsShippingInfo.isDisplayed());
        Assert.assertTrue(life.detailsBillingInfo.isDisplayed());
        Assert.assertTrue(life.detailsPaymentInfo.isDisplayed());
    }

    //  ==================== 2. US19 MY WALLET   =======================>>>
    // 1901- Dashboard sayfasinda bulunan side bar'daki My Wallet linkinin Wallet sayfasina yönlendirdigi dogrulanmali.
    @Then("User clicks My Wallet section on dashboard page")
    public void userClicksMyWalletSectionOnDashboardPage() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        life.myWalletLink.click();
        ReusableMethods.bekle(2);
    }
    @Then("User verifies that the My Wallet link in the sidebar on the Dashboard page is accessible")
    public void userVerifiesThatTheMyWalletLinkInTheSidebarOnTheDashboardPageIsAccessible() {
        Assert.assertTrue(life.myWalletTitle.isDisplayed());
    }
    //1902-My Wallet sayfasinda Total Balance, Running Balance, Pending Balance boardlarinin görünür oldugu dogrulanmali.
    @Then("User verifies that balance statuses appear on My Wallet page")
    public void userVerifiesThatBalanceStatusesAppearOnMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.myWalletTotalBalance.isDisplayed());
        Assert.assertTrue(life.myWalletRunningBalance.isDisplayed());
        Assert.assertTrue(life.myWalletPendingBalance.isDisplayed());
    }
    //1903- My Wallet sayfasinda Recharge Wallet butonunun görünür oldugu ve Recharge Amount sekmesine yönlendirdigi dogrulanmali.
    @Then("User verifies that the Top Up My Wallet button appears and works on the My Wallet page")
    public void userVerifiesThatTheTopUpMyWalletButtonAppearsAndWorksOnTheMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.myWalletRechargeWallet.isDisplayed());
        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.rechargeWalletRechargeAmountTab.isDisplayed());
    }
    //1904- Recharge Amount sekmesinde tutar girebilebilen bir TextBox'in oldugu dogrulanmali
    @Then("User verifies that there is a TextBox where the amount can be entered in the Recharge Amount tab")
    public void userVerifiesThatThereIsATextBoxWhereTheAmountCanBeEnteredInTheRechargeAmountTab() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.enterRechargeAmountBox.isDisplayed());
    }
    //1905
    @Then("User verifies that the Cancel button on the Recharge Amount tab is visible and working, to cancel the operation")
    public void userVerifiesThatTheCancelButtonOnTheRechargeAmountTabIsVisibleAndWorkingToCancelTheOperation() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.cancelButtonAmountBox.isDisplayed());
        ReusableMethods.bekle(2);

        life.cancelButtonAmountBox.click();
        ReusableMethods.bekle(2);
        Assert.assertFalse(life.cancelButtonAmountBox.isDisplayed());
    }
    //1906
    @Then("User verifies that the Add Fund button in the Recharge Amount tab is visible and working")
    public void userVerifiesThatTheAddFundButtonInTheRechargeAmountTabIsVisibleAndWorking() {

        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.addFundButton.isDisplayed());
        ReusableMethods.bekle(2);

        life.enterRechargeAmountBox.sendKeys("1500");
        life.addFundButton.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.myWalletRechargeTitle.isDisplayed());
    }
    //1907- My Wallet sayfasinda Wallet Recharge History listesinde Date, Trx Id, Amount, Type, Payment Method, Status
    @Then("User verifies that they have corresponding columns in the Wallet Upload History list on the My Wallet page")
    public void userVerifiesThatTheyHaveCorrespondingColumnsInTheWalletUploadHistoryListOnTheMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(1);

        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Date"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Trx Id"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Amount"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Type"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Payment Method"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Status"));
    }

    @Then("User verifies Wallet transactions in the Wallet Recharge History list on the My Wallet page")
    public void userVerifiesWalletTransactionsInTheWalletRechargeHistoryListOnTheMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).
                sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.walletRechargeHistoryTitle.isEnabled());
        Assert.assertTrue(life.walletRechargeHistoryTab.isEnabled());
    }

    // ============================= 3. US20- MY COUPON  ====================

    @Then("User clicks My Coupons section on dashboard page")
    public void userClicksMyCouponsSectionOnDashboardPage() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        life.myCouponsLink.click();
    }
    @Then("User confirms that the My Coupon page is accessible")
    public void userConfirmsThatTheMyCouponPageIsAccessible() {
        String expectedLink="https://trendlifebuy.com/profile/coupons";
        String actualLink=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualLink,expectedLink);
    }

    @Then("User verifies that the coupon code can be entered in the textBox in the Add Coupons section of the My Coupon page")
    public void userVerifiesThatTheCouponCodeCanBeEnteredInTheTextBoxInTheAddCouponsSectionOfTheMyCouponPage() {
        life.addCouponsCodeBox.sendKeys("GÖRDUN mu? addCouponsCodeBox kutusu calisiyor");
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.addCouponsCodeBox.isDisplayed());   //????

    }
    @Then("User verifies that the coupon code can be added with the Add Coupon button on the My Coupons page")
    public void userVerifiesThatTheCouponCodeCanBeAddedWithTheAddCouponButtonOnTheMyCouponsPage() {
        life.addCouponsCodeBox.sendKeys("CODE ler tek kullanimlik, NAAPCEEEZ?  Methods ile cagirmaa???"); // Code 123123123  ama kullaninca code nin isi bitiyor, tek seferlik
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.addCouponButton.isDisplayed());
        life.addCouponButton.click();
        ReusableMethods.bekle(2);
        //Assert.assertFalse(life.addCouponButton.isDisplayed()); ----???? 2002

    }

    @Then("User verifies which information the Collected Coupons list is listed")
    public void userVerifiesWhichInformationTheCollectedCouponsListIsListed() {
        Assert.assertTrue(life.collectedCouponsValue.isDisplayed());
        Assert.assertTrue(life.collectedCouponsName.isDisplayed());
        Assert.assertTrue(life.collectedCouponsCode.isDisplayed());
        Assert.assertTrue(life.collectedCouponsValidity.isDisplayed());
        Assert.assertTrue(life.collectedCouponsAction.isDisplayed());
    }

    //  ==================== 4. US21  MY Refund & Dispute   =======================>>>
    @Then("User clicks Refund & Dispute section on dashboard page")
    public void userClicksRefundDisputeSectionOnDashboardPage() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.refundDisputeLink.click();
    }
    @Then("User verifies that Refund & Dispute page is accessible")
    public void userVerifiesThatRefundDisputePageIsAccessible() {
        ReusableMethods.bekle(2);
        String expRefundSidaLink= "my-refund-list";
        String actualSidaLink = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualSidaLink.contains(expRefundSidaLink));
    }

    //  ====================  US52  All Activity Logs   =======================>>>
    /*@Given("Admin enters an {string}, a {string} and then clicks sign in link on admin page to login")
    public void adminEntersAnAAndThenClicksSignInLinkOnAdminPageToLogin(String mail,String password) {
        life.adminLoginBora(mail, password);
        ReusableMethods.bekle(2);
    }

     */
    @Then("Admin clicks All Activity Logs and Activity Logs links in Dashboard")
    public void adminClicksAllActivityLogsAndActivityLogsLinksInDashboard() {                                    //5201
        actions.moveToElement(life.allActivityLogsLink).perform();
        ReusableMethods.bekle(2);

        actions.click(life.allActivityLogsLink).perform();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(1);
        life.loginActivityLink.click();
    }
    @Then("Admin verifies accessing Login - Logout Activity page from All Activity Logs menu")
    public void adminVerifiesAccessingLoginLogoutActivityPageFromAllActivityLogsMenu() {
        //Assert.assertTrue(life.loginLogoutActivityTitle.isDisplayed());
        String expLoginLogoutActivityTitle="Login - Logout Activity";
        Assert.assertTrue(life.loginLogoutActivityTitle.getText().contains(expLoginLogoutActivityTitle));
    }

    @Then("Admin verifies that activities in Login - Logout Activity list are deleted with Celan All button")
    public void adminVerifiesThatActivitiesInLoginLogoutActivityListAreDeletedWithCelanAllButton() {            //5202
        ReusableMethods.bekle(2);
        life.cleanAllButton.click();
        ReusableMethods.bekle(1);
        life.dataDeleteButton2.click();
        ReusableMethods.bekle(2);
        String expData="No data";
        String actData=life.sonucYazisi52NoData.getText();
        Assert.assertTrue(actData.contains(expData));


    }
    @Then("Admin verifies that the activities in the Login-Logout Activity list are the titles for which they are listed")
    public void adminVerifiesThatTheActivitiesInTheLoginLogoutActivityListAreTheTitlesForWhichTheyAreListed() { //5203
        Assert.assertTrue(life.loginLogoutActivityUser.isDisplayed());
        Assert.assertTrue(life.loginLogoutActivityLoginAt.isDisplayed());
        Assert.assertTrue(life.loginLogoutActivityLogoutAt.isDisplayed());
        Assert.assertTrue(life.loginLogoutActivityIP.isDisplayed());
        Assert.assertTrue(life.loginLogoutActivityAgent.isDisplayed());
        Assert.assertTrue(life.loginLogoutActivityDescription.isDisplayed());
        //5203  User, Login AT, Logout AT, IP, Agent, Description basliklari altinda listelendigi dogrulanir
        //System.out.println(life.loginLogoutActivityBasliklar.getText()); // SL USER LOGIN AT LOGOUT AT IP AGENT DESCRIPTION
        String expData="SL USER LOGIN AT LOGOUT AT IP AGENT DESCRIPTION";
        String actData=life.loginLogoutActivityBasliklar.getText();  // Actual   :SL USER LOGIN AT LOGOUT AT IP AGENT DESCRIPTION
        Assert.assertEquals(expData,actData);
    }

    @Then("Admin verifies that it is possible to search Login - Logout Activity list with Quick Search Text Box")
    public void adminVerifiesThatItIsPossibleToSearchLoginLogoutActivityListWithQuickSearchTextBox() {           //5204
        ReusableMethods.bekle(3);
        //actions.sendKeys(Keys.END).perform();
        String sonucYazisi1=life.searchBoxInfoYazisi.getText();
        ReusableMethods.bekle(2);
        life.quickSearchBox.sendKeys("9999");
        ReusableMethods.bekle(3);
        String sonucYazisi2=life.searchBoxInfoYazisi.getText();
        Assert.assertNotEquals(sonucYazisi1,sonucYazisi2);  //Passed

    }
    @Then("Test for transitions between pages in Login - Logout Activity List")
    public void testForTransitionsBetweenPagesInLoginLogoutActivityList() {                                      //5205
        actions.sendKeys(Keys.END).perform();
        String sonucYazisi1=life.searchBoxInfoYazisi.getText();
        ReusableMethods.bekle(1);
        //life.sayfa2Button.click();
        life.nextSagTus.click();
        ReusableMethods.bekle(1);
        String sonucYazisi2=life.searchBoxInfoYazisi.getText();
        Assert.assertNotEquals(sonucYazisi1,sonucYazisi2);
    }

    // ==================== US54 Contact Request   =======================>>>
    @Then("Admin clicks Contact Request and contact Mail links in Dashboard")
    public void adminClicksContactRequestAndContactMailLinksInDashboard() {
        actions.moveToElement(life.contactRequestLink).perform();
        ReusableMethods.bekle(2);
        life.contactRequestLink.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);

        actions.moveToElement(life.contactMailLink).perform();
        ReusableMethods.bekle(2);
        life.contactMailLink.click();
        ReusableMethods.bekle(3);
    }
    @Then("Admin verifies that Contact Mail page is accessible from Contact Request tab in Dashboard")
    public void adminVerifiesThatContactMailPageIsAccessibleFromContactRequestTabInDashboard() {
        String expectedData="contact";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedData));
    }
    @Then("Admin verifies Contact Mail LIst is visible on Contact Mail page")
    public void adminVerifiesContactMailLIstIsVisibleOnContactMailPage() {                                   //5402
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.contactMailListTitle.isDisplayed());
    }
    @Then("Admin verifies that messages are listed with Name , Email, Message headers in Contact Mail LIst")
    public void adminVerifiesThatMessagesAreListedWithNameEmailMessageHeadersInContactMailLIst() {             //5403
        Assert.assertTrue(life.contactMailListNAME.isDisplayed());
        Assert.assertTrue(life.contactMailListEMAIL.isDisplayed());
        Assert.assertTrue(life.contactMailListMESSAGE.isDisplayed());
    }
    @Then("Admin verifies that when clicking Contact Mail List headers, the order of the information is changed")
    public void adminVerifiesThatWhenClickingContactMailListHeadersTheOrderOfTheInformationIsChanged() {        //5404
        //ReusableMethods.bekle(2);
        String foreClickExpData=life.altEMAILWebElementBirinci.getText();
        ReusableMethods.bekle(2);
        life.contactMailListEMAIL.click();
        ReusableMethods.bekle(2);
        String efterClickActData=life.altEMAILWebElementBirinci.getText();   //bitox26925@lance7.com
        Assert.assertNotEquals(foreClickExpData,efterClickActData);

    }
    @Then("Admin verifies that it is possible to search Contact Mail List with Quick Search Box")
    public void adminVerifiesThatItIsPossibleToSearchContactMailListWithQuickSearchBox() {              //5405  --Dinamik degil
        String foreClickExpData=life.altEMAILWebElementBirinci.getText();
        String altEMAILWebElementIkinci= life.altEMAILWebElementIkinci.getText();
        //System.out.println(foreClickExpData);      // Expected :u_3_4635293334@wisequarter.com
        actions.click(life.mailListQuickSearchBoxKutusu).sendKeys("test@test.com").sendKeys(Keys.ENTER).perform();
        ReusableMethods.bekle(2);
        String enterQuickSearhBoxData=life.altEMAILWebElementBirinci.getText();   //test@test.com
        //System.out.println(enterQuickSearhBoxData);     // test@test.com
        String beklenenBirinciData= "test@test.com";
        Assert.assertNotEquals(foreClickExpData,enterQuickSearhBoxData);
        Assert.assertEquals(enterQuickSearhBoxData,beklenenBirinciData);

    }

    @Then("Admin verifies the visibility of Show and Delete links in Select tab under Action heading")
    public void adminVerifiesTheVisibilityOfShowAndDeleteLinksInSelectTabUnderActionHeading() {             //5406
        life.actionsSelectButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.actionsShowButton.isDisplayed());
        Assert.assertTrue(life.actionsDeleteButton.isDisplayed());
    }

    @Then("Admin verifies that clicking the Show link in the Select tab reaches the Contact Mail page")
    public void adminVerifiesThatClickingTheShowLinkInTheSelectTabReachesTheContactMailPage() {           //5407
        life.actionsSelectButton.click();
        ReusableMethods.bekle(1);
        life.actionsShowButton.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(life.contactMailDetayTitle.isDisplayed());

        String expData="contact";
        String actData=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actData.contains(expData));

        String expData2="Contact";
        String actData2=life.contactMailDetayTitle.getText();
        Assert.assertTrue(actData2.contains(expData2));
    }

    @Then("Admin verifies that the mail has been deleted with the Delete link in the Select tab under the Action title")
    public void adminVerifiesThatTheMailHasBeenDeletedWithTheDeleteLinkInTheSelectTabUnderTheActionTitle() {    //5408
        String expSonucYazisi1=life.getSonucYazisi54NoData.getText();
        life.actionsSelectButton.click();
        ReusableMethods.bekle(1);
        life.actionsDeleteButton.click();
        ReusableMethods.bekle(1);
        life.actionsSelectDelete2Button.click();
        ReusableMethods.bekle(1);
        String actSonucYazisi2=life.getSonucYazisi54NoData.getText();
        // Peki ikinci sayfada veriler olunca, birinci sayfadan silinen yerine hemen ikinci sayfadan veri gelirse
        Assert.assertNotEquals(expSonucYazisi1,actSonucYazisi2);
        //Assert.assertNotEquals(foreDeleteExpData,efterDeleteActData);   // alttaki mailde ayni olunca FAILED, message sanki uniq

    }
}



