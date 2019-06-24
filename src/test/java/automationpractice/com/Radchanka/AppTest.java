package automationpractice.com.Radchanka;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import automationpractice.com.Radchanka.pages.AuthenticationPage;
import automationpractice.com.Radchanka.pages.HomePage;
import automationpractice.com.Radchanka.pages.CardProductPage;
import automationpractice.com.Radchanka.pages.CheckoutPage;
import automationpractice.com.Radchanka.pages.ContactUsPage;
import automationpractice.com.Radchanka.pages.MyAccountPage;
import automationpractice.com.Radchanka.pages.OrderHistoryAndDetailsPage;
import automationpractice.com.Radchanka.pages.ProductListingPage;
import automationpractice.com.Radchanka.pages.RegistrationPage;
import automationpractice.com.Radchanka.pages.ShoppingCardPage;
import automationpractice.com.Radchanka.wrapper.Wrapper;

public class AppTest extends BaseTest {

	private HomePage homePage;
	private Wrapper wrapper;
	private ContactUsPage contactUsPage;
	private AuthenticationPage authenticationPage;
	private RegistrationPage registrationPage;
	private MyAccountPage myAccountPage;
	private ProductListingPage productListingPage;
	private CardProductPage cardProductPage;
	private ShoppingCardPage shoppingCardPage;
	private CheckoutPage checkoutPage;
	private OrderHistoryAndDetailsPage orderHistoryAndDetailsPage;

	@Before
	public void createDriver() {
		driver = getBrowser("http://automationpractice.com/index.php");
		homePage = new HomePage(driver);
		wrapper = new Wrapper(driver);
		authenticationPage = new AuthenticationPage(driver);
		registrationPage = new RegistrationPage(driver);
		myAccountPage = new MyAccountPage(driver);
		contactUsPage = new ContactUsPage(driver);
		productListingPage = new ProductListingPage(driver);
		cardProductPage = new CardProductPage(driver);
		shoppingCardPage = new ShoppingCardPage(driver);
		checkoutPage = new CheckoutPage(driver);
		orderHistoryAndDetailsPage = new OrderHistoryAndDetailsPage(driver);
	}

	@Test
	public void TestCase1() {
		assertTrue(wrapper.clickElement(homePage.getContact_us()));
		assertTrue(wrapper.attachFile(contactUsPage.getAttach_file()));
		assertTrue(wrapper.selectValue(contactUsPage.getSubject_heading(), 2));
		assertTrue(wrapper.inputEmailAddress(contactUsPage.getEmail_address()));
		assertTrue(wrapper.sendKeysElement(contactUsPage.getOrder_reference(), "1111"));
		assertTrue(wrapper.sendKeysElement(contactUsPage.getMessage(), "Hello!"));
		assertTrue(wrapper.clickElement(contactUsPage.getSend_button()));
		assertEquals("Your message has been successfully sent to our team.",
				wrapper.readText(contactUsPage.getSuccess_message()));
	}

	@Test
	public void TestCase2() {
		assertTrue(wrapper.clickElement(homePage.getContact_us()));
		assertTrue(wrapper.attachFile(contactUsPage.getAttach_file()));
		assertTrue(wrapper.selectValue(contactUsPage.getSubject_heading(), 2));
		assertTrue(wrapper.inputEmailAddress(contactUsPage.getEmail_address()));
		assertTrue(wrapper.sendKeysElement(contactUsPage.getOrder_reference(), "1111"));
		assertTrue(wrapper.clickElement(contactUsPage.getSend_button()));
		assertEquals("The message cannot be blank.", wrapper.readText(contactUsPage.getError_message()));
	}

