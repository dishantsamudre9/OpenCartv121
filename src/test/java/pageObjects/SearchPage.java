package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@name=\"search\"]")
	WebElement Searchtextproduct;

	@FindBy(xpath = "(//button[@type=\"button\"])[4]")
	WebElement ClickButton;

	@FindBy(xpath = "//div[@id=\"content\"]//h1")
	WebElement GetTextMobile;
	
	public void searchbarclick() {
		Searchtextproduct.click();
	}

	public void searchProduct(String Product) {
		Searchtextproduct.sendKeys(Product);
	}

	public void clickbutton() {
		ClickButton.click();
	}

	public String getMobileText() {
		return GetTextMobile.getText();
	}
}
