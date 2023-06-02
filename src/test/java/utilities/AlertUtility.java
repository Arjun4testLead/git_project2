package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertUtility {
	
	public static boolean alertPresent(WebDriver driver) {
		
		try {
			
			driver.switchTo().alert();
			
			return true;
			
		} 
		catch (Exception e) {

			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		RedaObjectUtility read = new RedaObjectUtility();
		
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(read.getUserName());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(read.getPassword());
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
		
		if(AlertUtility.alertPresent(driver)==true) {
			
			driver.switchTo().alert().accept();
			System.out.println("alert is accepted");
		}
		else {
			System.out.println("alert is not present");
		}
		
		
		
	}

}
