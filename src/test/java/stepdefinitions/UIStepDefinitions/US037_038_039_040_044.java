package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.apache.velocity.util.introspection.VelPropertySet;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US037_038_039_040_044_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US037_038_039_040_044 {

    US037_038_039_040_044_Page life= new US037_038_039_040_044_Page();

    @Then("Admin clicks Wallet Manage link")
    public void admin_clicks_wallet_manage_link() {
        life.walletManage.click();
    }

    @Then("Admin clicks Offline Recharge link")
    public void admin_clicks_offline_recharge_link() {life.offlineRecharge.click();}


    @Then("Admin verifies that Offline Recharge List is displayed on the Offline Recharge Page")
    public void admin_verifies_that_offline_recharge_list_is_displayed_on_the_offline_recharge_page() {
        Assert.assertTrue(life.offlineRechargeList.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to SL information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_sl_information_in_the_offline_recharge_list() {
        Assert.assertTrue(life.informationSL.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Date information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_date_information_in_the_offline_recharge_list() {
        Assert.assertTrue(life.informationDate.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Email information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_email_information_in_the_offline_recharge_list() {
        Assert.assertTrue(life.informationEmail.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to TXN ID information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_txn_id_information_in_the_offline_recharge_list() {
        Assert.assertTrue(life.informationTxnId.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Amount information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_amount_information_in_the_offline_recharge_list() {
        Assert.assertTrue(life.informationAmount.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Type information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_type_information_in_the_offline_recharge_list() {
        Assert.assertTrue(life.informationType.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Payment Method information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_payment_method_information_in_the_offline_recharge_list() {
        Assert.assertTrue(life.informationPaymentMethod.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Approval information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_approval_information_in_the_offline_recharge_list() {
        Assert.assertTrue(life.informationApproval.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Action information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_action_information_in_the_offline_recharge_list() {
        Assert.assertTrue(life.informationAction.isDisplayed());
    }

    @Then("Admin verifies that transactions can be filtered according to SL information")
    public void admin_verifies_that_transactions_can_be_filtered_according_to_sl_information() {
        life.informationSL.click();
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that transactions can be filtered according to Date information")
    public void admin_verifies_that_transactions_can_be_filtered_according_to_date_information() {
        life.informationDate.click();
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that transactions can be filtered according to TXN ID information")
    public void admin_verifies_that_transactions_can_be_filtered_according_to_txn_id_information() {
        life.informationTxnId.click();
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that transactions can be filtered according to Amount information")
    public void admin_verifies_that_transactions_can_be_filtered_according_to_amount_information() {
        life.informationAmount.click();
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that transactions can be filtered according to Type information")
    public void admin_verifies_that_transactions_can_be_filtered_according_to_type_information() {
        life.informationType.click();
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that transactions can be filtered according to Payment Method information")
    public void admin_verifies_that_transactions_can_be_filtered_according_to_payment_method_information() {
        life.informationPaymentMethod.click();
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that transactions can be filtered according to Approval information")
    public void admin_verifies_that_transactions_can_be_filtered_according_to_approval_information() {
        life.informationApproval.click();
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that transactions can be filtered according to Action information")
    public void admin_verifies_that_transactions_can_be_filtered_according_to_action_information() {
        life.informationAction.click();
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that transactions can be filtered according to Email information")
    public void admin_verifies_that_transactions_can_be_filtered_according_to_email_information() {
        life.informationEmail.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().alert().accept();
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that the Offline Recharge Transaction List can be searched with the Quick Search TextBox")
    public void admin_verifies_that_the_offline_recharge_transaction_list_can_be_searched_with_the_quick_search_text_box() {
        life.quickOfflineRecharge.sendKeys("22nd");
        Assert.assertTrue(life.filter22ndDec2022.isDisplayed());
    }

    @Then("Admin verifies that the balance can be changed offline with the Offline Recharge button")
    public void admin_verifies_that_the_balance_can_be_changed_offline_with_the_offline_recharge_button() {
        life.offlineRechargeButton.click();
        life.nameButton.click();
        life.selectOne.click();
        life.amountRecharge.sendKeys("1725");
        life.anyComment.sendKeys("17-25");
        life.continueButton.click();
        Assert.assertTrue(life.verifyBalance.isDisplayed());
    }

    @Then("Admin clicks Admin Reports link")
    public void admin_clicks_admin_reports_link() {
        life.adminReportsLink.click();
    }

    @Then("Admin clicks Keywords Search link")
    public void admin_clicks_keywords_search_link() {
        life.keywordsSearchLink.click();
    }

    @Then("Admin verifies that the Keyword Search List can be searched with Quick Search TextBox")
    public void admin_verifies_that_the_keyword_search_list_can_be_searched_with_quick_search_text_box() {
        life.quickKeywordSearch.sendKeys("computer");
        Assert.assertTrue(life.verifyQuickSearchBox.isDisplayed());
    }

    @Then("Admin verifies that there is a Keyword search report List in the Admin Reports - Keywords Search page")
    public void admin_verifies_that_there_is_a_keyword_search_report_list_in_the_admin_reports_keywords_search_page() {
        Assert.assertTrue(life.keywordSearchReportList.isDisplayed());
    }

    @Then("Admin verifies that Keywords is included in the Search Report List")
    public void admin_verifies_that_keywords_is_included_in_the_search_report_list() {
        Assert.assertTrue(life.keywords.isDisplayed());
    }

    @Then("Admin verifies that Number of Time is included in the Search Report List")
    public void admin_verifies_that_number_of_time_is_included_in_the_search_report_list() {
        Assert.assertTrue(life.numberOfTime.isDisplayed());
    }

    @Then("Admin verifies that it is possible to switch between the pages in the Keyword Search Report List")
    public void admin_verifies_that_it_is_possible_to_switch_between_the_pages_in_the_keyword_search_report_list() {
        Assert.assertTrue(life.switchPageKeywordSearch.isEnabled());
    }

    @Then("Admin verifies that there is a maximum of {int} keyword information on each page in Keyword search report list")
    public void adminVerifiesThatThereIsAMaximumOfKeywordInformationOnEachPageInKeywordSearchReportList(int arg0) {
        //Assert.assertTrue(life.numberOfRows.getSize(),10);
        Assert.assertTrue(life.verify10.isDisplayed());
    }

    @Then("Admin clicks Visitor link")
    public void admin_clicks_visitor_link() {
        life.visitorLink.click();
    }
    @Then("Admin verifies that Visitor Report List is visible")
    public void admin_verifies_that_visitor_report_list_is_visible() {
        Assert.assertTrue(life.visitorReportList.isDisplayed());
    }

    @Then("Admin verifies that it is possible to search Visitor Report List with Quick Search TextBox")
    public void adminVerifiesThatItIsPossibleToSearchVisitorReportListWithQuickSearchTextBox() {
        life.quickVisitorReport.sendKeys("Texas");
        Assert.assertTrue(life.verifyVisitorQuickSBox.isDisplayed());
    }

    @Then("Admin verifies that IP information is listed in the Visitor Report List")
    public void admin_verifies_that_ip_information_is_listed_in_the_visitor_report_list() {
        Assert.assertTrue(life.ipInformation.isDisplayed());
    }
    @Then("Admin verifies that Agent information is listed in the Visitor Report List")
    public void admin_verifies_that_agent_information_is_listed_in_the_visitor_report_list() {
        Assert.assertTrue(life.agentInformation.isDisplayed());
    }
    @Then("Admin verifies that Device information is listed in the Visitor Report List")
    public void admin_verifies_that_device_information_is_listed_in_the_visitor_report_list() {
        Assert.assertTrue(life.deviceInformation.isDisplayed());
    }
    @Then("Admin verifies that Location information is listed in the Visitor Report List")
    public void admin_verifies_that_location_information_is_listed_in_the_visitor_report_list() {
        Assert.assertTrue(life.locationInformation.isDisplayed());
    }
    @Then("Admin verifies that Date information is listed in the Visitor Report List")
    public void admin_verifies_that_date_information_is_listed_in_the_visitor_report_list() {
        Assert.assertTrue(life.dateInformation.isDisplayed());
    }

    @Then("Admin verifies that it is possible to switch between the pages in the Visitor Report List")
    public void adminVerifiesThatItIsPossibleToSwitchBetweenThePagesInTheVisitorReportList() {
        Assert.assertTrue(life.switchVisitorReport.isEnabled());
    }

    @Then("Admin verifies that there is a maximum of {int} keyword information on each page in the Visitor Report List")
    public void adminVerifiesThatThereIsAMaximumOfKeywordInformationOnEachPageInTheVisitorReportList(int arg0) {
        Assert.assertTrue(life.verify10visitor.isDisplayed());
    }

    @Then("Admin clicks Support Ticket link")
    public void admin_clicks_support_ticket_link() {
        life.supportTicketLink.click();
    }
    @Then("Admin clicks My Ticket link")
    public void admin_clicks_my_ticket_link() {
        life.myTicketLink.click();
    }
    @Then("Admin verifies that My Ticket link directs to the relevant page")
    public void admin_verifies_that_my_ticket_link_directs_to_the_relevant_page() {
        Assert.assertTrue(life.ticketList.isDisplayed());
    }

    @Then("Admin verifies that Select One is selectable from the Category Tab in the My Ticket Page")
    public void admin_verifies_that_select_one_is_selectable_from_the_category_tab_in_the_my_ticket_page() {
        life.category.click();
        Assert.assertTrue(life.categorySelectOne.isEnabled());
    }
    @Then("Admin verifies that Installation is selectable from the Category Tab in the My Ticket Page")
    public void admin_verifies_that_installation_is_selectable_from_the_category_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.categoryInstallation.isEnabled());
    }
    @Then("Admin verifies that Technical is selectable from the Category Tab in the My Ticket Page")
    public void admin_verifies_that_technical_is_selectable_from_the_category_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.categoryTechnical.isEnabled());
    }
    @Then("Admin verifies that Others is selectable from the Category Tab in the My Ticket Page")
    public void admin_verifies_that_others_is_selectable_from_the_category_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.categoryOthers.isEnabled());
    }

    @Then("Admin verifies that Select One is selectable from the Priority Tab in the My Ticket Page")
    public void admin_verifies_that_select_one_is_selectable_from_the_tab_in_the_my_ticket_page() {
        life.priority.click();
        Assert.assertTrue(life.prioritySelectOne.isEnabled());
    }
    @Then("Admin verifies that High is selectable from the Priority Tab in the My Ticket Page")
    public void admin_verifies_that_installation_is_selectable_from_the_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.priorityHigh.isEnabled());
    }
    @Then("Admin verifies that Medium is selectable from the Priority Tab in the My Ticket Page")
    public void admin_verifies_that_technical_is_selectable_from_the_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.priorityMedium.isEnabled());
    }
    @Then("Admin verifies that Low is selectable from the Priority Tab in the My Ticket Page")
    public void admin_verifies_that_others_is_selectable_from_the_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.priorityLow.isEnabled());
    }

    @Then("Admin verifies that Select One is selectable from the Status Tab in the My Ticket Page")
    public void admin_verifies_that_select_one_is_selectable_from_the_status_tab_in_the_my_ticket_page() {
        life.status.click();
        Assert.assertTrue(life.statusSelectOne.isEnabled());
    }
    @Then("Admin verifies that Pending is selectable from the Status Tab in the My Ticket Page")
    public void admin_verifies_that_pending_is_selectable_from_the_status_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.statusPending.isEnabled());
    }
    @Then("Admin verifies that On Going is selectable from the Status Tab in the My Ticket Page")
    public void admin_verifies_that_on_going_is_selectable_from_the_status_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.statusOnGoing.isEnabled());
    }
    @Then("Admin verifies that Completed is selectable from the Status Tab in the My Ticket Page")
    public void admin_verifies_that_completed_is_selectable_from_the_status_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.statusCompleted.isEnabled());
    }
    @Then("Admin verifies that Closed is selectable from the Status Tab in the My Ticket Page")
    public void admin_verifies_that_closed_is_selectable_from_the_status_tab_in_the_my_ticket_page() {
        Assert.assertTrue(life.statusClosed.isEnabled());
    }

    @Then("Admin verifies Ticket List can be created according to the filtering made from Category tab")
    public void admin_verifies_ticket_list_can_be_created_according_to_the_filtering_made_from_category_tab() {
        life.category.click();
        life.categoryInstallation.click();
        life.search.click();
        Assert.assertTrue(life.afterSearch.isDisplayed());
    }
    @Then("Admin verifies Ticket List can be created according to the filtering made from Priority tab")
    public void admin_verifies_ticket_list_can_be_created_according_to_the_filtering_made_from_priority_tab() {
        life.priority.click();
        life.priorityHigh.click();
        life.search.click();
        Assert.assertTrue(life.afterSearch.isDisplayed());
    }
    @Then("Admin verifies Ticket List can be created according to the filtering made from Status tab")
    public void admin_verifies_ticket_list_can_be_created_according_to_the_filtering_made_from_status_tab() {
        life.status.click();
        life.statusPending.click();
        life.search.click();
        Assert.assertTrue(life.afterSearch.isDisplayed());
    }

    @Then("Admin verifies that the Tickets can be listed under the Subject heading")
    public void admin_verifies_that_the_tickets_can_be_listed_under_the_subject_heading() {
        Assert.assertTrue(life.subject.isDisplayed());
    }

    @Then("Admin verifies that the Tickets can be listed under the Category heading")
    public void admin_verifies_that_the_tickets_can_be_listed_under_the_category_heading() {
        Assert.assertTrue(life.category2.isDisplayed());
    }

    @Then("Admin verifies that the Tickets can be listed under the User Name heading")
    public void admin_verifies_that_the_tickets_can_be_listed_under_the_user_name_heading() {
        Assert.assertTrue(life.userName.isDisplayed());
    }

    @Then("Admin verifies that the Tickets can be listed under the Priority heading")
    public void admin_verifies_that_the_tickets_can_be_listed_under_the_priority_heading() {
        Assert.assertTrue(life.priority2.isDisplayed());
    }

    @Then("Admin verifies that the Tickets can be listed under the User Agent heading")
    public void admin_verifies_that_the_tickets_can_be_listed_under_the_user_agent_heading() {
        Assert.assertTrue(life.userAgent.isDisplayed());
    }

    @Then("Admin verifies that the Tickets can be listed under the Status heading")
    public void admin_verifies_that_the_tickets_can_be_listed_under_the_status_heading() {
        Assert.assertTrue(life.status2.isDisplayed());
    }

    @Then("Admin verifies that the Tickets can be listed under the Action heading")
    public void admin_verifies_that_the_tickets_can_be_listed_under_the_action_heading() {
        Assert.assertTrue(life.action.isDisplayed());
    }

    // 2nd Sprint
    @Then("Admin clicks Wallet Recharge History link")
    public void admin_clicks_wallet_recharge_history_link() {
        life.walletRechargeHistory.click();
    }
    @Then("Admin verifies that Wallet Recharge transactions are shown in Wallet Recharge History List")
    public void admin_verifies_that_wallet_recharge_transactions_are_shown_in_wallet_recharge_history_list() {
        Assert.assertTrue(life.walletRechargeHistoryList.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed under User information")
    public void admin_verifies_that_transactions_are_listed_under_user_information() {
        Assert.assertTrue(life.userRechargeHistory.isDisplayed());
    }
    @Then("Admin verifies that transactions are listed under Email information")
    public void admin_verifies_that_transactions_are_listed_under_email_information() {
        Assert.assertTrue(life.emailRechargeHistory.isDisplayed());
    }
    @Then("Admin verifies that transactions are listed under Type information")
    public void admin_verifies_that_transactions_are_listed_under_type_information() {
        Assert.assertTrue(life.typeRechargeHistory.isDisplayed());
    }
    @Then("Admin verifies that transactions are listed under Amount information")
    public void admin_verifies_that_transactions_are_listed_under_amount_information() {
        Assert.assertTrue(life.amountRechargeHistory.isDisplayed());
    }
    @Then("Admin verifies that transactions are listed under Payment Details information")
    public void admin_verifies_that_transactions_are_listed_under_payment_information() {
        Assert.assertTrue(life.paymentDetailsRechargeHistory.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed under TRX ID information")
    public void admin_verifies_that_transactions_are_listed_under_trx_id_information() {
        Assert.assertTrue(life.trxIdRechargeHistory.isDisplayed());
    }
    @Then("Admin verifies that transactions are listed under Date information")
    public void admin_verifies_that_transactions_are_listed_under_date_information() {
        Actions actions= new Actions(Driver.getDriver());
        if (life.plus1.isDisplayed()){
            actions.moveToElement(life.plus1);
            actions.click(life.plus1).perform();

        } else {
            // actions.moveToElement(life.plus1);
            // actions.click(life.plus1);
            Assert.assertTrue(life.dateRechargeHistory.isDisplayed());
        }
    }

    @Then("Admin verifies that there are transitions between pages")
    public void admin_verifies_that_there_are_transitions_between_pages() {
        Assert.assertTrue(life.transitionPages2RechargeHistory.isDisplayed());
    }

}
