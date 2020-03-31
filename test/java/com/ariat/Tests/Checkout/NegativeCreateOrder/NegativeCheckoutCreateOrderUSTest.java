package com.ariat.Tests.Checkout.NegativeCreateOrder;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Pages.Main.CheckoutPage;
import com.ariat.Pages.Main.CheckoutProcessPage;
import com.ariat.Pages.Main.MyBagPage;
import com.ariat.Pages.Products.BagsProductPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;
import com.ariat.Utils.KillChrome;
import com.ariat.Utils.SetSelenium;

/**
 * Checkout -> Negative Create new order
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class NegativeCheckoutCreateOrderUSTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageUS homePageUS; 
	private WomenCategoryPage womenCategoryPage;
	private MyBagPage myBagPage;
	private WomenAccessoriesPage womenAccessoriesPage;
	private WomenAccessoriesGlovesPage womenAccessoriesGlovesPage;
	private BagsProductPage bagsProductPage;
	private CheckoutPage checkoutPage;
	private CheckoutProcessPage checkoutProcessPage;


	public static final String CARD_NAME = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String FIRST_NAME_NOK = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String LAST_NAME_NOK = GenerateRandomDataUtils.generateRandomNumber(7);
	public static final String CITY_NOK = "24534543";
	public static final String COUNTRY_NOK = "United Kingdom";

	public static final String MOBILE_NOK = GenerateRandomDataUtils.generateRandomString(7);
	public static final String EMAIL_NOK = GenerateRandomDataUtils.generateRandomNumber(12);
	public static final String PASSWORD = GenerateRandomDataUtils.generateRandomString(10);


	public static final String CARD_NAME_OK = GenerateRandomDataUtils.generateRandomString(5);
	public static final String FIRST_NAME_OK = GenerateRandomDataUtils.generateRandomString(5);
	public static final String LAST_NAME_OK = GenerateRandomDataUtils.generateRandomString(7);
	

	public static final String ZIP_CODE_NOK = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String ADDRESS_NOK = GenerateRandomDataUtils.generateRandomNumber(5);

	public static final String ADDRESS_OK = "W. Adams St.";
	public static final String CITY_OK = "Phoenix";
	public static final String STATE_OK = "Arizona";
	public static final String ZIP_CODE_OK = "85007";
	public static final String MOBILE_OK = "(602) 364-2722";


	public static final String ERROR_MESAGE = "Please enter a valid value";
	
	@BeforeTest
	public void setSeleniumUP() {
	SetSelenium setPath = new SetSelenium();
	setPath.setSelenium();
	}
	
	@Test(priority=0)
	public void checkoutNegativeCreateOrderInvalidContactInfoAndShippingAddressUS() {
		logger.info("Starting checkout -> create negative order invalid shipping address...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		bagsProductPage = homePageUS.returnBagsProductPage();
		myBagPage = bagsProductPage.returnMyBagPage();
		checkoutPage = myBagPage.returnCheckoutPage();
		checkoutProcessPage = checkoutPage.returnCheckoutProcessPage();
		checkoutProcessPage.enterFName(FIRST_NAME_NOK);
		checkoutProcessPage.enterLName(LAST_NAME_NOK);
		checkoutProcessPage.enterAddress(ADDRESS_NOK);
		checkoutProcessPage.enterCity(CITY_NOK);
		checkoutProcessPage.enterZipCode(ZIP_CODE_NOK);
		checkoutProcessPage.selectState();
		checkoutProcessPage.enterMobile(MOBILE_NOK);
		checkoutProcessPage.assertWrongDataCreateOrder(ERROR_MESAGE);
		checkoutProcessPage.enterEmail(EMAIL_NOK);
		logger.info("Finishing checkout -> create negative order invalid shipping address.");
	}

	
	@AfterTest
	public void clearBrowserSession() {
		homePage.quit();
		homePageUK.quit();
		homePageUS.quit();
		womenCategoryPage.quit();
		womenAccessoriesPage.quit();
		womenAccessoriesGlovesPage.quit();
		bagsProductPage.quit();
		myBagPage.quit();
		checkoutPage.quit();
		checkoutProcessPage.quit();
		KillChrome kill = new KillChrome();
	}
}
