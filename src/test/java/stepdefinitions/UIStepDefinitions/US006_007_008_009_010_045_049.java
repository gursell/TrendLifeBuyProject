package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import pages.US006_007_008_009_010_045_049_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US006_007_008_009_010_045_049 {

    TrendLifeBuyPage life=new TrendLifeBuyPage();
    US006_007_008_009_010_045_049_Page leventPage = new US006_007_008_009_010_045_049_Page();
    Actions actions=new Actions(Driver.getDriver());

    @Then("User clicks the LOGIN link")
    public void user_clicks_login_link() {
        if (leventPage.firstAlertMailLevent.isDisplayed()){
            leventPage.firstAlertMailCloseLevent.click();
        }
        else {
            life.loginLink.click();
        }
    }

    @Then("User clicks the Click Here link next to Forgot Password? text")
    public void userClicksTheClickHereLinkNextToForgotPasswordText() {
        leventPage.clickHereLink.click();
    }

    @Then("User verifies being redirected to Password Reset page")
    public void userVerifiesBeingRedirectedToPasswordResetPage() {
        Assert.assertTrue(leventPage.forgotPasswordPageText.isDisplayed());
    }

    @Then("User clicks the Sign Up link next to Don't have an Account? text")
    public void userClicksTheSignUpLinkNextToDonTHaveAnAccountText() {
        leventPage.signUpDontHaveAnAccountLink.click();
    }

    @Then("User verifies being redirected to Register page")
    public void userVerifiesBeingRedirectedToRegisterPage() {
        Assert.assertTrue(leventPage.registerPageText.isDisplayed());
    }

    @Then("User verifies being redirected to Home page")
    public void userVerifiesBeingRedirectedToHomePage() {
        String expectedHomePageUrl="https://trendlifebuy.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedHomePageUrl));
    }

    @Then("User verifies that \\(Logged In Succesfully!) message appears in the corner")
    public void userVerifiesThatLoggedInSuccesfullyMessageAppearsInTheCorner() {
        Assert.assertTrue(leventPage.logInPopUpMessage.isEnabled());
    }

    @Then("User verifies that \\(These credentials do not match our records.) message appears")
    public void userVerifiesThatTheseCredentialsDoNotMatchOurRecordsMessageAppearsInTheCorner() {
        Assert.assertTrue(leventPage.wrongLogInPopUpMessage.isDisplayed());
    }

    @Then("User enters {string} and {string} and logs in")
    public void userEntersAndAndLogsIn(String arg0, String arg1) {
        life.emailBox.sendKeys(arg0);
        life.passwordBox.sendKeys(arg1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.signInButton.click();
    }

    @Then("User clicks the Remember me checkbox")
    public void userClicksTheRememberMeCheckbox() {
        leventPage.rememberMeBox.click();
    }

    @Then("User verifies that Remember me checkbox is being clicked")
    public void userVerifiesThatRememberMeCheckboxIsBeingClicked() {
        Assert.assertFalse(leventPage.rememberMeBox.isSelected());
    }

    @Then("User clicks the Sign up with Google button")
    public void userClicksTheSignUpWithGoogleButton() {
        leventPage.signUpWithGoogle.click();
    }

    @Then("User verifies being redirected to {string} page")
    public void userVerifiesBeingRedirectedToPage(String arg0) {
        String expectedsignUpUrl="arg0";
        String actualsignUpUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedsignUpUrl.contains(actualsignUpUrl));
    }

    @Then("User clicks the Sign up with Facebook button")
    public void userClicksTheSignUpWithFacebookButton() {
        leventPage.signUpWithFacebook.click();
    }

    @Then("User clicks the REGISTER link")
    public void userClicksTheREGISTERLink() {
        leventPage.registerLink.click();
    }

    @Then("User verifies being redirected to Sign Up page")
    public void userVerifiesBeingRedirectedToSignUpPage() {
        Assert.assertTrue(leventPage.registerPageText.isDisplayed());
    }

    @Then("User verifies being logged in")
    public void userVerifiesBeingLoggedIn() {
        Assert.assertTrue(leventPage.registerPageText.isDisplayed());
    }

    @Then("User clicks the TRACK YOUR ORDER link and enters an {string} and clicks TRACK NOW button")
    public void userClicksTheTRACKYOURORDERLinkAndEntersAnAndClicksTRACKNOWButton(String arg0) {
        leventPage.trackYourOrderLink.click();
        leventPage.trackYourOrderBox.sendKeys(ConfigReader.getProperty(arg0));
        leventPage.trackNowButton.click();
    }

    @Then("User verifies being redirected to Orders page")
    public void userVerifiesBeingRedirectedToOrdersPage() {
        Assert.assertTrue(leventPage.orderIDTitle.isDisplayed());
    }

    @Then("User clicks the COMPARE link")
    public void userClicksTheCOMPARELink() {
        leventPage.compareButton.click();
    }

    @Then("User should verify that the products are displayed side by side with pictures and content information.")
    public void userShouldVerifyThatTheProductsAreDisplayedSideBySideWithPicturesAndContentInformation() {
        Assert.assertTrue(leventPage.productCompareText.isDisplayed());
    }

    @Then("User clicks RESET COMPARE button")
    public void userClicksRESETCOMPAREButton() {
        ReusableMethods.bekle(2);
        leventPage.resetCompareLink.click();
    }

    @Then("User verifies that \\(Compare list is empty.) text is visible")
    public void userVerifiesThatCompareListIsEmptyTextIsVisible() {
        Assert.assertTrue(leventPage.compareListIsEmptyText.isDisplayed());
        Driver.getDriver().get("https://trendlifebuy.com/category/women-fashion?item=category");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(leventPage.firstCompareIcon).perform();
        leventPage.firstCompareIcon.click();
    }

    @Then("User clicks the CART link")
    public void userClicksTheCARTLink() {
        leventPage.cartButton.click();
    }

    @Then("User clicks + sign for the first product")
    public void userClicksSignForTheFirstProduct() {
        leventPage.firstTiPlus.click();
    }

    @Then("User clicks - sign for the second product")
    public void userClicksSignForTheSecondProduct() {
        leventPage.secondTiMinus.click();
    }

    @Then("User verifies unit price of the product is visible")
    public void userVerifiesUnitPriceOfTheProductIsVisible() {
        Assert.assertTrue(leventPage.firstUnitPrice.isEnabled());
    }

    @Then("User verifies  the amount of discount is visible")
    public void userVerifiesTheAmountOfDiscountIsVisible() {
        Assert.assertTrue(leventPage.amountOfDiscount.isDisplayed());
    }

    @Then("User clicks PROCEED TO CHECKOUT button")
    public void userClicksPROCEEDTOCHECKOUTButton() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        leventPage.proceedToCheckoutButton.click();
    }

    @Then("User verifies being redirected to Checkout page")
    public void userVerifiesBeingRedirectedToCheckoutPage() {
        String expectedCheckoutPageUrl="https://trendlifebuy.com/checkout";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedCheckoutPageUrl));
    }

    @Then("User clicks CONTINUE SHOPPING button")
    public void userClicksCONTINUESHOPPINGButton() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        leventPage.continueShoppingButton.click();
    }

    @Then("User clicks delete icon")
    public void userClicksDeleteIcon() {
        leventPage.firstDeleteIcon.click();
    }

    @Then("User verifies that \\(Product succesfully deleted from cart) message appears in the corner")
    public void userVerifiesThatProductSuccesfullyDeletedFromCartMessageAppearsInTheCorner() {
        Assert.assertTrue(leventPage.productDeletedPopUpMessage.isEnabled());

        Driver.getDriver().get("https://trendlifebuy.com/category/women-fashion?item=category");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(leventPage.firstCompareIcon).perform();
        leventPage.fashionFirstItem.click();
        leventPage.fashionItemAddcartButton.click();
        Driver.getDriver().navigate().back();
        leventPage.fashionSecondItem.click();
        leventPage.fashionItemAddcartButton.click();
        Driver.getDriver().navigate().back();
        leventPage.fashionThirdItem.click();
        leventPage.fashionItemAddcartButton.click();
        Driver.getDriver().get("https://trendlifebuy.com/cart");
    }

    @Then("User verifies that \\(Shipping charge free from) text is visible")
    public void userVerifiesThatShippingChargeFreeFromTextIsVisible() {
        Assert.assertTrue(leventPage.shippingChargeFreeFromText.isDisplayed());
    }

    @Then("User verifies that \\(Order Summary) text is visible")
    public void userVerifiesThatOrderSummaryTextIsVisible() {
        Assert.assertTrue(leventPage.orderSummary.isDisplayed());
    }

    @Then("User verifies that \\(Subtotal) text is visible")
    public void userVerifiesThatSubtotallTextIsVisible() {
        Assert.assertTrue(leventPage.subtotal.isDisplayed());
    }

    @Then("User verifies that \\(Shipping Charge) text is visible")
    public void userVerifiesThatShippingChargeTextIsVisible() {
        Assert.assertTrue(leventPage.shippingCharge.isDisplayed());
    }

    @Then("User verifies that \\(Discount) text is visible")
    public void userVerifiesThatDiscountTextIsVisible() {
        Assert.assertTrue(leventPage.amountOfDiscount.isDisplayed());
    }

    @Then("User verifies that VAT_TAX_GST text is visible")
    public void userVerifiesThatVATTAXGSTTextIsVisible() {
        Assert.assertTrue(leventPage.VAT_TAX_GST.isDisplayed());
    }

    @Then("User verifies that \\(Total) text is visible")
    public void userVerifiesThatTotalTextIsVisible() {
        Assert.assertTrue(leventPage.total.isDisplayed());
    }

    @Then("User verifies \\(Verify Your Email) message appears")
    public void userVerifiesVerifyYourEmailMessageAppears() {
        Assert.assertTrue(leventPage.verifyYourEmailText.isDisplayed());
    }

    @Then("User enters {string}")
    public void userEntersFirstName(String arg0) {
        leventPage.firstNameBox.sendKeys(arg0);
    }

    @Then("User enters last name {string}")
    public void userEntersLastName(String arg0) {
        leventPage.lastNameBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    Faker faker = new Faker();
    @Then("User enters valid e-mail")
    public void userEntersValidEMail() {
        leventPage.eMailBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("User enters {string} and confirms {string}")
    public void userEntersAndConfirms(String arg0, String arg1) {
        leventPage.passwordBox.sendKeys(ConfigReader.getProperty(arg0));
        leventPage.confirmPasswordBox.sendKeys(ConfigReader.getProperty(arg1));
    }

    @Then("User clicks SIGN UP button")
    public void userClicksSIGNUPButton() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        leventPage.signUpButtonRegisterPage.click();
    }

    @Then("User enters first {string}")
    public void userEntersFirst(String arg0) {
        leventPage.firstNameBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    @Then("User enters {string} to last name box")
    public void userEntersToLastNameBox(String arg0) {
        leventPage.lastNameBox.sendKeys(arg0);
    }

    @Then("User enters {string} to e-mail box")
    public void userEntersToEMailBox(String arg0) {
        leventPage.eMailBox.sendKeys(arg0);
    }

    @Then("User verifies \\(The email must be a valid email address.) message appears")
    public void userVerifiesTheEmailMustBeAValidEmailAddressMessageAppears() {
        Assert.assertTrue(leventPage.emailMustBeValidMessageText.isDisplayed());
    }

    @Then("User enters a {string} and confirms {string}")
    public void userEntersAAndConfirms(String arg0, String arg1) {
        leventPage.passwordBox.sendKeys(arg0);
        leventPage.confirmPasswordBox.sendKeys(arg1);
    }

    @Then("User verifies \\(The password must be a minimum of {int} characters and a combination of uppercase letters, lowercase letters, numbers, or symbols.) message appears")
    public void userVerifiesThePasswordMustBeAMinimumOfCharactersAndACombinationOfUppercaseLettersLowercaseLettersNumbersOrSymbolsMessageAppears(int arg0) {
        Assert.assertTrue(leventPage.passwordMustBeValidMessageText.isDisplayed());
    }

    @Then("User clicks to \\(By signing up, you agree to Terms of Service and Privacy Policy CheckBox) to deselect it")
    public void userClicksToBySigningUpYouAgreeToTermsOfServiceAndPrivacyPolicyCheckBoxToDeselectIt() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        leventPage.privacyPolicyCheckBox.click();
    }

    @Then("User verifies \\(Please agree with our policy privacy) message appears in the corner")
    public void userVerifiesPleaseAgreeWithOurPolicyPrivacyMessageAppearsInTheCorner() {
        Assert.assertTrue(leventPage.privacyPolicyPopUpMessage.isEnabled());
    }


    @Then("User clicks the Sign In link")
    public void userClicksTheSignInLink() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        leventPage.signInLinkRegisterPage.click();
    }

    @Then("User verifies being redirected to login page")
    public void userVerifiesBeingRedirectedToLoginPage() {
        String expectedLoginPageUrl="https://trendlifebuy.com/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedLoginPageUrl));

    }

    @Then("User verifies + sign can be clickable")
    public void userVerifiesPlusSignCanBeClickable() {
        Assert.assertTrue(leventPage.firstTiPlus.isEnabled());
    }

    @Then("User clicks - sign for the first product and verifies total fee has changed")
    public void userClicksMinusSignForTheFirstProduct() {
        String oldPrice = leventPage.oldPrice.toString();
        leventPage.firstTiMinus.click();
        String newPrice = leventPage.newPrice.toString();
        Assert.assertNotEquals(oldPrice, newPrice);
    }


    @Then("Admin clicks Admin reports Link on the dashboard")
    public void adminClicksAdminReportsLinkOnTheDashboard() {
        actions.moveToElement(leventPage.dashboard).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(leventPage.adminReportsTab).perform();
        leventPage.adminReportsTab.click();
    }

    @Then("Admin clicks Top Customers link under Admin reports Tab")
    public void adminClicksTopCustomersLinkUnderAdminReportsTab() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(leventPage.topCustomersTab).perform();
        leventPage.topCustomersTab.click();
    }

    @Then("Admin verifies that the Top Customers List can be accessed from the Top Customers link")
    public void adminVerifiesThatTheTopCustomersListCanBeAccessedFromTheTopCustomersLink() {
        actions.moveToElement(leventPage.topCustomersListTitle).perform();
        Assert.assertTrue(leventPage.topCustomersListTitle.isDisplayed());
    }

    @Then("Admin verifies that the top customers are listed under Name, Email, Phone, Total Spend, Joined AT in the Top Customers List")
    public void adminVerifiesThatTheTopCustomersAreListedUnderNameEmailPhoneTotalSpendJoinedATInTheTopCustomersList() {
        actions.moveToElement(leventPage.topCustomersListNameColumn).perform();
        Assert.assertTrue(leventPage.topCustomersListNameColumn.isDisplayed());
        actions.moveToElement(leventPage.topCustomersListEmailColumn).perform();
        Assert.assertTrue(leventPage.topCustomersListEmailColumn.isDisplayed());
        actions.moveToElement(leventPage.topCustomersListPhoneColumn).perform();
        Assert.assertTrue(leventPage.topCustomersListPhoneColumn.isDisplayed());
        actions.moveToElement(leventPage.topCustomersListTotalSpendColumn).perform();
        Assert.assertTrue(leventPage.topCustomersListTotalSpendColumn.isDisplayed());
        actions.moveToElement(leventPage.topCustomersListJoinedAtColumn).perform();
        Assert.assertTrue(leventPage.topCustomersListJoinedAtColumn.isDisplayed());
    }

    @Then("Admin clicks Quick Search TextBox and searches a customer by name")
    public void adminClicksQuickSearchTextBoxAndSearchesACustomerByName() {
        leventPage.topCustomersListQuickSearchTextBox.sendKeys(leventPage.topCustomersListFirstName.getText());
        leventPage.topCustomersListQuickSearchTextBox.sendKeys(Keys.ENTER);
    }

    @Then("Admin verifies that it is possible to search in the Top Customers List from the Quick Search TextBox")
    public void adminVerifiesThatItIsPossibleToSearchInTheTopCustomersListFromTheQuickSearchTextBox() {
        Assert.assertTrue(leventPage.topCustomersListFirstName.isDisplayed());
        leventPage.topCustomersListQuickSearchTextBox.clear();
    }

    @Then("Admin clicks \\(next page arrow)")
    public void adminClicksNextPageArrow() {
        actions.moveToElement(leventPage.topCustomersListJoinedAtColumn).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(leventPage.topCustomersListNextPageLink).perform();
        ReusableMethods.bekle(2);
        leventPage.topCustomersListNextPageLink.click();
    }

    @Then("Admin verifies that there are transitions between pages in the Top Customers List")
    public void adminVerifiesThatThereAreTransitionsBetweenPagesInTheTopCustomersList() {
        Assert.assertTrue(leventPage.topCustomersListElement11.isDisplayed());
        leventPage.topCustomersListPreviousPageLink.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(leventPage.topCustomersListElement1.isDisplayed());
    }

    @Then("Admin clicks Support Ticket Link on the dashboard")
    public void adminClicksSupportTicketLinkOnTheDashboard() {
        actions.moveToElement(leventPage.dashboard).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(leventPage.supportTicketLink).perform();
        leventPage.supportTicketLink.click();
    }

    @Then("Admin clicks Category link under Support Ticket Tab")
    public void adminClicksCategoryLinkUnderSupportTicketTab() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(leventPage.supportTicketLinkCategoryTab).perform();
        leventPage.supportTicketLinkCategoryTab.click();
    }

    @Then("Admin verifies that the Categories page can be accessed from the Category link.")
    public void adminVerifiesThatTheCategoriesPageCanBeAccessedFromTheCategoryLink() {
        actions.moveToElement(leventPage.categoryListTitleText).perform();
        Assert.assertTrue(leventPage.categoryListTitleText.isDisplayed());
    }

    @Then("Admin enters a category name at \\(add New) section, clicks to Save button and verifies that a new category can be created")
    public void adminEntersACategoryNameAtAddNewSectionClicksToSaveButtonAndVerifiesThatANewCategoryCanBeCreated() {
        String categoryName = faker.name().name();
        leventPage.addNewCategoryName.sendKeys(categoryName);
        leventPage.addNewCategoryNameSaveButton.click();
        ReusableMethods.bekle(2);
        String actualCategoryName = leventPage.categoryNameInFirstLine.getAccessibleName();
        Assert.assertEquals(categoryName,actualCategoryName);
    }


    @Then("Admin verifies that the ticket categories are displayed according to Name, Status, Action titles in the Category List.")
    public void adminVerifiesThatTheTicketCategoriesAreDisplayedAccordingToNameStatusActionTitlesInTheCategoryList() {
        Assert.assertTrue(leventPage.categoryHeadLineName.isDisplayed());
        Assert.assertTrue(leventPage.categoryHeadLineStatus.isDisplayed());
        Assert.assertTrue(leventPage.categoryHeadLineAction.isDisplayed());
    }

    @Then("Admin clicks a categoriy’s status to make it inactive")
    public void adminClicksACategoriySStatusToMakeItInactive() {
        leventPage.categoryStatusButtonFirstLine.click();
    }

    @Then("Admin verifies that the status of the categories can be changed")
    public void adminVerifiesThatTheStatusOfTheCategoriesCanBeChanged() {
        Assert.assertTrue(leventPage.categorySuccessPopUpMessage.isEnabled());;
    }

    @Then("Admin clicks a categoriy’s Select Button and sees the Edit Button and Delete Button")
    public void adminClicksACategoriySSelectButtonAndSeesTheEditButtonAndDeleteButton() {
        leventPage.categorySelectButtonFirstLine.click();
    }

    @Then("Admin verifies that there are edit and delete links in the select tab under the Action title in the Category List.")
    public void adminVerifiesThatThereAreEditAndDeleteLinksInTheSelectTabUnderTheActionTitleInTheCategoryList() {
        Assert.assertTrue(leventPage.categorySelectButtonFirstLineEditButton.isEnabled());
        Assert.assertTrue(leventPage.categorySelectButtonFirstLineDeleteButton.isEnabled());
    }

    @Then("Admin clicks the edit link")
    public void adminClicksTheEditLink() {
        String oldCategoryName = leventPage.categoryNameInFirstLine.getText();
        leventPage.categorySelectButtonFirstLineEditButton.click();
    }

    @Then("Admin verifies that the edit page is opened when the edit link is clicked on the select tab under the Action title in the Category List.")
    public void adminVerifiesThatTheEditPageIsOpenedWhenTheEditLinkIsClickedOnTheSelectTabUnderTheActionTitleInTheCategoryList() {
        Assert.assertTrue(leventPage.categoryEditPageText.isDisplayed());
    }

    @Then("Admin changes the name and the status of the category and verifies that the Name and Status of the category can be updated")
    public void adminChangesTheNameAndTheStatusOfTheCategoryAndVerifiesThis() {
        ReusableMethods.bekle(2);
        String oldCategoryName = leventPage.categoryNameInFirstLine.getText();
        String newName = faker.name().username();
        leventPage.categoryEditPageNameBox.sendKeys(newName);
        ReusableMethods.bekle(2);
        leventPage.categoryEditPageStatusCheckBox.click();
        ReusableMethods.bekle(2);
        leventPage.categoryEditPageUpdateButton.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(leventPage.categorySuccessPopUpMessage.isEnabled());
        String actualCategoryName = leventPage.categoryNameInFirstLine.getText();
        Assert.assertNotEquals(oldCategoryName, actualCategoryName);
        leventPage.categoryEditPageStatusButton.click();
    }

    @Then("Admin clicks the delete link and verifies that the category can be deleted")
    public void adminClicksTheDeleteLink() {
        ReusableMethods.bekle(2);
        leventPage.categorySelectButtonFirstLineDeleteButton.click();
        ReusableMethods.bekle(2);
        leventPage.categoryEditPageDeletePopUpPage.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(leventPage.categorySuccessPopUpMessage.isEnabled());
    }
}
