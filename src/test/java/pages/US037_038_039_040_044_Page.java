package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US037_038_039_040_044_Page {
    public US037_038_039_040_044_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Dashboard Page
    @FindBy(xpath = "//*[text()='Wallet Manage']")
    public WebElement walletManage;

    @FindBy (xpath = "//*[text()='Offline Recharge']")
    public WebElement offlineRecharge;

    @FindBy (xpath = "//*[text()='Admin Reports']")
    public WebElement adminReportsLink;

    @FindBy (xpath = "//*[text()='Keywords search']")
    public WebElement keywordsSearchLink;

    @FindBy (xpath = "//*[text()='Visitor']")
    public WebElement visitorLink;

    @FindBy (xpath = "(//*[text()='Support Ticket'])[1]")
    public WebElement supportTicketLink;

    @FindBy (xpath = "//*[text()='My Tickets']")
    public WebElement myTicketLink;

    // Offline Recharge Page

    @FindBy (xpath = "//h3[text()='Offline Recharge']")
    public WebElement offlineRechargeList;

    @FindBy (xpath = "//*[text()='SL']")
    public WebElement informationSL;

    @FindBy (xpath = "//*[text()='Date']")
    public WebElement informationDate;

    @FindBy (xpath = "//*[text()='Email']")
    public WebElement informationEmail;

    @FindBy (xpath = "//*[text()='TXN ID']")
    public WebElement informationTxnId;

    @FindBy (xpath = "//*[text()='Amount']")
    public WebElement informationAmount;

    @FindBy (xpath = "//*[text()='Type']")
    public WebElement informationType;

    @FindBy (xpath = "//*[text()='Payment Method']")
    public WebElement informationPaymentMethod;

    @FindBy (xpath = "//*[text()='Approval']")
    public WebElement informationApproval;

    @FindBy (xpath = "//*[text()='Action']")
    public WebElement informationAction;

    @FindBy (xpath = "//*[text()='22nd Dec, 2022']")
    public WebElement filter22ndDec2022;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement quickOfflineRecharge;

    @FindBy (xpath = "//a[@data-toggle='modal']")
    public WebElement offlineRechargeButton;

    @FindBy (xpath = "//input[@name='recharge_amount']")
    public WebElement amountRecharge;

    @FindBy (xpath = "(//div[@class='nice-select primary_select mb-25'])[2]")
    public WebElement nameButton;

    @FindBy (xpath = "(//li[@data-value='476'])[1]")
    public WebElement selectOne;

    @FindBy (xpath = "(//*[@placeholder='Any Comment'])[1]")
    public WebElement anyComment;

    @FindBy (xpath = "(//button[@id='save_button_parent'])[1]")
    public WebElement continueButton;

    @FindBy (xpath = "//*[text()='17-25']")
    public WebElement verifyBalance;

    // Keywords Search Page
    @FindBy (xpath = "//input[@type='search']")
    public WebElement quickKeywordSearch;

    @FindBy (xpath = "//*[text()='computer']")
    public WebElement verifyQuickSearchBox;

    @FindBy (xpath = "//h3[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px']")
    public WebElement keywordSearchReportList;

    @FindBy (xpath = "//*[@aria-label='Keywords: activate to sort column ascending']")
    public WebElement keywords;

    @FindBy (xpath = "//*[@aria-label='Number of time: activate to sort column ascending']")
    public WebElement numberOfTime;

    @FindBy (xpath = "//a[@data-dt-idx='2']")
    public WebElement switchPageKeywordSearch;

    /*
    @FindBy (xpath = "//tbody")
    public WebElement numberOfRows;

    // List<WebElement> numberOfRows= Driver.getDriver().findElements(By.xpath("//tbody"));
     */

    @FindBy (xpath = "(//*[text()='10'])[2]")
    public WebElement verify10;

    // Visitor Report Page
    @FindBy (xpath = "//*[text()='Visitor Report']")
    public WebElement visitorReportList;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement quickVisitorReport;

    @FindBy (xpath = "//*[text()='United States, Texas']")
    public WebElement verifyVisitorQuickSBox;

    @FindBy (xpath = "//*[@aria-label='IP: activate to sort column ascending']")
    public WebElement ipInformation;

    @FindBy (xpath = "//*[@aria-label='Agent: activate to sort column ascending']")
    public WebElement agentInformation;

    @FindBy (xpath = "//*[@aria-label='Device: activate to sort column ascending']")
    public WebElement deviceInformation;

    @FindBy (xpath = "//*[@aria-label='Location: activate to sort column ascending']")
    public WebElement locationInformation;

    @FindBy (xpath = "//*[@aria-label='Date: activate to sort column ascending']")
    public WebElement dateInformation;

    @FindBy (xpath = "//a[@data-dt-idx='2']")
    public WebElement switchVisitorReport;

    @FindBy (xpath = "//*[text()='10']")
    public WebElement verify10visitor;

    // My Ticket Page
    @FindBy (xpath = "//*[text()='Ticket List']")
    public WebElement ticketList;

    @FindBy (xpath = "(//div[@class='nice-select primary_select mb-15'])[1]")
    public WebElement category;

    @FindBy (xpath = "(//*[text()='Select One'])[3]")
    public WebElement categorySelectOne;

    @FindBy (xpath = "(//*[text()='Installation '])[2]")
    public WebElement categoryInstallation;

    @FindBy (xpath = "(//*[text()='Technical '])[2]")
    public WebElement categoryTechnical;

    @FindBy (xpath = "(//*[text()='Others '])[2]")
    public WebElement categoryOthers;

    @FindBy (xpath = "(//div[@class='nice-select primary_select mb-15'])[2]")
    public WebElement priority;

    @FindBy (xpath = "(//*[text()='Select One'])[6]")
    public WebElement prioritySelectOne;

    @FindBy (xpath = "(//*[text()='High '])[2]")
    public WebElement priorityHigh;

    @FindBy (xpath = "(//*[text()='Medium '])[2]")
    public WebElement priorityMedium;

    @FindBy (xpath = "(//*[text()='Low '])[2]")
    public WebElement priorityLow;

    @FindBy (xpath = "(//div[@class='nice-select primary_select mb-15'])[3]")
    public WebElement status;

    @FindBy (xpath = "(//*[text()='Select One'])[9]")
    public WebElement statusSelectOne;

    @FindBy (xpath = "(//*[text()='Pending '])[2]")
    public WebElement statusPending;

    @FindBy (xpath = "(//*[text()='On Going '])[2]")
    public WebElement statusOnGoing;

    @FindBy (xpath = "(//*[text()='Completed '])[2]")
    public WebElement statusCompleted;

    @FindBy (xpath = "(//*[text()='Closed '])[2]")
    public WebElement statusClosed;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement search;

    @FindBy (xpath = "//*[text()='No data available in table']")
    public WebElement afterSearch;

    @FindBy (xpath = "//*[@aria-label='Subject: activate to sort column ascending']")
    public WebElement subject;

    @FindBy (xpath = "//*[@aria-label='Category: activate to sort column ascending']")
    public WebElement category2;

    @FindBy (xpath = "//*[@aria-label='User Name: activate to sort column ascending']")
    public WebElement userName;

    @FindBy (xpath = "//*[@aria-label='Priority: activate to sort column ascending']")
    public WebElement priority2;

    @FindBy (xpath = "//*[@aria-label='User Agent: activate to sort column ascending']")
    public WebElement userAgent;

    @FindBy (xpath = "//*[@aria-label='Status: activate to sort column ascending']")
    public WebElement status2;

    @FindBy (xpath = "//*[@aria-label='Action: activate to sort column ascending']")
    public WebElement action;

    // 2nd Sprint
    @FindBy (xpath = "//*[text()='Wallet recharge history']")
    public WebElement walletRechargeHistory;

    @FindBy (xpath = "//h3[text()='Wallet recharge history']")
    public WebElement walletRechargeHistoryList;

    @FindBy (xpath = "//*[@aria-label='User: activate to sort column ascending']")
    public WebElement userRechargeHistory;

    @FindBy (xpath = "//*[@aria-label='Email: activate to sort column ascending']")
    public WebElement emailRechargeHistory;

    @FindBy (xpath = "//*[@aria-label='Type: activate to sort column ascending']")
    public WebElement typeRechargeHistory;

    @FindBy (xpath = "//*[@aria-label='Amount: activate to sort column ascending']")
    public WebElement amountRechargeHistory;

    @FindBy (xpath = "//*[@aria-label='Payment Details: activate to sort column ascending']")
    public WebElement paymentDetailsRechargeHistory;

    @FindBy (xpath = "//*[@aria-label='Trx Id: activate to sort column ascending']")
    public WebElement trxIdRechargeHistory;

    @FindBy (xpath = "//tbody/tr/td[1]")
    public WebElement plus1;

    @FindBy (xpath = "//span[@class='dtr-title']")
    public WebElement dateRechargeHistory;

    @FindBy (xpath = "//a[@data-dt-idx='2']")
    public WebElement transitionPages2RechargeHistory;

}
