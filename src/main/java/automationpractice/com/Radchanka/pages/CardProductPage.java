package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class CardProductPage extends BasePage {

	public CardProductPage(WebDriver driver) {
		super(driver);
	}

	By add_to_card = By.xpath("//p[contains(@class,'buttons_bottom_block no-print')]");
	By close_window = By.xpath("//span[contains(@class,'cross')]");
	By proceseed_to_checkout = By.xpath("//a[contains(@class,'btn btn-default button button-medium')]");
	By cart_title = By.xpath("//h1[contains(@class,'page-heading')]");

	public By getAdd_to_card() {
		return add_to_card;
	}

	public By getClose_window() {
		return close_window;
	}

	public By getProceseed_to_checkout() {
		return proceseed_to_checkout;
	}

	public By getCart_title() {
		return cart_title;
	}


}
