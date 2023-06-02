package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameUtility {

	public static void handleFrameByIDorName(WebDriver driver, String id) {

		driver.switchTo().frame(id);
	}

	public static void handleFrameByWebElement(WebDriver driver, WebElement element) {

		driver.switchTo().frame(element);
	}


}
