package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUtility {
	
	
	public static void scrollPage(WebDriver driver, int pageHeight) {
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0, pageHeight)");
	}
	
	
	public static void scrollToElement(WebDriver driver, WebElement element) {
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
