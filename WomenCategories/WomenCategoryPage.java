package com.ariat.Pages.Categories.WomenCategories;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Pages.Products.BagsProductPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements returns methods to pages: Women Category Page Women Footwear Page
 * Women Clothing Page Women Accessories Page Women Featured Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenCategoryPage extends BasePage {

	
	private By womenAccesoriesCategory = By
			.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[3]/li/a");
	private By womenAccessoriesText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By womenCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/a");
	private By womenText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By sortDropWomenCategoryUp = By.cssSelector("=.ui-state-hover .icon-arrow-right");
	private By show36ItemLinkUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/ul/li[1]/a");
	private By show72ItemLinkUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/ul/li[2]/a");
	private By show108ItemLinkUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/ul/li[3]/a");
	private By nextPaginationButtonUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[5]/ul/li[5]");
	private By prevPaginationButtonUp = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[5]/ul/li[1]/a/span");
	private By backToTopButton = By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/a");
	private By sortDropWomenCategoryDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[1]/h3/p[1]/span");
	private By show36ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[3]/ul/li[1]/a");
	private By show72ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[3]/ul/li[2]/a");
    private By show108ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[3]/ul/li[3]/a");
	private By nextPaginationButtonDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[4]/ul/li[5]/a");
	private By prevPaginationButtonDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[4]/ul/li[7]/a");
	private By heritageProductLink = By.cssSelector("#\\37 1c529871b0e23de6cda26efe7 .psd-4-full-width-video-module-1__image");
	private By heritaheProductText = By.xpath("//*contains[text(),'Heritage II Ellipse Tall Riding Boot']");
	private By recommendedLink = By.linkText("Recommended");
	private By priceHighToLowLink = By.linkText("Price (High to Low)");
	private By priceLowToHighLink = By.linkText("Price (Low to High)");
	private By bestSellersLink = By.linkText("Best Sellers");
	private By womenAccesoriesCategoryLefytNav = By.linkText("Accessories");
	private By womenAccesoriesCategoryLefytNavDE= By.linkText("Accessoires");
	private By womenAccesoriesCategoryLefytNavFR= By.linkText("Accessoires");
	private By expandIconFootwear = By.xpath("//*[@id=\"main\"]/div[1]/ul/li[1]/a/span[2]");
	private By expandIconAccessories = By.xpath("//*[@id=\"main\"]/div[1]/ul/li[3]/a/span[2]");
	private By garmentBagProduct = By.xpath("//*[@id=\"6637647889b5b1522cd5df99b6\"]/div[1]/a/picture/img");
	private By garmentText = By.xpath("//*contains[text()='Garment Bag']");

	
	public WomenCategoryPage(WebDriver driver) {
		super(driver);
	}
	
	public void expandSubCategoriesFootwear() {
		WebDriverUtils.clickOnElementWithWait(driver, expandIconFootwear);
	}
	
	public void expandSubCategoriesAccessories() {
		WebDriverUtils.clickOnElementWithWait(driver, expandIconAccessories);
	}

	public void womenCategory() {
		WebDriverUtils.moveToElement(driver, womenCategory);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickSortUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, sortDropWomenCategoryUp);
	}
	
	public void clickSortDown() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, sortDropWomenCategoryDown);
	}

	public void sortProductWomenCategoryRecommended() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, recommendedLink);
	}
	
	public void sortProductWomenCategoryPriceHighToLow() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, priceHighToLowLink);
	}
	
	public void sortProductWomenCategoryPriceLowToHigh() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, priceLowToHighLink);
	}
	
	public void sortProductWomenCategoryBestSellers() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, bestSellersLink);
	}
	
	public void show36ItemsUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show36ItemLinkUp);
	}

	public void show72ItemsUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show72ItemLinkUp);
	}

	public void show108ItemLinkUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show108ItemLinkUp);
	}

	public void nextPaginationUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaginationButtonUp);
	}

	public void prevPaginationButtonUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, prevPaginationButtonUp);
	}

	public void backToTopClick() {
		WebDriverUtils.scrolltoElement(driver, backToTopButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, backToTopButton);
	}

	public void show36ItemsDown() {
		WebDriverUtils.scrolltoElement(driver, show36ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show36ItemLinkDown);
	}

	public void show72ItemsDown() {
		WebDriverUtils.scrolltoElement(driver, show72ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show72ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void show108ItemLinkDown() {
		WebDriverUtils.scrolltoElement(driver, show108ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show108ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void nextPaginationDown() {
		WebDriverUtils.scrollElementToPosition(driver, nextPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void prevPaginationButtonDown() {
		WebDriverUtils.scrollElementToPosition(driver, prevPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, prevPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public WomenAccessoriesPage returnWomenAccessoriesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccesoriesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
		return new WomenAccessoriesPage(driver);
	}

	
	public WomenAccessoriesPage returnWomenAccessoriesCategoryLeftNavPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccesoriesCategoryLefytNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
		return new WomenAccessoriesPage(driver);
	}
	
	
	public WomenAccessoriesPage returnWomenAccessoriesCategoryLeftNavPageFR() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccesoriesCategoryLefytNavFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
		return new WomenAccessoriesPage(driver);
	}
	public WomenAccessoriesPage returnWomenAccessoriesCategoryLeftNavPageDE() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccesoriesCategoryLefytNavDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
		return new WomenAccessoriesPage(driver);
	}

	public HeritageProductPage returnHeritageProduct() {
		WebDriverUtils.clickOnElementWithWait(driver, heritageProductLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(heritaheProductText));
		return new HeritageProductPage(driver);
	}
		
	public BagsProductPage returnBagsProductPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, garmentBagProduct);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(garmentText));
		return new BagsProductPage(driver);
	}

	public WomenCategoryPage returnWomenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenText));
		return new WomenCategoryPage(driver);
	}
}
