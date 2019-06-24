package automationpractice.com.Radchanka.base;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	protected WebDriver driver;
	protected WebElement element;
	protected List<WebElement> elements;
	protected static Logger log = Logger.getLogger(BasePage.class.getName());

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

}