	@Test
	public void TestCase3() {
		assertTrue(wrapper.clickElement(homePage.getSign_in()));
		assertTrue(wrapper.inputEmailAddress(authenticationPage.getEmail_address_create()));
		assertTrue(wrapper.clickElement(authenticationPage.getCreate_account_button()));
		assertTrue(wrapper.clickElement(registrationPage.getTitle_mrs()));
		assertTrue(wrapper.sendKeysElement(registrationPage.getCustomer_firstname(), "Ina"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getCustomer_lastname(), "Radchanka"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getPassword(), "123456"));
		assertTrue(wrapper.selectValue(registrationPage.getDate_of_birth(), 2));
		assertTrue(wrapper.selectValue(registrationPage.getMonth_of_birth(), 2));
		assertTrue(wrapper.selectValue(registrationPage.getYear_of_birth(), 2));
		assertTrue(wrapper.clickElement(registrationPage.getChecker_newsletter()));
		assertTrue(wrapper.clickElement(registrationPage.getChecker_optin()));
		assertTrue(wrapper.sendKeysElement(registrationPage.getCompany(), "Radchanka"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getAddress(), "My street test"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getAddress_line2(), "My street test 2"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getCity(), "Vitebsk"));
		assertTrue(wrapper.selectValue(registrationPage.getState(), "Arizona"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getPostal_code(), "21000"));
		assertTrue(wrapper.selectValue(registrationPage.getCountry(), "United States"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getAdditional_information(), "Hello!"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getHome_phone(), "+1-567-244-5678"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getMobile_phone(), "+1-567-244-123"));
		assertTrue(wrapper.sendKeysElement(registrationPage.getMy_address(), "My address alias"));
		assertTrue(wrapper.clickElement(registrationPage.getRegister_button()));
		assertEquals("http://automationpractice.com/index.php?controller=my-account", wrapper.checkUrl());
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",
				wrapper.readText(myAccountPage.getInfo_account()));
	}

	@Test
	public void TestCase4() {
		assertTrue(wrapper.sendKeysElement(homePage.getSearch_input(), "Blouse"));
		assertTrue(wrapper.clickElement(homePage.getSearch_button()));
		assertTrue(wrapper.findElement(productListingPage.getProduct()));
		assertEquals("Blouse", wrapper.readText(productListingPage.getProduct_name()));
	}

	@Test
	public void TestCase5() throws InterruptedException {
		assertTrue(wrapper.sendKeysElement(homePage.getSearch_input(), "Evening Dresses"));
		assertTrue(wrapper.clickElement(homePage.getSearch_button()));
		assertTrue(wrapper.findElement(productListingPage.getProduct()));
		assertTrue(wrapper.clickElement(productListingPage.getProduct_name()));
		assertTrue(wrapper.clickElement(cardProductPage.getAdd_to_card()));
		assertTrue(wrapper.clickElement(cardProductPage.getProceseed_to_checkout()));
		assertEquals("Printed Dress", wrapper.readText(shoppingCardPage.getProduct_name()));
		assertTrue(wrapper.clickElement(shoppingCardPage.getDelete()));
		Thread.sleep(1000);
		assertEquals("Your shopping cart is empty.", wrapper.readText(shoppingCardPage.getMessage_card_is_empty()));
	}

	@Test
	public void TestCase6() {
		assertTrue(wrapper.moveToElement(homePage.getWomen()));
		assertTrue(wrapper.clickElement(homePage.getT_shirts()));
		assertTrue(wrapper.findElement(productListingPage.getProduct()));
		assertEquals("Faded Short Sleeve T-shirts", wrapper.readText(productListingPage.getProduct_name()));
	}

	@Test
	public void TestCase7() {
		assertTrue(wrapper.clickElement(homePage.getSign_in()));
		assertTrue(wrapper.sendKeysElement(authenticationPage.getEmail_address(), "tqe79464@bcaoo.com"));
		assertTrue(wrapper.sendKeysElement(authenticationPage.getPassword(), "123456"));
		assertTrue(wrapper.clickElement(authenticationPage.getSign_in_button()));
		assertTrue(wrapper.sendKeysElement(homePage.getSearch_input(), "Casual Dresses"));
		assertTrue(wrapper.clickElement(homePage.getSearch_button()));
		assertTrue(wrapper.findElement(productListingPage.getProduct()));
		assertTrue(wrapper.clickElement(productListingPage.getProduct_name()));
		assertTrue(wrapper.clickElement(cardProductPage.getAdd_to_card()));
		assertTrue(wrapper.clickElement(cardProductPage.getProceseed_to_checkout()));
		assertTrue(wrapper.clickElement(checkoutPage.getProceed_to_checkout()));
		assertTrue(wrapper.clickElement(checkoutPage.getProcees_to_checkout_address()));
		assertTrue(wrapper.clickElement(checkoutPage.getCheckbox_agree()));
		assertTrue(wrapper.clickElement(checkoutPage.getProcees_to_checkout_shipping()));
		assertTrue(wrapper.clickElement(checkoutPage.getPay_bank_wire()));
		assertTrue(wrapper.clickElement(checkoutPage.getConfirm_order()));
		assertTrue(wrapper.clickElement(homePage.getHeader_user_info()));
		assertTrue(wrapper.clickElement(myAccountPage.getOrder_history_and_details()));
		assertTrue(wrapper.clickElement(orderHistoryAndDetailsPage.getOrder_reference()));
		assertEquals("Printed Summer Dress - Color : Yellow, Size : S",
				wrapper.readText(orderHistoryAndDetailsPage.getProduct_name()));
	}

	@Test
	public void TestCase8() {
		assertTrue(wrapper.clickElement(homePage.getSign_in()));
		assertTrue(wrapper.sendKeysElement(authenticationPage.getEmail_address_create(), "tqe79464@bcaoo.com"));
		assertTrue(wrapper.clickElement(authenticationPage.getCreate_account_button()));
		assertEquals(
				"An account using this email address has already been registered. Please enter a valid password or request a new one.",
				wrapper.readText(authenticationPage.getMessage_error()));
	}

	@Test
	public void TestCase9() {
		assertTrue(wrapper.clickElement(homePage.getSign_in()));
		assertTrue(wrapper.sendKeysElement(authenticationPage.getEmail_address(), "tqe79464@bcaoo.com"));
		assertTrue(wrapper.sendKeysElement(authenticationPage.getPassword(), "111111"));
		assertTrue(wrapper.clickElement(authenticationPage.getSign_in_button()));
		assertEquals("Authentication failed.", wrapper.readText(authenticationPage.getMessage_error()));
	}

	@Test
	public void TestCase10() {
		assertTrue(wrapper.clickElement(homePage.getSign_in()));
		assertTrue(wrapper.sendKeysElement(authenticationPage.getEmail_address(), "tqe79464@bcaoo.com"));
		assertTrue(wrapper.sendKeysElement(authenticationPage.getPassword(), "123456"));
		assertTrue(wrapper.clickElement(authenticationPage.getSign_in_button()));
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",
				wrapper.readText(myAccountPage.getInfo_account()));
	}

	@Test
	public void TestCase11() {
		assertTrue(wrapper.moveToElement(homePage.getWomen()));
		assertTrue(wrapper.clickElement(homePage.getBlouses()));
		assertTrue(wrapper.findElement(productListingPage.getProduct()));
		assertTrue(wrapper.clickElement(productListingPage.getProduct_name()));
		assertTrue(wrapper.clickElement(cardProductPage.getAdd_to_card()));
		assertTrue(wrapper.clickElement(cardProductPage.getProceseed_to_checkout()));
		assertEquals("Blouse", wrapper.readText(shoppingCardPage.getProduct_name()));
	}

	@Test
	public void TestCase12() {
		assertEquals("0123-456-789", wrapper.readText(homePage.getShop_phone()));
	}

}
