package com.inetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "uid")
	WebElement txtusername;
	
	@FindBy(name = "password")
	WebElement txtpassword;
	
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}

}
