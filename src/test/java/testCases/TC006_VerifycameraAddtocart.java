package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.cameraSearchPage;
import testBase.BaseClass;

public class TC006_VerifycameraAddtocart extends BaseClass {

	@Test(groups = { "Sanity", "Master" })

	public void verifyCameraAddToCart() {

		logger.info("***Starting TC006 AddtoCart");

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

			cameraSearchPage csp = new cameraSearchPage(driver);

			csp.Addtocart();

			Assert.assertEquals("Nikon D300", csp.getmessage());
			
			logger.info("***End TC006 AddtoCart");


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
