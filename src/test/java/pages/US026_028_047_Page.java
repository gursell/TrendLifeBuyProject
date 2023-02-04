package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US026_028_047_Page {
    public US026_028_047_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "/html/body/header/div/div[2]/div/div/div/div/div[1]/div/a")
    public WebElement website;

    @FindBy (xpath = "(//a[@href='https://trendlifebuy.com/product/exclusive-bag-1'])[1]")
    public WebElement product1;



    @FindBy (xpath = "//*[@id=\"subscriptionModal\"]/div/div[1]/i")
    public WebElement closead;


    @FindBy (xpath = "//*[@id=\"add_to_cart_btn_modal\"]")
    public WebElement selectaddtocart2;


    @FindBy (xpath = "//*[@id=\"cart_add_modal\"]/div/div/div/div/div[3]/a[1]")
    public WebElement viewcart;

    @FindBy (xpath = "//*[@id=\"cart_form\"]/div/div/div[3]/a")
    public WebElement proceedtocheckout;

    @FindBy (xpath = "//*[@id=\"tab_pane_subcat_10\"]/div/div[1]/div[1]/a/img")
    public WebElement product2;
    @FindBy(xpath = "//*[@id=\"tab_pane_subcat_10\"]/div/div[1]/div[2]/div[2]/a")
    public WebElement product2addtocart;

    @FindBy (xpath = "//*[@id=\"cart_form\"]/div/div/div[2]/ul/li/div/div[1]/a/div[1]/img")
    public WebElement cartitem;

    @FindBy (xpath = "//*[@id=\"cart_add_modal\"]/div/div/div/div/div[3]/a[1]")
    public WebElement viewcartwindow;


    @FindBy (xpath = "//*[@id=\"add_to_cart_btn_modal\"]")
    public WebElement addtocartwindow;

    @FindBy (xpath = "//*[@id=\"mainOrderForm\"]/div/div[1]/div/div[2]/div[3]/div[3]/div[6]/div/span")
    public WebElement citytextbox;

    @FindBy (xpath = "//*[@id=\"mainOrderForm\"]/div/div[1]/div/div[2]/div[3]/div[3]/div[6]/div/div/input")
    public WebElement citysearchbox;

    @FindBy (xpath = "//*[@id=\"mainOrderForm\"]/div/div[1]/div/div[2]/div[3]/div[3]/div[6]/div/ul/li[22]")
    public WebElement cityclark;

    @FindBy (xpath = "//*[@id=\"next_step_btn_div\"]/button")
    public WebElement countinuetoshiipingbutton;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement emailboxcheckout;

    @FindBy (xpath = "//input[@value='home_delivery']")
    public WebElement homedeliveryradiobutton;

    @FindBy (xpath = "//input[@value='pickup_location']")
    public WebElement pickuplocationradiobutton;

    @FindBy (xpath = "//div[@class=\"nice-select primary_select mb-15 open\"]")
    public WebElement typelistfromorder;

    @FindBy (xpath = "//input[@class=\"primary_input_field primary-input form-control\"]")
    public WebElement datelistfromorder;

    @FindBy (xpath = "/html/body/div[2]/nav/ul/li[16]/ul/li[9]/a")
    public WebElement orderlink;

    @FindBy (xpath = "//div[@class=\"nice-select primary_select mb-15\"]")
    public WebElement clicktypelist;

    @FindBy (xpath = "//input[@class=\"primary_input_field primary-input form-control\"]")
    public WebElement clickdatelist;

    @FindBy (xpath = "//li[@class=\"option selected focus\"]")
    public WebElement allorderadmin;

    @FindBy (xpath = "(//li[@class=\"option\"][2])")
    public WebElement pendingordersadmin;

    @FindBy (xpath = "(//li[@class=\"option\"][3])")
    public WebElement confirmedordersadmin;

    @FindBy (xpath = "(//li[@class=\"option\"][4])")
    public WebElement completedordersadmin;

    @FindBy (xpath = "(//li[@class=\"option\"][5])")
    public WebElement inhouseorderadmin;

   @FindBy (xpath = "//li[@data-range-key=\"Today\"]")
    public WebElement todaydate;

    @FindBy (xpath = "//li[@data-range-key=\"Yesterday\"]")
    public WebElement yesterdaydate;

    @FindBy (xpath = "//li[@data-range-key=\"Last 7 Days\"]")
    public WebElement lastsevendate;

    @FindBy (xpath = "//li[@data-range-key=\"Last 30 Days\"]")
    public WebElement last30date;

    @FindBy (xpath = "//li[@data-range-key=\"This Month\"]")
    public WebElement thismonthdate;

    @FindBy (xpath = "//li[@data-range-key=\"Last Month\"]")
    public WebElement lastmonthdate;

    @FindBy (xpath = "//li[@data-range-key=\"This Year\"]")
    public WebElement thisyeardate;

    @FindBy (xpath = "//li[@data-range-key=\"Last Year\"]")
    public WebElement lastyeardate;

    @FindBy (xpath = "//li[@data-range-key=\"Custom Range\"]")
    public WebElement customrangedate;

    @FindBy (xpath = "(//td[@data-title=\"r0c3\"])[2]")
    public WebElement datedate;

    @FindBy (xpath = "//input[@id=\"start_date\"]")
    public WebElement startdate;

    @FindBy (xpath = "//input[@id=\"end_date\"]")
    public WebElement enddate;

    @FindBy (xpath = "//button[@id=\"save_button_parent\"]")
    public WebElement searchbutton;

    @FindBy (xpath = "//th[@aria-label=\"Date: activate to sort column ascending\"]")
    public WebElement dateordersearch;

    @FindBy (xpath = "//th[@aria-label=\"Order ID: activate to sort column ascending\"]")
    public WebElement orderidsearch;

    @FindBy (xpath = "//th[@aria-label=\"Email: activate to sort column ascending\"]")
    public WebElement emailorder;

    @FindBy (xpath = "//th[@aria-label=\"Product QTY: activate to sort column ascending\"]")
    public WebElement productqtyorder;

    @FindBy (xpath = "//th[@aria-label=\"Total Amount: activate to sort column ascending\"]")
    public WebElement orderstatusorder;

    @FindBy (xpath = "//th[@style= \"width: 85px;\"]")
    public WebElement ispaidorder;

    @FindBy (xpath = "//input[@aria-controls=\"allOrderTable\"]")
    public WebElement searchboxbutton;

    @FindBy (xpath = "(//span[@class=\"current\"])[2]")
    public WebElement allorderlist;












    }




