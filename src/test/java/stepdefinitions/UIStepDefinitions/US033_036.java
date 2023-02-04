package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.TrendLifeBuyPage;
import pages.US033_036_Page;
import utilities.Driver;

import java.util.List;

public class US033_036 {

    US033_036_Page mert=new US033_036_Page();

    Actions actions=new Actions( Driver.getDriver());
    @Given("Admin click {string} button then click {string} button")
    public void admin_click_button_then_click_button(String string, String string2) {
    mert.costumerButton.click();
    mert.allCostumerButton.click();
    }

    @Given("Admin Test that All Customer  is visible")
    public void adminTestThatAllCustomerIsVisible() {
    Assert.assertTrue( mert.allCostumerButton.isDisplayed() );
    }

    @Then("Admin Test that All Customer List  is visible")
    public void adminTestThatAllCustomerListIsVisible() {
       /* List<WebElement> sonuc ;
        WebElement driver = null;
        Object WebElementListe = driver.findElements( By.className( "All Costumer" ) ); */
    Assert.assertTrue( mert.allCostumerLogo.isDisplayed() );
    }

    @When("Admin Check that the Is Active radio button is working")
    public void admin_check_that_the_is_active_radio_button_is_working() {

    }
    @Then("Admin Click Select DropDownMenu")
    public void admin_click_select_drop_down_menu() {
        mert.dropDownSelect.click();

    }
    @Then("Admin Click Details radio button")
    public void admin_click_details_radio_button() {
        mert.detailsDDM.click();

    }
    @Then("Admin Test that Customer Profile  is visible")
    public void admin_test_that_customer_profile_is_visible() {
        Assert.assertTrue( mert.costumerProfileButton.isDisplayed() );

    }

    @When("Admin Check that the is Active radio button is working")
    public void adminCheckThatTheIsActiveRadioButtonIsWorking() {

    }
    @Then("Admin Test that the texts Customer Profile, Name, Email, Phone is visible")
    public void admin_test_that_the_texts_customer_profile_name_email_phone_is_visible() {
    Assert.assertTrue( mert.name.isDisplayed() );
    Assert.assertTrue( mert.email.isDisplayed() );
    Assert.assertTrue( mert.phone.isDisplayed() );
    }

    @Given("Admin it should be verified that Orders, Wallet Histories information")
    public void admin_it_should_be_verified_that_orders_wallet_histories_information() {
Assert.assertTrue( mert.orders.isDisplayed() );
Assert.assertTrue( mert.wallet.isDisplayed() );
Assert.assertTrue( mert.address.isDisplayed() );
    }

    @Then("Admin Click Wallet Histories button")
    public void admin_click_wallet_histories_button() {
mert.wallet.click();
    }
    @Then("The DATE, USER is visible")
    public void the_date_user_is_visible() {
Assert.assertTrue( mert.date.isDisplayed() );
Assert.assertTrue( mert.user.isDisplayed() );

    }
    @Then("Admin It should be verified that the Details link that appears when the select button")
    public void admin_ıt_should_be_verified_that_the_details_link_that_appears_when_the_select_button() {
      Assert.assertTrue( mert.detailsLink.isEnabled() );
          }
    @When("Admin Check that the Details, Edit, Delete radio button is working")
    public void admin_check_that_the_details_edit_delete_radio_button_is_working() {
       mert.detailsDDM.click();
    }
    @When("Verify that it is possible to search within the List from the Quick Search Text Box")
    public void verify_that_it_is_possible_to_search_within_the_list_from_the_quick_search_text_box() {
      mert.searchBox.click();
      mert.searchBox.sendKeys( "test" );
      Assert.assertTrue( mert.searchBoxSonuc.isDisplayed() );

    }
    @When("Admin Click Edit button")
    public void admin_click_edit_button() {
        mert.editDDM.click();

    }
    @Given("Admin Test that Update Customer is visible")
    public void admin_test_that_update_customer_is_visible() {
        Assert.assertTrue( mert.updateCostomer.isDisplayed() );

    }
    @Given("Admin click inactive Costomer button")
    public void admin_click_inactive_costomer_button() {
       mert.inactiveCostumer.click();

    }
    @Given("Admin Test that inactive Costumer is visible")
    public void admin_test_that_inactive_costumer_is_visible() {
        Assert.assertTrue(mert.inactiveCostumer.isDisplayed());

    }
    @When("Admin click {string} button then {string} button")
    public void admin_click_button_then_button(String string, String string2) {
         mert.inactiveCostumer.click();
         }
    @Given("Admin Test that Details, Edit, Delete  is visible")
    public void admin_test_that_details_edit_delete_is_visible() {
        Assert.assertTrue( mert.detailsDDM.isDisplayed() );
        Assert.assertTrue( mert.editDDM.isDisplayed() );
        Assert.assertTrue(mert.deleteDDM.isDisplayed() );
    }



}

