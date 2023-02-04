package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US033_036_Page {

    public US033_036_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
        }

    @FindBy(xpath = "//*[@id=\"sidebar_menu\"]/li[2]/ul/li/a")
    public WebElement allCostumerButton;

    @FindBy(xpath = "//*[@id=\"all_customer\"]/div[1]/div/h3")
    public WebElement allCostumerLogo;

    @FindBy(xpath = "https://trendlifebuy.com/customer/profile/details/480")
    public WebElement detailsLink;

    @FindBy(xpath = "//*[@id=\"allCustomerTable\"]/tbody/tr[1]/td[9]/div/div/a[2]")
    public WebElement editDDM;

    @FindBy(xpath = "//*[@id=\"inactiveCustomerTable\"]/tbody/tr[1]/td[9]/div/div/a[3]")
    public WebElement deleteDDM;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement detailsDDM;

    @FindBy(xpath = "//h3[text()='Customer Profile']")
    public WebElement costumerProfileButton;

    @FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
    public WebElement dropDownSelect;

    @FindBy(xpath = "//td[text()='Name']")
    public WebElement name;

    @FindBy(xpath = "//td[text()='Email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"main-content\"]/section/div/div[2]/div/div/div/ul/li[1]/a")
    public WebElement orders;

    @FindBy(xpath = "//*[@id=\"walletTable\"]/thead/tr/th[3]")
    public WebElement user;

    @FindBy(xpath = "//*[@id=\"walletTable\"]/thead/tr/th[2]")
    public WebElement date;

    @FindBy(xpath = "//*[@id=\"main-content\"]/section/div/div[2]/div/div/div/ul/li[2]/a")
    public WebElement wallet;

    @FindBy(xpath = "//*[@id=\"main-content\"]/section/div/div[2]/div/div/div/ul/li[3]/a")
    public WebElement address;

    @FindBy(xpath = "//td[text()='Phone']")
    public WebElement phone;

    @FindBy(xpath = "//*[@id=\"allCustomerTable\"]/tbody/tr[3]/td[3]/a")
    public WebElement searchBoxSonuc;

    @FindBy(xpath = "//*[@id=\"allCustomerTable_filter\"]/label/input")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"1\"]")
    public WebElement inactiveCostumer;

    @FindBy(xpath = "//h3[text()='Update Customer']")
    public WebElement updateCostomer;

    @FindBy(xpath = "//span[text()='Customer']")
    public WebElement costumerButton;


    }
