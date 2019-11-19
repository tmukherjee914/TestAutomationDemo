package com.amazon.pageLocaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage2Locators extends AbstractPage {
	
	@FindBy(xpath="//input[@id='ap_email']")
	public  WebElement emailTxtBox;
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continueLogin;
	
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement loginButton;

	public LoginPage2Locators(WebDriver driver)
	{
		
			super(driver);
		    //PageFactory.initElements(driver, this);
	}

}
