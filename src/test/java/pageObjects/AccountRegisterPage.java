package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage extends BasePage {
	
	    


		public AccountRegisterPage(WebDriver driver) {
			super(driver);// intialize using constructor invoke base class class constructor
		}

		@FindBy(xpath = "//input[@name=\"firstname\"]")
		WebElement txtFirstname;

		@FindBy(xpath = "//input[@id=\"input-lastname\"]")
		WebElement txtLastname;

		@FindBy(xpath = "//input[@id=\"input-email\"]")
		WebElement txtEmail;
		//
		@FindBy(xpath = "//input[@id='input-telephone']")
		WebElement txtTelephone;

		@FindBy(xpath = "//input[@id=\"input-password\"]")
		WebElement txtPassword;
		//
		@FindBy(xpath = "//input[@id=\"input-confirm\"]")
		WebElement txtConfmPassword;
		//
		@FindBy(xpath = "//input[@name='agree']")
        WebElement txtSubcribe;

		@FindBy(xpath = "//input[@name='agree']")
		WebElement checkoxPolicy;

		@FindBy(xpath = "//input[@value='Continue']")
		WebElement buttonContinue;

		@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
		WebElement msgConfirmation;

		public void setFirstName(String fname) {
			txtFirstname.sendKeys(fname);
		}

		public void setLastName(String lname) {
			txtLastname.sendKeys(lname);
		}

		public void setEmail(String email) {
			txtEmail.sendKeys(email);
		}
		//
		public void setTelephone(String telephone) {
			txtTelephone.sendKeys(telephone);
		}

		public void setPassw(String password) {
			txtPassword.sendKeys(password);
		}
		//
		public void setConfrmPassw(String password) {
			txtConfmPassword.sendKeys(password);
		}
		
		public void subscribe() {
			txtSubcribe.click();
		}

		public void checkBox() {
			checkoxPolicy.click();
		}

		public void btnContinue() {
			buttonContinue.click();

			// Alternative for button click
			// so12
			// btnContinue.submit();

			// so13
			// Actions act=new Actions(driver);
			// act.moveToElement(btnContinue).click().perform();

			// so14
			// JavascriptExecutor js=(JavascriptExecutor)driver;
			// js.executeScript("arguments[0].click();", btnContinue);

			// Sol 5
			// btnContinue.sendKeys(Keys.RETURN);

			// So16
			// WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();

		}

		// we always do the validation in test class never do in base class
		// it will just return the text and validation is done in text class
		// here no validation only return String
		public String getConfirmationmsg() {
			try {
				return (msgConfirmation.getText());// cature the text value "Your Account Has Been Created!" and return
													// it
			} catch (Exception e) {// if some time message is not found or showF it will through exception
				return (e.getMessage());
			}
		}
	}
