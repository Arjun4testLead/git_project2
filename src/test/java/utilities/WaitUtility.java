package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	
	public static void implecit_wait(WebDriver driver, long sec) {
		
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	
	public static void explecit_waitForVisibilityOfElement(WebDriver driver, long sec, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
