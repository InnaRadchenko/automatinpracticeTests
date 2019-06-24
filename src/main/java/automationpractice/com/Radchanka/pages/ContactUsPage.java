package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class ContactUsPage extends BasePage {

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

	By subject_heading = By.id("id_contact");
	By email_address = By.id("email");
	By order_reference = By.id("id_order");
	By attach_file = By.xpath("//input[@type='file']");
	By send_button = By.id("submitMessage");
	By message = By.id("message");
	By success_message = By.xpath("//p[contains(@class,'alert alert-success')]");
	By error_message = By.xpath("//div[contains(@class,'alert alert-danger')]/ol");

	public By getSubject_heading() {
		return subject_heading;
	}

	public By getEmail_address() {
		return email_address;
	}

	public By getOrder_reference() {
		return order_reference;
	}

	public By getAttach_file() {
		return attach_file;
	}

	public By getSend_button() {
		return send_button;
	}

	public By getMessage() {
		return message;
	}

	public By getSuccess_message() {
		return success_message;
	}

	public By getError_message() {
		return error_message;
	}

}
