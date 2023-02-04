package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US016_017_042_Page {
    public US016_017_042_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    // +++++++++++++++ US16 +++++++++++++++++++++

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardLink;

   @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
  //  @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[3]/ul/li[2]/a")
    public WebElement purchaseHistory;

    @FindBy(xpath = "//div[@class='nice-select amaz_select3']")
    public WebElement allHistoryDropDown;

    @FindBy(xpath = "//li[@data-value='all']")
    public WebElement allHistoryButton;

    @FindBy(xpath = "//li[@data-value='pending']")
    public WebElement pendingOrdersButton;

    @FindBy(xpath = "//li[@data-value='confirm']")
    public WebElement confirmOrdersButton;

    @FindBy(xpath = "//li[text()='Completed Orders']")
    public WebElement copletedOrdersButton;

    @FindBy(xpath = "//li[text()='Refused/Cancelled Orders']")
    public WebElement refusedCancelledOrdersButton;

    @FindBy(xpath = "(//button[@class='amazy_status_btn purchase_show'])[1]")
    public WebElement orderSummaryButton;

    @FindBy(xpath = "(//a[@class='amazy_status_btn'])[1]")
    public WebElement downloadOrderInvoice;

    // +++++++++++++++ US17 +++++++++++++++++++++

    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[3]")
    public WebElement myOrderButton;

    @FindBy(xpath = "//button[@id='home-tab']")
    public WebElement myOrderAllButton;

    @FindBy(xpath = "//button[@id='Pay-tab']")
    public WebElement myOrderToPayButton;

    @FindBy(xpath = "//button[@id='Ship-tab']")
    public WebElement myOrderToShipButton;

    @FindBy(xpath = "//button[@id='Receive-tab']")
    public WebElement myOrderToReceiveButton;

    @FindBy(xpath = "(//div[@class='d-flex align-items-center flex-wrap gap_5'])[1]")
    public WebElement orderIdButton;

    @FindBy(xpath = "(//h4[@class='font_14 f_w_500 m-0 lh-base'])[2]")
    public WebElement orderDateButton;

    @FindBy(xpath = "(//h4[@class='font_14 f_w_500 m-0 lh-base'])[3] ")
    public WebElement statusButton;

    @FindBy(xpath = "(//h4[@class='font_14 f_w_500 m-0 lh-base'])[4] ")
    public WebElement orderAmountButton;

    @FindBy(xpath = "(//h4[@class='font_14 f_w_500 m-0 lh-base'])[5] ")
    public WebElement paidByButton;

    @FindBy(xpath = "(//span[@class='current'])[1]")
    public WebElement numbersDropDownMenu;

    @FindBy(xpath = "//span[text()='Last 5 orders']")
    public WebElement lastFiveOrdersButton;

    @FindBy(xpath = "(//li[@class='option'])[1]")
    public WebElement lastTenOrdersButton;

    @FindBy(xpath = "//li[@data-value='20']")
    public WebElement lastTwentyOrdersButton;

    @FindBy(xpath = "//li[@data-value='40']")
    public WebElement lastFourtyOrdersButton;

    @FindBy(xpath = "(//span[text()='Prev'])[1]")
    public WebElement previousButton;

    @FindBy(xpath = "(//span[text()='Next'])[1]")
    public WebElement nextButton;

    //++++++++++++++++++ US42 ++++++++++++++++

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement adminSignInButton;

    @FindBy(xpath = "//*[text()='Admin Reports']")
    public WebElement adminReportsButton;

    //@FindBy(xpath = "/*[text()='Product stock']")
    @FindBy(xpath = "//a[text()='Product stock']")
    public WebElement productStockButton;

    @FindBy(xpath = "//label[@class='primary_input_label']")
    public WebElement typeButton;

    @FindBy(xpath = "(//div[@tabindex='0'])[2]")
    public WebElement typedropDownMenu;

    //@FindBy(xpath = "//li[@class='option']")
    // @FindBy(xpath = "(//span[@class='current'])[2]")
    @FindBy(xpath = "//li[@class='option selected focus']")
    public WebElement selectOneOption;


    @FindBy(xpath = "//li[@data-value='all']")
    public WebElement allProductList;

    // @FindBy(xpath = "//li[@class='option']")
    //public WebElement allProductList2;

    // @FindBy(xpath = "(//button[@type='submit'])[2]")
    @FindBy(xpath = "//button[@id='save_button_parent']")
    public WebElement searchButton;





}
