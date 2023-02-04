package pages;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US022_023_024_053_Page {
    Actions actions=new Actions(Driver.getDriver());
    public US022_023_024_053_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@href=\"https://trendlifebuy.com/profile\"])[1]")
    public WebElement myAccountLink;

    @FindBy(xpath = "//span[@class='img_upload_btn position-relative']")
    public WebElement chooseFileButton;

    @FindBy(xpath ="(//img[@class='img-fluid'])[1]")
    public WebElement photo;
    @FindBy(xpath = "(//img[@class='img-fluid'])[1]")
    public WebElement image;

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstNameBoxMyAccount;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement lastNameBoxMyAccount;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    private WebElement emailAdressBoxMyAccount;

    @FindBy(xpath = "(//input[@name='phone'])[1]")
    private WebElement phoneNumberBoxMyAccount;

    @FindBy(xpath = "(//input[@name='date_of_birth'])[1]")
    private WebElement dateOfBirthBoxMyAccount;

    @FindBy(xpath = "(//textarea[@name='name'])[1]")
    private WebElement descriptionsBoxMyAccount;

    @FindBy(xpath = "(//*[text()='Update Now'])[1]")
    private WebElement updateNowButtonMyAccount;

    @FindBy(xpath = "//*[text()='Success']")
    private WebElement successMessageMyAccount;

    @FindBy(xpath = "//button[@id='Password-tab']")
    public WebElement changePasswordButtonMyAccount;

    @FindBy(xpath = "//input[@name='current_password']")
    private WebElement currentPasswordBox;

    @FindBy(xpath = "//input[@placeholder='New Password']")
    private WebElement newPasswordBox;

    @FindBy(xpath = "//input[@name='new_password_confirmation']")
    private WebElement reEnterNewPasswordBox;

    @FindBy(xpath = "//button[@class='amaz_primary_btn style2 rounded-0  text-uppercase  text-center min_200 change_password']")
    private WebElement updateNowButtonChangePassword;

    @FindBy(xpath = "(//*[text()='Address'])[1]")
    public WebElement adressButtonMyAccount;

    @FindBy(xpath = "//*[text()='Add new address']")
    public WebElement addNewAddress;

    @FindBy(xpath = "//button[@class='amazy_status_btn edit_address']")
    public WebElement editIconAdressPage;

    public void verifiesThatTheBasicInfoTab(){
        assertTrue(firstNameBoxMyAccount.isDisplayed());
        assertTrue(lastNameBoxMyAccount.isDisplayed());
        assertTrue(emailAdressBoxMyAccount.isDisplayed());
        assertTrue(phoneNumberBoxMyAccount.isDisplayed());
        assertTrue(dateOfBirthBoxMyAccount.isDisplayed());
        assertTrue(descriptionsBoxMyAccount.isDisplayed());
    }

    //TC2204
    public void verifiesBasicInfoTabMyAccount(String firstname, String lastname, String emailAdress, String value){
        String expected1=ConfigReader.getProperty(firstname);
        String actual1=firstNameBoxMyAccount.getAttribute(value);
        String expected2= ConfigReader.getProperty(lastname);
        String actual2=lastNameBoxMyAccount.getAttribute(value);
        String expected3=ConfigReader.getProperty(emailAdress);
        String actual3=emailAdressBoxMyAccount.getAttribute(value);

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);
    }
    public void uploadAllBoxInAccountPage(String firstname, String lastname, String mail, String phoneNumber, String dateOfBirth, String description){
        firstNameBoxMyAccount.clear();
        firstNameBoxMyAccount.sendKeys(ConfigReader.getProperty(firstname));
        lastNameBoxMyAccount.clear();
        lastNameBoxMyAccount.sendKeys(ConfigReader.getProperty(lastname));
        emailAdressBoxMyAccount.clear();
        emailAdressBoxMyAccount.sendKeys(ConfigReader.getProperty(mail));
        phoneNumberBoxMyAccount.clear();
        phoneNumberBoxMyAccount.sendKeys(ConfigReader.getProperty(phoneNumber));
        dateOfBirthBoxMyAccount.clear();
        dateOfBirthBoxMyAccount.sendKeys(ConfigReader.getProperty(dateOfBirth)+ Keys.ENTER);
        descriptionsBoxMyAccount.sendKeys(ConfigReader.getProperty(description));
        ReusableMethods.bekle(2);
        updateNowButtonMyAccount.click();
        Assert.assertTrue(successMessageMyAccount.isDisplayed());
    }

    public void verifiesThatChangePasswordPage(){
        currentPasswordBox.isDisplayed();
        newPasswordBox.isDisplayed();
        reEnterNewPasswordBox.isDisplayed();
    }
    public void changePassword(String current, String newPassword, String reNewPassword){
        currentPasswordBox.sendKeys(ConfigReader.getProperty(current));
        newPasswordBox.sendKeys(ConfigReader.getProperty(newPassword));
        reEnterNewPasswordBox.sendKeys(ConfigReader.getProperty(reNewPassword));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(successMessageMyAccount.isDisplayed());
    }

    @FindBy(xpath = "//*[text()='nevzat']")
    private WebElement fullNametextAdressPage;

    @FindBy(xpath = "//*[text()='SMOCZA']")
    private WebElement adressTextAdressPage;

    @FindBy(xpath = "//*[text()='Warsaw, Warsaw, Poland']")
    private WebElement regionTextAdressPage;

    @FindBy(xpath = "(//*[text()='nevzat12@gmail.com'])[2]")
    private WebElement eMailAdressPage;

    @FindBy(xpath = "//*[text()='571534519']")
    private WebElement phoneNumberAdressPage;

    @FindBy(xpath = "(//*[text()='Type'])[2]")
    private WebElement typeUpdateAddressPage;

    @FindBy(xpath = "(//input[@name='name'])[3]")
    private WebElement nameBoxUpdateAddressPage;

    @FindBy(xpath = "(//input[@name='email'])[3]")
    private WebElement emailAdressBoxUpdateAddressPage;

    @FindBy(xpath = "(//input[@placeholder='Phone Number'])[2]")
    private WebElement phoneNumberBoxUpdateAddressPage;

    @FindBy(xpath = "(//div[@class='nice-select theme_select style2 wide'])[6]")
    private WebElement countryBoxUpdateAddressPage;

    @FindBy(xpath = "(//div[@class='nice-select theme_select style2 wide'])[7]")
    private WebElement stateBoxUpdateAddressPage;

    @FindBy(xpath = "(//div[@class='nice-select theme_select style2 wide'])[8]")
    private WebElement cityBoxUpdateAddressPage;

    @FindBy(xpath = "(//input[@name='postal_code'])[2]")
    private WebElement postalCodeUpdateAddressPage;

    @FindBy(xpath = "(//textarea[@name='address'])[2]")
    private WebElement streetAddressUpdateAddressPage;

    public void updateAddressPageAssertion(){
        ReusableMethods.waitForVisibility(typeUpdateAddressPage,5);
        Assert.assertTrue(typeUpdateAddressPage.isDisplayed());
        Assert.assertTrue(nameBoxUpdateAddressPage.isDisplayed());
        Assert.assertTrue(emailAdressBoxUpdateAddressPage.isDisplayed());
        Assert.assertTrue(phoneNumberBoxUpdateAddressPage.isDisplayed());
        Assert.assertTrue(countryBoxUpdateAddressPage.isDisplayed());
        Assert.assertTrue(stateBoxUpdateAddressPage.isDisplayed());
        Assert.assertTrue(cityBoxUpdateAddressPage.isDisplayed());
        Assert.assertTrue(postalCodeUpdateAddressPage.isDisplayed());
        Assert.assertTrue(streetAddressUpdateAddressPage.isDisplayed());
    }


    public void addressPageUserAssertinInformation(){
        ReusableMethods.bekle(2);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
        sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        String expectedName="nevzat";
        String expectedAdress="SMOCZA";
        String expectedRegion="Warsaw, Warsaw, Poland";
        String expectedeMail="nevzat12@gmail.com";
        String expectedPhoneNumber="571534519";
        Assert.assertEquals(expectedName,fullNametextAdressPage.getText());
        Assert.assertEquals(expectedAdress,adressTextAdressPage.getText());
        Assert.assertEquals(expectedRegion,regionTextAdressPage.getText());
        Assert.assertEquals(expectedeMail,eMailAdressPage.getText());
        Assert.assertEquals(expectedPhoneNumber,phoneNumberAdressPage.getText());

    }

    @FindBy(xpath = "(//input[@type='radio'])[4]")
    public WebElement billingAddressUpdateAddressPage;
    @FindBy(xpath = "(//li[@data-value='175'])[2]")
    private WebElement countryPoland;
    @FindBy(xpath = "(//*[text()='Select from options'])[15]")
    private WebElement stateofWarsaw;
    @FindBy(xpath = "(//li[text()='Warsaw'])[2]")
    private WebElement cityOptions;
    @FindBy(xpath = "(//li[@data-value='32650'])[1]")
    private WebElement cityOfWarsaw;
    @FindBy(xpath = "(//input[@type='text'])[19]")
    private WebElement cityTextBox;
    @FindBy(xpath = "//li[text()='Warsaw']")
    private WebElement stateofWarsaw2;
    @FindBy(xpath = "//button[text()='Update']")
    private WebElement updateButtonAdressPage;
    @FindBy(xpath = "(//input[@type='text'])[18]")
    private WebElement stateTextBoxAdressPage;

    public void updateAdressPageChange(){
        nameBoxUpdateAddressPage.click();
        nameBoxUpdateAddressPage.clear();
        nameBoxUpdateAddressPage.sendKeys("nevzat");
        emailAdressBoxUpdateAddressPage.click();
        emailAdressBoxUpdateAddressPage.clear();
        emailAdressBoxUpdateAddressPage.sendKeys("nevzat12@gmail.com");

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        countryBoxUpdateAddressPage.click();
        ReusableMethods.bekle(1);
        countryBoxUpdateAddressPage.sendKeys("Poland");
        countryPoland.click();
        ReusableMethods.bekle(3);
        stateBoxUpdateAddressPage.click();
        ReusableMethods.bekle(2);
        stateTextBoxAdressPage.sendKeys("Warsaw");
        ReusableMethods.bekle(2);
        stateofWarsaw2.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.bekle(2);
        cityTextBox.sendKeys("Warsaw");
        cityOfWarsaw.click();
        ReusableMethods.bekle(2);
        postalCodeUpdateAddressPage.clear();
        postalCodeUpdateAddressPage.sendKeys("01-012");
        streetAddressUpdateAddressPage.clear();
        streetAddressUpdateAddressPage.sendKeys("SMOCZA");
        updateButtonAdressPage.click();
        Assert.assertTrue(successMessageMyAccount.isDisplayed());
    }

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButtonAddressPage;

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/support-ticket']")
    private WebElement supportTicketLink;
    @FindBy(xpath = "//*[text()='All Submitted Ticket ']")
    public WebElement allSubmittedTicketText;

    public void supportTicketclick(){
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        actions.moveToElement(supportTicketLink).click().perform();

    }
    @FindBy(xpath = "//*[@id=\"dataShow\"]/div[2]/div/table/thead/tr")
    private WebElement allSubmittedTicketLine;

    public void allSubmittedAssertion(){
        String expected="SL Ticket ID Subject Priority Last update Action";
        String actual=allSubmittedTicketLine.getText();

        Assert.assertEquals(expected,actual);
    }

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/support-ticket/TIC821524/show']")
    public WebElement viewButtonSupportTicketPage;
    @FindBy(xpath = "//*[text()='#TIC208302 - ornek']")
    public WebElement dataTextSupportPage;
    @FindBy(xpath = "(//a[@class='amaz_badge_btn7 d-inline-flex align-items-center'])[1]")
    private WebElement statusInformation;
    @FindBy(xpath = "(//a[@class='amaz_badge_btn7 d-inline-flex align-items-center'])[2]")
    private WebElement priortyInformation;
    @FindBy(xpath = "(//a[@class='amaz_badge_btn7 d-inline-flex align-items-center'])[3]")
    private WebElement categoryInformation;

    public void statusPriorityCategoryAssertion(){
        String expectedStatus="Pending";
        String actualStatus=statusInformation.getText();
        String expectedPriority="Medium";
        String actualPriority=priortyInformation.getText();
        String expectedCategory="Installation";
        String actualCategory=categoryInformation.getText();
        Assert.assertEquals(expectedStatus,actualStatus);
        Assert.assertEquals(expectedPriority,actualPriority);
        Assert.assertEquals(expectedCategory,actualCategory);
    }
    @FindBy(xpath = "(//div[@class='ticket_view_box theme_border gray_color_1 radius_5px mb_20'])[2]")
    public WebElement answerFromAdmin;
    @FindBy(xpath = "//button[@data-bs-toggle='collapse']")
    private WebElement replyButtonSupportTicket;
    @FindBy(xpath = "//div[@class='note-editable']")
    private WebElement descriptionTextBoxSupportTicket;
    @FindBy(xpath = "//button[text()='+ Reply now']")
    private WebElement plusReplyNowButton;

    public void replyButtonSupportTicketandAnswer(){
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        replyButtonSupportTicket.click();
        descriptionTextBoxSupportTicket.sendKeys("testForDesription");
        plusReplyNowButton.click();
        Assert.assertTrue(plusReplyNowButton.isDisplayed());
    }

    @FindBy(xpath = "//div[@class='nice-select amaz_select4 style2']")
    private WebElement dropDownSupportTicket;
    @FindBy(xpath = "//*[text()='TIC821524']")
    private WebElement ticketIdText;
    @FindBy(xpath = "//p[text()='Empty List.']")
    private WebElement emptyListText;
    @FindBy(xpath = "//li[@data-value='0']")
    private WebElement allTicketsection;
    @FindBy(xpath = "//li[@data-value='1']")
    private WebElement pendingSection;
    @FindBy(xpath = "//li[@data-value='2']")
    private WebElement onGoingSection;
    @FindBy(xpath = "//li[@data-value='3']")
    private WebElement complatedSection;
    @FindBy(xpath = "//li[@data-value='4']")
    private WebElement closedSection;

    public void supportTicketFilter(){

     dropDownSupportTicket.click();
     pendingSection.click();
     Assert.assertTrue(ticketIdText.isDisplayed());
        ReusableMethods.bekle(2);
     dropDownSupportTicket.click();
     onGoingSection.click();
     Assert.assertTrue(emptyListText.isDisplayed());
        ReusableMethods.bekle(2);
     dropDownSupportTicket.click();
     complatedSection.click();
     Assert.assertTrue(emptyListText.isDisplayed());
        ReusableMethods.bekle(2);
     dropDownSupportTicket.click();
     closedSection.click();
     Assert.assertTrue(emptyListText.isDisplayed());
    }
    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/support-ticket/create']")
    public WebElement plusAddnewButton;

    @FindBy(xpath = "//*[text()='Create new ticket ']")
    public WebElement createNewTicketText;
    @FindBy(xpath = "//input[@name='subject']")
    private WebElement subjectBoxCreateNewTicket;
    @FindBy(xpath = "(//div[@class='nice-select theme_select style2 wide'])[1]")
    private WebElement categoryBoxCrateNewTicket;
    @FindBy(xpath = "(//div[@class='nice-select theme_select style2 wide'])[2]")
    private WebElement priortyBoxCreateNewTicket;
    @FindBy(xpath = "//div[@class='note-editable']")
    private WebElement descriptionBoxCrateNewTicket;
    @FindBy(xpath = "(//*[text()='Installation'])[2]")
    private WebElement dropDownInstallation;
    @FindBy(xpath = "//li[text()='High']")
    private WebElement dropDownHigh;
    @FindBy(xpath = "//button[text()='+ Create Now']")
    private WebElement createNewTicketButton;
    @FindBy(xpath = "//*[text()='Nevzat Celik']")
    private WebElement nevzat;
    public void crateNewTicketPage(){
        subjectBoxCreateNewTicket.sendKeys("hello");
        ReusableMethods.bekle(2);
        actions.scrollToElement(categoryBoxCrateNewTicket).scrollToElement(dropDownInstallation).perform();
        categoryBoxCrateNewTicket.click();
        dropDownInstallation.click();
        priortyBoxCreateNewTicket.click();
        dropDownHigh.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        descriptionBoxCrateNewTicket.sendKeys("abcdefghijklmn");
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        createNewTicketButton.click();

    }

    @FindBy(xpath = "//*[text()='All Activity Logs']")
    public WebElement allactivityLogs;

    @FindBy(xpath = "//*[text()='Clean All']")
    private WebElement cleanAllButton;

    @FindBy(xpath = "//*[text()='No data available in table']")
    private WebElement noDataAvaliable;

    @FindBy(xpath = "//*[text()='Activity Logs']")
    public WebElement activitylogsButton;

    public void activityLogsEntryMethod(){
        actions.scrollToElement(allactivityLogs).click(allactivityLogs).perform();
        actions.scrollToElement(activitylogsButton).click(activitylogsButton).perform();
    }
    public void cleanAllMethodandAssertion(){
        cleanAllButton.click();
        Assert.assertTrue(noDataAvaliable.isDisplayed());
    }

    @FindBy(xpath = "//tr[@role='row']")
    private WebElement row;

    public void row(){
        String expected="SL TYPE DESCRIPTION URL IP AGENT ATTEMPTED AT USER";
        String actual=row.getText();
        Assert.assertEquals(expected,actual);
    }
    @FindBy(xpath = "//a[@id='activityDataTable_next']")
    private WebElement nextPage;

    @FindBy(xpath = "//div[@id='activityDataTable_info']")
    private WebElement showingInformText;



    public void nextpageandAssertionMethods(){
        actions.scrollToElement(nextPage).perform();
        nextPage.click();
        ReusableMethods.bekle(2);
        String expected="Showing 11 to 20 of 30 entries";
        String actual=showingInformText.getText();
        Assert.assertEquals(expected,actual);
        nextPage.click();
        String expected2="Showing 21 to 30 of 30 entries";
        String actual2=showingInformText.getText();
        Assert.assertEquals(expected,actual);


    }
}
