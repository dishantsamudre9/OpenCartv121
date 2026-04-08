package testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC004_Search extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void verify_text() {
		logger.info("***Starting TC004 Search");
		try {
			HomePage hp = new HomePage(driver);

			hp.clickMyAccount();
			hp.login();

			LoginPage lp = new LoginPage(driver);

			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clicklogin();
	
			SearchPage sp = new SearchPage(driver);
			
			sp.searchProduct("Mobile");
			sp.clickbutton();

			String actualText = sp.getMobileText();

			Assert.assertEquals(actualText, "Search - Mobile");
			logger.info("+++++++End text is verified+++++++++++++++++++");
		} catch (Throwable e) {

			// System.out.println(e.getMessage());
			Assert.fail("text failed" + e.getMessage());

		}

	}

}
