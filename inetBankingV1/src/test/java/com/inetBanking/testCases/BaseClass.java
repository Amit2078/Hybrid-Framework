package com.inetBanking.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	public String baseURL = "https://demo.guru99.com/V1/index.php";
	public String username = "mngr26593";
	public String password = "1234567@";
	public static WebDriver driver;
	public static Logger log;
	
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		log = LogManager.getLogger(BaseClass.class.getName());
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
