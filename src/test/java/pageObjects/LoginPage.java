package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='uid']") 
	WebElement userName;

	@FindBy(xpath = "//input[@name='password']") 
	WebElement passWord;

	@FindBy(xpath = "//input[@name='btnLogin']") 
	WebElement loginButton;


	public void enterUid(String uid) {
		userName.sendKeys(uid);
	}

	public void enterPassword(String pass) {
		passWord.sendKeys(pass);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
