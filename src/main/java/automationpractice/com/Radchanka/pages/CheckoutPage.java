package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	By proceed_to_checkout = By.xpath("//a[contains(@class,'button btn btn-default standard-checkout button-medium')]");
	By procees_to_checkout_address = By.xpath("//button[contains(@class,'button btn btn-default button-medium')]");
	By checkbox_agree = By.id("uniform-cgv");
	By procees_to_checkout_shipping = By
			.xpath("//button[contains(@class,'button btn btn-default standard-checkout button-medium')]");
	By pay_bank_wire = By.xpath("//a[contains(@class,'bankwire')]");
	By confirm_order = By.xpath("//button[contains(@class,'button btn btn-default button-medium')]");

	public By getProceed_to_checkout() {
		return proceed_to_checkout;
	}

	public By getProcees_to_checkout_address() {
		return procees_to_checkout_address;
	}

	public By getCheckbox_agree() {
		return checkbox_agree;
	}

	public By getProcees_to_checkout_shipping() {
		return procees_to_checkout_shipping;
	}

	public By getPay_bank_wire() {
		return pay_bank_wire;
	}

	public By getConfirm_order() {
		return confirm_order;
	}

}
