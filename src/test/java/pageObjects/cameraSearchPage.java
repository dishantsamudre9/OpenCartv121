package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cameraSearchPage extends BasePage{

	public cameraSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//button[@onclick=\"cart.add('31', '1');\"]")
	WebElement Addcart;
	
	@FindBy(xpath = "(//a[text()='Nikon D300'])[2]")
	WebElement getmsg;
	
	public void Addtocart() {
		Addcart.click();
	}
	
	public String getmessage() {
		String text;
		return getmsg.getText();
	}

}
