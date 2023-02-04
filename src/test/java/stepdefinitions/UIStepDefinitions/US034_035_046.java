package stepdefinitions.UIStepDefinitions;

import pages.US034_035_046_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import static org.junit.Assert.*;

public class US034_035_046 {



    US034_035_046_Page trendlifebuyPage = new US034_035_046_Page();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();


    @Given("Go to {string} page.")
    public void go_to_page(String myUrl) {

        // Launch browser.
        // Go to Url https://trendlifebuy.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        ReusableMethods.waitForPageToLoad(3);

    }


//********************************************  SCENARIO TC_3401  ****************************************************//

    @Given("Enter a valid {string} address and {string} in the relevant fields on the page that opens, then click the SIGN IN button.")
    public void enter_a_valid_address_and_in_the_relevant_fields_on_the_page_that_opens_then_click_the_sign_in_button(String Email, String Password) {
        // Login is done by entering a valid Administrator Email and Password, then click the Sign in.

        trendlifebuyPage.myLoginMethod();

    }

    @Then("Then a message about successful login should appear in a green box in the upper right corner of the screen.")
    public void after_pressing_the_sign_in_button_a_message_about_successful_login_should_appear_in_a_green_box_in_the_upper_right_corner_of_the_screen() {

        assertTrue("The Welcome Message does not appear on the screen", trendlifebuyPage.welcomeMessage.isDisplayed());

    }

    @Then("The Products Title should be clickable under the PRODUCT MANAGE title on the left side of the screen on the Dashboard page.")
    public void the_products_title_should_be_clickable_under_the_product_manage_title_on_the_left_side_of_the_screen_on_the_dashboard_page() {

        trendlifebuyPage.productsTitle.click();
    }

    @Then("Click on the link button titled Product Lists from the options listed under the Products Title.")
    public void then_it_is_verified_that_the_link_button_titled_product_lists_is_accessible_from_the_options_listed_under_the_products_title() {

        actions.scrollToElement(trendlifebuyPage.productListLinkBut).perform();
        actions.click(trendlifebuyPage.productListLinkBut).perform();
        ReusableMethods.waitForPageToLoad(5);

    }

    @Then("Then, it is checked that the Products page is opened and the Product List window visible on the screen.")
    public void then_it_is_checked_that_the_products_page_is_opened_and_the_product_list_window_visible_on_the_screen() {

        String actualUrl = "https://trendlifebuy.com/admin-dashboard";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        assertNotEquals(expectedUrl, actualUrl);

        ReusableMethods.waitForVisibility(trendlifebuyPage.productListWindow, 2);
        assertTrue("The Product List window does not visible on the screen", trendlifebuyPage.productListWindow.isDisplayed());

    }


//********************************************  SCENARIO TC_3402  ****************************************************//

    @Then("On the page that opens, it is verified that the Links of the Product List, Alert List, Out of Stock List, Disabled Products List, Product List by SKU are visible on the Product List page.")
    public void on_the_page_that_opens_it_is_verified_that_the_links_of_the_product_list_alert_list_out_of_stock_list_disabled_products_list_product_list_by_sku_are_visible_on_the_product_list_page() {

        assertTrue("The Product List Tab Button does not visible on the screen", trendlifebuyPage.productListTabButton.isDisplayed());
        assertTrue("The Alert List Tab Button does not visible on the screen", trendlifebuyPage.alertListTabButton.isDisplayed());
        assertTrue("The Aut of Stock List Tab Button does not visible on the screen", trendlifebuyPage.autofStockListTabButton.isDisplayed());
        assertTrue("The Disabled Product List Tab Button does not visible on the screen", trendlifebuyPage.disableProductkListTabButton.isDisplayed());
        assertTrue("The Product By SKU Tab Button does not visible on the screen", trendlifebuyPage.productBySKUListTabButton.isDisplayed());

    }

    @Then("Clicking on these visible titles Product List, Alert List, Out of Stock List, Disabled Products List, Product List by SKU on the screen confirms that the relevant windows are opened.")
    public void clicking_on_these_visible_titles_product_list_alert_list_out_of_stock_list_disabled_products_list_product_list_by_sku_on_the_screen_confirms_that_the_relevant_windows_are_opened() {

        trendlifebuyPage.alertListTabButton.click();
        ReusableMethods.waitForVisibility(trendlifebuyPage.alertListWindow, 2);
        assertTrue("The Alert List tab window does not visible on the screen", trendlifebuyPage.alertListWindow.isDisplayed());

        trendlifebuyPage.productListTabButton.click();
        ReusableMethods.waitForVisibility(trendlifebuyPage.productListWindow, 2);
        assertTrue("The Product List tab window does not visible on the screen", trendlifebuyPage.productListWindow.isDisplayed());

        trendlifebuyPage.autofStockListTabButton.click();
        ReusableMethods.waitForVisibility(trendlifebuyPage.autofStockListWindow, 2);
        assertTrue("The Aut of Stock List tab window does not visible on the screen", trendlifebuyPage.autofStockListWindow.isDisplayed());

        trendlifebuyPage.disableProductkListTabButton.click();
        ReusableMethods.waitForVisibility(trendlifebuyPage.disableProductkListWindow, 2);
        assertTrue("The Disable Product List tab window does not visible on the screen", trendlifebuyPage.disableProductkListWindow.isDisplayed());

        trendlifebuyPage.productBySKUListTabButton.click();
        ReusableMethods.waitForVisibility(trendlifebuyPage.productBySKUWindow, 2);
        assertTrue("The Product By SKU tab window does not visible on the screen", trendlifebuyPage.productBySKUWindow.isDisplayed());

    }


//********************************************  SCENARIO TC_3403  ****************************************************//

