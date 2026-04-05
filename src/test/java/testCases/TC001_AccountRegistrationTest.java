package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegisterPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test(groups = { "Regression", "Master" })
	public void verif_account_registration() {

		logger.info("Starting TC_001");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked my account");

			hp.Register();
			logger.info("Click on Register");

			// actually what is done here WebDriver driver=new Cheomedriver(); //created
			// outside

			AccountRegisterPage regp = new AccountRegisterPage(driver);// passed inside

			// here driver is dependency //why it call dependency because HomePage depend on
			// driver
			// Passing into HomePage =Dependency injection
			// real time example driver is a car and HomePage is driver
			// without sending driver we get null point exception
			// this is a field injection which write in comment wedriver driver =new driver
			// it is tight coupling
			// setter injection and getter injection most use in the start of home page or
			// Account register page we use construct injection
			// and in base class starting we use setter injection
			// main aim is use for loose coupling so we can change browser any time not
			// depend on one browser
			// reusability , easy testing, better desgin(solid principale (dependency
			// inversion principle)),
			// real time example you=class
			// food =dependency
			// with di some one give food
			// without di you have to cook your food
			logger.info("Providing details");
			regp.setFirstName(randomString().toUpperCase());
			regp.setLastName(randomString().toUpperCase());
			regp.setEmail(randomString() + "@yopmail.com");
			regp.setTelephone(randomNumber());
			String password = randomPassword();
			regp.setPassw(password);
			regp.setConfrmPassw(password);
			// regp.subscribe();

			regp.checkBox();

			regp.btnContinue();

			logger.info("Validating expected message");

			String confmsg = regp.getConfirmationmsg();
			if (confmsg.equals("Your Account Has Been Created!")) {

				Assert.assertTrue(true);
			} else {
				logger.error("Test Failed..");
				logger.debug("Debug logs..");
				Assert.assertTrue(false);
			} // Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		} catch (Exception e) {

			Assert.fail("Test failed due to: " + e.getMessage());
			// Assert.fail();
			logger.debug("Debug logs..");

		}
		logger.info("++++Finished TC001_Account Registration+++");
	}

}
