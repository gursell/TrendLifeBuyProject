package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US001_002_003_004_005_050_Page {
    public US001_002_003_004_005_050_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Play store']")
    public WebElement playStoreButton;

    @FindBy(xpath = "//span[text()='google_logo Play']")
    public WebElement googlePlayText;

    @FindBy(xpath = "//span[text()='App store']")
    public WebElement appleStoreButton;

    @FindBy(xpath = "(//a[@href='/app-store/'])[1]")
    public WebElement appleStoreText;

    @FindBy(xpath = "(//a[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[2]")
    public WebElement trackYourOrder;

    @FindBy(xpath = "//span[text()='Compare(']")
    public WebElement compareButton;

    @FindBy(xpath = "(//a[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[4]")
    public WebElement wishListButton;

    @FindBy(xpath = "(//a[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[5]")
    public WebElement cartButton;

    @FindBy(xpath = "//div[@class='logo_img']")
    public WebElement logo;

    @FindBy(xpath = "(//input[@id='inlineFormInputGroup'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "((//button[@id='search_button'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='brand_banner d-flex align-items-center']")
    public WebElement computerText;

    @FindBy(xpath = "(//h4[@class='font_18 f_w_700 getProductByChoice cursor_pointer'])[2]")
    public WebElement laptopText;

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='/ Register']")
    public WebElement registerButton;

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/'])[1]")
    public WebElement homeButton;

    @FindBy(xpath = "(//a[text()='Blog'])[1]")
    public WebElement blogButton;

    @FindBy(xpath = "(//a[@class='label_name f_w_400'])[1]")
    public WebElement jasperScottText;

    @FindBy(xpath = "(//a[text()='Contact'])[1]")
    public WebElement contactButton;

    @FindBy(xpath = "(//a[text()='About Us'])[1]")
    public WebElement aboutUsButton;

    @FindBy(xpath = "//a[@class='single_top_lists d-flex align-items-center d-none d-lg-inline-flex']")
    public WebElement newUserButton;

    @FindBy(xpath = "//a[@class='Categories_togler']")
    public WebElement allCategoriesMenu;

    @FindBy(xpath = "(//a[@class='dropdown-item has_arrow d-flex align-items-center'])[1]")
    public WebElement computerAccessoriesCategory;

    @FindBy(xpath = "(//a[@class='dropdown-item has_arrow d-flex align-items-center'])[2]")
    public WebElement electronicDevicesCategory;

    @FindBy(xpath = "(//a[@class='dropdown-item has_arrow d-flex align-items-center'])[3]")
    public WebElement watchesAccessoriesCategory;

    @FindBy(xpath = "(//a[@class='dropdown-item has_arrow d-flex align-items-center'])[4]")
    public WebElement fashionsCategory;

    @FindBy(xpath = "(//a[@class='dropdown-item has_arrow d-flex align-items-center'])[5]")
    public WebElement toysKidsBabiesCategory;

    @FindBy(xpath = "(//a[@class='dropdown-item has_arrow d-flex align-items-center'])[6]")
    public WebElement bagShoesCategory;

    @FindBy(xpath = "(//a[@class='dropdown-item has_arrow d-flex align-items-center'])[7]")
    public WebElement lifestyleHomeCategory;

    @FindBy(xpath = "(//a[@class='dropdown-item has_arrow d-flex align-items-center'])[8]")
    public WebElement tvHomeAppliancesCategory;

    @FindBy(xpath = "(//a[@class='dropdown-item has_arrow d-flex align-items-center'])[9]")
    public WebElement autoMobilesBikesCategory;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccountLink;

    @FindBy(xpath = "//h3[@class='m-0']")
    public WebElement signIn;

    @FindBy(xpath = "//a[text()='Order Status']")
    public WebElement orderStatusLink;

    @FindBy(xpath = "//a[text()='Referral']")
    public WebElement referralLink;

    @FindBy(xpath = "//a[text()='Coupons']")
    public WebElement couponsLink;

    @FindBy(xpath = "//a[text()='About Us']")
    public WebElement aboutUsLink;

    @FindBy(xpath = " //h3[text()='With TrendLifeBuy Assurance']")
    public WebElement withTrendLifeBuy;

    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUsLink;

    @FindBy(xpath = "(//span[@class='contact_box_title font_16 f_w_500 d-block lh-1 '])[1]")
    public WebElement callOrWhatsApp;

    @FindBy(xpath = "(//i[@class='ti-close'])[2]")
    public WebElement tiClose;

    @FindBy(xpath = "//a[text()='Career']")
    public WebElement careerLink;

    @FindBy(xpath = "//h3[text()='When you want… to be unique']")
    public WebElement whenYouWant;
    @FindBy(xpath = "//a[text()='Refund Policy']")
    public WebElement refundPolicyLink;

    @FindBy(xpath = "//h5[text()='Returns Policy']")
    public WebElement returnsPolicy;

    @FindBy(xpath = "//a[text()='Terms & Condition']")
    public WebElement termsConditionLink;

    @FindBy(xpath = "//h2[text()='Overview']")
    public WebElement overview;

    @FindBy(xpath = "//a[@title='Go to Top']")
    public WebElement goToTupButton;

    @FindBy(xpath = "//i[@class='fab fa-twitter']")
    public WebElement twitterIcon;

    @FindBy(xpath = "//span[text()='Giriş yap']")
    public WebElement twittergirisYap;

    @FindBy(xpath = "//i[@class='fab fa-instagram']")
    public WebElement instagramIcon;

    @FindBy(xpath = "//i[@aria-label='Instagram']")
    public WebElement instagramText;

    @FindBy(xpath = "//i[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;

    @FindBy(xpath = "//i[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;

    @FindBy(xpath = "//h2[@class='_8eso']")
    public WebElement facebookText;

    @FindBy(xpath = "//h3[@id='best_deals_title']")
    public WebElement trendingProducts;

    @FindBy(xpath = "//h3[@id='feature_categories_title']")
    public WebElement hotCategories;

    @FindBy(xpath = "//h4[@id='filter_category_title']")
    public WebElement houseAppliances;

    @FindBy(xpath = "//h4[@class='mb-0']")
    public WebElement recommendationForYou;

    @FindBy(xpath = "//h3[@id='top_brands_title']")
    public WebElement topBrand;

    @FindBy(xpath = "(//h3[@class='m-0 flex-fill'])[4]")
    public WebElement popularSearches;

    @FindBy(xpath = "(//h3[@class='m-0 flex-fill'])[5]")
    public WebElement trendlifebuyOnlineShopping;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement sofaLink;

    @FindBy(xpath = "(//h4[text()=' Single Size Sofa '])[1]")
    public WebElement singleSizeSofa;

    @FindBy(xpath = "//button[text()='Wooden Furniture']")
    public WebElement woodenFurnitureLink;

    @FindBy(xpath = "(//div[@class='product__meta text-center'])[31]")
    public WebElement woodenDesignLink;

    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement viewAllButton;

    @FindBy(xpath = "//span[text()='More Deals']")
    public WebElement moreDealsButton;

    @FindBy(xpath = "//a[@id='loadmore']")
    public WebElement loadMoreButton;

    @FindBy(xpath = "//a[text()='Priority']")
    public WebElement priorityLink;

    @FindBy(xpath = "//h3[text()='Priority List']")
    public WebElement priorityList;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement addNewBox;


    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement newPriName;

    @FindBy(xpath = "(//th[@class='sorting'])[1]")
    public WebElement nameHeading;

    @FindBy(xpath = "(//th[@class='sorting'])[2]")
    public WebElement statusHeading;

    @FindBy(xpath = "(//th[@class='sorting'])[3]")
    public WebElement actionHeading;

    @FindBy(xpath = "(//div[@class='slider round'])[1]")
    public WebElement statusSliderRound;

    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[1]")
    public WebElement selectTab1;

    @FindBy(xpath = "(//a[text()='Edit'])[1]")
    public WebElement editLink;

    @FindBy(xpath = "(//a[text()='Delete'])[1]")
    public WebElement deleteLink;

    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[4]")
    public WebElement selectTab4;

    @FindBy(xpath = "(//a[text()='Edit'])[4]")
    public WebElement editLink4;

    @FindBy(xpath = "(//a[text()='Delete'])[4]")
    public WebElement deleteLink4;

    @FindBy(xpath = "(//h3[@class='mb-30'])[1]")
    public WebElement editPage;

    @FindBy(xpath = "(//span[@class='checkmark'])[2]")
    public WebElement inactiveTick;

    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement updateButton;

    @FindBy(xpath = "//td[text()='Lowest']")
    public WebElement lowestText;

    @FindBy(xpath = "//input[@id='dataDeleteBtn']")
    public WebElement dataDeleteButton;


}