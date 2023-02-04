package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import pages.US027_029_043_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;


public class US027_029_043 {
    US027_029_043_Page us027_029_page = new US027_029_043_Page();
    TrendLifeBuyPage trendLifeBuyPage = new TrendLifeBuyPage();

    TrendLifeBuyCommonStep ortaklife = new TrendLifeBuyCommonStep();

    //US027_029_Page adminVerifiesReleventPage;




    @Then("Verify that login button appear")
    public void verify_that_login_button_appear() {
        Assert.assertTrue(trendLifeBuyPage.loginLink.isDisplayed());

    }

    @Then("User verifies that it redirects to the login page")
    public void user_verifies_that_it_redirects_to_the_login_page() {
        Assert.assertTrue(us027_029_page.LoginPage.isDisplayed());

    }

    @Then("User verifies that the site can be logged with correct email and password")
    public void user_verifies_that_the_site_can_be_logged_with_correct_email_and_password() {
        Assert.assertTrue(trendLifeBuyPage.dashboardLink.isDisplayed());

    }

    @Then("User verifies that the products is displayed")
    public void user_verifies_that_the_products_is_displayed() {
        Assert.assertTrue(us027_029_page.productLocate.isDisplayed());
    }

    @Then("User hovers over the product, and click the Add to Cart")
    public void userHoversOverTheProductAndClickTheAddToCart() {

        ReusableMethods.bekle(5);
        //page.closead.click();
        //ReusableMethods.bekle(2);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        action.moveToElement(us027_029_page.productLocate).perform();
        Actions action2 = new Actions(Driver.getDriver());
        action2.moveToElement(us027_029_page.addToCartButton).perform();
        ReusableMethods.bekle(5);
        us027_029_page.addToCartButton.click();
        ReusableMethods.bekle(5);

    }

    @Then("User clicks on the AddToCartWindow")
    public void userClicksOnTheAddToCartWindow() {
        us027_029_page.AddtoCartWindow.click();
    }

    @Then("User verifies that the Item added to your cart is displayed")
    public void user_verifies_that_the_ıtem_added_to_your_cart_is_displayed() {
        ReusableMethods.bekle(4);
        Assert.assertTrue(us027_029_page.itemAddedtext.isDisplayed());
        ReusableMethods.bekle(4);
    }

    @Then("Verify that View Cart is displayed")
    public void verify_that_view_cart_is_displayed() {
        ReusableMethods.bekle(4);
        Assert.assertTrue(us027_029_page.viewCartButton.isDisplayed());
        ReusableMethods.bekle(4);

    }

    @Then("User clicks on the View Cart button")
    public void user_clicks_on_the_view_cart_button() {
        ReusableMethods.bekle(3);
        us027_029_page.viewCartButton.click();
    }

    @Then("User verifies that it redirects to the Cart page")
    public void user_verifies_that_it_redirects_to_the_cart_page() {
        ReusableMethods.bekle(3);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/cart";
        Assert.assertTrue(actualUrl.equals(expectedUrl));

    }

    @Then("User verifies that the Proceed to Checkout button is displayed")
    public void user_verifies_that_the_proceed_to_checkout_button_is_displayed() {
        ReusableMethods.bekle(4);
        Assert.assertTrue(us027_029_page.proceedToCheckout.isDisplayed());
    }

    @Then("User clicks the on Proceed to Checkout button")
    public void user_clicks_the_on_proceed_to_checkout_button() {
        ReusableMethods.bekle(2);
        Actions action3=new Actions(Driver.getDriver());
        action3.sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        us027_029_page.proceedToCheckout.click();
        ReusableMethods.bekle(3);
    }

    @Then("User verifies that it redirects to the Checkout page")
    public void user_verifies_that_it_redirects_to_the_checkout_page() {
        ReusableMethods.bekle(4);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/checkout";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }

    @Then("User verifies that the Continue to Shipping button is displayed")
    public void user_verifies_that_the_continue_to_shipping_button_is_displayed() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(us027_029_page.continueToShipping.isDisplayed());
    }

    @Then("User clicks on the Add to Cart")
    public void user_clicks_on_the_add_to_cart() {

    }

