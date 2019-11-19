package com.utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericDrivers {

	public static WebDriver driver;	
	
	public static  void Browser (String browser) {
		if (browser.equalsIgnoreCase("Chrome")) 
		{			
			WebDriverManager.chromedriver().                                                                                                                                                                                                                                                                      setup();
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
					  
		}
		
		if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("start-maximized");
			driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		   
		
	}	
}
	
//	 public void loadPage(){
//	        //PageFactory.initElements(driver, this);
//	    }
}
