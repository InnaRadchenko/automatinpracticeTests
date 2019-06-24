package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class OrderHistoryAndDetailsPage extends BasePage {

	public OrderHistoryAndDetailsPage(WebDriver driver) {
		super(driver);
	}

	By order_reference = By.xpath("//tr[contains(@class,'first_item ')]/td/a");
	By product_name = By.xpath("//td[contains(@class,'bold')]/label");

	public By getOrder_reference() {
		return order_reference;
	}

	public By getProduct_name() {
		return product_name;
	}

}