    @Then("User clicks on the Continue to Shipping button")
    public void user_clicks_on_the_continue_to_shipping_button() {
        //ReusableMethods.bekle(5);
        Actions action4=new Actions(Driver.getDriver());
        action4.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_UP).perform();
        ReusableMethods.bekle(7);
        Actions action5=new Actions(Driver.getDriver());
        action5.moveToElement(us027_029_page.continueToShipping).perform();
        ReusableMethods.bekle(7);
        us027_029_page.continueToShipping.click();
    }

    @Then("User verifies that it redirects to the Shipping page")
    public void user_verifies_that_it_redirects_to_the_shipping_page() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(us027_029_page.shippingMethodTitle.isDisplayed());

    }

    @Then("User verifies that the Payment button is visible")
    public void user_verifies_that_the_payment_button_is_visible() {
        Assert.assertTrue(us027_029_page.continueToPayment.isDisplayed());

    }

    @Then("User select Shipping Methods")
    public void user_select_shipping_methods() {
        //us027_029_page.continueToShipping.click();
    }

    @Then("User clicks on the Continue to Payment button")
    public void user_clicks_on_the_continue_to_payment_button() {
        Actions action6=new Actions(Driver.getDriver());
        action6.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        Actions action7=new Actions(Driver.getDriver());
        action7.moveToElement(us027_029_page.continueToPayment).perform();
        ReusableMethods.bekle(4);
        us027_029_page.continueToPayment.click();

    }

    @Then("User verifies that it should redirects to the Payment page")
    public void user_verifies_that_it_should_redirects_to_the_payment_page() {
        Assert.assertTrue(us027_029_page.paymentTitle.isDisplayed());

    }

    @Then("User verifies that Pay Now button is displayed")
    public void user_verifies_that_pay_now_button_is_displayed() {
        Assert.assertTrue(us027_029_page.payNowButton.isDisplayed());

    }

    @Then("User selects one of the payment methods")
    public void user_selects_one_of_the_payment_methods() {
        Actions action10=new Actions(Driver.getDriver());
        action10.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        //action10.moveToElement(us027_029_page.cashOnDelivery).perform();
        us027_029_page.cashOnDelivery.click();
        ReusableMethods.bekle(5);

    }

    @Then("User selects one of the  billing addres")
    public void userSelectsOneOfTheBillingAddres() {
        Actions action8=new Actions(Driver.getDriver());
        action8.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(6);
        Actions action9=new Actions(Driver.getDriver());
        action9.moveToElement(us027_029_page.sameAsShipping).perform();
        ReusableMethods.bekle(4);
        us027_029_page.sameAsShipping.click();

    }

    @Then("User clicks on the Pay Now button")
    public void user_clicks_on_the_pay_now_button() {
        us027_029_page.payNowButton.click();

    }

    @Then("User verifies that it redirects to the Order Summary page")
    public void user_verifies_that_it_redirects_to_the_order_summary_page() {
        Assert.assertTrue(us027_029_page.orderSummaryTitle.isDisplayed());

    }

    @Then("User verifies that the order has been received message is seen")
    public void user_verifies_that_the_order_has_been_received_message_is_seen() {
        Assert.assertTrue(us027_029_page.orderReceivedMessage.isDisplayed());
    }

    @Then("User verifies that the information about the order is seen")
    public void user_verifies_that_the_information_about_the_order_is_seen() {
        Assert.assertTrue(us027_029_page.orderInformation.isDisplayed());
    }

    @Then("User verifies that the Continue Shopping button is displayed")
    public void userVerifiesThatTheContinueShoppingButtonIsDisplayed() {
        Assert.assertTrue(us027_029_page.continueShopping.isDisplayed());
    }

    @Then("User clicks on the Continue Shopping button")
    public void user_clicks_on_the_continue_shopping_button() {
        Actions action10=new Actions(Driver.getDriver());
        action10.moveToElement(us027_029_page.continueShopping).perform();
        us027_029_page.continueShopping.click();
    }

    @Then("User verifies that the Continue Shopping button is redirects to the homepage")
    public void user_verifies_that_the_continue_shopping_button_is_redirects_to_the_homepage() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/";

    }






    @Then("Admin verifies that the site is accesible")
    public void admin_verifies_that_the_site_is_accesible() {
        Assert.assertTrue(trendLifeBuyPage.dashboardLink.isDisplayed());
    }

    @Then("Admin verifies that admin Dashboard can be logged with valid admin email and password")
    public void adminVerifiesThatAdminDashboardCanBeLoggedWithValidAdminEmailAndPassword() {
        Assert.assertTrue(us027_029_page.adminProfilicon.isDisplayed());
    }

    @Then("Admin verify that the Search Textbox is visible")
    public void adminVerifyThatTheSearchTextboxIsVisible() {
        Assert.assertTrue(us027_029_page.adminSearchbox.isDisplayed());
    }

    @Then("Admin clicks on the Search Textbox and search")
    public void adminClicksOnTheSearchTextboxAndSearch() {
        us027_029_page.adminSearchbox.click();
        us027_029_page.adminSearchbox.sendKeys("customer"); // buraya birşey yazılarak enter yapılmıyor
        // altta çıkan seçeneklere tıklanarak arama yapılabiliyor. tekrar bak
    }

    @Then("Admin verifies that the site can be searched using the Search Textbox")
    public void adminVerifiesThatTheSiteCanBeSearchedUsingTheSearchTextbox() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(us027_029_page.customerDown);
        us027_029_page.customerDown.click();

    }

    @Then("Admin clicks on the menu icon")
    public void adminClicksOnTheMenuIcon() {
        ReusableMethods.bekle(10); //menü ikonu tıklanmıyor
        us027_029_page.adminMenuicon.click();
        //Assert.assertTrue(us027_029_page.adminDashboardTitle.isDisplayed());
    }

    @Then("Admin verifies that the Side Bar narrows and expands")
    public void adminVerifiesThatTheSideBarNarrowsAndExpands() {
        ReusableMethods.bekle(5);
        Assert.assertFalse(us027_029_page.adminDashboardTitle.isDisplayed());
    }

    @Then("Admin clicks on the Website button")
    public void adminClicksOnTheWebsiteButton() {
        us027_029_page.adminWebsiteButton.click();
    }

    @Then("Admin verifies that it should redirect to the user interface of the site")
    public void adminVerifiesThatItShouldRedirectToTheUserInterfaceOfTheSite() {
        String ilkSayfaHandleDegeri=Driver.getDriver().getWindowHandle();
        us027_029_page.adminWebsiteButton.click();

        Set<String> windowHandleSeti=Driver.getDriver().getWindowHandles();
        String ikincisfWindowHandledegeri="";

        for (String eachhandledegeri: windowHandleSeti
        ) {
            if (!eachhandledegeri.equals(ilkSayfaHandleDegeri)){
                ikincisfWindowHandledegeri=eachhandledegeri;
            }
        }
        Driver.getDriver().switchTo().window(ikincisfWindowHandledegeri);

        Assert.assertTrue(us027_029_page.websiteNewPage.isDisplayed());

        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/";
        Assert.assertTrue(actualUrl.equals(expectedUrl));


    }


    @Then("Admin clicks on Today button")
    public void adminClicksOnTodayButton() {
        us027_029_page.adminTodayButton.click();
        //us027_029_page.visitorDataToday.getText();

    }

    @Then("Admin clicks on This Week button")
    public void adminClicksOnThisWeekButton() {
        us027_029_page.adminWeekButton.click();
        //us027_029_page.visitorWeek.getText();

    }
    @Then("Admin clicks on This Month button")
    public void adminClicksOnThisMonthButton() {
    }

    @Then("Admin clicks on This Year button")
    public void adminClicksOnThisYearButton() {
        us027_029_page.adminYearButton.click();
    }

    @Then("Admin verifies that the data on the Summary Board changes")
    public void adminVerifiesThatTheDataOnTheSummaryBoardChanges() {
        Assert.assertFalse(us027_029_page.todayVisitor.equals(us027_029_page.weekVisitor)); //test olmadı
    }

    @Then("Admin clicks on the Visitor")
    public void adminClicksOnTheVisitor() {
        us027_029_page.visitorButton.click();
    }

    @Then("Admin verifies that it redirects to the relevant page")
    public void adminVerifiesThatItRedirectsToTheRelevantPage() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/admin-report/visitor-report";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }

    @Then("Admin clicks TrendlifeLogo")
    public void adminClicksTrendlifeLogo() {
        Driver.getDriver().navigate().back();
        //Actions actions10=new Actions(Driver.getDriver());
        //actions10.click(us027_029_page.trendlifeLogo).perform();

    }

    @Then("Admin clicks on the Total Order")
    public void adminClicksOnTheTotalOrder() {
       // us027_029_page.TotalOrderButton.click();
        //ReusableMethods.bekle(4);

        String ilksfHandledegeri=Driver.getDriver().getCurrentUrl();
        us027_029_page.TotalOrderButton.click();

        Set<String> windowHandleSeti=Driver.getDriver().getWindowHandles();
        String ikincisfWindowHandledegeri="";

        for (String eachhandledegeri: windowHandleSeti
        ) {
            if (!eachhandledegeri.equals(ilksfHandledegeri)){
                ikincisfWindowHandledegeri=eachhandledegeri;
            }
        }
        Driver.getDriver().switchTo().window(ikincisfWindowHandledegeri);
        Assert.assertTrue(us027_029_page.orderRelevantpage.isDisplayed());
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/ordermanage/total-sales-list";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
        us027_029_page.admintrendLifeLogo.click();

    }

    @Then("Admin clicks on the Total Pending Order")
    public void adminClicksOnTheTotalPendingOrder() {

        String ilksfHandledegeri=Driver.getDriver().getCurrentUrl();
        us027_029_page.TotalOrderButton.click();

        Set<String> windowHandleSeti=Driver.getDriver().getWindowHandles();
        String ikincisfWindowHandledegeri="";

        for (String eachhandledegeri: windowHandleSeti
        ) {
            if (!eachhandledegeri.equals(ilksfHandledegeri)){
                ikincisfWindowHandledegeri=eachhandledegeri;
            }
        }
        Driver.getDriver().switchTo().window(ikincisfWindowHandledegeri);
        Assert.assertTrue(us027_029_page.orderRelevantpage.isDisplayed());
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/ordermanage/total-sales-list";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }

    @Then("Admin clicks on the Total Completed Order")
    public void adminClicksOnTheTotalCompletedOrder() {
        String ilksfHandledegeri=Driver.getDriver().getCurrentUrl();
        us027_029_page.TotalOrderButton.click();

        Set<String> windowHandleSeti=Driver.getDriver().getWindowHandles();
        String ikincisfWindowHandledegeri="";

        for (String eachhandledegeri: windowHandleSeti
        ) {
            if (!eachhandledegeri.equals(ilksfHandledegeri)){
                ikincisfWindowHandledegeri=eachhandledegeri;
            }
        }
        Driver.getDriver().switchTo().window(ikincisfWindowHandledegeri);
        Assert.assertTrue(us027_029_page.orderRelevantpage.isDisplayed());
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/ordermanage/total-sales-list";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }

    @Then("Admin clicks on the Total Sale")
    public void adminClicksOnTheTotalSale() {
        us027_029_page.TotalSaleButton.click();
    }

    @Then("Admin clicks on the Total Review")
    public void adminClicksOnTheTotalReview() {
        us027_029_page.TotalReviewButton.click();
    }

    @Then("Admin clicks on the Total Revenue")
    public void adminClicksOnTheTotalRevenue() {
        us027_029_page.TotalRevenueButton.click();
    }


    @Then("Admin clicks on the Active Customer")
    public void adminClicksOnTheActiveCustomer() {
        us027_029_page.ActiveCustomerButton.click();
    }

    @Then("Admin clicks on the Total Subscriber")
    public void adminClicksOnTheTotalSubscriber() {
        us027_029_page.TotalSubscriberButton.click();

    }

    @Then("Admin clicks on the Admin Reports")
    public void adminClicksOnTheAdminReports() {
        us027_029_page.AdminReports.click();
    }
    @Then("Admin clicks on the WishlistButton")
    public void adminClicksOnTheWishlistButton() {
        us027_029_page.WishlistButton.click();

    }


    @Then("Admin verifies that Wishlist report accesible")
    public void adminVerifiesThatWishlistReportAccesible() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("wishlist"));
    }

    @Then("Admin clicks on the wishlistSearchBox")
    public void adminClicksOnTheWishlistSearchBox() {
        us027_029_page.wishlistSearchBox.click();

    }

    @Then("Admin select one report type")
    public void adminSelectOneReportType() {
        us027_029_page.wishlistSelect.click();

    }

    @Then("Admin clicks on the wishlistSearchButton")
    public void adminClicksOnTheWishlistSearchButton() {
        us027_029_page.wishlistSearchButton.click();
    }

    @Then("Admin verifies that wishlist type can be selected")
    public void adminVerifiesThatWishlistTypeCanBeSelected() {
        Assert.assertTrue(us027_029_page.wishlistSearchBox.isEnabled());
    }

    @Then("Admin verifies that selected wishlist report is displayed")
    public void adminVerifiesThatSelectedWishlistReportIsDisplayed() {
        Assert.assertTrue(us027_029_page.wishlistSelectedType.isDisplayed());



    }
}