    @Then("In the Product List, it is verified that the products are listed under the headings SL, Name, Product Type, Brand, Image, Stock, Status, Action.")
    public void in_the_product_list_it_is_verified_that_the_products_are_listed_under_the_headings_sl_name_product_type_brand_image_stock_status_action() {


        List<WebElement> productTitleElementListi = Driver.getDriver().findElements(By.xpath("//table[@id='mainProductTable']//th"));

        for (WebElement eachElement : productTitleElementListi) {

            System.out.print(eachElement.getText() + "    ");

        }

        System.out.println("");


        List<WebElement> productsDataElementList = Driver.getDriver().findElements(By.xpath(" //table[@id='mainProductTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementList) {

            System.out.println(eachElement2.getText());
        }


        assertTrue("The table title SL in the Product List tab window does not appear on the screen.", productTitleElementListi.get(0).isDisplayed());
        assertTrue("The table title NAME in the Product List tab window does not appear on the screen.", productTitleElementListi.get(1).isDisplayed());
        assertTrue("The table title PRODUCT TYPE in the Product List tab window does not appear on the screen.", productTitleElementListi.get(2).isDisplayed());
        assertTrue("The table title BRAND in the Product List tab window does not appear on the screen.", productTitleElementListi.get(3).isDisplayed());
        assertTrue("The table title IMAGE in the Product List tab window does not appear on the screen.", productTitleElementListi.get(4).isDisplayed());
        assertTrue("The table title STOCK in the Product List tab window does not appear on the screen.", productTitleElementListi.get(5).isDisplayed());
        assertTrue("The table title STATUS in the Product List tab window does not appear on the screen.", productTitleElementListi.get(6).isDisplayed());
        // assertTrue("The table title ACTION in the Product List tab window does not appear on the screen.", productTitleElementListi.get(7).isDisplayed());


        assertTrue("The 1th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(0).isDisplayed());
        assertTrue("The 2nd PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(1).isDisplayed());
        assertTrue("The 3th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(2).isDisplayed());
        assertTrue("The 4th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(3).isDisplayed());
        assertTrue("The 5th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(4).isDisplayed());
        assertTrue("The 6th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(5).isDisplayed());
        assertTrue("The 7th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(6).isDisplayed());
        assertTrue("The 8th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(7).isDisplayed());
        assertTrue("The 9th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(8).isDisplayed());
        assertTrue("The 10th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(9).isDisplayed());




    }


//********************************************  SCENARIO TC_3404  ****************************************************//

    @Then("Search is made by typing {string} in the Quick Search search box on the Product List page. It is checked how many products are listed before and after the search.")
    public void search_is_made_by_typing_in_the_quick_search_search_box_on_the_product_list_page_it_is_checked_how_many_products_are_listed_before_and_after_the_search(String nike) {

        ReusableMethods.waitForVisibility(trendlifebuyPage.quickSearchResultInfo, 2);
        String actualResultText = trendlifebuyPage.quickSearchResultInfo.getText();
        System.out.println(actualResultText);

        trendlifebuyPage.quickSearchBox.sendKeys(nike + Keys.ENTER);
        ReusableMethods.bekle(2);

        String expectedResultText1 = trendlifebuyPage.quickSearchResultInfo.getText();
        System.out.println(expectedResultText1);

        assertNotEquals(expectedResultText1, actualResultText);

    }


//********************************************  SCENARIO TC_3405  ****************************************************//

    @Then("To update the status of any of the products from the Status column in the Product List, the status icon is clicked.")
    public void to_update_the_status_of_any_of_the_products_from_the_status_column_in_the_product_list_the_status_icon_is_clicked() {

        System.out.println(trendlifebuyPage.productListStatusSliderCheckBox.isSelected());
        trendlifebuyPage.productListStatusSlider.click();
    }

    @Then("After clicking the status icon, it is checked that the message Updated Successfully appears in the upper right corner of the screen.")
    public void after_clicking_the_status_icon_it_is_checked_that_the_message_updated_successfully_appears_in_the_upper_right_corner_of_the_screen() {

        ReusableMethods.waitForVisibility(trendlifebuyPage.productStatusUpdateMessage, 2);
        assertTrue("The Status Update Success Message does not appear on the screen",
                trendlifebuyPage.productStatusUpdateMessage.isDisplayed());
    }


    @Then("Then check if the status checkbox is selected.")
    public void then_check_if_the_status_checkbox_is_selected() {

        if (!trendlifebuyPage.productListStatusSliderCheckBox.isSelected()) {

            trendlifebuyPage.productListStatusSlider.click();
            System.out.println(trendlifebuyPage.productListStatusSliderCheckBox.isSelected());
            assertTrue("The Product List status checkbox is not selected.",
                    trendlifebuyPage.productListStatusSliderCheckBox.isSelected());

        } else {

            assertFalse("The Product List status checkbox is selected.",
                    trendlifebuyPage.productListStatusSliderCheckBox.isSelected());
            System.out.println(trendlifebuyPage.productListStatusSliderCheckBox.isSelected());
        }


    }


//********************************************  SCENARIO TC_3406  ****************************************************//

    @Then("Click on any Select button opposite the products under the Action heading column.")
    public void click_on_any_select_button_opposite_the_products_under_the_action_heading_column() {

        if (!trendlifebuyPage.product1ListActionSelectButton.isDisplayed()) {

            assertFalse("The Product Select button does visible on the screen",
                    trendlifebuyPage.product1ListActionSelectButton.isDisplayed());

            trendlifebuyPage.plusViewActionSelectButton.click();

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectButtonPlus);
            actions.click(trendlifebuyPage.product1ListActionSelectButtonPlus).perform();


        } else {

            assertTrue("The Product Select button does not visible on the screen",
                    trendlifebuyPage.product1ListActionSelectButton.isDisplayed());

            trendlifebuyPage.product1ListActionSelectButton.click();
        }

        ReusableMethods.bekle(1);


    }

    @Then("It is checked that the View button link in the opened mini pop-up tab is visible.")
    public void it_is_checked_that_the_view_button_link_in_the_opened_mini_pop_up_tab_is_visible() {

        if (!trendlifebuyPage.product1ListActionSelectViewButton.isDisplayed()) {

            System.out.println(trendlifebuyPage.product1ListActionSelectViewButtonPlus.isDisplayed());
            assertTrue("The Select drop down menu View link button does not appear on the screen",
                    trendlifebuyPage.product1ListActionSelectViewButtonPlus.isDisplayed());

        } else {

            System.out.println(trendlifebuyPage.product1ListActionSelectViewButton.isDisplayed());
            assertTrue("The Select drop down menu View link button does not appear on the screen",
                    trendlifebuyPage.product1ListActionSelectViewButton.isDisplayed());
        }


    }

    @Then("Click on the View button link and check that the window with the explanations about the product appears in the window that opens.")
    public void click_on_the_view_button_link_and_check_that_the_window_with_the_explanations_about_the_product_appears_in_the_window_that_opens() {

        if (trendlifebuyPage.product1ListActionSelectViewButton.isDisplayed()) {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectViewButton);
            actions.click(trendlifebuyPage.product1ListActionSelectViewButton).perform();

        } else {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectViewButtonPlus);
            actions.click(trendlifebuyPage.product1ListActionSelectViewButtonPlus).perform();

        }

        ReusableMethods.bekle(1);
        assertTrue("The View details window for the 1st product does not appear on the screen",
                trendlifebuyPage.viewProductDetailsWindow.isDisplayed());

    }

    @Then("Close the product descriptions window.")
    public void close_the_product_descriptions_window() {

        trendlifebuyPage.viewProductDetailsWindowCloseButton.click();
        ReusableMethods.bekle(1);
        assertFalse("The View details window for the 1st product does appear on the screen",
                trendlifebuyPage.viewProductDetailsWindow.isDisplayed());

    }


//********************************************  SCENARIO TC_3407  ****************************************************/

    @Then("In the opened mini pop-up tab, it is checked whether the Edit button link is visible.")
    public void in_the_opened_mini_pop_up_tab_it_is_checked_whether_the_edit_button_link_is_visible() {

        if (!trendlifebuyPage.product1ListActionSelectEditButton.isDisplayed()) {

            System.out.println(trendlifebuyPage.product1ListActionSelectEditButtonPlus.isDisplayed());
            assertTrue("The Select drop down menu Edit link button does not appear on the screen",
                    trendlifebuyPage.product1ListActionSelectEditButtonPlus.isDisplayed());

        } else {

            System.out.println(trendlifebuyPage.product1ListActionSelectEditButton.isDisplayed());
            assertTrue("The Select drop down menu Edit link button does not appear on the screen",
                    trendlifebuyPage.product1ListActionSelectEditButton.isDisplayed());
        }


    }

    @Then("Click on the Edit link button and check that the Edit Product page is opened.")
    public void click_on_the_edit_link_button_and_check_that_the_edit_product_page_is_opened() {

        String actualURL = Driver.getDriver().getCurrentUrl();

        if (trendlifebuyPage.product1ListActionSelectEditButton.isDisplayed()) {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectEditButton);
            actions.click(trendlifebuyPage.product1ListActionSelectEditButton).perform();

        } else {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectEditButtonPlus);
            actions.click(trendlifebuyPage.product1ListActionSelectEditButtonPlus).perform();

        }

        ReusableMethods.waitForPageToLoad(1);
        String expectedURL = Driver.getDriver().getCurrentUrl();

        assertNotEquals(expectedURL, actualURL);
        assertTrue(expectedURL.contains("edit"));


    }

    @Then("Check whether the page where information about the product is arranged is displayed.")
    public void check_whether_the_page_where_information_about_the_product_is_arranged_is_displayed() {

        System.out.println(trendlifebuyPage.editProductPageWindow.isDisplayed());
        assertTrue("The Edit Product page window does not appear on the screen",
                trendlifebuyPage.editProductPageWindow.isDisplayed());

    }

    @Then("Go back to the previous page from the Edit Product page.")
    public void go_back_to_the_previous_page_from_the_edit_product_page() {

        Driver.getDriver().navigate().back();

    }
//********************************************  SCENARIO TC_3408  ****************************************************//

    @Then("Click on the Edit link button.")
    public void click_on_the_edit_link_button() {

        if (trendlifebuyPage.product1ListActionSelectEditButton.isDisplayed()) {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectEditButton);
            actions.click(trendlifebuyPage.product1ListActionSelectEditButton).perform();

        } else {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectEditButtonPlus);
            actions.click(trendlifebuyPage.product1ListActionSelectEditButtonPlus).perform();

        }
    }

    @Then("In the GENERAL INFORMATION tab window on the Edit Product page; Product Information, Product Image Info, Pdf Specifications, Product Video Info, Others Info, Price Info And Stock, Weight Height Info, Description, Specifications, SEO Info It is checked that product editing titles such as.")
    public void in_the_general_information_tab_window_on_the_edit_product_page_product_information_product_image_info_pdf_specifications_product_video_info_others_info_price_info_and_stock_weight_height_info_description_specifications_seo_info_it_is_checked_that_product_editing_titles_such_as() {

        System.out.println(trendlifebuyPage.editProductInformationTitle.getText());
        assertTrue("The table title Product Information in the Edit Product page tab window does not appear on the screen.",
                trendlifebuyPage.editProductInformationTitle.isDisplayed());

        List<WebElement> productEditElementWindowHeaders = Driver.getDriver().findElements(By.xpath("//h3[@class='mb-3 mr-30']"));

        for (WebElement eachElement1 : productEditElementWindowHeaders) {

            System.out.print(eachElement1.getText() + "    ");

        }

        assertTrue("The title Price Info And Stock in the Edit Product page tab window does not appear on the screen.", productEditElementWindowHeaders.get(0).isDisplayed());
        assertTrue("The title Weight Height Info in the Edit Product page tab window does not appear on the screen.", productEditElementWindowHeaders.get(1).isDisplayed());
        assertTrue("The title Description in the Edit Product page tab window does not appear on the screen.", productEditElementWindowHeaders.get(2).isDisplayed());
        assertTrue("The title Specifications in the Edit Product page tab window does not appear on the screen.", productEditElementWindowHeaders.get(3).isDisplayed());
        assertTrue("The title SEO info in the Edit Product page tab window does not appear on the screen.", productEditElementWindowHeaders.get(4).isDisplayed());
        assertTrue("The title Product Image Info in the Edit Product page tab window does not appear on the screen.", productEditElementWindowHeaders.get(5).isDisplayed());
        assertTrue("The title Pdf Specifications in the Edit Product page tab window does not appear on the screen.", productEditElementWindowHeaders.get(6).isDisplayed());
        assertTrue("The title Product Video Info in the Edit Product page tab window does not appear on the screen.", productEditElementWindowHeaders.get(7).isDisplayed());
        assertTrue("The title Others Info in the Edit Product page tab window does not appear on the screen.", productEditElementWindowHeaders.get(8).isDisplayed());

    }

//********************************************  SCENARIO TC_3409  ****************************************************//

    @Then("Click on the tab titled RELATED PRODUCT on the Edit Product page and check that the title Related Product appears in the window that opens.")
    public void click_on_the_tab_titled_related_product_on_the_edit_product_page_and_check_that_the_title_related_product_appears_in_the_window_that_opens() {


        List<WebElement> editProductHeaders = Driver.getDriver().findElements(By.xpath("//h3[@class=\"mb-0 mr-30 mb_xs_15px mb_sm_20px\"]"));

        for (WebElement eachElement1 : editProductHeaders) {

            eachElement1.getText();
        }

        trendlifebuyPage.editProductRelatedProductTabButton.click();
        ReusableMethods.waitForVisibility(editProductHeaders.get(1), 1);
        assertTrue("The tab title RELATED PRODUCT in the Edit Product page window does not appear on the screen.", editProductHeaders.get(1).isDisplayed());

        trendlifebuyPage.editProductGeneralInformationTabButton.click();
        ReusableMethods.waitForVisibility(editProductHeaders.get(0), 1);
        assertTrue("The tab title GENERAL INFORMATION in the Edit Product page window does not appear on the screen.", editProductHeaders.get(0).isDisplayed());

    }


    @Then("Click on the tab titled UP SALE on the Edit Product page and check that the title Up Sale appears in the window that opens.")
    public void click_on_the_tab_titled_up_sale_on_the_edit_product_page_and_check_that_the_title_up_sale_appears_in_the_window_that_opens() {

        List<WebElement> editProductHeaders = Driver.getDriver().findElements(By.xpath("//h3[@class=\"mb-0 mr-30 mb_xs_15px mb_sm_20px\"]"));

        for (WebElement eachElement3 : editProductHeaders) {

            eachElement3.getText();
        }

        trendlifebuyPage.editProductUpSaleTabButton.click();
        ReusableMethods.waitForVisibility(editProductHeaders.get(2), 1);
        assertTrue("The tab title UP SALE in the Edit Product page window does not appear on the screen.", editProductHeaders.get(2).isDisplayed());

    }

    @Then("Click on the tab titled CROSS SALE on the Edit Product page and check that the title Cross sale appears in the window that opens.")
    public void click_on_the_tab_titled_cross_sale_on_the_edit_product_page_and_check_that_the_title_cross_sale_appears_in_the_window_that_opens() {

        List<WebElement> editProductHeaders = Driver.getDriver().findElements(By.xpath("//h3[@class=\"mb-0 mr-30 mb_xs_15px mb_sm_20px\"]"));

        for (WebElement eachElement4 : editProductHeaders) {

            eachElement4.getText();
        }

        trendlifebuyPage.editProductCrossSaleTabButton.click();
        ReusableMethods.waitForVisibility(editProductHeaders.get(3), 1);
        assertTrue("The tab title CROSS SALE in the Edit Product page window does not appear on the screen.", editProductHeaders.get(3).isDisplayed());

    }


//********************************************  SCENARIO TC_3410  ****************************************************//

    @Then("Check that the Single checkbox under the Type option is selected.")
    public void check_that_the_single_checkbox_under_the_type_option_is_selected() {

        assertTrue("The Single checkbox under the Type title option is not selected.", trendlifebuyPage.editProductSingleCheckBoxButton.isSelected());
        assertFalse("The Variant checkbox under the Type title option is selected.", trendlifebuyPage.editProductVariantCheckBoxButton.isSelected());
    }

    @Then("Verify that the CHANGE NOT POSSIBLE FOR USE message appears under the Product Information heading that the Type option cannot be changed.")
    public void verify_that_the_change_not_possible_for_use_message_appears_under_the_product_information_heading_that_the_type_option_cannot_be_changed() {
        WebElement typeSelectStatus = Driver.getDriver().findElement(By.xpath("//label[.='Type (Change Not Possible for Use) *']"));

        System.out.println(typeSelectStatus.getText());
        assertTrue(typeSelectStatus.getText(), typeSelectStatus.isDisplayed());
    }

    @Then("Click the Variant checkbox under the Type option and Check that the Variant checkbox is can not selected.")
    public void click_the_variant_checkbox_under_the_type_option_and_check_that_the_variant_checkbox_is_can_not_selected() {

        actions.moveToElement(trendlifebuyPage.editProductVariantCheckBoxButton);
        actions.click(trendlifebuyPage.editProductVariantCheckBoxButton).perform();
        assertFalse("The Variant checkbox under the Type title option is selected.", trendlifebuyPage.editProductVariantCheckBoxButton.isSelected());

    }


    //********************************************  SCENARIO TC_3411  ****************************************************//
    @Then("Click on the Related Product tab button, type {string} in the Quick Search box in the window that opens, Click and tick the checkboxes of the products found in the search result.")
    public void click_on_the_related_product_tab_button_type_in_the_quick_search_box_in_the_window_that_opens_click_and_tick_the_checkboxes_of_the_products_found_in_the_search_result(String bag) {

        trendlifebuyPage.editProductRelatedProductTabButton.click();
        trendlifebuyPage.editProductRelatedProductQuickSearchBox.sendKeys(bag);
        ReusableMethods.bekle(1);
        actions.moveToElement(trendlifebuyPage.relatedProductQuickSearchResultTickAllProducts);
        actions.click(trendlifebuyPage.relatedProductQuickSearchResultTickAllProducts).perform();

    }

    @Then("Click the Up Sale tab button, type {string} in the Quick Search box in the window that opens, Click and tick the checkboxes of the products found in the search result.")
    public void click_the_up_sale_tab_button_type_in_the_quick_search_box_in_the_window_that_opens_click_and_tick_the_checkboxes_of_the_products_found_in_the_search_result(String bag) {

        trendlifebuyPage.editProductUpSaleTabButton.click();
        trendlifebuyPage.editProductUpSaleQuickSearchBox.sendKeys(bag);
        ReusableMethods.bekle(1);
        actions.moveToElement(trendlifebuyPage.upSaleQuickSearchResultTickAllProducts);
        actions.click(trendlifebuyPage.upSaleQuickSearchResultTickAllProducts).perform();


    }

    @Then("Click on the Cross Sale tab button, type {string} in the Quick Search box in the window that opens.")
    public void click_on_the_cross_sale_tab_button_type_in_the_quick_search_box_in_the_window_that_opens(String bag) {

        trendlifebuyPage.editProductCrossSaleTabButton.click();
        trendlifebuyPage.editProductCrossSaleQuickSearchBox.sendKeys(bag);
        ReusableMethods.bekle(1);

    }

    @Then("Click and tick the checkboxes of the products found in the search result and click the Update button at the bottom of the window.")
    public void click_and_tick_the_checkboxes_of_the_products_found_in_the_search_result_and_click_the_update_button_at_the_bottom_of_the_window() {

        actions.moveToElement(trendlifebuyPage.crossSaleQuickSearchResultTickAllProducts);
        actions.click(trendlifebuyPage.crossSaleQuickSearchResultTickAllProducts).perform();

        trendlifebuyPage.editAndCloneProductUpdateAndSaveButton.click();
    }

    @Then("Check that the message that the edited information has been successfully saved appears on the screen.")
    public void check_that_the_message_that_the_edited_information_has_been_successfully_saved_appears_on_the_screen() {

        assertTrue("The Edit Product Update Success Message does not appear on the screen",
                trendlifebuyPage.editAndCloneProductUpdateSuccessMessage.isDisplayed());
    }


//********************************************  SCENARIO TC_3412  ****************************************************//

    @Then("It is checked that the Clone button link in the opened mini pop-up tab is visible.")
    public void it_is_checked_that_the_clone_button_link_in_the_opened_mini_pop_up_tab_is_visible() {

        if (!trendlifebuyPage.product1ListActionSelectCloneButton.isDisplayed()) {

            System.out.println(trendlifebuyPage.product1ListActionSelectCloneButtonPlus.isDisplayed());
            assertTrue("The Select drop down menu Clone link button does not appear on the screen",
                    trendlifebuyPage.product1ListActionSelectCloneButtonPlus.isDisplayed());

        } else {

            System.out.println(trendlifebuyPage.product1ListActionSelectCloneButton.isDisplayed());
            assertTrue("The Select drop down menu Clone link button does not appear on the screen",
                    trendlifebuyPage.product1ListActionSelectCloneButton.isDisplayed());
        }
    }

    @Then("Click on the Clone button link and check that the page that opens is the Clone Product page.")
    public void click_on_the_clone_button_link_and_check_that_the_page_that_opens_is_the_clone_product_page() {

        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println(actualURL);

        if (trendlifebuyPage.product1ListActionSelectCloneButton.isDisplayed()) {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectCloneButton);
            actions.click(trendlifebuyPage.product1ListActionSelectCloneButton).perform();

        } else {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectCloneButtonPlus);
            actions.click(trendlifebuyPage.product1ListActionSelectCloneButtonPlus).perform();

        }

        ReusableMethods.waitForPageToLoad(1);
        String expectedURL = Driver.getDriver().getCurrentUrl();
        System.out.println(expectedURL);

        assertNotEquals(expectedURL, actualURL);
        assertTrue(expectedURL.contains("clone"));

        assertTrue("The Clone Product page window does not appear on the screen",
                trendlifebuyPage.cloneProductPageWindow.isDisplayed());
    }


//********************************************  SCENARIO TC_3413  ****************************************************//

    @Then("Click the Clone Link button.")
    public void click_the_clone_link_button() {

        if (trendlifebuyPage.product1ListActionSelectCloneButton.isDisplayed()) {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectCloneButton);
            actions.click(trendlifebuyPage.product1ListActionSelectCloneButton).perform();

        } else {

            actions.moveToElement(trendlifebuyPage.product1ListActionSelectCloneButtonPlus);
            actions.click(trendlifebuyPage.product1ListActionSelectCloneButtonPlus).perform();

        }
    }

    @Then("Click the Variant checkbox under the Product Information heading, then click the Single checkbox again to select it.")
    public void click_the_variant_checkbox_under_the_product_information_heading_then_click_the_single_checkbox_again_to_select_it() {

        actions.moveToElement(trendlifebuyPage.editProductVariantCheckBoxButton);
        actions.click(trendlifebuyPage.editProductVariantCheckBoxButton).perform();
        assertTrue("The Variant checkbox under the Type title option is not selected.", trendlifebuyPage.editProductVariantCheckBoxButton.isSelected());

        actions.moveToElement(trendlifebuyPage.editProductSingleCheckBoxButton);
        actions.click(trendlifebuyPage.editProductSingleCheckBoxButton).perform();
        assertTrue("The Single checkbox under the Type title option is not selected.", trendlifebuyPage.editProductSingleCheckBoxButton.isSelected());

    }

    @Then("Type {string} in the NAME text box and {string} in the PRODUCT SKU text box.")
    public void type_in_the_name_text_box_and_in_the_product_sku_text_box(String name, String productSKU) {

        trendlifebuyPage.productInformationNAMETextBox.clear();
        trendlifebuyPage.productInformationNAMETextBox.sendKeys(name);
        trendlifebuyPage.productInformationPRODUCTSKUTextBox.clear();
        trendlifebuyPage.productInformationPRODUCTSKUTextBox.sendKeys(productSKU);


    }

    @Then("Type {string} in the SUBTITLE1 text box and {string} in the MODEL NUMBER text box.")
    public void type_in_the_subtitle_text_box_and_in_the_model_number_text_box(String subtitle1, String modelNo) {

        trendlifebuyPage.productInformationSUBTITLE1TextBox.clear();
        trendlifebuyPage.productInformationSUBTITLE1TextBox.sendKeys(subtitle1);
        trendlifebuyPage.productInformationMODELNUMBERTextBox.clear();
        trendlifebuyPage.productInformationMODELNUMBERTextBox.sendKeys(modelNo);
    }

    @Then("Click on the CATEGORY text box, click on the Bags option in the mini pop-up box that appears.")
    public void click_on_the_category_text_box_click_on_the_bags_option_in_the_mini_pop_up_box_that_appears() {

        Select select = new Select(trendlifebuyPage.productInformationCATEGORYTextBox);
        select.selectByVisibleText("Bags");
    }

    @Then("Click on the box under the BRAND title and select the OzVittoria brand from the options.")
    public void click_on_the_box_under_the_brand_title_and_select_the_oz_vittoria_brand_from_the_options() {

        trendlifebuyPage.productInformationBRANDTextBox.click();
        trendlifebuyPage.productInformationBRANDSearchBox.sendKeys("OzVittoria");
        actions.moveToElement(trendlifebuyPage.productInformationBRANDSelectOzVittoria);
        actions.click(trendlifebuyPage.productInformationBRANDSelectOzVittoria).perform();
    }

    @Then("Click on the box under the UNIT heading and click on the LOT option from the options that appear.")
    public void click_on_the_box_under_the_unit_heading_and_click_on_the_lot_option_from_the_options_that_appear() {

        trendlifebuyPage.productInformationUNITDropDownTextBox.click();
        trendlifebuyPage.productInformationUNITSelectTitleSearchBox.sendKeys("LOT");
        actions.moveToElement(trendlifebuyPage.productInformationUNITSelectLOT);
        actions.click(trendlifebuyPage.productInformationUNITSelectLOT).perform();


    }

    @Then("Click on the box under the BARCODE TYPE title and click on any of the options that appear.")
    public void click_on_the_box_under_the_barcode_type_title_and_click_on_any_of_the_options_that_appear() {

        trendlifebuyPage.productInformationBARCODEAnySelectBox.click();
        trendlifebuyPage.productInformationBARCODESelectTitleSearchBox.sendKeys("39E+");
        actions.moveToElement(trendlifebuyPage.productInformationUNITSelectC39E);
        actions.click(trendlifebuyPage.productInformationUNITSelectC39E).perform();

    }

    @Then("Type {string} in the text box under the MINIMUM ORDER QTY title and {string} in the MAX ORDER QTY text box.")
    public void type_in_the_text_box_under_the_minimum_order_qty_title_and_in_the_max_order_qty_text_box(String orderQTY, String maxOrderQTY) {

        trendlifebuyPage.productInformationMINORDERQTYBox.clear();
        trendlifebuyPage.productInformationMINORDERQTYBox.sendKeys(orderQTY);
        trendlifebuyPage.productInformationMAXORDERQTYBox.clear();
        trendlifebuyPage.productInformationMAXORDERQTYBox.sendKeys(maxOrderQTY);


    }

    @Then("Type {string} in the text box under Tags \\(Comma Separated).")
    public void type_in_the_text_box_under_tags_comma_separated(String tags) {

        trendlifebuyPage.productInformationTAGSBox.sendKeys(tags + Keys.ENTER);

    }

    @Then("Click the Browse button under Product Image Info and click the Upload New button from the pop-up window.")
    public void click_the_browse_button_under_product_image_info_and_click_the_upload_new_button_from_the_pop_up_window() {

        trendlifebuyPage.productImageBrowseButton.click();

        trendlifebuyPage.productImageUploadNewButton.click();

    }

    @Then("Upload an image file from your computer by clicking the Browse files link and click the Done button.")
    public void upload_an_image_file_from_your_computer_by_clicking_the_browse_files_link_and_click_the_done_button() {
        String yuklenecekDosyaYolu = System.getProperty("user.home") + "\\Desktop\\FileTesti\\UrunGorseli.jpg";
        //"C:\Users\User\Desktop\FileTesti\UrunGorseli.jpg"

        trendlifebuyPage.productImageBrowseFileLinkButton.sendKeys(yuklenecekDosyaYolu);

        ReusableMethods.waitForVisibility(trendlifebuyPage.productImageDoneButton, 10);
        actions.moveToElement(trendlifebuyPage.productImageDoneButton);
        actions.click(trendlifebuyPage.productImageDoneButton).perform();

        trendlifebuyPage.productImageSelectFileButton.click();

    }

    @Then("Then click on the 'Sort by newest' option from the sorting options in the window that opens and select an image.")
    public void then_click_on_the_sort_by_newest_option_from_the_sorting_options_in_the_window_that_opens_and_select_an_image_and_check_that_a_photo_is_selected() {

        trendlifebuyPage.productImageSelectSortByBox.click();
        trendlifebuyPage.productImageSelectSortBySearchBox.sendKeys("newest");
        actions.moveToElement(trendlifebuyPage.productImageSelectSortBySearchBoxSelect);
        actions.click(trendlifebuyPage.productImageSelectSortBySearchBoxSelect).perform();

    }

    @Then("Click the Select Only checkbox and click the Add Files button and save the file.")
    public void click_the_select_only_checkbox_and_click_the_add_files_button_and_save_the_file() {

        trendlifebuyPage.productImageSelectOnlyCheckBoxButton.click();
        System.out.println(trendlifebuyPage.productImageSelectOnlyCheckBoxButtonInput.isSelected());
        assertTrue(trendlifebuyPage.productImageSelectOnlyCheckBoxButtonInput.isSelected());

        actions.moveToElement(trendlifebuyPage.productImageSelectOnlyFiles);
        actions.doubleClick(trendlifebuyPage.productImageSelectOnlyFiles).perform();

        trendlifebuyPage.productImageAddFilesButton.click();
        System.out.println(trendlifebuyPage.productImageBrowseFileTextBox.getText());

        ReusableMethods.bekle(4);

    }

    @Then("Upload a PDF file from your computer by clicking the Browse button in the Upload PDF section under PDF SPECIFICATIONS.")
    public void upload_a_pdf_file_from_your_computer_by_clicking_the_browse_button_in_the_upload_pdf_section_under_pdf_specifications() {

        String yuklenecekPDFDosyaYolu = System.getProperty("user.home") + "\\Desktop\\FileTesti\\DeriCanta-SB-SS2021.pdf";
        //"C:\Users\User\Desktop\FileTesti\UrunGorseli.jpg"

        trendlifebuyPage.productPdfSpecificationsBrowseBox.sendKeys(yuklenecekPDFDosyaYolu);
    }

    @Then("Select Youtube from the VIDEO PROVIDER box under the heading Product Video Information and print a {string} in the VIDEO LINK text box.")
    public void select_youtube_from_the_video_provider_box_under_the_heading_product_video_information_and_print_a_in_the_video_link_text_box(String youTube) {

        Select select = new Select(trendlifebuyPage.productVideoProviderBox);
        select.selectByVisibleText("Youtube");

        trendlifebuyPage.productVideoLinkTextBox.sendKeys(ConfigReader.getProperty("YoutubeUrl"));
    }

    @Then("Check that the STATUS and MAKE DISPLAY IN DETAILS PAGE selected information under Others Info can be changed.")
    public void check_that_the_status_and_make_display_in_details_page_selected_information_under_others_info_can_be_changed() {

        trendlifebuyPage.productStatusCheckBoxPending.click();
        System.out.println(trendlifebuyPage.productStatusCheckBoxPendingIsSelect.isSelected());
        assertTrue(trendlifebuyPage.productStatusCheckBoxPendingIsSelect.isSelected());

        trendlifebuyPage.productStatusCheckBoxPublish.click();
        System.out.println(trendlifebuyPage.productStatusCheckBoxPublishIsSelect.isSelected());
        assertTrue(trendlifebuyPage.productStatusCheckBoxPublishIsSelect.isSelected());

        trendlifebuyPage.productMakeDisplayDetailsCheckBoxCrossSale.click();
        System.out.println(trendlifebuyPage.productMakeDisplayDetailsCheckBoxCrossSaleIsSelect.isSelected());
        assertTrue(trendlifebuyPage.productMakeDisplayDetailsCheckBoxCrossSaleIsSelect.isSelected());

        trendlifebuyPage.productMakeDisplayDetailsCheckBoxUpSale.click();
        System.out.println(trendlifebuyPage.productMakeDisplayDetailsCheckBoxUpSaleIsSelect.isSelected());
        assertTrue(trendlifebuyPage.productMakeDisplayDetailsCheckBoxUpSaleIsSelect.isSelected());

    }

    @Then("Check that the selected and written information under the Weight Height Info heading can be changed.")
    public void check_that_the_selected_and_written_information_under_the_weight_height_info_heading_can_be_changed() {

        trendlifebuyPage.productWeightHeightInfoWeight.clear();
        trendlifebuyPage.productWeightHeightInfoWeight.sendKeys("600");
        trendlifebuyPage.productWeightHeightInfoLength.clear();
        trendlifebuyPage.productWeightHeightInfoLength.sendKeys("30");
        trendlifebuyPage.productWeightHeightInfoBreadth.clear();
        trendlifebuyPage.productWeightHeightInfoBreadth.sendKeys("20");
        trendlifebuyPage.productWeightHeightInfoHeight.clear();
        trendlifebuyPage.productWeightHeightInfoHeight.sendKeys("15");
        trendlifebuyPage.productWeightHeightInfoAdditionalShipping.clear();
        trendlifebuyPage.productWeightHeightInfoAdditionalShipping.sendKeys("1");

        trendlifebuyPage.productWeightHeightInfoStockManage.click();
        actions.moveToElement(trendlifebuyPage.productWeightHeightInfoStockManageYES);
        actions.click(trendlifebuyPage.productWeightHeightInfoStockManageYES).perform();

        trendlifebuyPage.productWeightHeightInfoProductStockTextBox.clear();
        trendlifebuyPage.productWeightHeightInfoProductStockTextBox.sendKeys("999");

        trendlifebuyPage.productWeightHeightInfoSellingPrice.clear();
        trendlifebuyPage.productWeightHeightInfoSellingPrice.sendKeys("25");
        trendlifebuyPage.productWeightHeightInfoDiscount.clear();
        trendlifebuyPage.productWeightHeightInfoDiscount.sendKeys("0");

        trendlifebuyPage.productWeightHeightInfoDiscountType.click();
        actions.moveToElement(trendlifebuyPage.productWeightHeightInfoDiscountTypePercentage);
        actions.click(trendlifebuyPage.productWeightHeightInfoDiscountTypePercentage).perform();

        trendlifebuyPage.productWeightHeightInfoTaxType.click();
        actions.moveToElement(trendlifebuyPage.productWeightHeightInfoTaxTypeVat1);
        actions.click(trendlifebuyPage.productWeightHeightInfoTaxTypeVat1).perform();


    }

    @Then("Write a description about the product in the text boxes under the headings Description and Specifications.")
    public void write_a_description_about_the_product_in_the_text_boxes_under_the_headings_description_and_specifications() {

        trendlifebuyPage.productDescriptionTextBox.clear();
        trendlifebuyPage.productDescriptionTextBox.sendKeys(ConfigReader.getProperty("Description"));
        trendlifebuyPage.productSpecificationsTextBox.clear();
        trendlifebuyPage.productSpecificationsTextBox.sendKeys(ConfigReader.getProperty("Specifications"));

    }

    @Then("Type a title and description in the META TITLE and META DESCRIPTION text boxes under SEO info.")
    public void type_a_title_and_description_in_the_meta_title_and_meta_description_text_boxes_under_seo_info() {

        trendlifebuyPage.productSEOInfoMetaTitleTextBox.clear();
        trendlifebuyPage.productSEOInfoMetaTitleTextBox.sendKeys("None");

        trendlifebuyPage.productSEOInfoMetaDescriptionTextBox.clear();
        trendlifebuyPage.productSEOInfoMetaDescriptionTextBox.sendKeys(ConfigReader.getProperty("MetaDescription"));

    }

    @Then("Then click the Save button at the bottom of the page and check that the information has been successfully saved.")
    public void then_click_the_save_button_at_the_bottom_of_the_page_and_check_that_the_information_has_been_successfully_saved() {

        trendlifebuyPage.editAndCloneProductUpdateAndSaveButton.click();
        assertTrue("The Clone Product Update Success Message does not appear on the screen",
                trendlifebuyPage.editAndCloneProductUpdateSuccessMessage.isDisplayed());

    }


//********************************************  SCENARIO TC_3414  ****************************************************//


    @Then("With the GENERAL INFORMATION window tab selected, verify that the message reminding that the information must be filled before recording is displayed at the end of the page.")
    public void with_the_general_information_window_tab_selected_verify_that_the_message_reminding_that_the_information_must_be_filled_before_recording_is_displayed_at_the_end_of_the_page() {

        javaScript.executeScript("arguments[0].scrollIntoView();", trendlifebuyPage.cloneProductUnderPageAlertWarningMessage);
        ReusableMethods.waitForVisibility(trendlifebuyPage.cloneProductUnderPageAlertWarningMessage, 3);
        assertTrue("At the end of the GENERAL INFORMATION tab window, the message reminding that the information must be filled before registration does not appear."
                , trendlifebuyPage.cloneProductUnderPageAlertWarningMessage.isDisplayed());

    }

    @Then("Click on the RELATED PRODUCT tab, verify that the Related Product window appears at the end of the page reminding you to fill in the information before recording.")
    public void click_on_the_related_product_tab_verify_that_the_related_product_window_appears_at_the_end_of_the_page_reminding_you_to_fill_in_the_information_before_recording() {

        trendlifebuyPage.editProductRelatedProductTabButton.click();
        javaScript.executeScript("arguments[0].scrollIntoView();", trendlifebuyPage.cloneProductUnderPageAlertWarningMessage);
        assertTrue("At the end of the Related Product tab window, the message reminding that the information must be filled before registration does not appear."
                , trendlifebuyPage.cloneProductUnderPageAlertWarningMessage.isDisplayed());
    }

    @Then("Click on the UP SALE tab, verify that the Up Sale window appears at the end of the page, reminding that the information must be filled before registration.")
    public void click_on_the_up_sale_tab_verify_that_the_up_sale_window_appears_at_the_end_of_the_page_reminding_that_the_information_must_be_filled_before_registration() {

        trendlifebuyPage.editProductUpSaleTabButton.click();
        javaScript.executeScript("arguments[0].scrollIntoView();", trendlifebuyPage.cloneProductUnderPageAlertWarningMessage);
        assertTrue("At the end of the UP SALE tab window, the message reminding that the information must be filled before registration does not appear."
                , trendlifebuyPage.cloneProductUnderPageAlertWarningMessage.isDisplayed());
    }

    @Then("Click on the CROSS SALE tab, verify that the Cross sale window appears at the end of the page, reminding that the information must be filled before registration.")
    public void click_on_the_cross_sale_tab_verify_that_the_cross_sale_window_appears_at_the_end_of_the_page_reminding_that_the_information_must_be_filled_before_registration() {

        trendlifebuyPage.editProductCrossSaleTabButton.click();
        javaScript.executeScript("arguments[0].scrollIntoView();", trendlifebuyPage.cloneProductUnderPageAlertWarningMessage);
        assertTrue("At the end of the CROSS SALE tab window, the message reminding that the information must be filled before registration does not appear."
                , trendlifebuyPage.cloneProductUnderPageAlertWarningMessage.isDisplayed());

    }


//********************************************  SCENARIO TC_3415  ****************************************************//

    @Then("GENERAL INFORMATION, RELATED PRODUCT While any of the , UP SALE or CROSS SALE window tabs are selected click the Save button at the end of the page.")
    public void general_information_related_product_while_any_of_the_up_sale_or_cross_sale_window_tabs_are_selected_click_the_save_button_at_the_end_of_the_page() {

        trendlifebuyPage.editProductRelatedProductTabButton.click();

        trendlifebuyPage.editProductGeneralInformationTabButton.click();

        trendlifebuyPage.editProductUpSaleTabButton.click();

        trendlifebuyPage.editProductCrossSaleTabButton.click();

        javaScript.executeScript("arguments[0].scrollIntoView();", trendlifebuyPage.editAndCloneProductUpdateAndSaveButton);

        trendlifebuyPage.editAndCloneProductUpdateAndSaveButton.click();

    }

    @Then("Verify that the about saved the product has been successfully message appears on the screen.")
    public void verify_that_the_about_saved_the_product_has_been_successfully_message_appears_on_the_screen() {

        ReusableMethods.waitForVisibility(trendlifebuyPage.editAndCloneProductUpdateSuccessMessage, 3);
        assertTrue("The Clone Product Update Success Message does not appear on the screen",
                trendlifebuyPage.editAndCloneProductUpdateSuccessMessage.isDisplayed());

    }


//********************************************  SCENARIO TC_3416  ****************************************************//

    @Then("Click on any Select button opposite the products under the Action heading column for Delete.")
    public void click_on_any_select_button_opposite_the_products_under_the_action_heading_column_for_delete() {

        trendlifebuyPage.productListQuickSearchBox.sendKeys("OzVittoria");
        ReusableMethods.bekle(2);

        if (!trendlifebuyPage.productListQuickSearchBoxProductTwoSelect.isDisplayed()) {

            assertFalse("The Product Select button does visible on the screen",
                    trendlifebuyPage.productListQuickSearchBoxProductTwoSelect.isDisplayed());

            trendlifebuyPage.plusQuickSearchActionSelectButton2.click();

            actions.moveToElement(trendlifebuyPage.productListQuickSearchBoxProductTwoSelectPlus);
            actions.click(trendlifebuyPage.productListQuickSearchBoxProductTwoSelectPlus).perform();


        } else {

            assertTrue("The Product Select button does not visible on the screen",
                    trendlifebuyPage.productListQuickSearchBoxProductTwoSelect.isDisplayed());

            trendlifebuyPage.productListQuickSearchBoxProductTwoSelect.click();
        }

        ReusableMethods.bekle(1);


    }

    @Then("In the mini pop-up tab that opens it is checked whether the Delete button link is visible.")
    public void in_the_mini_pop_up_tab_that_opens_it_is_checked_whether_the_delete_button_link_is_visible() {

        assertTrue("The Product Select Delete link button does not visible on the screen",
                trendlifebuyPage.productListQuickSearchBoxProductTwoDeleteLinkBut.isDisplayed());

    }

    @Then("Click the Delete and then click the Delete button in the mini alert window that will appear.")
    public void click_the_delete_and_then_click_the_delete_button_in_the_mini_alert_window_that_will_appear() {

        trendlifebuyPage.productListQuickSearchBoxProductTwoDeleteLinkBut.click();

        ReusableMethods.waitForVisibility(trendlifebuyPage.productListAlertDeleteButton, 2);
        trendlifebuyPage.productListAlertDeleteButton.click();
    }

    @Then("Check that a green pop-up message appears in the upper right corner of the screen stating that the product has been Deleted Successfully.")
    public void check_that_a_green_pop_up_message_appears_in_the_upper_right_corner_of_the_screen_stating_that_the_product_has_been_deleted_successfully() {

        ReusableMethods.waitForVisibility(trendlifebuyPage.productListDeleteProductSuccessMessage, 4);
        assertTrue("The Product Delete Successful Message does not appear on the screen", trendlifebuyPage.productListDeleteProductSuccessMessage.isDisplayed());

    }


//********************************************  SCENARIO TC_3417  ****************************************************//

    @Then("Click the Product By SKU tab button that appears on the screen.")
    public void click_the_product_by_sku_tab_button_that_appears_on_the_screen() {

        trendlifebuyPage.productBySKUListTabButton.click();
        ReusableMethods.waitForVisibility(trendlifebuyPage.productBySKUWindow, 2);


    }

    @Then("Verify that the products are listed and appearing under the headings SL, Name, Brand, SKU, Selling Price, Image, Action in the tab that appears.")
    public void verify_that_the_products_are_listed_and_appearing_under_the_headings_sl_name_brand_sku_selling_price_image_action_in_the_tab_that_appears() {

        List<WebElement> productTitleElementListi = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']//th"));

        for (WebElement eachElement : productTitleElementListi) {

            System.out.print(eachElement.getText() + "    ");

        }

        System.out.println("");


        List<WebElement> productsDataElementList = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementList) {

            System.out.println(eachElement2.getText());
        }


        assertTrue("The table title SL in the Product List tab window does not appear on the screen.", productTitleElementListi.get(0).isDisplayed());
        assertTrue("The table title NAME in the Product List tab window does not appear on the screen.", productTitleElementListi.get(1).isDisplayed());
        assertTrue("The table title PRODUCT TYPE in the Product List tab window does not appear on the screen.", productTitleElementListi.get(2).isDisplayed());
        assertTrue("The table title BRAND in the Product List tab window does not appear on the screen.", productTitleElementListi.get(3).isDisplayed());
        assertTrue("The table title IMAGE in the Product List tab window does not appear on the screen.", productTitleElementListi.get(4).isDisplayed());
        assertTrue("The table title STOCK in the Product List tab window does not appear on the screen.", productTitleElementListi.get(5).isDisplayed());
        //assertTrue("The table title ACTION in the Product List tab window does not appear on the screen.", productTitleElementListi.get(6).isDisplayed());

        javaScript.executeScript("arguments[0].scrollIntoView();", productsDataElementList.get(8));

        assertTrue("The 1th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(0).isDisplayed());
        assertTrue("The 2nd PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(1).isDisplayed());
        assertTrue("The 3th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(2).isDisplayed());
        assertTrue("The 4th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(3).isDisplayed());
        assertTrue("The 5th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(4).isDisplayed());
        assertTrue("The 6th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(5).isDisplayed());
        assertTrue("The 7th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(6).isDisplayed());
        assertTrue("The 8th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(7).isDisplayed());
        assertTrue("The 9th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(8).isDisplayed());
        assertTrue("The 10th PRODUCT TABLE DATA in the Product List tab window does not appear on the screen.", productsDataElementList.get(9).isDisplayed());

    }


//********************************************  SCENARIO TC_3418  ****************************************************//

    @Then("Click on the NAME filtering header in the tab that opens and verify that the ordering has changed.")
    public void click_on_the_name_filtering_header_in_the_tab_that_opens_and_verify_that_the_ordering_has_changed() {

        List<WebElement> productTitleElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']//th"));


        for (WebElement eachElement : productTitleElementListSKUTab) {

            System.out.print(eachElement.getText() + "    ");

        }

        productTitleElementListSKUTab.get(0).click();


        ReusableMethods.bekle(1);


        List<WebElement> productsDataElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTab) {

            eachElement2.getText();

        }

        System.out.println("SortBY SL: " + productsDataElementListSKUTab.get(0).getText());


        productTitleElementListSKUTab.get(0).click();

        ReusableMethods.bekle(1);


        List<WebElement> productsDataElementListSKUTabSorted = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTabSorted) {

            eachElement2.getText();

        }
        ReusableMethods.fluentWait(productsDataElementListSKUTabSorted.get(1), 3);

        System.out.println("SortBY NAME: " + productsDataElementListSKUTabSorted.get(0).getText());

        assertNotEquals("The sorting did not change when the NAME filter sort header was clicked."
                , productsDataElementListSKUTabSorted.get(0), productsDataElementListSKUTab.get(0));


    }

    @Then("Click on the SL filtering header in the tab that opens and verify that the ordering has changed.")
    public void click_on_the_sl_filtering_header_in_the_tab_that_opens_and_verify_that_the_ordering_has_changed() {

        List<WebElement> productTitleElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']//th"));


        for (WebElement eachElement : productTitleElementListSKUTab) {

            System.out.print(eachElement.getText() + "    ");

        }

        productTitleElementListSKUTab.get(1).click();

        ReusableMethods.bekle(1);

        List<WebElement> productsDataElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTab) {

            eachElement2.getText();

        }

        System.out.println("SortBY : " + productsDataElementListSKUTab.get(0).getText());


        productTitleElementListSKUTab.get(1).click();


        ReusableMethods.bekle(1);


        List<WebElement> productsDataElementListSKUTabSorted = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTabSorted) {

            eachElement2.getText();

        }
        ReusableMethods.fluentWait(productsDataElementListSKUTabSorted.get(1), 3);

        System.out.println("SortBY NAME: " + productsDataElementListSKUTabSorted.get(0).getText());

        assertNotEquals("The sorting did not change when the NAME filter sort header was clicked."
                , productsDataElementListSKUTabSorted.get(0), productsDataElementListSKUTab.get(0));


    }

    @Then("Click on the BRAND filtering header in the tab that opens and verify that the ordering has changed.")
    public void click_on_the_brand_filtering_header_in_the_tab_that_opens_and_verify_that_the_ordering_has_changed() {


        List<WebElement> productTitleElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']//th"));


        for (WebElement eachElement : productTitleElementListSKUTab) {

            System.out.print(eachElement.getText() + "    ");

        }

        productTitleElementListSKUTab.get(2).click();

        ReusableMethods.bekle(1);

        List<WebElement> productsDataElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTab) {

            eachElement2.getText();

        }

        System.out.println("SortBY : " + productsDataElementListSKUTab.get(0).getText());


        productTitleElementListSKUTab.get(2).click();


        ReusableMethods.bekle(1);


        List<WebElement> productsDataElementListSKUTabSorted = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTabSorted) {

            eachElement2.getText();

        }
        ReusableMethods.fluentWait(productsDataElementListSKUTabSorted.get(1), 3);

        System.out.println("SortBY NAME: " + productsDataElementListSKUTabSorted.get(0).getText());

        assertNotEquals("The sorting did not change when the NAME filter sort header was clicked."
                , productsDataElementListSKUTabSorted.get(0), productsDataElementListSKUTab.get(0));


    }

    @Then("Click on the SKU filtering header in the tab that opens and verify that the ordering has changed.")
    public void click_on_the_sku_filtering_header_in_the_tab_that_opens_and_verify_that_the_ordering_has_changed() {

        List<WebElement> productTitleElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']//th"));


        for (WebElement eachElement : productTitleElementListSKUTab) {

            System.out.print(eachElement.getText() + "    ");

        }

        productTitleElementListSKUTab.get(3).click();

        ReusableMethods.bekle(1);

        List<WebElement> productsDataElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTab) {

            eachElement2.getText();

        }

        System.out.println("SortBY : " + productsDataElementListSKUTab.get(0).getText());


        productTitleElementListSKUTab.get(3).click();


        ReusableMethods.bekle(1);


        List<WebElement> productsDataElementListSKUTabSorted = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTabSorted) {

            eachElement2.getText();

        }
        ReusableMethods.fluentWait(productsDataElementListSKUTabSorted.get(1), 3);

        System.out.println("SortBY NAME: " + productsDataElementListSKUTabSorted.get(0).getText());

        assertNotEquals("The sorting did not change when the NAME filter sort header was clicked."
                , productsDataElementListSKUTabSorted.get(0), productsDataElementListSKUTab.get(0));


    }

    @Then("Click on the SELLING PRICE filtering header in the tab that opens and verify that the ordering has changed.")
    public void click_on_the_selling_price_filtering_header_in_the_tab_that_opens_and_verify_that_the_ordering_has_changed() {

        List<WebElement> productTitleElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']//th"));


        for (WebElement eachElement : productTitleElementListSKUTab) {

            System.out.print(eachElement.getText() + "    ");

        }

        productTitleElementListSKUTab.get(4).click();

        ReusableMethods.bekle(1);

        List<WebElement> productsDataElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTab) {

            eachElement2.getText();

        }

        System.out.println("SortBY : " + productsDataElementListSKUTab.get(0).getText());


        productTitleElementListSKUTab.get(4).click();


        ReusableMethods.bekle(1);


        List<WebElement> productsDataElementListSKUTabSorted = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTabSorted) {

            eachElement2.getText();

        }
        ReusableMethods.fluentWait(productsDataElementListSKUTabSorted.get(1), 3);

