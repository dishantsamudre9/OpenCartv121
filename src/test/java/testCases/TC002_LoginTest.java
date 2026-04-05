package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		logger.info("****starting tc001 login******");
		try {
			// homepage

			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.login();
			// login page
			LoginPage lp = new LoginPage(driver);

			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clicklogin();
			// my account
			MyAccountPage macc = new MyAccountPage(driver);

			boolean targetpage = macc.isMyAccountPageExit();

			// Assert.assertEquals(targetpage, true,"Login Failed");
			Assert.assertTrue(targetpage);
			logger.info("assert pass");
		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("++++++Finished TC_002Login Test++++");
	}
}
