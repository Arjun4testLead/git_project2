package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
	WebDriver driver;
	
	public AddNewCustomer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	WebElement newCustomer;

	@FindBy(xpath = "//input[@name='name']")
	WebElement customerName;

	@FindBy(xpath = "//input[@value='m']")
	WebElement MaleGender;

	@FindBy(xpath = "//input[@value='f']")
	WebElement FemaleGender;

	@FindBy(xpath = "//input[@id='dob']")
	WebElement dob;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement address;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//input[@name='state']")
	WebElement state;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pin;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement cell;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='sub']")
	WebElement submitButton;

	@FindBy(xpath = "//a[normalize-space()='Log out']")
	WebElement logOutButton;

	
	
	public void clickNewCustomer() {
		newCustomer.click();
	}

	public void enterCustomerName(String name) {
		customerName.sendKeys(name);
	}

	public void clickMaleGender() {
		MaleGender.click();
	}

	public void clickFemaleGender() {
		FemaleGender.click();
	}

	public void enterDOB(String mm, String dd, String yyyy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yyyy);
	}

	public void enterAddress(String streetNo) {
		address.sendKeys(streetNo);	
	}

	public void enterCity(String cityName) {
		city.sendKeys(cityName);
	}

	public void enterState(String stateName) {
		state.sendKeys(stateName);
	}

	public void enterPIN(String pinNo) {
		pin.sendKeys(pinNo);
	}

	public void enterCELL(String cellNo) {
		cell.sendKeys(cellNo);
	}


	public void enterEMAIL(String emailId) {
		email.sendKeys(emailId);
	}

	public void enterPASS(String pass) {
		password.sendKeys(pass);
	}

	public void clickSubmit() {
		submitButton.click();
	}
	
	public void clickLogOut() {
		logOutButton.click();
	}

}
