package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TrendLifeBuyPage {
    Actions actions=new Actions(Driver.getDriver());

    public TrendLifeBuyPage(){
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

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardLink;

    public void userLogin(String mail,String password){
        if (firstAlertMail.isDisplayed()){
            firstAlertMailClose.click();
            loginLink.click();
            emailBox.sendKeys(ConfigReader.getProperty(mail));
            passwordBox.sendKeys(ConfigReader.getProperty(password));
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.bekle(2);
            signInButton.click();
        }
        else {
            loginLink.click();
            emailBox.sendKeys(ConfigReader.getProperty(mail));
            passwordBox.sendKeys(ConfigReader.getProperty(password));
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.bekle(3);
            signInButton.click();
        }
    }
    public void adminLogin(String mail,String password){
        emailBox.sendKeys(ConfigReader.getProperty(mail));
        passwordBox.sendKeys(ConfigReader.getProperty(password));
        signInButton.click();
    }


}
