package com.amazon.pageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilites.GenericDrivers;



public class LoginPageLocators extends AbstractPage   {
	
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	public  WebElement loginbutton;


	public LoginPageLocators(WebDriver driver)
	{
		
			super(driver);
		    //PageFactory.initElements(driver, this);
	}

}
