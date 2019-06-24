package automationpractice.com.Radchanka.wrapper;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import automationpractice.com.Radchanka.base.BasePage;

public class Wrapper extends BasePage {

	public Wrapper(WebDriver driver) {
		super(driver);
	}

	public boolean isElementDisplayed(WebElement webElement) {
		return webElement.isDisplayed();
	}

	public boolean findElement(By locator) {
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			log.info("Not found " + locator);
			return false;
		}
		log.info("Found " + locator);
		return true;
	}

	public boolean clickElement(By locator) {
		try {
			element = driver.findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			log.info("Not click " + locator);
			return false;
		}
		log.info("Click " + locator);
		return true;
	}

	public boolean sendKeysElement(By locator, String text) {
		try {
			driver.findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			log.info("Don't send keys element " + locator);
			return false;
		}
		log.info("Send keys element: " + locator);
		return true;
	}

	public boolean selectValue(By selector, int index) {
		Select dropdown = new Select(driver.findElement(selector));
		dropdown.selectByIndex(index);
		return true;
	}

	public String checkUrl() {
		String Url;
		try {
			Url = driver.getCurrentUrl();
		} catch (NoSuchElementException e) {
			log.info("Not found url ");
			return "Not found url";
		}
		log.info("Found url ");
		return Url;
	}

	public String readText(By locator) {
		try {
			return driver.findElement(locator).getText();
		} catch (NoSuchElementException e) {
			log.info("Not found text ");
			return "Not found text ";
		}
	}

	public boolean inputEmailAddress(By locator) {
		try {
			DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmss");
			Date today = Calendar.getInstance().getTime();
			String todayDate = df.format(today);
			String newmail = "radchanka" + todayDate + "@gmail.com";
			driver.findElement(locator).sendKeys(newmail);
			log.info("Input EmailAddress");
			return true;
		} catch (NoSuchElementException e) {
			log.info("Not found EmailAddress ");
			return false;
		}
	}

	public boolean attachFile(By locator) {
		try {
			File file = new File("./files/test.txt");
			driver.findElement(locator).sendKeys(file.getAbsolutePath());
			log.info("Attach File success");
			return true;
		} catch (NoSuchElementException e) {
			log.info("Don't attach File success ");
			return false;
		}
	}

	public boolean moveToElement(By locator) {
		try {
			Actions actions = new Actions(driver);
			element = driver.findElement(locator);
			actions.moveToElement(element).build().perform();
			log.info("Move to element " + locator + " success");
			return true;
		} catch (NoSuchElementException e) {
			log.info("Don't move to element " + locator);
			return false;
		}

	}

	public boolean selectValue(By locator, String text) {
		try {
			Select dropdown = new Select(driver.findElement(locator));
			dropdown.selectByVisibleText(text);
			log.info("Select value " + locator + " success");
			return true;
		} catch (NoSuchElementException e) {
			log.info("Don't select value " + locator);
			return false;
		}
	}

}
