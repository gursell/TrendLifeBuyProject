package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US006_007_008_009_010_045_049_Page {
    public US006_007_008_009_010_045_049_Page(){
      PageFactory.initElements(Driver.getDriver(),this);
    }
    // Home Page
    @FindBy(xpath = "//div[@class='newsletter_form_inner']")
    public WebElement firstAlertMailLevent;
    // Home Page
    @FindBy(xpath = "(//div[@class='close_modal'])[1]")
    public WebElement firstAlertMailCloseLevent;
    // Home Page => Login Page => Click Here Link (Next to the "Forgot Password?" text)
    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/password/reset']")
    public WebElement clickHereLink;
    // Home Page => Login Page => Click Here Link => Forgot Password Page
    @FindBy(xpath = "//p[@class='support_text']")
    public WebElement forgotPasswordPageText;
    // Home Page => Login Page => SignUp Link (Next to the "Don’t have an Account?" text)
    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/password/reset']")
    public WebElement signUpDontHaveAnAccountLink;
    // Home Page => Login Page => SignUp Link => Register Page
    @FindBy(xpath = "//h3[@class='m-0']")
    public WebElement registerPageText;
    // Home Page => Login Page => Sign In => Login Page
    @FindBy(xpath = "//a[@class='log_out']")
    public WebElement logOutButton;
    // Home Page => Login Page => Sign In => Login Page
    @FindBy(xpath = "//div[text()='Logged In Successfully!']")
    public WebElement logInPopUpMessage;
    // Home Page => Login Page => Sign In Page
    @FindBy(xpath = "//span[text()='These credentials do not match our records.']")
    public WebElement wrongLogInPopUpMessage;
    // Home Page => Login Page => Sign In Page => Remember Me Box
    @FindBy(xpath = "//span[@class='checkmark mr_15']")
    public WebElement rememberMeBox;
    // Home Page => Login Page => Sign In Page => Sign up with Google Button
    @FindBy(xpath = "//h5[text()='Sign up with Google']")
    public WebElement signUpWithGoogle;
    // Home Page => Login Page => Sign In Page => Sign up with Facebook Button
    @FindBy(xpath = "//h5[text()='Sign up with Facebook']")
    public WebElement signUpWithFacebook;
    // Home Page => Register link
    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/register']")
    public WebElement registerLink;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameBox;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameBox;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "//input[@name='email']")
    public WebElement eMailBox;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "//input[@name='password_confirmation']")
    public WebElement confirmPasswordBox;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "//p[text()='By signing up, you agree to  Terms of Service and Privacy Policy']")
    public WebElement privacyPolicyCheckBox;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signUpButtonRegisterPage;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "//span[text()='The email must be a valid email address.']")
    public WebElement emailMustBeValidMessageText;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "(//span[@class='text-danger'])[5]")
    public WebElement passwordMustBeValidMessageText;
    // Home Page => Register link => Register Page
    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/login']")
    public WebElement signInLinkRegisterPage;
    // Home Page => Track Your Order Link
    @FindBy(xpath = "//span[text()='Track Your Order']")
    public WebElement trackYourOrderLink;
    // Home Page => Track Your Order Link => Track Order Page
    @FindBy(xpath = "//input[@id='order_number']")
    public WebElement trackYourOrderBox;
    // Home Page => Track Your Order Link => Track Order Page
    @FindBy(xpath = "//button[text()='Track Now']")
    public WebElement trackNowButton;
    // Home Page => Track Your Order Link => Track Order Page => Order Page
    @FindBy(xpath = "//p[text()=' 68221222021152']")
    public WebElement orderIDUser;
    // Home Page => Track Your Order Link => Track Order Page => Order Page
    @FindBy(xpath = "//p[text()=' 49221222014947']")
    public WebElement orderIDGuest;
    // Home Page => Track Your Order Link => Track Order Page => Order Page
    @FindBy(xpath = "//h4[text()='Order ID:  ']")
    public WebElement orderIDTitle;
    // Home Page => Compare Button
    @FindBy(xpath = "//span[text()='Compare(']")
    public WebElement compareButton;
    // Home Page => Compare Button => Compare Page
    @FindBy(xpath = "//h3[text()='Product compare']")
    public WebElement productCompareText;
    // Home Page => Compare Button => Compare Page
    @FindBy(xpath = "//a[text()='Reset Compare']")
    public WebElement resetCompareLink;
    // Home Page => Compare Button => Compare Page
    @FindBy(xpath = "//h4[text()='Compare list is empty.']")
    public WebElement compareListIsEmptyText;
    // Home Page => Compare Button => Compare Page => Home Link
    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeLink;
    // Home Page => First Compare Icon
    @FindBy(xpath = "(//i[@class='ti-control-shuffle'])[1]")
    public WebElement firstCompareIcon;
    // Home Page => Second Compare Icon
    @FindBy(xpath = "(//i[@class='ti-control-shuffle'])[2]")
    public WebElement secondCompareIcon;
    // Home Page => Third Compare Icon
    @FindBy(xpath = "(//i[@class='ti-control-shuffle'])[3]")
    public WebElement thirdCompareIcon;
    // Home Page => Cart Button
    @FindBy(xpath = "(//span[text()='Cart ('])[1]")
    public WebElement cartButton;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//i[@class='ti-plus'])[1]")
    public WebElement firstTiPlus;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//i[@class='ti-minus'])[1]")
    public WebElement firstTiMinus;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//i[@class='ti-plus'])[2]")
    public WebElement secondTiPlus;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//i[@class='ti-minus'])[2]")
    public WebElement secondTiMinus;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "//h4[@class='font_16 f_w_700 m-0 text-nowrap set_base_price558']")
    public WebElement firstUnitPrice;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//span[@class='green_badge text-nowrap'])[2]")
    public WebElement secondUnitPrice;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//div[@class='single_total_right'])[3]")
    public WebElement amountOfDiscount;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "//h4[text()='Discount']")
    public WebElement discount;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//h4[text()='Subtotal'])[2]")
    public WebElement subtotal;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "//h4[text()='Shipping Charge']")
    public WebElement shippingCharge;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "//h4[text()='VAT/TAX/GST']")
    public WebElement VAT_TAX_GST;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//span[text()='Total'])[5]")
    public WebElement total;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "//a[text()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "//a[text()='Continue Shopping']")
    public WebElement continueShoppingButton;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//span[@class='close_icon style_2 lh-1 cart_item_delete_btn cursor_pointer'])[3]")
    public WebElement thirdDeleteIcon;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//span[@class='close_icon style_2 lh-1 cart_item_delete_btn cursor_pointer'])[2]")
    public WebElement secondDeleteIcon;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "(//span[@class='close_icon style_2 lh-1 cart_item_delete_btn cursor_pointer'])[1]")
    public WebElement firstDeleteIcon;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "//div[text()='Product successfully deleted from cart']")
    public WebElement productDeletedPopUpMessage;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "//h5[text()='Shipping charge free from ']")
    public WebElement shippingChargeFreeFromText;
    // Home Page => Cart Button => Cart Page
    @FindBy(xpath = "//h3[text()='Order Summary']")
    public WebElement orderSummary;
    // https://trendlifebuy.com/category/women-fashion?item=category
    @FindBy(xpath = "(//img[@class='lazyload'])[1]")
    public WebElement fashionFirstItem;
    // https://trendlifebuy.com/category/women-fashion?item=category
    @FindBy(xpath = "(//button[text()='Add To Cart'])[2]")
    public WebElement fashionItemAddcartButton;
    // https://trendlifebuy.com/category/women-fashion?item=category
    @FindBy(xpath = "(//img[@class='lazyload'])[2]")
    public WebElement fashionSecondItem;
    // https://trendlifebuy.com/category/women-fashion?item=category
    @FindBy(xpath = "(//img[@class='lazyload'])[3]")
    public WebElement fashionThirdItem;
    // https://trendlifebuy.com/user-email-verify
    @FindBy(xpath = "//p[text()='Verify Your Email.']")
    public WebElement verifyYourEmailText;
    // Home Page => Register Link => Register Page
    @FindBy(xpath = "//div[text()='Please agree with our policy privacy ']")
    public WebElement privacyPolicyPopUpMessage;
    // Home Page => Register Link => Cart Page
    @FindBy(xpath = "//span[text()='$ 280']")
    public WebElement oldPrice;
    // Home Page => Register Link => Cart Page
    @FindBy(xpath = "//span[text()='$ 340']")
    public WebElement newPrice;
    // Admin Login => Admin Reports
    @FindBy(xpath = "//span[text()='Admin Reports']")
    public WebElement adminReportsTab;
    // Admin Login => Dashboard
    @FindBy(xpath = "//span[text()='Dashboard']")
    public WebElement dashboard;
    // Admin Login => Admin Reports => Top Customers
    @FindBy(xpath = "//a[text()='Top Customers']")
    public WebElement topCustomersTab;
    // Admin Login => Admin Reports => Top Customers => Top Customers List Title
    @FindBy(xpath = "//h3[text()='Top Customers']")
    public WebElement topCustomersListTitle;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => Name Column
    @FindBy(xpath = "//th[@aria-label='Name: activate to sort column ascending']")
    public WebElement topCustomersListNameColumn;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => Email Column
    @FindBy(xpath = "//th[@aria-label='Email: activate to sort column ascending']")
    public WebElement topCustomersListEmailColumn;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => Phone Column
    @FindBy(xpath = "//th[@aria-label='Phone: activate to sort column ascending']")
    public WebElement topCustomersListPhoneColumn;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => Total Spend Column
    @FindBy(xpath = "//th[@aria-label='Total spend: activate to sort column ascending']")
    public WebElement topCustomersListTotalSpendColumn;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => Joined At Column
    @FindBy(xpath = "//th[@aria-label='Joined at: activate to sort column ascending']")
    public WebElement topCustomersListJoinedAtColumn;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => Quick Search Text Box
    @FindBy(xpath = "//input[@type='search']")
    public WebElement topCustomersListQuickSearchTextBox;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => First Name
    @FindBy(xpath = "//td[text()='Tester']")
    public WebElement topCustomersListFirstName;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => Next Page Link
    @FindBy(xpath = "//i[@class='ti-arrow-right']")
    public WebElement topCustomersListNextPageLink;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => Previous Page Link
    @FindBy(xpath = "//i[@class='ti-arrow-left']")
    public WebElement topCustomersListPreviousPageLink;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => Second Page's First Element (11)
    @FindBy(xpath = "//td[text()='11']")
    public WebElement topCustomersListElement11;
    // Admin Login => Admin Reports => Top Customers => Top Customers List => First Page's First Element (1)
    @FindBy(xpath = "//td[text()='1']")
    public WebElement topCustomersListElement1;
    // Admin Login => Support Ticket
    @FindBy(xpath = "//span[.='Support Ticket']")
    public WebElement supportTicketLink;
    // Admin Login => Support Ticket => Category Tab
    @FindBy(xpath = "//ul[@class='mm-collapse mm-show']//a[.='Category']")
    public WebElement supportTicketLinkCategoryTab;
    // Admin Login => Support Ticket => Category Tab => Category List Title Text
    @FindBy(xpath = "//h3[.='Category List']")
    public WebElement categoryListTitleText;
    // Admin Login => Support Ticket => Category Tab => Add New Category Name
    @FindBy(xpath = "//input[@id='name']")
    public WebElement addNewCategoryName;
    // Admin Login => Support Ticket => Category Tab => Add New Category Name => Save Button
    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement addNewCategoryNameSaveButton;
    // Admin Login => Support Ticket => Category Tab => Category List => Category Name in First Line
    @FindBy(xpath = "//tbody[@id='sku_tbody']/tr[1]/td[2]")
    public WebElement categoryNameInFirstLine;
    // Admin Login => Support Ticket => Category Tab => Category List => Head Line
    @FindBy(xpath = "//th[.='Name']")
    public WebElement categoryHeadLineName;
    // Admin Login => Support Ticket => Category Tab => Category List => Head Line
    @FindBy(xpath = "//th[.='Status']")
    public WebElement categoryHeadLineStatus;
    // Admin Login => Support Ticket => Category Tab => Category List => Head Line
    @FindBy(xpath = "//th[.='Action']")
    public WebElement categoryHeadLineAction;
    // Admin Login => Support Ticket => Category Tab => Category List => Success Pop Up
    @FindBy(xpath = "//body[@class='admin']/div[6]")
    public WebElement categorySuccessPopUpMessage;
    // Admin Login => Support Ticket => Category Tab => Category List => Status Button First Line
    @FindBy(xpath = "//tbody[@id='sku_tbody']/tr[1]//div[@class='slider round']")
    public WebElement categoryStatusButtonFirstLine;
    // Admin Login => Support Ticket => Category Tab => Category List => Select Button First Line
    @FindBy(xpath = "//tbody[@id='sku_tbody']/tr[1]//button[@class='btn btn-secondary dropdown-toggle']")
    public WebElement categorySelectButtonFirstLine;
    // Admin Login => Support Ticket => Category Tab => Category List => Select Button First Line => Edit Button
    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']/a[.='Edit']")
    public WebElement categorySelectButtonFirstLineEditButton;
    // Admin Login => Support Ticket => Category Tab => Category List => Select Button First Line => Delete Button
    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']/a[.='Delete']")
    public WebElement categorySelectButtonFirstLineDeleteButton;
    // Admin Login => Support Ticket => Category Tab => Category List => Select Button First Line => Edit Button => edit Page
    @FindBy(xpath = "//h3[contains(.,'Edit')]")
    public WebElement categoryEditPageText;
    // Admin Login => Support Ticket => Category Tab => Category List => Select Button First Line => Edit Button => edit Page => Name Box
    @FindBy(xpath = "//input[@id='name']")
    public WebElement categoryEditPageNameBox;
    // Admin Login => Support Ticket => Category Tab => Category List => Select Button First Line => Edit Button => edit Page => Status Check Box
    @FindBy(xpath = "//ul[@id='theme_nav']/li[2]//span[@class='checkmark']")
    public WebElement categoryEditPageStatusCheckBox;
    // Admin Login => Support Ticket => Category Tab => Category List => Select Button First Line => Edit Button => edit Page => Update Button
    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement categoryEditPageUpdateButton;
    // Admin Login => Support Ticket => Category Tab => Category List => Select Button First Line => Status Button
    @FindBy(xpath = "//tbody[@id='sku_tbody']/tr[1]//div[@class='slider round']")
    public WebElement categoryEditPageStatusButton;
    // Admin Login => Support Ticket => Category Tab => Category List => Select Button First Line => Status Button
    @FindBy(xpath = "//input[@value='Delete']")
    public WebElement categoryEditPageDeletePopUpPage;

}
