package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	By info_account = By.xpath("//p[contains(@class,'info-account')]");
	By order_history_and_details = By.xpath("//span[contains(text(),'Order history and details')]");

	public By getInfo_account() {
		return info_account;
	}

	public By getOrder_history_and_details() {
		return order_history_and_details;
	}

}
