package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class ProductListingPage extends BasePage {

	public ProductListingPage(WebDriver driver) {
		super(driver);
	}

	By product = By.xpath("//div[contains(@class,'product-container')]");
	By product_name = By.xpath("//div[contains(@class,'right-block')]//a");

	public By getProduct() {
		return product;
	}

	public By getProduct_name() {
		return product_name;
	}
}