        System.out.println("SortBY NAME: " + productsDataElementListSKUTabSorted.get(0).getText());

        assertNotEquals("The sorting did not change when the NAME filter sort header was clicked."
                , productsDataElementListSKUTabSorted.get(0), productsDataElementListSKUTab.get(0));

    }

    @Then("Click on the IMAGE filtering header in the tab that opens and verify that the ordering has changed.")
    public void click_on_the_image_filtering_header_in_the_tab_that_opens_and_verify_that_the_ordering_has_changed() {

        List<WebElement> productTitleElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']//th"));


        for (WebElement eachElement : productTitleElementListSKUTab) {

            System.out.print(eachElement.getText() + "    ");

        }

        productTitleElementListSKUTab.get(5).click();

        ReusableMethods.bekle(1);

        List<WebElement> productsDataElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTab) {

            eachElement2.getText();

        }

        System.out.println("SortBY : " + productsDataElementListSKUTab.get(0).getText());


        productTitleElementListSKUTab.get(5).click();


        ReusableMethods.bekle(1);


        List<WebElement> productsDataElementListSKUTabSorted = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTabSorted) {

            eachElement2.getText();

        }
        ReusableMethods.fluentWait(productsDataElementListSKUTabSorted.get(1), 3);

        System.out.println("SortBY NAME: " + productsDataElementListSKUTabSorted.get(0).getText());

        assertNotEquals("The sorting did not change when the NAME filter sort header was clicked."
                , productsDataElementListSKUTabSorted.get(0), productsDataElementListSKUTab.get(0));

    }

    @Then("Click on the ACTION filtering header in the tab that opens and verify that the ordering has changed.")
    public void click_on_the_action_filtering_header_in_the_tab_that_opens_and_verify_that_the_ordering_has_changed() {

        List<WebElement> productTitleElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']//th"));


        for (WebElement eachElement : productTitleElementListSKUTab) {

            System.out.print(eachElement.getText() + "    ");

        }

        actions.moveToElement(productTitleElementListSKUTab.get(6));
        actions.doubleClick(productTitleElementListSKUTab.get(6)).perform();

        ReusableMethods.bekle(1);

        List<WebElement> productsDataElementListSKUTab = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTab) {

            eachElement2.getText();

        }

        System.out.println("SortBY : " + productsDataElementListSKUTab.get(0).getText());


        actions.moveToElement(productTitleElementListSKUTab.get(6));
        actions.doubleClick(productTitleElementListSKUTab.get(6)).perform();


        ReusableMethods.bekle(1);


        List<WebElement> productsDataElementListSKUTabSorted = Driver.getDriver().findElements(By.xpath("//table[@id='SKUTable']/tbody[1]/tr"));

        for (WebElement eachElement2 : productsDataElementListSKUTabSorted) {

            eachElement2.getText();

        }
        ReusableMethods.fluentWait(productsDataElementListSKUTabSorted.get(1), 3);

        System.out.println("SortBY NAME: " + productsDataElementListSKUTabSorted.get(0).getText());

        assertNotEquals("The sorting did not change when the NAME filter sort header was clicked."
                , productsDataElementListSKUTabSorted.get(0), productsDataElementListSKUTab.get(0));
    }


