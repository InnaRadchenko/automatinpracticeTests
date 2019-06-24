package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class AuthenticationPage extends BasePage {

	public AuthenticationPage(WebDriver driver) {
		super(driver);
	}

	By email_address_create = By.id("email_create");
	By create_account_button = By.xpath("//button[contains(@class,'btn btn-default button button-medium exclusive')]");
	By email_address = By.id("email");
	By password = By.id("passwd");
	By sign_in_button = By.xpath("//i[contains(@class,'icon-lock left')]");
	By message_error = By.xpath("//div[contains(@class,'alert alert-danger')]/ol/li");

	public By getEmail_address_create() {
		return email_address_create;
	}

	public By getCreate_account_button() {
		return create_account_button;
	}

	public By getEmail_address() {
		return email_address;
	}

	public By getPassword() {
		return password;
	}

	public By getSign_in_button() {
		return sign_in_button;
	}

	public By getMessage_error() {
		return message_error;
	}

}
