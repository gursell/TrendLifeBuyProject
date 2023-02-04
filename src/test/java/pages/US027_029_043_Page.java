package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US027_029_043_Page {


    public US027_029_043_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//img[@title='Trendlifebuy | Online Shopping'])[1]")
    public WebElement trendlifeLogo;

    @FindBy(xpath = "//h3[text()='Sign In']")
    public WebElement LoginPage;

    @FindBy(xpath = "(//div[@class='owl-item active'])[4]")
    public WebElement productLocate;

    @FindBy(xpath = "(//div[@class='product_prise'])[10]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@id='add_to_cart_btn_modal']")
    public WebElement AddtoCartWindow;

    @FindBy(xpath = "//h4[text()='Item added to your cart']")
    public WebElement itemAddedtext;

    @FindBy(xpath = "//a[text()='View cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//a[text()='Proceed to checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//button[text()='Continue To Shipping']")
    public WebElement continueToShipping;

    @FindBy(xpath = "(//button[@type='submit'])[2]")    //h3[text()='Shipping Method']
    public WebElement shippingMethodTitle;

    @FindBy(xpath = "//button[text()='Continue To Payment']")
    public WebElement continueToPayment;

    @FindBy(xpath = "//h3[text()='Payment']")
    public WebElement paymentTitle;

    @FindBy(xpath = "//a[@id='payment_btn_trigger']")
    public WebElement payNowButton;

    @FindBy(xpath = "//h4[text()='Order summary']")
    public WebElement orderSummaryTitle;

    @FindBy(xpath="//a[text()='Continue Shopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "//span[text()='Flat Rate']")
    public WebElement shippingMethod;

    @FindBy(xpath = "(//span[@class='checkmark mr_10'])[1]")
    public WebElement paymentMethod;

    @FindBy(xpath = "//a[text()='Home delivery']")
    public WebElement HomeDelivery;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement addressBox;

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailBox;

    @FindBy (xpath="//input[@id='phone']")
    public WebElement phoneBox;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement countryBox;

    @FindBy(xpath = "//input[@id='postal_code']")
    public WebElement postalCodeBox;

    @FindBy(xpath="//span[text()='I agree with the terms and conditions.']")
    public WebElement agreeConditions;

    @FindBy(xpath = "//span[text()='Cash On Delivery']")
    public WebElement cashOnDelivery;

    @FindBy(xpath = "(//span[@class='checkmark mr_10'])[4]")
    public WebElement sameAsShipping;

    @FindBy(xpath = "//div[text()='Order created succesfully']")
    public WebElement orderReceivedMessage;

    @FindBy(xpath = "//div[@class='summery_pro_content']")
    public WebElement orderInformation;










    @FindBy(xpath = "//input[@id='text']")
    public WebElement adminEmailbox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement adminPasswordBox;

    @FindBy (xpath = "//div[@class='profile_info']")
    public WebElement adminProfilicon;

    @FindBy (xpath = "//input[@id='search']")
    public WebElement adminSearchbox;

    @FindBy (xpath = "//div[@class='collaspe_icon open_miniSide']")
    public  WebElement adminMenuicon;

    @FindBy (xpath = "//a[@target='_blank']")
    public WebElement adminWebsiteButton;

    @FindBy(xpath = "//span[text()='Dashboard']")
    public WebElement adminDashboardTitle;

    //@FindBy(xpath = "https://trendlifebuy.com/")
    //public WebElement url;


    @FindBy (xpath = "//a[@data-type='today']")
    public WebElement adminTodayButton;

    @FindBy (xpath = "//a[@data-type='week']")
    public WebElement adminWeekButton;

    @FindBy(xpath = "//a[@data-type='month']")
    public WebElement adminMonthButton;

    @FindBy(xpath = "//a[@data-type='year']")
    public WebElement adminYearButton;

    @FindBy(xpath = "//h1[text()='34']")
    public WebElement todayVisitor;

    @FindBy(xpath = "//h1[text()='256']")
    public WebElement weekVisitor;

    @FindBy(xpath = "//h3[text()='Visitor']")
    public WebElement visitorButton;

    @FindBy(xpath = "//h3[text()='Total Order']")
    public WebElement TotalOrderButton;

    @FindBy(xpath = "//h3[text()='Total Pending Order']")
    public WebElement TotalPendingOrderButton;

    @FindBy(xpath = "//h3[text()='Total Completed Order']")
    public WebElement TotalCompletedOrderButton;

    @FindBy(xpath = "//h3[text()='Total Sale']")
    public WebElement TotalSaleButton;

    @FindBy(xpath = "//h3[text()='Total Review']")
    public WebElement TotalReviewButton;

    @FindBy(xpath = "//h3[text()='Total Revenue']")
    public WebElement TotalRevenueButton;

    @FindBy(xpath = "//h3[text()='Active Customer']")
    public WebElement ActiveCustomerButton;

    @FindBy(xpath = "//h3[text()='Total Subscriber']")
    public WebElement TotalSubscriberButton;

    @FindBy(xpath = "//a[@class='large_logo']")
    public WebElement admintrendLifeLogo;

    @FindBy(xpath="//a[text()='Customer']")
    public WebElement customerDown;

    @FindBy(xpath="//h1[text()='14']")
    public WebElement visitorDataToday;

    @FindBy(xpath = "//h1[text()='252']")
    public WebElement visitorWeek;

    @FindBy(xpath = "//img[@title='Trendlifebuy | Online Shopping']")
    public WebElement websiteNewPage;

    @FindBy(xpath = "//a[text()='Pending Orders']")
    public WebElement orderRelevantpage;




    //us 43
    @FindBy (xpath = "//span[text()='Admin Reports']")
    public WebElement AdminReports;

    @FindBy (xpath = "//a[text()='Wishlist']")
    public WebElement WishlistButton;

    @FindBy (xpath = "//div[@class='nice-select primary_select mb-15']")
    public WebElement wishlistSearchBox;

    @FindBy (xpath = "//li[@data-value='product']")
    public WebElement wishlistSelect;

    @FindBy (xpath = "//button[@id='save_button_parent']")
    public WebElement wishlistSearchButton;

    @FindBy (xpath = "(//div[@class='box_header common_table_header'])[2]")
    public WebElement wishlistSelectedType;


}
