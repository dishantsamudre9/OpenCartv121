package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*Page object class consider 3 part
1]Constructor
2]Locator
3]Action Method*/
public class HomePage extends BasePage {

	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);
		// here driver is send to use base class to intialize element present in home
		// page using pagefactory.initElements which is present in base class by
		// inhereitance we extend it in base class
		// to achieve reuseability no need to write again
		// it is invoke the parent constructor by using child constructor
	}

	// Locator
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement linkMyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement linkRegister;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement login;
	

	// Action Method
	public void clickMyAccount() {
		linkMyaccount.click();

	}

	public void Register() {
		linkRegister.click();
	}
	
	public void login() {
		login.click();
	}

}
