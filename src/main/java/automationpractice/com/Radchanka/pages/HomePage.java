package automationpractice.com.Radchanka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationpractice.com.Radchanka.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	By contact_us = By.id("contact-link");
	By sign_in = By.xpath("//a[contains(@class,'login')]");
	By search_input = By.id("search_query_top");
	By search_button = By.xpath("//button[contains(@class,'btn btn-default button-search')]");
	By women = By.xpath(
			"//ul[contains(@class,'sf-menu clearfix menu-content sf-js-enabled sf-arrows')]/descendant::a[contains(text(),'Women')]");
	By t_shirts = By.xpath(
			"//ul[contains(@class,'submenu-container clearfix first-in-line-xs')]/descendant::a[contains(text(),'T-shirts')]");
	By header_user_info = By.xpath("//div[contains(@class,'header_user_info')]");
	By blouses = By.xpath(
			"//ul[contains(@class,'submenu-container clearfix first-in-line-xs')]/descendant::a[contains(text(),'Blouses')]");
	By shop_phone = By.xpath("//span[contains(@class,'shop-phone')]/strong");

	public By getContact_us() {
		return contact_us;
	}

	public By getSign_in() {
		return sign_in;
	}

	public By getSearch_input() {
		return search_input;
	}

	public By getSearch_button() {
		return search_button;
	}

	public By getWomen() {
		return women;
	}

	public By getT_shirts() {
		return t_shirts;
	}

	public By getHeader_user_info() {
		return header_user_info;
	}

	public By getBlouses() {
		return blouses;
	}

	public By getShop_phone() {
		return shop_phone;
	}

}
