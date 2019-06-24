package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	By title_mrs = By.id("id_gender2");
	By customer_firstname = By.id("customer_firstname");
	By customer_lastname = By.id("customer_lastname");
	By password = By.id("passwd");
	By date_of_birth = By.id("days");
	By month_of_birth = By.id("months");
	By year_of_birth = By.id("years");
	By checker_newsletter = By.id("newsletter");
	By checker_optin = By.id("optin");
	By firstname = By.id("firstname");
	By lastname = By.id("lastname");
	By company = By.id("company");
	By address = By.id("address1");
	By address_line2 = By.id("address2");
	By city = By.id("city");
	By state = By.id("id_state");
	By postal_code = By.id("postcode");
	By country = By.id("id_country");
	By additional_information = By.id("other");
	By home_phone = By.id("phone");
	By mobile_phone = By.id("phone_mobile");
	By my_address = By.id("alias");
	By register_button = By.id("submitAccount");

	public By getTitle_mrs() {
		return title_mrs;
	}

	public By getCustomer_firstname() {
		return customer_firstname;
	}

	public By getCustomer_lastname() {
		return customer_lastname;
	}

	public By getPassword() {
		return password;
	}

	public By getDate_of_birth() {
		return date_of_birth;
	}

	public By getMonth_of_birth() {
		return month_of_birth;
	}

	public By getYear_of_birth() {
		return year_of_birth;
	}

	public By getChecker_newsletter() {
		return checker_newsletter;
	}

	public By getChecker_optin() {
		return checker_optin;
	}

	public By getFirstname() {
		return firstname;
	}

	public By getLastname() {
		return lastname;
	}

	public By getCompany() {
		return company;
	}

	public By getAddress() {
		return address;
	}

	public By getAddress_line2() {
		return address_line2;
	}

	public By getCity() {
		return city;
	}

	public By getState() {
		return state;
	}

	public By getPostal_code() {
		return postal_code;
	}

	public By getCountry() {
		return country;
	}

	public By getAdditional_information() {
		return additional_information;
	}

	public By getHome_phone() {
		return home_phone;
	}

	public By getMobile_phone() {
		return mobile_phone;
	}

	public By getMy_address() {
		return my_address;
	}

	public By getRegister_button() {
		return register_button;
	}

}
