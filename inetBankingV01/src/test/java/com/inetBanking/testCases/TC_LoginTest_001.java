package com.inetBanking.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest( ) throws InterruptedException {
		
		Thread.sleep(3);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickLogin();
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			logger.info("Login Pass");
			Assert.assertTrue(true);
			
		}
		else
		{
			logger.info("Login Fail");
			Assert.assertTrue(false);
			
		}
		
	}

}
