package com.ariat.Tests.Account.Countries.NegativeCreateAccount;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageSE;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Main.CreateAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Utils.GenerateRandomDataUtils;
import com.ariat.Utils.KillChrome;
import com.ariat.Utils.SetSelenium;


/**
 * Test negative create account by instantiating the browser, go to Home page,
 * and calls all the methods such as: create account, login, check order status
 * for Sweden
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class NegativeCreateAccountSETest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private CreateAccountPage createAccountPage;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageSE homePageSE;
	private SignInPage signInPage;
	private String loggingMessage = "The email address is invalid.";
	private String missingLoggingValue = "This field is required.";

	public static final String FIRST_NAME = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String LAST_NAME = GenerateRandomDataUtils.generateRandomNumber(7);
	public static final String BIRTH_MONTH = "March";
	public static final String BIRTH_DAY = "02";

	public static final String EMAIL = GenerateRandomDataUtils.generateRandomNumber(12);
	public static final String PASSWORD = GenerateRandomDataUtils.generateRandomString(10);

	public static final String FIRST_NAME1 = "@#$%^&*()";
	public static final String LAST_NAME1 = "@#$%^&*()";
	public static final String EMAIL1 = "@#$%^&*()";
	
	@BeforeTest
	public void setSeleniumUP() {
	SetSelenium setPath = new SetSelenium();
	setPath.setSelenium();
	}

	@Test(priority = 0)
	public void negativeCreateAccountTestSE() {
		logger.info("Starting create negative account test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageSE = (HomePageSE) homePage.chooseEULocation(euCountry.SE, euCountry.SE.getCurrencyISO());
		signInPage = homePageSE.returnSignInPage();
		createAccountPage = signInPage.returnCreateAccountPage();
		createAccountPage.createAccount(FIRST_NAME, LAST_NAME, BIRTH_MONTH, BIRTH_DAY, EMAIL, EMAIL, PASSWORD, PASSWORD);
		createAccountPage.createAccountClick();
		createAccountPage.assertWrongNameCreateAccount(loggingMessage);
		logger.info("Finishing negative create account test...");
	}

	@Test(priority = 1)
	public void negativeCreateAccountTestWildcardsSE() {
		logger.info("Starting create negative account test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageSE = (HomePageSE) homePage.chooseEULocation(euCountry.SE, euCountry.SE.getCurrencyISO());
		signInPage = homePageSE.returnSignInPage();
		createAccountPage = signInPage.returnCreateAccountPage();
		createAccountPage.createAccount(FIRST_NAME1, LAST_NAME1, BIRTH_MONTH, BIRTH_DAY, EMAIL, EMAIL, PASSWORD, PASSWORD);
		createAccountPage.createAccountClick();
		createAccountPage.assertWrongNameCreateAccount(loggingMessage);
		logger.info("Finishing negative create account test...");
	}

	@Test(priority = 2)
	public void negativeCreateAccountTestMissingValuesSE() {
		logger.info("Starting create negative account test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageSE = (HomePageSE) homePage.chooseEULocation(euCountry.SE, euCountry.SE.getCurrencyISO());
		signInPage = homePageSE.returnSignInPage();
		createAccountPage = signInPage.returnCreateAccountPage();
		createAccountPage.createAccount(FIRST_NAME, LAST_NAME, null, null, null, null, null, null);
		createAccountPage.createAccountClick();
		createAccountPage.asserCreateAccountMissingValues(missingLoggingValue);
		logger.info("Finishing negative create account test...");
	}
	
	@AfterTest
	public void clearBrowserSession() {
		homePage.quit();
		homePageUK.quit();
		homePageSE.quit();
		signInPage.quit();
		createAccountPage.quit();
		KillChrome kill = new KillChrome();
	}
}
