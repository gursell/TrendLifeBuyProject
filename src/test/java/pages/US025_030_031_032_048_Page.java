package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US025_030_031_032_048_Page {
    public US025_030_031_032_048_Page(){
        PageFactory.initElements(Driver.getDriver(),this); }
        @FindBy(xpath = "(//a[@href=\"https://trendlifebuy.com/profile\"])[1]")
        public WebElement myAccountLink;
        @FindBy(xpath = "//input[@name='first_name']")
        public WebElement firstnameBoxMyAccount;
        @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
        public WebElement purchaseHistoryLink;
        @FindBy(xpath = "//span[text()='These credentials do not match our records.']")
        public WebElement systemMessage;
        @FindBy (xpath = "//a[@class='log_out']")
        public WebElement logoutLink;
        @FindBy (xpath = "//span[@class='d-inline-block lh-1 ']")
        public WebElement logoutisdisplayed;
        @FindBy (xpath = "//a[@class='position-relative d-flex align-items-center log_out']")
        public WebElement dashboardLogoutLink;
        @FindBy (xpath = "//i[@class='fa fa-bell']")
        public WebElement notificationIcon;
        @FindBy(xpath = "//*[text()='Notifications']")
        public WebElement notificationText;
        @FindBy (xpath = "//*[text()='Setting']")
        public WebElement notificationSettingClick;
        @FindBy(xpath = "//div[@class='main-title d-md-flex']")
        public WebElement PersonalNotificationSettingPage;
        @FindBy (xpath = "(//span[@class='checkmark'])[1]")
        public WebElement checkmark;
        @FindBy (xpath = "//*[text()='Read all']")
        public WebElement readAllButton;
        @FindBy (xpath = "//*[text()='View']")
        public WebElement viewButton;
        @FindBy (xpath = "//div[@class='notify_content']")
        public WebElement noNotificationFoundText;
        @FindBy(xpath = "//img[@id='profile_pic']")
    public WebElement profileIcon;
        @FindBy (xpath = "//*[text()='User_13463436332']")
    public WebElement adminName;
        @FindBy(xpath = "//div[@class='profile_info_details']")
    public WebElement myProfile;
        @FindBy(xpath = "//a[@class='log_out']")
    public WebElement logOut;
        @FindBy(xpath = "//*[text()='Basic Info']")
    public WebElement basicInfo;
        @FindBy(xpath = "//*[text()='First Name ']")
    public WebElement firstName;
        @FindBy (xpath = "//*[text()='Last Name']")
    public WebElement lastName;
        @FindBy(xpath = "(//label[@class='primary_input_label'])[3]")
    public WebElement emailName;
        @FindBy (xpath = "(//label[@class='primary_input_label'])[4]")
    public WebElement phoneNummer;
        @FindBy (xpath = "(//label[@class='primary_input_label'])[5]")
    public WebElement dateOfBirth;
        @FindBy(xpath = "//*[text()='Update ']")
    public WebElement update;
        @FindBy (xpath = "(//a[@class='nav-link'])[2]")
    public WebElement adressLink;
        @FindBy (xpath = "//a[@id='make_dft_shipping']")
    public WebElement adressVerify;
        @FindBy (xpath = "//a[@class='primary-btn radius_30px mr-10 fix-gr-bg add_new_address']")
    public WebElement addNewAdress;
        @FindBy (xpath = "(//input[@type='text'])[7]")
    public WebElement addNewAdressName;
        @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement getAddNewAdressPhone;
        @FindBy (xpath = "(//input[@type='text'])[9]")
        public WebElement getAddNewAdressAdress;
    @FindBy (xpath = "(//input[@class='primary_input_field'])[5]")
    public WebElement getAddNewAdressEmail;
    @FindBy (xpath = "(//input[@class='primary_input_field'])[8]")
    public WebElement getAddNewAdressPostaKod;
    @FindBy (xpath = "(//*[text()='Select from options'])[6]")
    public WebElement getAddNewAdressCity;
    @FindBy (xpath = "(//*[text()='Aberdeen'])[2]")
    public WebElement AdressCityClick;
    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement getAddNewAdressSave;

    //32
    @FindBy (xpath = "(//div[@class='nav_title'])[1]")
    public WebElement dashbordIcon;

    @FindBy(xpath = "(//span[@class='menu_seperator'])[2]")
    public WebElement userManagesCategory;
    @FindBy (xpath = "(//*[text()='Customer'])[1]")
    public WebElement customer;
    @FindBy(xpath = "//*[text()='Human Resource']")
    public WebElement humanResource;
    @FindBy(xpath = "(//span[@class='menu_seperator'])[3]")
    public WebElement orderManagesCategory;
    @FindBy(xpath = "//*[text()='Order Manage']")
    public WebElement orderManage;
    @FindBy(xpath = "//*[text()='Refund Manage']")
    public WebElement refundManage;
    @FindBy(xpath = "(//span[@class='menu_seperator'])[4]")
    public WebElement productManagesCategory;
    @FindBy(xpath = "(//*[text()='Products'])[1]")
    public WebElement products;
    @FindBy(xpath = "(//*[text()='Review'])[1]")
    public WebElement review;
    @FindBy(xpath = "(//*[text()='Shipping'])[1]")
    public WebElement shipping;
    @FindBy(xpath = "(//*[text()='Media Manager'])[1]")
    public WebElement mediaManager;
    @FindBy(xpath = "(//span[@class='menu_seperator'])[5]")
    public WebElement promotionalCategory;
    @FindBy(xpath = "(//*[text()='Marketing'])[1]")
    public WebElement marketing;
    @FindBy(xpath = "(//*[text()='Gift Card'])[1]")
    public WebElement giftCard;
    @FindBy(xpath = "(//span[@class='menu_seperator'])[6]")
    public WebElement financeCategory;
    @FindBy(xpath = "(//*[text()='Account'])[1]")
    public WebElement account;
    @FindBy(xpath = "(//*[text()='Wallet Manage'])[1]")
    public WebElement walletManage;
    @FindBy(xpath = "(//span[@class='menu_seperator'])[7]")
    public WebElement contentCategory;
    @FindBy(xpath = "(//*[text()='Blog'])[1]")
    public WebElement blog;
    @FindBy(xpath = "(//*[text()='Contact Request'])[1]")
    public WebElement contactRequest;
    @FindBy(xpath = "(//*[text()='Admin Reports'])[1]")
    public WebElement adminReports;
    @FindBy(xpath = "(//*[text()='Support Ticket'])[1]")
    public WebElement supportTicket;
    @FindBy(xpath = "(//*[text()='All Activity Logs'])[1]")
    public WebElement allActivityLogs;

    //48

    @FindBy (xpath = "//*[text()='Review']")
    public WebElement reviewLink;
    @FindBy (xpath = "(//*[text()='Product Review'])[1]")
    public WebElement productReviewLink;
    @FindBy (xpath = "(//*[text()='All Product Review List'])[1]")
    public WebElement producttReviewPage;
    @FindBy(xpath = "(//a[@class='paginate_button current'])[1]")
    public WebElement producttReviewList;
    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searcBox;
    @FindBy(xpath = "//*[text()='Sun glass For Man']")
    public WebElement SunGlassForMan;
    @FindBy(xpath = "(//*[text()='Rating'])[3]")
    public WebElement ratingg;
    @FindBy(xpath = "(//*[text()='Customer Feedback'])[1]")
    public WebElement customerrFeedback;
    @FindBy(xpath = "(//*[text()='Customer & Time'])[1]")
    public WebElement customerrTime;








}
