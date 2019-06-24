package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class ShoppingCardPage extends BasePage {

	public ShoppingCardPage(WebDriver driver) {
		super(driver);
	}

	By product_name = By.xpath("//td[contains(@class,'cart_description')]/p/a");
	By delete = By.xpath("//i[contains(@class,'icon-trash')]");
	By message_card_is_empty = By.xpath("//p[contains(@class,'alert alert-warning')]");

	public By getProduct_name() {
		return product_name;
	}

	public By getDelete() {
		return delete;
	}

	public By getMessage_card_is_empty() {
		return message_card_is_empty;
	}

}
