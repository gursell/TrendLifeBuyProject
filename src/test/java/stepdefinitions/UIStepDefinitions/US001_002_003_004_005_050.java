package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US001_002_003_004_005_050_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US001_002_003_004_005_050 {
    US001_002_003_004_005_050_Page lifegursel = new US001_002_003_004_005_050_Page();

    Actions actions= new Actions(Driver.getDriver());

    @Given("Open browser go to {string}")
    public void open_browser_go_to(String userUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(userUrl));
    }

    @Given("Click to play store button at the {string}")
    public void click_to_play_store_button_at_the(String string) {
        lifegursel.playStoreButton.click();

    }
    @Then("Verify if visitor can redirect to the relevant page after clicking play store  button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_play_store_button_at_the(String string) {
        String expectedUrl="https://play.google.com/store/games";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();

    }
    @Then("Click to apple store button at the {string}")
    public void click_to_apple_store_button_at_the(String string) {
        lifegursel.appleStoreButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking apple store button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_apple_store_button_at_the(String string) {
        String expectedUrl="https://www.apple.com/app-store/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }

    @Given("Click to track your order button at the {string}")
    public void click_to_track_your_order_button_at_the(String string) {
        lifegursel.trackYourOrder.click();
    }

    @Then("Verify if visitor can redirect to the relevant page after clicking track your order button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_track_your_order_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/track-order";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }

    @Given("Click to compare button at the {string}")
    public void click_to_compare_button_at_the(String string) {
        lifegursel.compareButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking compare button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_compare_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/compare";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }
    @Given("Click to wishlist button at the {string}")
    public void click_to_wishlist_button_at_the(String string) {
        lifegursel.wishListButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking wishlist button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_wishlist_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();

    }
    @Given("Click to cart button at the {string}")
    public void click_to_cart_button_at_the(String string) {
        lifegursel.cartButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking cart button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_cart_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/cart";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }

    @Given("Click to logo button at the {string}")
    public void click_to_logo_button_at_the(String string) {
        lifegursel.logo.click();
    }
    @Then("Verify if visitor can redirect to the home page after clicking logo button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_home_page_after_clicking_logo_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }

    @Given("Click to search box at the {string}")
    public void click_to_search_box_at_the(String string) {
        lifegursel.searchBox.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking computer to search box at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_computer_to_search_box_at_the(String string) {
        lifegursel.searchBox.sendKeys("Computer" + Keys.ENTER);
        ReusableMethods.bekle(2);
        String expectedUrl="https://trendlifebuy.com/category/Computer?item=search&category=undefined";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        ReusableMethods.bekle(2);
        Assert.assertEquals(expectedUrl,actualUrl);
        /*ReusableMethods.bekle(1);
        life.searchButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.computerText.isDisplayed());*/
        Driver.getDriver().navigate().back();
    }
    @Given("Click to login button at the {string}")
    public void click_to_login_button_at_the(String string) {
        lifegursel.loginButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking login button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_login_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }
    @Given("Click to register button at the {string}")
    public void click_to_register_button_at_the(String string) {
        lifegursel.registerButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking register button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_register_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/register";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }
    @Given("Click to home button at the {string}")
    public void click_to_home_button_at_the(String string) {
        lifegursel.homeButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking home button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_home_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }
    @Given("Click to blog button at the {string}")
    public void click_to_blog_button_at_the(String string) {
        lifegursel.blogButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking blog button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_blog_button_at_the(String string) {
        Assert.assertTrue(lifegursel.jasperScottText.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Given("Click to contact button at the {string}")
    public void click_to_contact_button_at_the(String string) {
        lifegursel.contactButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking contact button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_contact_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/contact-us";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }
    @Given("Click to about us button at the {string}")
    public void click_to_about_us_button_at_the(String string) {
        lifegursel.aboutUsButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking about us button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_about_us_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/about-us";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();
    }
    @Given("Click to new user zone button at the {string}")
    public void click_to_new_user_zone_button_at_the(String string) {
        lifegursel.newUserButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking new user zone button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_new_user_zone_button_at_the(String string) {
        String expectedUrl="https://trendlifebuy.com/new-user-zone/new-user-gifts-choose-one";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();

    }
    @Given("Click to daily deals button at the {string}")
    public void click_to_daily_deals_button_at_the(String string) {
        //life.dailyDealsButton.click();
    }
    @Then("Verify if visitor can redirect to the relevant page after clicking daily deals button at the {string}")
    public void verify_if_visitor_can_redirect_to_the_relevant_page_after_clicking_daily_deals_button_at_the(String string) {

    }
    @Given("Click to all categories menu at the {string}")
    public void click_to_all_categories_menu_at_the(String string) {
        lifegursel.allCategoriesMenu.click();
    }
    @Then("Check if computer & accessories, electronics devices,watches & accessories, fashions, toys-kids&babies, bag&shoes, lifestyle&home,tv & home appliances, auto mobiles & bikes are visible at the {string}")
    public void check_if_computer_accessories_electronics_devices_watches_accessories_fashions_toys_kids_babies_bag_shoes_lifestyle_home_tv_home_appliances_auto_mobiles_bikes_are_visible_at_the(String string) {
        Assert.assertTrue(lifegursel.computerAccessoriesCategory.isDisplayed());
        Assert.assertTrue(lifegursel.electronicDevicesCategory.isDisplayed());
        Assert.assertTrue(lifegursel.watchesAccessoriesCategory.isDisplayed());
        Assert.assertTrue(lifegursel.fashionsCategory.isDisplayed());
        Assert.assertTrue(lifegursel.toysKidsBabiesCategory.isDisplayed());
        Assert.assertTrue(lifegursel.bagShoesCategory.isDisplayed());
        Assert.assertTrue(lifegursel.lifestyleHomeCategory.isDisplayed());
        Assert.assertTrue(lifegursel.tvHomeAppliancesCategory.isDisplayed());
        Assert.assertTrue(lifegursel.autoMobilesBikesCategory.isDisplayed());

    }
    @Then("Check if computer & accessories, electronics devices,watches & accessories, fashions, toys-kids&babies, bag&shoes, lifestyle&home,tv & home appliances, auto mobiles & bikes are active at the {string}")
    public void check_if_computer_accessories_electronics_devices_watches_accessories_fashions_toys_kids_babies_bag_shoes_lifestyle_home_tv_home_appliances_auto_mobiles_bikes_are_active_at_the(String string) {
        Assert.assertTrue(lifegursel.computerAccessoriesCategory.isEnabled());
        Assert.assertTrue(lifegursel.electronicDevicesCategory.isEnabled());
        Assert.assertTrue(lifegursel.watchesAccessoriesCategory.isEnabled());
        Assert.assertTrue(lifegursel.fashionsCategory.isEnabled());
        Assert.assertTrue(lifegursel.toysKidsBabiesCategory.isEnabled());
        Assert.assertTrue(lifegursel.bagShoesCategory.isEnabled());
        Assert.assertTrue(lifegursel.lifestyleHomeCategory.isEnabled());
        Assert.assertTrue(lifegursel.tvHomeAppliancesCategory.isEnabled());
        Assert.assertTrue(lifegursel.autoMobilesBikesCategory.isEnabled());
    }
    @Then("Check if my account, order status, referral, coupons links are visible at the {string}")
    public void checkIfMyAccountOrderStatusReferralCouponsLinksAreVisibleAtThe(String string) {
        Assert.assertTrue(lifegursel.myAccountLink.isDisplayed());
        Assert.assertTrue(lifegursel.orderStatusLink.isDisplayed());
        Assert.assertTrue(lifegursel.referralLink.isDisplayed());
        Assert.assertTrue(lifegursel.couponsLink.isDisplayed());
    }

    @Given("Check if  my account, order status, referral, coupons links redirect to relevant pages after clicking to my account, order status, referral, coupons links.")
    public void check_if_my_account_order_status_referral_coupons_links_redirect_to_relevant_pages_after_clicking_to_my_account_order_status_referral_coupons_links() {
        lifegursel.tiClose.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                perform();

        lifegursel.myAccountLink.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(lifegursel.signIn.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        lifegursel.orderStatusLink.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(lifegursel.signIn.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        lifegursel.referralLink.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(lifegursel.signIn.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        lifegursel.couponsLink.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(lifegursel.signIn.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
    }
    @Then("Check if about us, contact us, career, refund policy, terms & condition links are visible at the {string}")
    public void check_if_my_account_career_refund_policy_terms_condition_links_are_visible_at_the(String string) {
        Assert.assertTrue(lifegursel.aboutUsLink.isDisplayed());
        Assert.assertTrue(lifegursel.contactUsLink.isDisplayed());
        Assert.assertTrue(lifegursel.careerLink.isDisplayed());
        Assert.assertTrue(lifegursel.refundPolicyLink.isDisplayed());
        Assert.assertTrue(lifegursel.termsConditionLink.isDisplayed());
    }
    @Given("Check if  about us, contact us, career, refund policy, terms & condition links redirect to relevant pages after clicking on about us, contact us, career, refund policy, terms & condition links")
    public void check_if_about_us_contact_us_career_refund_policy_terms_condition_links_redirect_to_relevant_pages_after_clicking_on_about_us_contact_us_career_refund_policy_terms_condition_links() {
        lifegursel.tiClose.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                perform();

        lifegursel.aboutUsLink.click();
        Assert.assertTrue(lifegursel.withTrendLifeBuy.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        lifegursel.contactUsLink.click();
        Assert.assertTrue(lifegursel.callOrWhatsApp.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        lifegursel.careerLink.click();
        Assert.assertTrue(lifegursel.whenYouWant.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        lifegursel.refundPolicyLink.click();
        Assert.assertTrue(lifegursel.returnsPolicy.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        lifegursel.termsConditionLink.click();
        Assert.assertTrue(lifegursel.overview.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
    }

    @Then("Check if google play store and apple store buttons are visible at the {string}")
    public void check_if_google_play_store_and_apple_store_buttons_are_visible_at_the(String string) {
        Assert.assertTrue(lifegursel.playStoreButton.isDisplayed());
        Assert.assertTrue(lifegursel.appleStoreButton.isDisplayed());
    }
    @Given("Check if google play store and apple store redirect to relevant pages after clicking on google play store and apple store")
    public void check_if_google_play_store_and_apple_store_redirect_to_relevant_pages_after_clicking_on_google_play_store_and_apple_store() {
        lifegursel.playStoreButton.click();
        Assert.assertTrue(lifegursel.googlePlayText.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        lifegursel.tiClose.click();
        lifegursel.appleStoreButton.click();
        Assert.assertTrue(lifegursel.appleStoreText.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
    }
    @Given("Click the go to top button")
    public void click_the_go_to_top_button() {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        lifegursel.goToTupButton.click();

    }
    @Given("Check if go to top button moves the page up")
    public void check_if_go_to_top_button_moves_the_page_up() {
        Assert.assertTrue(lifegursel.wishListButton.isDisplayed());
    }
    @Then("Check if facebook, twitter, linkedin and instagram icons are visible at the {string}")
    public void check_if_facebook_twitter_linkedin_and_instagram_icons_are_visible_at_the(String string) {
        Assert.assertTrue(lifegursel.facebookIcon.isDisplayed());
        Assert.assertTrue(lifegursel.twitterIcon.isDisplayed());
        Assert.assertTrue(lifegursel.linkedinIcon.isDisplayed());
        Assert.assertTrue(lifegursel.instagramIcon.isDisplayed());
    }
    @Given("Check if facebook, twitter, linkedin and instagram icons redirect to relevant pages after clicking on facebook, twitter, linkedin and instagram icons")
    public void check_if_facebook_twitter_linkedin_and_instagram_icons_redirect_to_relevant_pages_after_clicking_on_facebook_twitter_linkedin_and_instagram_icons() {

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        lifegursel.tiClose.click();
        lifegursel.facebookIcon.click();
        Assert.assertTrue(lifegursel.facebookText.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        lifegursel.twitterIcon.click();
        Assert.assertTrue(lifegursel.twittergirisYap.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        lifegursel.linkedinIcon.click();
        String expectedUrl="https://www.linkedin.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();

        lifegursel.instagramIcon.click();
        Assert.assertTrue(lifegursel.instagramText.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
    }
    @Then("Check if trending products, hot categories, house appliances, recommendation for you, top brand,popular searches, trendlifebuy | ONLINE SHOPPING are visible at the {string}")
    public void check_if_trending_products_hot_categories_house_appliances_recommendation_for_you_top_brand_popular_searches_trendlifebuy_onlıne_shoppıng_are_visible_at_the(String string) {
        Assert.assertTrue(lifegursel.trendingProducts.isDisplayed());
        Assert.assertTrue(lifegursel.hotCategories.isDisplayed());
        Assert.assertTrue(lifegursel.houseAppliances.isDisplayed());
        Assert.assertTrue(lifegursel.recommendationForYou.isDisplayed());
        Assert.assertTrue(lifegursel.topBrand.isDisplayed());
        Assert.assertTrue(lifegursel.popularSearches.isDisplayed());
        Assert.assertTrue(lifegursel.trendlifebuyOnlineShopping.isDisplayed());
    }
    @Given("Click to sofa link at the {string}")
    public void click_to_sofa_link_at_the(String string) {
        lifegursel.tiClose.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN)
                .perform();
        ReusableMethods.bekle(2);
        lifegursel.sofaLink.click();
    }
    @Then("Verify if sofa link leads to the relevant page after clicking sofa link at the {string}")
    public void verify_if_sofa_link_leads_to_the_relevant_page_after_clicking_sofa_link_at_the(String string) {
        Assert.assertTrue(lifegursel.singleSizeSofa.isDisplayed());
    }

    @Then("Verify if wooden furniture link leads to the relevant page after clicking on wooden furniture link at the {string}")
    public void verify_if_wooden_furniture_link_leads_to_the_relevant_page_after_clicking_on_wooden_furniture_link_at_the(String string) {
        lifegursel.tiClose.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        lifegursel.woodenFurnitureLink.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(lifegursel.woodenDesignLink.isDisplayed());
    }

    @Then("Verify if the view all button redirects to the relevant page after clicking on view all button at the {string}")
    public void verify_if_the_view_all_button_redirects_to_the_relevant_page_after_clicking_on_view_all_button_at_the(String string) {
        lifegursel.tiClose.click();
        ReusableMethods.bekle(2);
        actions.moveToElement(lifegursel.viewAllButton);
        ReusableMethods.bekle(2);
        lifegursel.viewAllButton.click();
        ReusableMethods.bekle(2);
        String expectedUrl="https://trendlifebuy.com/category/best_deals?item=product";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
    }
    @Then("Verify if the more deals button redirects to the relevant page after clicking on more deals button at the {string}")
    public void verify_if_the_more_deals_button_redirects_to_the_relevant_page_after_clicking_on_more_deals_button_at_the(String string) {
        actions.moveToElement(lifegursel.moreDealsButton);
        ReusableMethods.bekle(2);
        lifegursel.tiClose.click();
        ReusableMethods.bekle(2);
        lifegursel.moreDealsButton.click();
        String expectedUrl="https://trendlifebuy.com/category/furnitures?item=category";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
    }
    @Then("Verify if more products are displayed after clicking to load more button at the {string}")
    public void verify_if_more_products_are_displayed_after_clicking_to_load_more_button_at_the(String string) throws IOException {

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        lifegursel.tiClose.click();
        lifegursel.loadMoreButton.click();
        ReusableMethods.bekle(2);
        //ReusableMethods.getScreenshot("https://trendlifebuy.com/"); bu satir baska


    /*@Then("The admin closes {string}")
    public void the_admin_closes (String adminUrl) {
        Driver.closeDriver();*/

    }
    @Then("Admin clicks on Priority link")
    public void admin_clicks_on_priority_link() {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN). sendKeys(Keys.PAGE_DOWN). sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN). sendKeys(Keys.PAGE_DOWN). sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
      lifegursel.priorityLink.click();
    }
    @Then("Admin verifies if the Priority link leads to Priority page")
    public void admin_verifies_if_the_priority_link_leads_to_priority_page() {
    Assert.assertTrue(lifegursel.priorityList.isDisplayed());
    }

    @Then("Admin clicks on Add New Box and enters a name")
    public void admin_clicks_on_add_new_box_and_enters_a_name() {
        lifegursel.addNewBox.sendKeys("New Pri");
        ReusableMethods.bekle(2);
    }
    @Then("Admin verifies if a new Priority can be seen under the Priority List")
    public void admin_verifies_if_a_new_priority_can_be_seen_under_the_priority_list() {
        Assert.assertTrue(lifegursel.newPriName.isDisplayed());
    }

    @Then("Admin verifies if the Priorities are displayed according to Name,Status and Actions headings")
    public void admin_verifies_if_the_priorities_are_displayed_according_to_name_status_and_actions_headings() {
        Assert.assertTrue(lifegursel.nameHeading.isDisplayed());
        Assert.assertTrue(lifegursel.statusHeading.isDisplayed());
        Assert.assertTrue(lifegursel.actionHeading.isDisplayed());
    }
    @Then("Admin verifies if the status of the Priorities can be changed under the Status title")
    public void admin_verifies_if_the_status_of_the_priorities_can_be_changed_under_the_status_title() {
        Assert.assertTrue(lifegursel.statusSliderRound.isEnabled());
    }

    @Then("Admin clicks on Select tab")
    public void admin_clicks_on_select_tab() {
        lifegursel.selectTab1.click();
        ReusableMethods.bekle(2);

    }
    @Then("Admin verifies that there are Edit and Delete links in the select tab")
    public void admin_verifies_that_there_are_edit_and_delete_links_in_the_select_tab() {
        Assert.assertTrue(lifegursel.editLink.isDisplayed());
        Assert.assertTrue(lifegursel.deleteLink.isDisplayed());
    }
    @Then("Admin clicks on Edit link")
    public void admin_clicks_on_edit_link() {
       lifegursel.editLink.click();
    }
    @Then("Admin verifies that the edit page is opened after clicking Edit link")
    public void admin_verifies_that_the_edit_page_is_opened_after_clicking_edit_link() {
        Assert.assertTrue(lifegursel.editPage.isDisplayed());
    }
    @Then("Admin verifies if the Name and Status of the category can be updated")
    public void admin_verifies_if_the_name_and_status_of_the_category_can_be_updated() {
        lifegursel.selectTab1.click();
        ReusableMethods.bekle(1);
        lifegursel.editLink.click();
        lifegursel.addNewBox.sendKeys("est" + Keys.ENTER);
        ReusableMethods.bekle(1);
        lifegursel.inactiveTick.click();
        ReusableMethods.bekle(1);
        lifegursel.updateButton.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(lifegursel.lowestText.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(lifegursel.statusSliderRound.isDisplayed());
        ReusableMethods.bekle(3);
    }
    @Then("Admin clicks on Delete link")
    public void admin_clicks_on_delete_link() {
        lifegursel.selectTab4.click();
        ReusableMethods.bekle(1);
       lifegursel.deleteLink4.click();
       ReusableMethods.bekle(1);
       lifegursel.dataDeleteButton.click();
       ReusableMethods.bekle(1);
    }
    @Then("Admin verifies if Priority can be deleted after clicking delete link on the select tab under the Action title")
    public void admin_verifies_if_priority_can_be_deleted_after_clicking_delete_link_on_the_select_tab_under_the_action_title() {
        Assert.assertTrue(lifegursel.selectTab4.isDisplayed());
    }
    @Then("Admin closes {string}")
    public void admin_closes(String string) {
        Driver.closeDriver();
    }

}



