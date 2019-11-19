package com.amazon;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.utilites.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


import com.amazon.pageLocaters.*;
import com.amazon.pageLocaters.LoginPageLocators;

import static com.utilites.GenericDrivers.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/test/Desktop/WPOS_Automation/Demo_amazon/src/test/resources/Features/Search.feature",glue= "com/amazon/stepdefinitions",


plugin = {
        //"rerun:target/rerun.txt",
        "pretty",
       "junit:target/cucumber-xml-report.xml",
        "html:target/cucumber-reports",
        "json:target/test-results.json"
},
monochrome = true)

public class Runnerclass {
	public static LoginPageLocators loginPageInstance;
	public static LoginPage2Locators loginPage;
	public static ItemSearchLocator searchitem;
 
  @BeforeClass
   public static void setUp()
  {
	  
	  GenericDrivers.Browser("Chrome");
	  pageObjectSetup();
	 
	}
  
  
  @AfterClass
  public static void close()
  {
	  
	  //driver.quit();
  }
  
  public static void pageObjectSetup()
  {
	 //driver = GenericDrivers.getDriver();
	 loginPageInstance = new LoginPageLocators(driver);
	 loginPage =new LoginPage2Locators(driver);
	 searchitem =new ItemSearchLocator(driver);
  }
  
}

