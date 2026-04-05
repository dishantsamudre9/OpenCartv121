package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver;//data memeber
	
	public BasePage(WebDriver driver)//intialize data member using constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
// Base class is used reuse in each and every class by using inheritance using exFtend keyword