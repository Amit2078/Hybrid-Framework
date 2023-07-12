package com.inetBanking.testCases;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBankingV1.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void LoginTest()
	{
		driver.get(baseURL);
		log.info("url is started");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		log.info("entered username");
		lp.setPassword(password);
		log.info("entered password");
		lp.clickSubmit();
		log.info("clicked on login button");
		String act_title = "GTPL Bank Manager HomePage";
		Assert.assertTrue(driver.getTitle().equals(act_title));
		log.info("test is passed");
	}

}
