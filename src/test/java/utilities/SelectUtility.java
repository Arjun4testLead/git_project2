package utilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectUtility {
	

	public static void select_by_index(WebElement element, int index) {

		Select oselect = new Select(element);
		oselect.selectByIndex(index);
	}
	

	public static void select_by_value(WebElement element, String value) {

		Select oselect = new Select(element);
		oselect.selectByValue(value);
	}
	

	public static void select_by_visibleText(WebElement element, String text) {

		Select oselect = new Select(element);
		oselect.selectByVisibleText(text);
	}
	
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		RedaObjectUtility read = new RedaObjectUtility();
		
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(read.getUserName());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(read.getPassword());
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='New Account']")).click();
		
		
		WebElement account = driver.findElement(By.xpath("//select[@name='selaccount']"));
		SelectUtility.select_by_index(account, 1);
		
		WebElement account1 = driver.findElement(By.xpath("//select[@name='selaccount']"));
		SelectUtility.select_by_index(account1, 0);
//		
//		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
//		SelectUtility.select_by_visibleText(yr, "1985");
		
	}

}