//********************************************  SCENARIO TC_3419  ****************************************************//


/*********************************************    SECOND SPLINT   *****************************************************/
    /*********************************************    SECOND SPLINT   *****************************************************/


//********************************************  SCENARIO TC_04601  ****************************************************//
    @Then("The Admin Reports Title should be clickable under the CONTENT title on the left side of the screen on the Dashboard page.")
    public void the_admin_reports_title_should_be_clickable_under_the_content_title_on_the_left_side_of_the_screen_on_the_dashboard_page() {

        javaScript.executeScript("arguments[0].scrollIntoView();", trendlifebuyPage.adminReportsLinkButton);
        trendlifebuyPage.adminReportsLinkButton.click();

    }

    @Then("Click on the link button titled Top Selling Item from the options listed under the Admin Reports Title.")
    public void click_on_the_link_button_titled_top_selling_item_from_the_options_listed_under_the_admin_reports_title() {

        actions.scrollToElement(trendlifebuyPage.adminReportsTopSellingItemLinkButton);
        actions.click(trendlifebuyPage.adminReportsTopSellingItemLinkButton).perform();
        ReusableMethods.waitForPageToLoad(4);
    }

    @Then("Then, it is checked that the Admin Reports page is opened and the Top Selling Item window visible on the screen.")
    public void then_it_is_checked_that_the_admin_reports_page_is_opened_and_the_top_selling_item_window_visible_on_the_screen() {

        String actualUrl = "https://trendlifebuy.com/admin-dashboard";
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        assertNotEquals(expectedUrl, actualUrl);

        ReusableMethods.waitForVisibility(trendlifebuyPage.adminReportsTopSellingItemWindow, 2);
        assertTrue("The Top Selling Item window does not visible on the screen", trendlifebuyPage.adminReportsTopSellingItemWindow.isDisplayed());

    }

    @Then("Then it is checked that the products are listed in the Top Selling Item window.")
    public void then_it_is_checked_that_the_products_are_listed_in_the_top_selling_item_window() {

        List<WebElement> topSellingItemTitleElementList = Driver.getDriver().findElements(By.xpath("//th[@scope]"));

        for (WebElement eachElement : topSellingItemTitleElementList) {

            System.out.print(eachElement.getText() + "    ");

        }

        System.out.print("    ");

        List<WebElement> topSellingItemsDataElementList = Driver.getDriver().findElements(By.xpath("//tr[@class]"));

        for (WebElement eachElement2 : topSellingItemsDataElementList) {

            System.out.println(eachElement2.getText());
        }


        assertTrue("The table title SL in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(0).isDisplayed());
        assertTrue("The table title SELLER in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(1).isDisplayed());
        assertTrue("The table title PRODUCT TYPE in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(2).isDisplayed());
        assertTrue("The table title TOTAL SALE in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(3).isDisplayed());
        assertTrue("The table title AVERAGE RATING in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(4).isDisplayed());


        javaScript.executeScript("arguments[0].scrollIntoView();", topSellingItemsDataElementList.get(8));


        assertTrue("The 1th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(0).isDisplayed());
        assertTrue("The 2nd PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(1).isDisplayed());
        assertTrue("The 3th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(2).isDisplayed());
        assertTrue("The 4th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(3).isDisplayed());
        assertTrue("The 5th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(4).isDisplayed());
        assertTrue("The 6th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(5).isDisplayed());
        assertTrue("The 7th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(6).isDisplayed());
        assertTrue("The 8th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(7).isDisplayed());
        assertTrue("The 9th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(8).isDisplayed());
        assertTrue("The 10th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(9).isDisplayed());

    }


//********************************************  SCENARIO TC_04602  ****************************************************//

    @Then("In the window that opens type {string} in the Quick Search box and search.")
    public void in_the_window_that_opens_type_in_the_quick_search_box_and_search(String search) throws IOException {

        List<WebElement> topSellingItemsDataSearchResultList1 = Driver.getDriver().findElements(By.xpath("//tr[@class]"));

        for (WebElement eachElement2 : topSellingItemsDataSearchResultList1) {

            System.out.println(eachElement2.getText());
        }

        assertTrue("The 1th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataSearchResultList1.get(0).isDisplayed());

        ReusableMethods.getScreenshot("Top Selling Item table before search");

        trendlifebuyPage.topSellingItemQuickSearchBox.sendKeys(search);

    }

    @Then("Check whether there are products in the search result and whether the products are listed according to the search result.")
    public void check_whether_there_are_products_in_the_search_result_and_whether_the_products_are_listed_according_to_the_search_result() throws IOException {

        ReusableMethods.waitForVisibility(trendlifebuyPage.topSellingItemQuickSearchBoxResult, 2);
        System.out.println("\n" + trendlifebuyPage.topSellingItemQuickSearchBoxResult.getText());

        assertTrue("When a word was typed into the Quick Search box in the Top Selling Item window, related product was found.",
                trendlifebuyPage.topSellingItemQuickSearchBoxResult.isDisplayed());

        System.out.println(trendlifebuyPage.topSellingItemResultTableInfo.getText());

        ReusableMethods.getScreenshot("No matching records found");


        List<WebElement> topSellingItemsDataSearchResultList2 = Driver.getDriver().findElements(By.xpath("//tr[@class]"));

        for (WebElement eachElement2 : topSellingItemsDataSearchResultList2) {

            System.out.println(eachElement2.getText());
        }

        assertTrue(topSellingItemsDataSearchResultList2.get(0).getText().contains("bag"));

    }


//********************************************  SCENARIO TC_04603  ****************************************************//

    @Then("It should be verified that the top selling products are listed under the headings Seller, Product, Total Sale, Average Rating on the page that opens.")
    public void it_should_be_verified_that_the_top_selling_products_are_listed_under_the_headings_seller_product_total_sale_average_rating_on_the_page_that_opens() {

        List<WebElement> topSellingItemTitleElementList = Driver.getDriver().findElements(By.xpath("//th[@scope]"));

        for (WebElement eachElement : topSellingItemTitleElementList) {

            System.out.print(eachElement.getText() + "    ");

        }

        System.out.print("\n");

        List<WebElement> topSellingItemsDataElementList = Driver.getDriver().findElements(By.xpath("//tr[@class]"));

        for (WebElement eachElement2 : topSellingItemsDataElementList) {

            System.out.println(eachElement2.getText() + "  ");
        }


        assertTrue("The table title SL in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(0).isDisplayed());
        assertTrue("The table title SELLER in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(1).isDisplayed());
        assertTrue("The table title PRODUCT TYPE in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(2).isDisplayed());
        assertTrue("The table title TOTAL SALE in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(3).isDisplayed());
        assertTrue("The table title AVERAGE RATING in the Top Selling Item window does not appear on the screen.", topSellingItemTitleElementList.get(4).isDisplayed());


        javaScript.executeScript("arguments[0].scrollIntoView();", topSellingItemsDataElementList.get(8));


        assertTrue("The 1th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(0).isDisplayed());
        assertTrue("The 2nd PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(1).isDisplayed());
        assertTrue("The 3th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(2).isDisplayed());
        assertTrue("The 4th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(3).isDisplayed());
        assertTrue("The 5th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(4).isDisplayed());
        assertTrue("The 6th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(5).isDisplayed());
        assertTrue("The 7th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(6).isDisplayed());
        assertTrue("The 8th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(7).isDisplayed());
        assertTrue("The 9th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(8).isDisplayed());
        assertTrue("The 10th PRODUCT TABLE DATA in the Top Selling Item window does not appear on the screen.", topSellingItemsDataElementList.get(9).isDisplayed());

    }


//********************************************  SCENARIO TC_04604  ****************************************************//

    @Then("Click on the direction arrows or page numbers at the bottom of the page to switch between the pages where the products are listed.")
    public void click_on_the_direction_arrows_or_page_numbers_at_the_bottom_of_the_page_to_switch_between_the_pages_where_the_products_are_listed() {

        trendlifebuyPage.topSellingItemNextPageButton.click();
        ReusableMethods.bekle(2);
        trendlifebuyPage.topSellingItemPreviousPageButton.click();
        ReusableMethods.bekle(1);
    }
    @Then("Then it should be verified that there are transitions between the pages in the Top Selling Item List and that the pages change.")
    public void then_it_should_be_verified_that_there_are_transitions_between_the_pages_in_the_top_selling_item_list_and_that_the_pages_change() {

        List<WebElement> topSellingItemsDataElementList1 = Driver.getDriver().findElements(By.xpath("//tr[@class]"));

        for (WebElement eachElement2 : topSellingItemsDataElementList1) {

            eachElement2.getText();
        }


        System.out.println("\nPage 1 : " + trendlifebuyPage.topSellingItemResultTableInfo.getText() + "\n");

        javaScript.executeScript("arguments[0].scrollIntoView();", topSellingItemsDataElementList1.get(9));

        String topSellingItems0 = topSellingItemsDataElementList1.get(0).getText();
        String topSellingItems1 = topSellingItemsDataElementList1.get(1).getText();
        String topSellingItems2 = topSellingItemsDataElementList1.get(2).getText();
        String topSellingItems3 = topSellingItemsDataElementList1.get(3).getText();
        String topSellingItems4 = topSellingItemsDataElementList1.get(4).getText();

        ReusableMethods.bekle(2);
        trendlifebuyPage.topSellingItemNextPageButton.click();
        ReusableMethods.bekle(2);


        List<WebElement> topSellingItemsDataElementList2 = Driver.getDriver().findElements(By.xpath("//tr[@class]"));

        for (WebElement eachElement2 : topSellingItemsDataElementList2) {

            System.out.println(eachElement2.getText() + "  ");
        }


        System.out.println("\nPage 2 : " + trendlifebuyPage.topSellingItemResultTableInfo.getText());

        javaScript.executeScript("arguments[0].scrollIntoView();", topSellingItemsDataElementList2.get(9));

        String topSellingItemsA = topSellingItemsDataElementList2.get(0).getText();
        String topSellingItemsB = topSellingItemsDataElementList2.get(1).getText();
        String topSellingItemsC = topSellingItemsDataElementList2.get(2).getText();
        String topSellingItemsD = topSellingItemsDataElementList2.get(3).getText();
        String topSellingItemsE = topSellingItemsDataElementList2.get(4).getText();

        assertNotEquals(topSellingItemsA, topSellingItems0);
        assertNotEquals(topSellingItemsB, topSellingItems1);
        assertNotEquals(topSellingItemsC, topSellingItems2);
        assertNotEquals(topSellingItemsD, topSellingItems3);
        assertNotEquals(topSellingItemsE, topSellingItems4);


        ReusableMethods.bekle(2);
        trendlifebuyPage.topSellingItemNextPageButton.click();

        ReusableMethods.bekle(2);
        System.out.println("\nPage 3 : " + trendlifebuyPage.topSellingItemResultTableInfo.getText());



    }

}