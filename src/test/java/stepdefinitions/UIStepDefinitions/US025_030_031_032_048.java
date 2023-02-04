package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US025_030_031_032_048_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US025_030_031_032_048 {
    US025_030_031_032_048_Page life=new US025_030_031_032_048_Page();
    Actions actions=new Actions(Driver.getDriver());
    @Then("User clicks My Account section on dashbord page")
    public void user_clicks_my_account_section_on_dashbord_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.myAccountLink.click();
    }
    @Then("User verifies that the page is accessible")
    public void user_verifies_that_the_page_is_accessible() {
        String expected="https://trendlifebuy.com/profile";
        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expected,actual);
        //   Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/profile"));
    }
/*
    @Then("User clicks Purchase History section on dashbord page")
    public void user_clicks_purchase_history_section_on_dashbord_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        life.purchaseHistoryLink.click();
    } */
 /*   @Then("User verifies that Purchase History page is accessible")
    public void user_verifies_that_purchase_history_page_is_accessible() {
        String expected="https://trendlifebuy.com/my-purchase-histories";
        String actual= Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expected,actual);
        ReusableMethods.bekle(2);
    } */
    @Then("User verifies that \\(These credentials do not match our records.) message appears in the corner")
    public void userVerifiesThatTheseCredentialsDoNotMatchOurRecordsMessageAppearsInTheCorner() {
        Assert.assertTrue(life.systemMessage.isDisplayed());
        ReusableMethods.bekle(2);
    }
    //US_25
    @Then("User clicks on the Logout link.")
    public void user_clicks_on_the_logout_link() {
        life.logoutLink.click();
    }
    @Then("Verifies that the users Logout link is displayed on the home page.")
    public void verifies_that_the_users_logout_link_is_displayed_on_the_home_page() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(life.logoutLink.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("It is displayed on the account that the user is logged out of.")
    public void it_is_displayed_on_the_account_that_the_user_is_logged_out_of() {
        ReusableMethods.bekle(2);
        actions.moveToElement(life.logoutisdisplayed).perform();
        Assert.assertTrue(life.logoutisdisplayed.isEnabled());
        ReusableMethods.bekle(2);
    }
    @Then("The visibility of the Sign Out link in the Dashboard Sidebar is verified.")
    public void the_visibility_of_the_sign_out_link_in_the_dashboard_sidebar_is_verified() {
        ReusableMethods.bekle(2);
        actions.moveToElement(life.logoutisdisplayed).perform();
        Assert.assertTrue(life.dashboardLogoutLink.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("User clicks  Logout link in the Dashboard Side Bar.")
    public void user_clicks_logout_link_in_the_dashboard_side_bar() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
      //  actions.moveToElement(life.dashboardLogoutLink).click().perform();
    life.dashboardLogoutLink.click();
    }
    @Then("It displayed verified that the account is logged out.")
    public void it_displayed_verified_that_the_account_is_logged_out() {
        Assert.assertTrue(life.logoutisdisplayed.isEnabled());
        ReusableMethods.bekle(2);
    }

    //Admin Page 30

    @Then("Click on the Notifications icon")
    public void click_on_the_notifications_icon() {
       actions.moveToElement(life.notificationIcon).click().perform();
     //   life.notificationIcon.click();
        ReusableMethods.bekle(2);
    }
    @Then("Verify the visibility of Notifications in the pop-up window.")
    public void verify_the_visibility_of_notifications_in_the_pop_up_window() {
        actions.moveToElement(life.notificationText).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.notificationText.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("Click the Settings button in the window that opens")
    public void click_the_settings_button_in_the_window_that_opens() {
        life.notificationSettingClick.click();
    }
    @Then("Verify redirected to user-notification page")
    public void verify_redirected_to_user_notification_page() {
        actions.moveToElement(life.PersonalNotificationSettingPage).perform();
        Assert.assertTrue(life.PersonalNotificationSettingPage.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("It is verified that the message type can be changed from the Personal Notification Setting List.")
    public void it_is_verified_that_the_message_type_can_be_changed_from_the_personal_notification_setting_list() {
        Assert.assertTrue(life.checkmark.isDisplayed());
        ReusableMethods.bekle(2);
        life.checkmark.click();
        Assert.assertTrue(life.checkmark.isEnabled());
        ReusableMethods.bekle(2);
    }
    @Then("Click the Read All button in the menu that opens")
    public void click_the_read_all_button_in_the_menu_that_opens() {
        life.readAllButton.click();
    }
    //eger bildirim yoksa Read All ve View All butonlari cikmiyor!!!!
    @Then("Verify that information messages \\(as read) are deleted from the window")
    public void verify_that_information_messages_as_read_are_deleted_from_the_window() {
        Assert.assertTrue(life.noNotificationFoundText.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("Click the View All button in the menu that opens.")
    public void click_the_view_all_button_in_the_menu_that_opens() {
    life.viewButton.click();
    }
    @Then("Verify that you are redirected to the relevant page.")
    public void verify_that_you_are_redirected_to_the_relevant_page() {
    Assert.assertTrue(life.notificationText.isDisplayed());
    ReusableMethods.bekle(2);
    }
    // Admin Page 31
    @Then("Verify that the profile icon appears in the top bar.")
    public void verify_that_the_profile_icon_appears_in_the_top_bar() {
    Assert.assertTrue(life.profileIcon.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Click the profile icon")
    public void click_the_profile_icon() {
    life.profileIcon.click();
    }
    @Then("Verify that the Name of the logged in account appears")
    public void verify_that_the_name_of_the_logged_in_account_appears() {
    Assert.assertTrue(life.adminName.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Verify that My Profile and Sign out links appear.")
    public void verify_that_my_profile_and_sign_out_links_appear() {
    Assert.assertTrue(life.myProfile.isDisplayed());
    life.profileIcon.click();
    Assert.assertTrue(life.logOut.isDisplayed());
    }
    @Then("Click the My Profile link")
    public void click_the_my_profile_link() {
    life.myProfile.click();
    }
    @Then("Verify that you have been to the profile page")
    public void verify_that_you_have_been_to_the_profile_page() {
    Assert.assertTrue(life.basicInfo.isDisplayed());
    }
    @Then("Verify that the Basics section on the profile page includes First Name, Last Name, Email Address, Phone Number, Siege Date.")
    public void verify_that_the_basics_section_on_the_profile_page_includes_first_name_last_name_email_address_phone_number_siege_date() {
        Assert.assertTrue(life.firstName.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.lastName.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.emailName.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.dateOfBirth.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.phoneNummer.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("Verify that First Name, Last Name, Email Address, Phone Number, Siege Date can be updated in the Basics section of the profile page.")
    public void verify_that_first_name_last_name_email_address_phone_number_siege_date_can_be_updated_in_the_basics_section_of_the_profile_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        life.update.click();
        ReusableMethods.bekle(3);
    }
    @Then("Click the Address button on the profile page")
    public void click_the_address_button_on_the_profile_page() {
    life.adressLink.click();
    ReusableMethods.bekle(2);
    }
    @Then("Verify that the address information appears on the page that opens.")
    public void verify_that_the_address_information_appears_on_the_page_that_opens() {
    Assert.assertTrue(life.adressVerify.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Click the Add New Address button")
    public void click_the_add_new_address_button() {
    life.adressLink.click();
    ReusableMethods.bekle(2);
    }
    @Then("Verify that a new address can be added to the account logged in from the opened page and that the added addresses appear on the address page.")
    public void verify_that_a_new_address_can_be_added_to_the_account_logged_in_from_the_opened_page_and_that_the_added_addresses_appear_on_the_address_page() {
        life.addNewAdress.click();
        life.addNewAdressName.sendKeys("Adam" + Keys.ENTER);
        ReusableMethods.bekle(2);
        life.getAddNewAdressAdress.sendKeys("Sokak" );
        ReusableMethods.bekle(2);
        life.getAddNewAdressEmail.sendKeys("adam@gmail.com" );
        ReusableMethods.bekle(2);
        life.getAddNewAdressPhone.sendKeys("+46768889977" );
        ReusableMethods.bekle(2);
        life.getAddNewAdressPostaKod.sendKeys("252 25" );
        ReusableMethods.bekle(2);
        life.getAddNewAdressCity.click();
        life.AdressCityClick.click();
        ReusableMethods.bekle(2);
        life.getAddNewAdressSave.click();
        ReusableMethods.bekle(3);
    }
    //Admin Page 32
    @Then("Verify the visibility of the Dashboard menu title in the Dashboard Sidebar.")
    public void verify_the_visibility_of_the_dashboard_menu_title_in_the_dashboard_sidebar() {
    Assert.assertTrue(life.dashbordIcon.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Click on the Dashboard text")
    public void click_on_the_dashboard_text() {
    life.dashbordIcon.click();
    ReusableMethods.bekle(2);
    }
    @Then("Verify that you are redirected to the homepage.")
    public void verify_that_you_are_redirected_to_the_homepage() {
        Assert.assertTrue(life.dashbordIcon.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("Verify that the User Manages category appears.")
    public void verify_that_the_user_administering_category_appears() {
    Assert.assertTrue(life.userManagesCategory.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Verify that the Customer and Human Resources drop-down menus exist under the User Managements category.")
    public void verify_that_the_customer_and_human_resources_drop_down_menus_exist_under_the_user_managements_category() {
    Assert.assertTrue(life.customer.isDisplayed());
    ReusableMethods.bekle(2);
    Assert.assertTrue(life.humanResource.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Verify that the Order Managements category appears in the Dashboard Sidebar.")
    public void verify_that_the_order_managements_category_appears_in_the_dashboard_sidebar() {
    Assert.assertTrue(life.orderManagesCategory.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Verify that the Order Management and Refund Management popups exist under the Order Managements category.")
    public void verify_that_the_order_management_and_refund_management_popups_exist_under_the_order_managements_category() {
    Assert.assertTrue(life.orderManage.isDisplayed());
    ReusableMethods.bekle(2);
    Assert.assertTrue(life.refundManage.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Verify that the Product Manage category is visible in the Dashboard Side Bar.")
    public void verify_that_the_product_manage_category_is_visible_in_the_dashboard_side_bar() {
    Assert.assertTrue(life.productManagesCategory.isDisplayed());
    }
    @Then("Verify that there are Products, Review, Shipping, and Media Manager popups under the Product Management category.")
    public void verify_that_there_are_products_review_shipping_and_media_manager_popups_under_the_product_management_category() {
    Assert.assertTrue(life.products.isDisplayed());
        ReusableMethods.bekle(2);
    Assert.assertTrue(life.review.isDisplayed());
        ReusableMethods.bekle(2);
    Assert.assertTrue(life.shipping.isDisplayed());
        ReusableMethods.bekle(2);
    Assert.assertTrue(life.mediaManager.isDisplayed());
        ReusableMethods.bekle(2);

    }
    @Then("Verify that the Promotional category is visible in the Dashboard Side Bar.")
    public void verify_that_the_promotional_category_is_visible_in_the_dashboard_side_bar() {
    Assert.assertTrue(life.promotionalCategory.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("Verify that there are Marketing and Gift Card pop-ups under the Promotional category in the Dashboard Side Bar.")
    public void verify_that_there_are_marketing_and_gift_card_pop_ups_under_the_promotional_category_in_the_dashboard_side_bar() {
    Assert.assertTrue(life.marketing.isDisplayed());
        ReusableMethods.bekle(2);
    Assert.assertTrue(life.giftCard.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("Verify that the Finance category is visible in the Dashboard Side Bar.")
    public void verify_that_the_finance_category_is_visible_in_the_dashboard_side_bar() {
    Assert.assertTrue(life.financeCategory.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("Verify that there are Account and Wallet Manage pop-ups under the Finance category in the Dashboard Side Bar.")
    public void verify_that_there_are_account_and_wallet_manage_pop_ups_under_the_finance_category_in_the_dashboard_side_bar() {
       Assert.assertTrue(life.account.isDisplayed());
       ReusableMethods.bekle(2);
       Assert.assertTrue(life.walletManage.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("Verify that the Content category is visible in the Dashboard Side Bar.")
    public void verify_that_the_content_category_is_visible_in_the_dashboard_side_bar() {
        Assert.assertTrue(life.contentCategory.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("It should be verified that there are Blog, Contact Request, Admin Reports, Support Ticket and All Activity Logs pop-ups under the Content category in the Dashboard Side Bar.")
    public void it_should_be_verified_that_there_are_blog_contact_request_admin_reports_support_ticket_and_all_activity_logs_pop_ups_under_the_content_category_in_the_dashboard_side_bar() {
        Assert.assertTrue(life.blog.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.contactRequest.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.adminReports.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.supportTicket.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.allActivityLogs.isDisplayed());
        ReusableMethods.bekle(2);

    }
    // 48

    @Then("Click on the Reivew link")
    public void click_on_the_reivew_link() {
    life.reviewLink.click();
    ReusableMethods.bekle(2);
    }
    @Then("Click on the Product Reivew link")
    public void click_on_the_product_reivew_link() {
    life.productReviewLink.click();
    ReusableMethods.bekle(2);
    }
    @Then("Verifies that it goes to the Product Review page.")
    public void verifies_that_it_goes_to_the_product_review_page() {
    Assert.assertTrue(life.producttReviewPage.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Verify that the Product Review List appears on the Product Review page")
    public void verify_that_the_product_review_list_appears_on_the_product_review_page() {
    Assert.assertTrue(life.producttReviewList.isDisplayed());
    ReusableMethods.bekle(2);
    }
    @Then("Verify that the Product Review List is searched from the Quick Search Text Box")
    public void verify_that_the_product_review_list_is_searched_from_the_quick_search_text_box() {
    life.searcBox.sendKeys("1" + Keys.ENTER);
    Assert.assertTrue(life.SunGlassForMan.isDisplayed());
    }
    @Then("In the Product Review List, it is verified that the products are listed under the headings of Product, Rating, Number of Comments.")
    public void in_the_product_review_list_it_is_verified_that_the_products_are_listed_under_the_headings_of_product_rating_number_of_comments() {
    Assert.assertTrue(life.customerrFeedback.isDisplayed());
        ReusableMethods.bekle(2);
    Assert.assertTrue(life.customerrTime.isDisplayed());
        ReusableMethods.bekle(2);
    Assert.assertTrue(life.ratingg.isDisplayed());
        ReusableMethods.bekle(2);
    }





}

