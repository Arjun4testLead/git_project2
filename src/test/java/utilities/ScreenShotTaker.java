package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotTaker {
	
	static String screenShotPath = null;
	
	public static String take_screenshot(WebDriver driver, String screenshotName) {
		
		try {
			String timeStamp = new SimpleDateFormat("MM.dd.yyyy__HH.mm.ss").format(new Date());
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File(System.getProperty("user.dir")+"./screenShots/"+screenshotName+"_"+timeStamp+".png");
			FileUtils.copyFile(srcFile, destFile);
			
			screenShotPath = destFile.getAbsolutePath();
			
		} catch (Exception e) {
			System.out.println("Exception : "+ e.getMessage());
		}
		return screenShotPath;
		
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		ScreenShotTaker.take_screenshot(driver, "facebook");
		
	}

}
