package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC005_mobilelink extends BaseClass {
	@Test(groups = { "Sanity", "Master" })
	public void mobile_isClick() {
		logger.info("***Starting TC005 Search");

		try {
			HomePage hp = new HomePage(driver);

			hp.clickMyAccount();
			hp.login();

			LoginPage lp = new LoginPage(driver);

			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clicklogin();

			SearchPage mb = new SearchPage(driver);

			mb.clickcameralink();

			logger.info(mb.getcamerapagetext());
			Assert.assertEquals("Cameras", mb.getcamerapagetext());

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

}