package stepdefinitions.UIStepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TrendLifeBuyCommonStep {

    TrendLifeBuyPage life=new TrendLifeBuyPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Open browser go to url {string}")
    public void open_browser_go_to_url(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
    }
    @Then("User clicks on the login link, enters {string} and {string} and logs in")
    public void user_clicks_on_the_login_link_enters_and_and_logs_in(String mail,String password) {
     life.userLogin(mail,password);
    }
    @Then("User clicks on dashboard link")
    public void user_clicks_on_dashboard_link() {
        life.dashboardLink.click();
    }
    @Then("Closes the page")
    public void closes_the_page() {

        Driver.closeDriver();
    }
    @Given("Admin enters an {string}, a {string} and then clicks sign in link on admin page to login")
    public void adminEntersAnAAndThenClicksSignInLinkOnAdminPageToLogin(String mail,String password) {
      life.adminLogin(mail, password);
        ReusableMethods.bekle(4);

    }

}

