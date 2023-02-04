package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ConfigReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US034_035_046_Page {

        public US034_035_046_Page(){

            PageFactory.initElements(Driver.getDriver(), this);
        }


        @FindBy(xpath = "//input[@id='text']")
        public WebElement emailBox;

        @FindBy(xpath = "//input[@id='password']")
        public WebElement passwordBox;

        @FindBy(xpath = "//span[@class='checkmark mr_15']")
        public WebElement rememberMeBox;

        @FindBy(xpath = "//button[@id='sign_in_btn']")
        public WebElement signInButton;

        @FindBy(xpath = "//div[@class='toast-title']")
        public WebElement welcomeMessage;

        @FindBy(css = "#sidebar_menu > li:nth-of-type(6) > .has-arrow")
        public WebElement productsTitle;

        @FindBy(xpath = "//a[contains(text(),'Product List')]")
        public WebElement productListLinkBut;

        @FindBy(xpath = "//h3[text()='Product List']")
        public WebElement productListWindow;

        @FindBy(xpath = "//a[@id='product_list_id']")
        public WebElement productListTabButton;

        @FindBy(xpath = "//a[@id='product_alert_id']")
        public WebElement alertListTabButton;

        @FindBy(xpath = "//h3[.='Alert List']")
        public WebElement alertListWindow;

        @FindBy(xpath = "//a[@id='product_stock_out_id']")
        public WebElement autofStockListTabButton;

        @FindBy(xpath = "//h3[.='Out Of Stock List']")
        public WebElement autofStockListWindow;

        @FindBy(xpath = "//a[@id='product_disabled_id']")
        public WebElement disableProductkListTabButton;

        @FindBy(xpath = "//h3[.='Disabled Product List']")
        public WebElement disableProductkListWindow;

        @FindBy(xpath = "//a[@id='product_sku_id']")
        public WebElement productBySKUListTabButton;

        @FindBy(xpath = "//h3[.='Product By SKU']")
        public WebElement productBySKUWindow;

        @FindBy(xpath = "//div[@id='mainProductTable_filter']//input[1]")
        public WebElement quickSearchBox;

        @FindBy(xpath = "//div[@id='mainProductTable_info']")
        public WebElement quickSearchResultInfo;

        @FindBy(xpath = "//table[@id='mainProductTable']//tr[1]//div[@class='slider round']")
        public WebElement productListStatusSlider;

        @FindBy(xpath = "//table[@id='mainProductTable']//input[@value='1']")
        public WebElement productListStatusSliderCheckBox;

        @FindBy(xpath = "//div[@id='toast-container']")
        public WebElement productStatusUpdateMessage;


        @FindBy(xpath = "//table[@id='mainProductTable']//tr[1]//div[@class='dropdown CRM_dropdown']")
        public WebElement product1ListActionSelectButton;

        @FindBy(xpath = "//span[@class='dtr-data']/div[@class='dropdown CRM_dropdown']")
        public WebElement product1ListActionSelectButtonPlus;

        @FindBy(xpath = "//table[@id='mainProductTable']//td[.='1']")
        public WebElement plusViewActionSelectButton;

        @FindBy(xpath = "(//a[@class='dropdown-item product_detail'])[1]")
        public WebElement product1ListActionSelectViewButton;

        @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']/a[.='View']")
        public WebElement product1ListActionSelectViewButtonPlus;

        @FindBy(xpath = "//h4[.='Exclusive Bag 1 Details']")
        public WebElement viewProductDetailsWindow;

        @FindBy(xpath = "//button[@class='close ']")
        public WebElement viewProductDetailsWindowCloseButton;

        @FindBy(xpath = "//a[@href='https://trendlifebuy.com/products/1/edit ']")
        public WebElement product1ListActionSelectEditButton;

        @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']/a[.='Edit']")
        public WebElement product1ListActionSelectEditButtonPlus;

        @FindBy(xpath = "(//div[@class='main-title d-md-flex'])[1]")
        public WebElement editProductPageWindow;

        @FindBy(xpath = "(//h3[@class='mb-2 mr-30'])[1]")
        public WebElement editProductInformationTitle;

        @FindBy(xpath = "//a[.='General Information']")
        public WebElement editProductGeneralInformationTabButton;

        @FindBy(xpath = "//a[.='Related Product']")
        public WebElement editProductRelatedProductTabButton;

        @FindBy(xpath = "(//input[@class=\"primary_input_field\"])[17]")
        public WebElement editProductRelatedProductQuickSearchBox;

        @FindBy(xpath = "//input[@id='relatedProductAll']")
        public WebElement relatedProductQuickSearchResultTickAllProducts;

        @FindBy(xpath = "//a[.='Up Sale']")
        public WebElement editProductUpSaleTabButton;

        @FindBy(xpath = "(//input[@class=\"primary_input_field\"])[18]")
        public WebElement editProductUpSaleQuickSearchBox;

        @FindBy(xpath = "//input[@id='upSaleAll']")
        public WebElement upSaleQuickSearchResultTickAllProducts;

        @FindBy(xpath = "//a[.='Cross sale']")
        public WebElement editProductCrossSaleTabButton;

        @FindBy(xpath = "(//input[@class=\"primary_input_field\"])[19]")
        public WebElement editProductCrossSaleQuickSearchBox;

        @FindBy(xpath = "//input[@id='crossSaleAll']")
        public WebElement crossSaleQuickSearchResultTickAllProducts;

        @FindBy(xpath = "//input[@id='single_prod']")
        public WebElement editProductSingleCheckBoxButton;

        @FindBy(xpath = "//input[@id='variant_prod']")
        public WebElement editProductVariantCheckBoxButton;

        @FindBy(xpath = "//div[@class='toast-title']")
        public WebElement editAndCloneProductUpdateSuccessMessage;

        @FindBy(xpath = "//a[@href='https://trendlifebuy.com/products/1/clone ']")
        public WebElement product1ListActionSelectCloneButton;

        @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']/a[.='Clone']")
        public WebElement product1ListActionSelectCloneButtonPlus;

        @FindBy(xpath = "//h3[.='Clone Product']")
        public WebElement cloneProductPageWindow;

        @FindBy(xpath = "//input[@id='product_name']")
        public WebElement productInformationNAMETextBox;

        @FindBy(xpath = "//input[@id='sku_single']")
        public WebElement productInformationPRODUCTSKUTextBox;

        @FindBy(xpath = "(//input[@class=\"primary_input_field\"])[3]")
        public WebElement productInformationSUBTITLE1TextBox;

        @FindBy(xpath = "(//input[@class=\"primary_input_field\"])[5]")
        public WebElement productInformationMODELNUMBERTextBox;

        @FindBy(xpath = "//select[@id='category_id']")
        public WebElement productInformationCATEGORYTextBox;

        @FindBy(xpath = "//div[@id='brand_select_div']//span[@class='select2-selection select2-selection--single']")
        public WebElement productInformationBRANDTextBox;

        @FindBy(xpath = "/html/body/span/span/span[1]/input")
        public WebElement productInformationBRANDSearchBox;

        @FindBy(xpath = "//li[.='OzVittoria']")
        public WebElement productInformationBRANDSelectOzVittoria;

        @FindBy(xpath = "//div[@class='nice-select primary_select mb-15 unit']")
        public WebElement productInformationUNITDropDownTextBox;

        @FindBy(xpath = "(//input[@class=\"nice-select-search\"])[2]")
        public WebElement productInformationUNITSelectTitleSearchBox;

        @FindBy(xpath = "//li[.='LOT']")
        public WebElement productInformationUNITSelectLOT;

        @FindBy(xpath = "//div[.='C39C39C39+C39EC39E+C93I25POSTNETEAN2EAN5PHARMA2T']")
        public WebElement productInformationBARCODEAnySelectBox;

        @FindBy(xpath = "(//input[@class=\"nice-select-search\"])[3]")
        public WebElement productInformationBARCODESelectTitleSearchBox;

        @FindBy(xpath = "//li[.='C39E+']")
        public WebElement productInformationUNITSelectC39E;

        @FindBy(xpath = "//input[@id='minimum_order_qty']")
        public WebElement productInformationMINORDERQTYBox;

        @FindBy(xpath = "//input[@name='max_order_qty']")
        public WebElement productInformationMAXORDERQTYBox;

        @FindBy(xpath = "//div[@class='bootstrap-tagsinput']/input[1]")
        public WebElement productInformationTAGSBox;

        @FindBy(xpath = "//*[@id=\"GenaralInfo\"]/div/div[2]/div/div[1]/div[2]/div/div[1]/button/label")
        public WebElement productImageBrowseButton;

        @FindBy(xpath = "//a[@id='product_request_id']")
        public WebElement productImageUploadNewButton;

        @FindBy(xpath = "//div[@class='uppy-Dashboard-AddFiles']/input[1]")
        public WebElement productImageBrowseFileLinkButton;

        @FindBy(css = ".uppy-u-reset")
        public WebElement productImageDoneButton;

        @FindBy(xpath = "//a[@id='product_list_id']")
        public WebElement productImageSelectFileButton;

        @FindBy(xpath = "//li[@class='m-0']//span[@class='checkmark']")
        public WebElement productImageSelectOnlyCheckBoxButton;

        @FindBy(xpath = "//input[@id='selected_only']")
        public WebElement productImageSelectOnlyCheckBoxButtonInput;

        @FindBy(xpath = "//div[@class='modal_file_box']")
        public WebElement productImageSelectOnlyFiles;

        @FindBy(xpath = "//div[@class='nice-select primary_select max_340px']")
        public WebElement productImageSelectSortByBox;

        @FindBy(xpath = "(//input[@class='nice-select-search'])[10]")
        public WebElement productImageSelectSortBySearchBox;

        @FindBy(xpath = "//li[@class='option selected focus']")
        public WebElement productImageSelectSortBySearchBoxSelect;

        @FindBy(xpath = "//button[.='Add files']")
        public WebElement productImageAddFilesButton;

        @FindBy(xpath = "//input[@id='thumbnail_image_file']")
        public WebElement productImageBrowseFileTextBox;

        @FindBy(xpath = "//*[@id=\"pdf_place1\"]")
        public WebElement productPdfSpecificationsBrowseBox;

        @FindBy(xpath = "//select[@id='video_provider']")
        public WebElement productVideoProviderBox;

        @FindBy(xpath = "//input[@name='video_link']")
        public WebElement productVideoLinkTextBox;

        @FindBy(xpath = "(//*[@id=\"theme_nav\"]/li[1]/label/span)[3]")
        public WebElement productStatusCheckBoxPublish;

        @FindBy(xpath = "(//*[@id=\"status_active\"])[1]")
        public WebElement productStatusCheckBoxPublishIsSelect;

        @FindBy(xpath = "(//*[@id=\"status_inactive\"])[1]")
        public WebElement productStatusCheckBoxPendingIsSelect;

        @FindBy(xpath = "(//*[@id=\"theme_nav\"]/li[2]/label/span)[2]")
        public WebElement productStatusCheckBoxPending;

        @FindBy(xpath = "(//*[@id=\"theme_nav\"]/li[1]/label/span)[4]")
        public WebElement productMakeDisplayDetailsCheckBoxUpSale;

        @FindBy(xpath = "(//*[@id=\"status_active\"])[2]")
        public WebElement productMakeDisplayDetailsCheckBoxUpSaleIsSelect;

        @FindBy(xpath = "(//*[@id=\"theme_nav\"]/li[2]/label/span)[3]")
        public WebElement productMakeDisplayDetailsCheckBoxCrossSale;

        @FindBy(xpath = "(//*[@id=\"status_inactive\"])[2]")
        public WebElement productMakeDisplayDetailsCheckBoxCrossSaleIsSelect;

        @FindBy(xpath = "//input[@id='weight']")
        public WebElement productWeightHeightInfoWeight;

        @FindBy(xpath = "//input[@id='length']")
        public WebElement productWeightHeightInfoLength;

        @FindBy(xpath = "//input[@id='breadth']")
        public WebElement productWeightHeightInfoBreadth;

        @FindBy(xpath = "//input[@id='height']")
        public WebElement productWeightHeightInfoHeight;

        @FindBy(xpath = "//input[@name='additional_shipping']")
        public WebElement productWeightHeightInfoAdditionalShipping;

        @FindBy(xpath = "//input[@id='selling_price']")
        public WebElement productWeightHeightInfoSellingPrice;

        @FindBy(xpath = "//input[@id='discount']")
        public WebElement productWeightHeightInfoDiscount;

        @FindBy(xpath = "//div[.='NoYesNo']")
        public WebElement productWeightHeightInfoStockManage;

        @FindBy(xpath = "//li[.='Yes']")
        public WebElement productWeightHeightInfoStockManageYES;

        @FindBy(xpath = "//input[@id='single_stock']")
        public WebElement productWeightHeightInfoProductStockTextBox;

        @FindBy(xpath = "//div[.='AmountAmountPercentage']")
        public WebElement productWeightHeightInfoDiscountType;

        @FindBy(xpath = "//li[.='Percentage']")
        public WebElement productWeightHeightInfoDiscountTypePercentage;

        @FindBy(xpath = "//div[.='Select OneSelect Onevat1']")
        public WebElement productWeightHeightInfoTaxType;

        @FindBy(xpath = "//li[.='vat1']")
        public WebElement productWeightHeightInfoTaxTypeVat1;

        @FindBy(xpath = "(//div[@class=\"note-editable card-block\"])[1]")
        public WebElement productDescriptionTextBox;

        @FindBy(xpath = "(//div[@class=\"note-editable card-block\"])[2]")
        public WebElement productSpecificationsTextBox;

        @FindBy(xpath = "(//input[@class=\"primary_input_field\"])[15]")
        public WebElement productSEOInfoMetaTitleTextBox;

        @FindBy(xpath = "//textarea[@id=\"meta_description\"]")
        public WebElement productSEOInfoMetaDescriptionTextBox;

        @FindBy(xpath = "//button[@class='primary_btn_2 mt-5 text-center saveBtn']")
        public WebElement editAndCloneProductUpdateAndSaveButton;

        @FindBy(xpath = "//div[@class='alert alert-warning mt-30 text-center']")
        public WebElement cloneProductUnderPageAlertWarningMessage;

        @FindBy(xpath = "//div[@id='mainProductTable_filter']//input[1]")
        public WebElement productListQuickSearchBox;

        @FindBy(xpath = "//table[@id='mainProductTable']//tr[2]//button[@class='btn btn-secondary dropdown-toggle']")
        public WebElement productListQuickSearchBoxProductTwoSelect;

        @FindBy(xpath = "//table[@id='mainProductTable']//td[.='2']")
        public WebElement plusQuickSearchActionSelectButton2;

        @FindBy(xpath = "//span[@class='dtr-data']//button[@class='btn btn-secondary dropdown-toggle']")
        public WebElement productListQuickSearchBoxProductTwoSelectPlus;

        @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']/a[.='Delete']")
        public WebElement productListQuickSearchBoxProductTwoDeleteLinkBut;

        @FindBy(xpath = "//form[@id='product_delete_form']/input[@id='dataDeleteBtn']")
        public WebElement productListAlertDeleteButton;

        @FindBy(xpath = "//div[@class='toast-message']")
        public WebElement productListDeleteProductSuccessMessage;





        /*********************************************    SECOND SPLINT   *****************************************************/

        @FindBy(xpath = "//span[.='Admin Reports']")
        public WebElement adminReportsLinkButton;

        @FindBy(xpath = "//a[.='Top selling item']")
        public WebElement adminReportsTopSellingItemLinkButton;

        @FindBy(xpath = "//div[@class='main-title d-md-flex']")
        public WebElement adminReportsTopSellingItemWindow;

        @FindBy(css = "[placeholder='Quick Search']")
        public WebElement topSellingItemQuickSearchBox;

        @FindBy(xpath = "//td[@class='dataTables_empty']")
        public WebElement topSellingItemQuickSearchBoxResult;

        @FindBy(xpath = "//div[@id='visitorTable_info']")
        public WebElement topSellingItemResultTableInfo;

        @FindBy(xpath = "//i[@class='ti-arrow-right']")
        public WebElement topSellingItemNextPageButton;

        @FindBy(xpath = "//i[@class='ti-arrow-left']")
        public WebElement topSellingItemPreviousPageButton;


        public void GetChromeOptions()
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("Zoom 90%");

        }

        public void myLoginMethod() {

            emailBox.sendKeys(ConfigReader.getProperty("adminyakupmail"));
            passwordBox.sendKeys(ConfigReader.getProperty("password"));
            rememberMeBox.click();

            JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
            javaScript.executeScript("arguments[0].scrollIntoView();", signInButton);
            signInButton.click();

        }

    /*public void dataYazdir(int satir, int sutun) {

        String dataXpathi= "//table//tr["+satir+"]/td["+sutun+"]";
        WebElement arananData= driver.findElement(By.xpath(dataXpathi));
        System.out.println(satir + ".satir, "+ sutun+ ".ci sutundaki data : " + arananData.getText());

    }

     */


}

