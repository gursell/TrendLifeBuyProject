package stepdefinitions.UIStepDefinitions;


import io.cucumber.java.en.Then;


import org.apache.xmlbeans.impl.jam.JElement;
import org.checkerframework.checker.formatter.qual.Format;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;


import pages.US026_028_047_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.DateFormat;
import java.util.Date;


public class US026_028_047 {
    US026_028_047_Page page = new US026_028_047_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Visitor verify that the site is accessible")
    public void visitor_verify_website() {

        Assert.assertTrue(page.website.isDisplayed());


    }

    @Then(("Visitor must see product"))
    public void select_product() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.product1.isDisplayed());


    }

    @Then("Visitor verify Add to Cart button is appear")
    public void appear_addtocart() {

        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.product2addtocart.isDisplayed());


    }

    @Then("Visitor select Add to Cart button")
    public void select_add_to_cart() {
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.selectaddtocart2.click();
        ReusableMethods.bekle(2);
        page.viewcart.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.cartitem.isDisplayed());
        ReusableMethods.bekle(2);


    }

    @Then("View cart should be visible")
    public void viewcart_should_visible() {
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.addtocartwindow.click();
        ReusableMethods.bekle(2);
        Actions actn3 = new Actions(Driver.getDriver());
        actn3.moveToElement(page.viewcartwindow).perform();
        Assert.assertTrue(page.viewcartwindow.isDisplayed());
        ReusableMethods.bekle(2);


    }

    @Then("in the Item added to your cart window and when clicked, it redirects to the Cart page")
    public void viewcart_section() {
        page.viewcartwindow.click();
        ReusableMethods.bekle(2);
        String expectedUrl = "https://trendlifebuy.com/cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Driver.getDriver().navigate().back();


    }

    @Then("Proceed to Checkout button is visible")
    public void proceed_checkout_visible() {
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.addtocartwindow.click();
        ReusableMethods.bekle(2);
        page.viewcartwindow.click();
        ReusableMethods.bekle(2);
        Actions proceedtocheckout = new Actions(Driver.getDriver());
        proceedtocheckout.moveToElement(page.proceedtocheckout).perform();
        Assert.assertTrue(page.proceedtocheckout.isDisplayed());
    }

    @Then("Redirecting to Checkout page when PROCEED TO CHECKOUT button is click should be verified")
    public void proceed_to_checkout() {
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.addtocartwindow.click();
        ReusableMethods.bekle(2);
        page.viewcartwindow.click();
        ReusableMethods.bekle(2);
        page.proceedtocheckout.click();
        ReusableMethods.bekle(2);
        String expectedUrl = "https://trendlifebuy.com/checkout";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Driver.getDriver().navigate().back();

    }

    @Then("verified that it is mandatory to enter E-mail in the Contact Information field on the Checkout page.")
    public void mendatory_email() {
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.addtocartwindow.click();
        ReusableMethods.bekle(2);
        page.viewcartwindow.click();
        ReusableMethods.bekle(2);
        page.proceedtocheckout.click();
        ReusableMethods.bekle(2);
        WebElement name = Driver.getDriver().findElement(By.id("name"));
        WebElement adress = Driver.getDriver().findElement(By.id("address"));
        WebElement phone = Driver.getDriver().findElement(By.id("phone"));
        name.sendKeys("talha");
        adress.sendKeys("Houston");
        phone.sendKeys("12345678");
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        Actions citytext = new Actions(Driver.getDriver());
        citytext.moveToElement(page.citytextbox).perform();
        page.citytextbox.click();
        page.citysearchbox.click();
        page.citysearchbox.sendKeys("Clark");
        ReusableMethods.bekle(2);
        page.cityclark.click();
        ReusableMethods.bekle(2);
        page.countinuetoshiipingbutton.click();
        String expectedUrl = "https://trendlifebuy.com/checkout?email=aaa%40aaa.com&news_letter=1&delivery_type=home_delivery&pickup_location=&name=talha&address=Houston&phone=12345678&country=231&state=3953&city=47802&postal_code=&note=&step=select_shipping";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        if (!expectedUrl.equals(actualUrl)) {
            System.out.println("Email is mandatory");
        }

    }

    @Then("To Checkout Page")
    public void emailme_checkbox() {
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.addtocartwindow.click();
        ReusableMethods.bekle(2);
        page.viewcartwindow.click();
        ReusableMethods.bekle(2);
        page.proceedtocheckout.click();
        ReusableMethods.bekle(2);


    }

    @Then("Email me with news and offers Check Box is visible and selected")
    public void email_visible_selected() {
        Actions checkbox = new Actions(Driver.getDriver());
        checkbox.moveToElement(page.emailboxcheckout).perform();
        Assert.assertTrue(page.emailboxcheckout.isDisplayed());
        Assert.assertTrue(page.emailboxcheckout.isSelected());


    }

    @Then("Home delivery and Pickup Location radio buttons are visible and selectable in the Shipping Address section.")
    public void radiobutton_visible_selectable() {
        Actions radiobutton = new Actions(Driver.getDriver());
        radiobutton.moveToElement(page.homedeliveryradiobutton).click().perform();
        radiobutton.moveToElement(page.homedeliveryradiobutton).click().perform();
        Assert.assertTrue(page.homedeliveryradiobutton.isEnabled());
        Assert.assertTrue(page.pickuplocationradiobutton.isEnabled());
        Assert.assertTrue(page.homedeliveryradiobutton.isSelected());
        Assert.assertFalse(page.pickuplocationradiobutton.isSelected());


    }

    @Then("page related to the Order Link can be accessed")
    public void orderlink_visible_accessed() {

        String expectedUrl = "https://trendlifebuy.com/admin-report/order";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);


    }

    @Then("verified that the Type and Date are selectable")
    public void type_date_are_selectable() {

        Actions dateandtype = new Actions(Driver.getDriver());
        dateandtype.moveToElement(page.typelistfromorder).click().perform();
        dateandtype.moveToElement(page.datelistfromorder).click().perform();
        Assert.assertTrue(page.typelistfromorder.isSelected());
        Assert.assertTrue(page.datelistfromorder.isSelected());


    }

    @Then("Click order link")
    public void click_order_link() {
        Actions actn = new Actions(Driver.getDriver());
        ReusableMethods.bekle(2);
        actn.sendKeys(Keys.PAGE_DOWN).perform();

        page.orderlink.click();


    }

    @Then("Click Type Section")
    public void click_type_section() {
        page.clicktypelist.click();
        ReusableMethods.bekle(1);


    }
    @Then("Click Date Section")
    public void click_date_section () {
        page.datelistfromorder.click();
        ReusableMethods.bekle(1);

    }

    @Then("Verify Type and Date List from admin")
    public void verify_type_date() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.clicktypelist.isDisplayed());
        Assert.assertTrue(page.clickdatelist.isDisplayed());
    }

    @Then("Verify All Order")
    public void verify_all_order() {

        Assert.assertTrue(page.allorderadmin.isDisplayed());
        ReusableMethods.bekle(1);


    }

    @Then("Verify Pending Orders")
    public void verify_pending_order() {

        Actions pendingoerder = new Actions(Driver.getDriver());
        pendingoerder.moveToElement(page.pendingordersadmin).perform();
        Assert.assertTrue(page.pendingordersadmin.isDisplayed());
        ReusableMethods.bekle(1);


    }

    @Then("Verify Confirmed Order")
    public void verify_confirmed_order() {

        Actions confiremedorder = new Actions(Driver.getDriver());
        confiremedorder.moveToElement(page.confirmedordersadmin).perform();
        Assert.assertTrue(page.confirmedordersadmin.isDisplayed());
        ReusableMethods.bekle(1);


    }

    @Then("Verify Completed Orders")
    public void verify_completed_order() {
        Actions completedorders = new Actions(Driver.getDriver());
        completedorders.moveToElement(page.completedordersadmin).perform();

        Assert.assertTrue(page.completedordersadmin.isDisplayed());
        ReusableMethods.bekle(1);


    }

    @Then("Verify Inhouse Orders")
    public void verify_inhouse_order() {

        Actions inhouseorders = new Actions(Driver.getDriver());
        inhouseorders.moveToElement(page.inhouseorderadmin).perform();
        Assert.assertTrue(page.inhouseorderadmin.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @Then("Verify Today")
    public void verify_today() {

        Assert.assertTrue(page.todaydate.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Then("Verify Yesterday")
    public void verify_yesterday() {
        Actions yesterday = new Actions(Driver.getDriver());
        yesterday.moveToElement(page.yesterdaydate).perform();
        Assert.assertTrue(page.yesterdaydate.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @Then("Verify Last 7 Days")
    public void verify_last_sevendays () {
        Actions sevendays = new Actions(Driver.getDriver());
        sevendays.moveToElement(page.lastsevendate).perform();
        Assert.assertTrue(page.lastsevendate.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @Then("Verify Last 30 Days")
    public void verify_30_month() {
        Actions monthdays = new Actions(Driver.getDriver());
        monthdays.moveToElement(page.last30date).perform();
        Assert.assertTrue(page.last30date.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @Then("Verify This Month")
    public void verify_this_month() {
        Actions thismonth = new Actions(Driver.getDriver());
        thismonth.moveToElement(page.thismonthdate).perform();
        Assert.assertTrue(page.thismonthdate.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @Then("Verify Last Month")
    public void verify_last_month() {
        Actions lastmonth = new Actions(Driver.getDriver());
        lastmonth.moveToElement(page.lastmonthdate).perform();
        Assert.assertTrue(page.lastmonthdate.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @Then("Verify This Year")
    public void verify_this_year() {
        Actions thisyear = new Actions(Driver.getDriver());
        thisyear.moveToElement(page.thisyeardate).perform();
        Assert.assertTrue(page.thisyeardate.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @Then("Verify Last Year")
    public void verify_last_year() {
        Actions lastyear = new Actions(Driver.getDriver());
        lastyear.moveToElement(page.lastyeardate).perform();
        Assert.assertTrue(page.lastyeardate.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @Then("Verify Custom Range")
    public void verify_custom_range() {
        Actions customrange = new Actions(Driver.getDriver());
        customrange.moveToElement(page.customrangedate).perform();
        Assert.assertTrue(page.customrangedate.isDisplayed());
        ReusableMethods.bekle(1);

    }

@Then("verified that the desired date range can be selected manually.")
public void verify_select_manually () {
        Actions customedate = new Actions(Driver.getDriver());
        customedate.moveToElement(page.customrangedate).click().perform();
        ReusableMethods.bekle(2);
        customedate.moveToElement(page.datedate).click().perform();
        Assert.assertTrue(page.datedate.isDisplayed());







}
@Then("Verified today section correct date is shown in the Date TextBox")
    public void verify_today_show () {
        ReusableMethods.bekle(2);
        page.todaydate.click();
     String Startdate = page.startdate.getText();
     String Enddate = page.enddate.getText();
    Assert.assertEquals(Startdate,Enddate);







}
    @Then("Verified Yesterday section correct date is shown in the Date TextBox")
    public void verify_yesterday_show () {
        ReusableMethods.bekle(2);
        Actions yesterday = new Actions(Driver.getDriver());
        page.datelistfromorder.click();
        ReusableMethods.bekle(2);
        yesterday.moveToElement(page.yesterdaydate).click().perform();
        ReusableMethods.bekle(2);
        String Enddate = page.enddate.getText();
        String startdate = page.startdate.getText();

        Assert.assertEquals(Enddate,startdate);







    }
    @Then("Verified Last 7 day section correct date is shown in the Date TextBox")
    public void verify_last7day_show () {
        ReusableMethods.bekle(2);
        Actions lastseven = new Actions(Driver.getDriver());
        page.datelistfromorder.click();
        ReusableMethods.bekle(2);
        lastseven.moveToElement(page.lastsevendate).click().perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.startdate.isEnabled());







    }
    @Then("Verified Last 30 Day section correct date is shown in the Date TextBox")
    public void verify_last30day_show () {
        ReusableMethods.bekle(2);
        Actions last30 = new Actions(Driver.getDriver());
        page.datelistfromorder.click();
        ReusableMethods.bekle(2);
      last30.moveToElement(page.last30date).click().perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.startdate.isEnabled());
    }


    @Then("Verified This Month section correct date is shown in the Date TextBox")
    public void verify_thismonth_show () {
        ReusableMethods.bekle(2);
        Actions thismonth = new Actions(Driver.getDriver());
        page.datelistfromorder.click();
        ReusableMethods.bekle(2);
      thismonth.moveToElement(page.thismonthdate).click().perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.startdate.isEnabled());

    }

    @Then("Verified Last Month section correct date is shown in the Date TextBox")
    public void verify_lastmonth_show () {
        ReusableMethods.bekle(2);
        Actions lastmonth = new Actions(Driver.getDriver());
        page.datelistfromorder.click();
        ReusableMethods.bekle(2);
        lastmonth.moveToElement(page.lastmonthdate).click().perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.startdate.isEnabled());
    }

    @Then("Verified This Year section correct date is shown in the Date TextBox")
    public void verify_thisyear_show () {
        ReusableMethods.bekle(2);
        Actions thisyear = new Actions(Driver.getDriver());
        page.datelistfromorder.click();
        ReusableMethods.bekle(2);
     thisyear.moveToElement(page.thisyeardate).click().perform();
        ReusableMethods.bekle(2);


            Assert.assertTrue(page.startdate.isEnabled());
    }


    @Then("Verified Last Year section correct date is shown in the Date TextBox")
    public void verify_lastyear_show () {
        ReusableMethods.bekle(2);
        Actions lastyear = new Actions(Driver.getDriver());
        page.datelistfromorder.click();
        ReusableMethods.bekle(2);
        lastyear.moveToElement(page.lastyeardate).click().perform();
        ReusableMethods.bekle(2);

        Assert.assertTrue(page.startdate.isEnabled());
    }

    @Then("Click Search Button")
    public void click_search_button() {
        ReusableMethods.bekle(2);
        page.searchbutton.click();


    }

    @Then("Verify Date that the products are listed under the headings")
    public void verify_date (){
        Assert.assertTrue(page.dateordersearch.isDisplayed());
    }


    @Then("Verify Order ID that the products are listed under the headings")
    public void verify_order_id (){
        Assert.assertTrue(page.orderidsearch.isDisplayed());
    }

    @Then("Verify E mail that the products are listed under the headings")
    public void verify_e_mail (){
        Assert.assertTrue(page.emailorder.isDisplayed());
    }

    @Then("Verify Product QTY that the products are listed under the headings")
    public void verify_product_qty (){
        Assert.assertTrue(page.productqtyorder.isDisplayed());
    }
    @Then("Verify Total Amount that the products are listed under the headings")
    public void verify_total_amount (){
        Assert.assertTrue(page.orderstatusorder.isDisplayed());
    }

    @Then("Verify IS PAID that the products are listed under the headings")
    public void verify_is_paid (){
            Assert.assertTrue(page.ispaidorder.isDisplayed());

    }
    @Then("should be verified that it is possible to search in the Orders Lists from the Quick Search TextBox")
    public void verify_searchbox () {
        ReusableMethods.bekle(2);
        page.searchboxbutton.click();
        ReusableMethods.bekle(4);
        page.searchboxbutton.sendKeys("76");
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.searchboxbutton.isDisplayed());




    }

    @Then("Click This Month from Date list")
    public void select_this_moth () {
        page.datelistfromorder.click();
        ReusableMethods.bekle(2);
        page.thismonthdate.click();
        ReusableMethods.bekle(2);
    }

@Then("Click type and Date")
    public void click_type_and_date() {

        page.allorderlist.click();
        ReusableMethods.bekle(2);
        page.datelistfromorder.click();
        ReusableMethods.bekle(2);

}

    }

