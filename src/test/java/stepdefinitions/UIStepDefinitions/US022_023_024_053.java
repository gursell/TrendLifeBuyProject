package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US022_023_024_053_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US022_023_024_053 {


    US022_023_024_053_Page nevzat=new US022_023_024_053_Page();
    Actions actions=new Actions(Driver.getDriver());




    @Then("User clicks My Account section on dashboard page")
    public void user_clicks_my_account_section_on_dashbord_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        nevzat.myAccountLink.click();
    }


    @Then("User verifies that the page is {string} accessibleS")
    public void userVerifiesThatThePageIsAccessibleS(String expectedurl) {
        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(ConfigReader.getProperty(expectedurl),actual);
    }

    @Then("User clicks Choose File button on My Profile page and {string} Photo")
    public void user_clicks_choose_file_button_on_my_profil_page_and_photo(String photo) {
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(5);
       // nevzat.chooseFileButton.click();
        actions.sendKeys(ConfigReader.getProperty(photo)).perform();
        ReusableMethods.bekle(1);



    }
    @Then("User verifies that the photo  is uploaded")
    public void user_verifies_that_the_photo_is_uploaded() {
     Assert.assertTrue(nevzat.image.isDisplayed());
    }


    @Then("Verifies that the Basic Info tab contains First Name, Last Name,Email Address, Phone Number, Date of Birth, Description,Text Box")
    public void verifiesThatTheBasicInfoTabContainsFirstNameLastNameEmailAddressPhoneNumberDateOfBirthDescriptionTextBox() {
        nevzat.verifiesThatTheBasicInfoTab();
    }

    @Then("User verifies that the information in the Basic Info tab \\({string},{string}, {string} {string}) is the user's information.")
    public void userVerifiesThatTheInformationInTheBasicInfoTabIsTheUserSInformation(String firstname, String lastname, String emailAdress, String value) {
     nevzat.verifiesBasicInfoTabMyAccount(firstname,lastname,emailAdress,value);

    }

    @Then("User enters {string} {string} {string} {string} {string} {string} in textboxes and confirms that it is updateable")
    public void userEntersInTextboxesAndConfirmsThatItIsUpdateable(String firstname, String lastname, String mail, String phoneNumber, String dateOfBirth, String description) {
        nevzat.uploadAllBoxInAccountPage(firstname,lastname,mail,phoneNumber,dateOfBirth,description);
    }


    @Then("User clicks Change Password button on My Account page")
    public void userClicksChangePasswordButtonOnMyAccountPage() {
        nevzat.changePasswordButtonMyAccount.click();
    }

    @Then("User verifies that the text boxes in the {string} {string} {string} Change Password tab")
    public void userVerifiesThatTheTextBoxesInTheChangePasswordTab(String current, String newPassword, String reNewPassword) {
       nevzat.changePassword(current,newPassword,reNewPassword);
    }

    @Then("User verifies that the text boxes in the Change Password tab")
    public void userVerifiesThatTheTextBoxesInTheChangePasswordTab() {
      nevzat.verifiesThatChangePasswordPage();
    }

    @Then("User clicks Address button on My Account page")
    public void userClicksAddressButtonOnMyAccountPage() {
        nevzat.adressButtonMyAccount.click();
    }

    @Then("User verifies that the information are  on the User Address page belong the User")
    public void userVerifiesThatTheInformationAreOnTheUserAddressPageBelongTheUser() {
        nevzat.addressPageUserAssertinInformation();

    }

    @Then("User verifies that in the address tab")
    public void userVerifiesThatInTheAddressTab() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
       Assert.assertTrue(nevzat.addNewAddress.isDisplayed());

    }

    @Then("User clicks edit icon")
    public void userClicksEditIcon() {
        ReusableMethods.waitForClickablility(nevzat.editIconAdressPage,5);
        nevzat.editIconAdressPage.click();


    }

    @Then("User verifies that there are textboxes on the page")
    public void userVerifiesThatThereAreTextboxesOnThePage() {
     nevzat.updateAddressPageAssertion();
    }

    @Then("User chooses Type on Update address")
    public void userChoosesTypeOnUpdateAddress() {
        assertTrue(nevzat.billingAddressUpdateAddressPage.isSelected());

    }

    @Then("User verifies the changes")
    public void userVerifiesTheChanges() {
      nevzat.updateAdressPageChange();
    }

    @Then("User clicks Add New Adress button on My Account page")
    public void userClicksAddNewAdressButtonOnMyAccountPage() {
        nevzat.addNewAddress.click();
    }

    @Then("User verifies redirected to page")
    public void userVerifiesRedirectedToPage() {
      //  actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(nevzat.createButtonAddressPage,5);
      assertTrue(nevzat.createButtonAddressPage.isDisplayed());
    }

    @Then("User clicks Support Ticket on dashboard page")
    public void userClicksSupportTicketOnDashboardPage() {
      nevzat.supportTicketclick();
    }

    @Then("User verifies that the page is accessibleS")
    public void userVerifiesThatThePageIsAccessibleS() {
      Assert.assertTrue(nevzat.adressButtonMyAccount.isDisplayed());
    }

    @Then("User verifies that the All Submitted Ticket text is visible")
    public void userVerifiesThatTheAllSubmittedTicketTextIsVisible() {
        Assert.assertTrue(nevzat.allSubmittedTicketText.isDisplayed());
    }

    @Then("User verifies name sequences of All Sent Ticket line text")
    public void userVerifiesNameSequencesOfAllSentTicketLineText() {
        nevzat.allSubmittedAssertion();
    }

    @Then("User clicks view button on Support Ticket page")
    public void userClicksViewButtonOnSupportTicketPage() {
        nevzat.viewButtonSupportTicketPage.click();
    }

    @Then("User verifies that data is visible")
    public void userVerifiesThatDataIsVisible() {
        Assert.assertTrue(nevzat.dataTextSupportPage.isDisplayed());
    }

    @Then("User verifies that Status, Priority, and Category information is visible")
    public void userVerifiesThatStatusPriorityAndCategoryInformationIsVisible() {
       nevzat.statusPriorityCategoryAssertion();
    }

    @Then("User verifies that the answer is visible")
    public void userVerifiesThatTheAnswerIsVisible() {
        Assert.assertTrue(nevzat.answerFromAdmin.isDisplayed());
    }

    @Then("User verifies that the Reply button visible")
    public void userVerifiesThatTheReplyButtonVisible() {
      nevzat.replyButtonSupportTicketandAnswer();
    }

    @Then("User verifies that All Ticket dropdown section is filterable")
    public void userVerifiesThatAllTicketDropdownSectionIsFilterable() {
      nevzat.supportTicketFilter();
    }

    @Then("User clicks Add New Button on Support Ticket page")
    public void userClicksAddNewButtonOnSupportTicketPage() {
        nevzat.plusAddnewButton.click();
    }

    @Then("User verifies that redirect to Create New Ticket page")
    public void userVerifiesThatRedirectToCreateNewTicketPage() {
      Assert.assertTrue(nevzat.createNewTicketText.isDisplayed());
    }

    @Then("User enters information  {string} {string} {string} and {string}")
    public void userEntersInformationAnd(String subject, String category, String priority, String description) {
         nevzat.crateNewTicketPage();
    }

    @Then("User verifies that the information are enterable on Create New Ticket page")
    public void userVerifiesThatTheInformationAreEnterableOnCreateNewTicketPage() {
        nevzat.allSubmittedTicketText.isDisplayed();
    }

    @Then("Admin clicks Activity Logs section on Dashboard page")
    public void adminClicksActivityLogsSectionOnDashboardPage() {
     nevzat.activityLogsEntryMethod();
    }

    @Then("Admin clicks Clean Button on the Activity Logs page, Admin verifies that the page is clean")
    public void adminClicksCleanButtonOnTheActivityLogsPageAdminVerifiesThatThePageIsClean() {
        nevzat.cleanAllMethodandAssertion();
    }

    @Then("Admin verifies that titles and subreddits are linked")
    public void adminVerifiesThatTitlesAndSubredditsAreLinked() {
        nevzat.row();
    }

    @Then("Admin verifies function of page switch button")
    public void adminVerifiesFunctionOfPageSwitchButton() {
         nevzat.nextpageandAssertionMethods();
    }
}
