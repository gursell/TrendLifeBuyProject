package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US018_019_020_021_052_054_Page {
    public US018_019_020_021_052_054_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='newsletter_form_inner']")
    private WebElement firstAlertMail;

    @FindBy(xpath = "(//div[@class='close_modal'])[1]")
    private WebElement firstAlertMailClose;
    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signInButton;

    // ==================== US18 MY ORDER   ======
    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/my-purchase-orders'])[1]")
    public WebElement myOrderLink; //a[@class='position-relative d-flex align-items-center active']--HATALI

    @FindBy(xpath = "(//a[text()='Order Details'])[2]")   //a[text()='Cancel Order']  //a[text()='Order Details']
    public WebElement orderDetailsButton; //a[text()='Order Details']

    @FindBy(xpath = "//div[@class='order_details_list_box']")
    public WebElement orderDetailsListBox;

    @FindBy(xpath = "//div[@class='dashboard_white_box_body dashboard_orderDetails_body']")
    private WebElement orderDetailsBody;

    // 1802- Order ID, Status, Order date, Order Amount, Package, Price, Est arrival date, TAX Amount information is displayed.
    @FindBy(xpath = "//h4[text()='Order ID:  ']")       //(//h4[text()='Order ID: '])[1] hatali
    public WebElement detailsOrderID;
    @FindBy(xpath = "//h4[text()='Status: ']")
    public WebElement detailsStatus;
    @FindBy(xpath = "//h4[text()='Order date :  ']") //h4[text()='Order date :  ']
    public WebElement detailsOrderDate;
    @FindBy(xpath = "(//h4[text()='Order amount: '])[1]")
    public WebElement detailsOrderAmount;
    @FindBy(xpath = "//h4[text()='Package : 22122303521333']")
    public WebElement detailsPackage;
    @FindBy(xpath = "//h4[text()='Price: $ 124']")
    public WebElement detailsPrice;
    @FindBy(xpath = "//p[text()='Est arrival date: 28 Dec - 31 Dec']")
    public WebElement detailsEstArrivalDate;
    @FindBy(xpath = "//h4[text()='TAX Amount:  ']")
    public WebElement detailsTAXAmount;

    // 1803- Order Details sayfasinda ilgili siparis süreci ile ilgili;
    // Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.
    @FindBy(xpath = "//h5[text()='Pending']")
    public WebElement detailsPending;
    @FindBy(xpath = "//h5[text()='Processing']")
    public WebElement detailsProcessing;
    @FindBy(xpath = "//h5[text()='Shipped']")
    public WebElement detailsShipped;
    @FindBy(xpath = "//h5[text()='Recieved']")
    public WebElement detailsRecieved;
    @FindBy(xpath = "//h5[text()='Delivered']")
    public WebElement detailsDelivered;

    //1804- Order Details sayfasinda; Pending, Processing, Shipped, Recieved, Delivered
    //        #  asamalarinin aciklamalarini iceren textlerin görünür oldugu dogrulanmali.
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[1]")
    public WebElement detailsPendingText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[2]")
    public WebElement detailsProcessingText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[3]")
    public WebElement detailsShippedText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[4]")
    public WebElement detailsRecievedText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[5]")
    public WebElement detailsDeliveredText;

    //---- 1805- My Order sayfasindaki Cancel Order butonunun Cancel sekmesine yönlendirme yaptigi dogrulanmali.
    @FindBy(xpath = "//a[text()='Cancel Order']")   // Dikkat- Cancel da Send islemini 3. de yaptim (//a[text()='Cancel Order'])[2]
    public WebElement cancelOrderButton;
    @FindBy(xpath = "//h3[text()='Select cancel reason']")
    public WebElement selectCancelReasonTab;

    //-- 1806- Cancel sekmesindeki Reason textbox'inin aktif oldugu ve send butonuna tiklaninca girilen order'in iptal edildigi dogrulanmali.
    @FindBy(xpath = "(//input[@class='nice-select-search'])[2]")
    public WebElement reasonBox;
    @FindBy(xpath = "//button[text()='Send']")
    public WebElement sendButton;
    @FindBy(xpath = "Yok") //Dikkat 3. urunun iptal buttonu ve tiklayinca iptal oldu
    public WebElement cancelOrderButton3;
    @FindBy(xpath = "Yok")
    public WebElement sendButton3;
    @FindBy(xpath = "//a[text()='Order Cancelled']") //Dikkat 3. urunun iptal buttonu
    public WebElement orderCancelledButton3;

    //-- 1807- Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali
    @FindBy(xpath = "//h4[text()='Shipping Info ']")
    public WebElement detailsShippingInfo;
    @FindBy(xpath = "//h4[text()='Billing Info ']")
    public WebElement detailsBillingInfo;
    @FindBy(xpath = "//h4[text()='Payment Info ']")
    public WebElement detailsPaymentInfo;

    // ==================== US19 MY WALLET   =======================>>>
    // 1901- Dashboard sayfasinda bulunan side bar'daki My Wallet linkinin Wallet sayfasina yönlendirdigi dogrulanmali.
    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/wallet/customer/my-wallet-index']")
    public WebElement myWalletLink;
    @FindBy(xpath = "//h4[text()='My Wallet']")
    public WebElement myWalletTitle;
    @FindBy(xpath = "//span[text()='Total Balance']")
    public WebElement myWalletTotalBalance;
    @FindBy(xpath = "//h4[text()='Running Balance']")
    public WebElement myWalletRunningBalance;
    @FindBy(xpath = "//h4[text()='Pending Balance']")
    public WebElement myWalletPendingBalance;
    @FindBy(xpath = "//span[text()='Recharge Wallet']")
    public WebElement myWalletRechargeWallet;
    @FindBy(xpath = "//h3[text()='Recharge Amount']")
    public WebElement rechargeWalletRechargeAmountTab;
    @FindBy(xpath = "//input[@id='recharge_amount']")
    public WebElement enterRechargeAmountBox;
    @FindBy(xpath = "//h5[text()='Cancel']")
    public WebElement cancelButtonAmountBox;
    @FindBy(xpath = "//button[text()='Add Fund']")
    public WebElement addFundButton;
    @FindBy(xpath = "//h4[text()='My wallet recharge']")
    public WebElement myWalletRechargeTitle;
    @FindBy(xpath = "//div[@class='dashboard_white_box_body']")
    public WebElement sutunWalletRechargeHistoryTitle;

    @FindBy(xpath = "//h4[text()='Wallet Recharge History']")
    public WebElement walletRechargeHistoryTitle;
    @FindBy(xpath = "(//div[@class='table-responsive'])[1]")
    public WebElement walletRechargeHistoryTab;

    // ==================== US20 MY COUPONS   =======================>>>

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/profile/coupons'])[1]")
    public WebElement myCouponsLink;
    @FindBy(xpath = "https://trendlifebuy.com/profile/coupons")
    public WebElement getMyCouponsLinkUrl;
    @FindBy(xpath = "//input[@id='code']")
    public WebElement addCouponsCodeBox;
    @FindBy(xpath = "//button[text()='Add Coupon']")
    public WebElement addCouponButton;

    @FindBy(xpath = "//th[text()='Coupon Value']")
    public WebElement collectedCouponsValue;
    @FindBy(xpath = "//th[text()='Store Name']")
    public WebElement collectedCouponsName;
    @FindBy(xpath = "//th[text()='Coupon Code']")
    public WebElement collectedCouponsCode;
    @FindBy(xpath = "//th[text()='Validity']")
    public WebElement collectedCouponsValidity;
    @FindBy(xpath = "//th[text()='Action']")
    public WebElement collectedCouponsAction;


    // ==================== US21 Refund & Dispute   =======================>>>

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/refund/my-refund-list']")
    public WebElement refundDisputeLink;


    // ==================== US52 All Activity Logs   =======================>>>

    @FindBy(xpath = "//span[text()='All Activity Logs']")
    public WebElement allActivityLogsLink;                                                                       //5201
    @FindBy(xpath = "//a[text()='Login Activity']")   //a[@class='active ']
    public WebElement loginActivityLink;
    @FindBy(xpath = "//h3[text()='Login - Logout Activity']")
    public WebElement loginLogoutActivityTitle;
    @FindBy(xpath = "//a[text()='Clean All']")   //div[text()='Showing 1 to 10 of 22 entries']
    public WebElement cleanAllButton;            //div[text()='Showing 1 to 10 of 123 entries']                  //5202
    @FindBy(xpath = "//input[@id='dataDeleteBtn']")
    public WebElement dataDeleteButton2;  //td[text()='No data available in table']
    @FindBy(xpath = "//a[@id='loginLogoutDataTable_next']")
    public WebElement nextSagTus;                                                                                //5202
    @FindBy(xpath = "//td[text()='No data available in table']")
    public WebElement sonucYazisi52NoData;

    @FindBy(xpath = "(//tr[@role='row'])[1]")                   //5203  User, Login AT, Logout AT, IP, Agent, Description
    public WebElement loginLogoutActivityBasliklar;
    @FindBy(xpath = "//th[text()='User']")                                                                     //5203
    public WebElement loginLogoutActivityUser;                  //5203  User, Login AT, Logout AT, IP, Agent, Description
    @FindBy(xpath = "//th[text()='Login At']")
    public WebElement loginLogoutActivityLoginAt;
    @FindBy(xpath = "//th[text()='Logout At']")
    public WebElement loginLogoutActivityLogoutAt;
    @FindBy(xpath = "//th[text()='IP']")
    public WebElement loginLogoutActivityIP;
    @FindBy(xpath = "//th[text()='Agent']")
    public WebElement loginLogoutActivityAgent;
    @FindBy(xpath = "//th[text()='Description']")
    public WebElement loginLogoutActivityDescription;
    @FindBy(xpath = "//input[@type='search']")                                    // 5204- Quick Search Text Box'i ile
    public WebElement quickSearchBox;                                                                          //5204

    @FindBy(xpath = "//a[text()='1']")
    public WebElement sayfa1Button;                                                                              //5205
    @FindBy(xpath = "//a[text()='2']")  //div[@id='loginLogoutDataTable_info']
    public WebElement sayfa2Button;
    @FindBy(xpath = "//div[@id='loginLogoutDataTable_info']")
    public WebElement searchBoxInfoYazisi;                                                                     //5205


    // ==================== US54 Contact Request   =======================>>>

    @FindBy(xpath = "//span[text()='Contact Request']")   // 5401
    public WebElement contactRequestLink;

    @FindBy(xpath = "//a[text()='Contact Mail']")
    public WebElement contactMailLink;

    @FindBy(xpath = "//h3[text()='Contact Mail List']")  //5402
    public WebElement contactMailListTitle;

    @FindBy(xpath = "//th[text()='Name']")               //5403
    public WebElement contactMailListNAME;
    @FindBy(xpath = "//th[text()='Message']")
    public WebElement contactMailListMESSAGE;
    @FindBy(xpath = "//th[text()='Email']")  //tbody[1]/tr[1]/td[@class='sorting_1']
    public WebElement contactMailListEMAIL;
    @FindBy(xpath = "//tbody[1]/tr[1]/td[@class='sorting_1']")
    public WebElement contactMailListTable;


    @FindBy(xpath = "//td[text()='bitox26925@lance7.com']") //5404  --Kullanmadim
    public WebElement altEMAILWebElement;
    @FindBy(xpath = "(//td[@class='sorting_1'])[1]") //5404
    public WebElement altEMAILWebElementBirinci;    //Basta, EMAIL in altindaki elemani verir,tiklayincada yeni gelenin textini verir
    @FindBy(xpath = "(//td[@class='sorting_1'])[2]") //5404
    public WebElement altEMAILWebElementIkinci;

    @FindBy(xpath = "//input[@type='search']")                         //5405
    public WebElement mailListQuickSearchBoxKutusu;

    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[1]")                         //5406
    public WebElement actionsSelectButton;

    @FindBy(xpath = "(//a[text()='Show'])[1]")                         //5406
    public WebElement actionsShowButton;

    @FindBy(xpath = "(//a[text()='Delete'])[1]")    //h3[text()='Contact Mail']                      //5406
    public WebElement actionsDeleteButton;

    @FindBy(xpath = "//h3[text()='Contact Mail']")                                                    //5407
    public WebElement contactMailDetayTitle;

    @FindBy(xpath = "//input[@id='dataDeleteBtn']")                                                    //5408
    public WebElement actionsSelectDelete2Button;

    //
    @FindBy(xpath = "//div[@id='a11y-speak-polite']")                                                    //5408
    public WebElement delectedMessage;

    @FindBy(xpath = "//div[@id='dataTable_info']")
    public WebElement getSonucYazisi54NoData;

}
