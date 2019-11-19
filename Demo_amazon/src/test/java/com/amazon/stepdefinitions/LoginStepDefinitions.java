package com.amazon.stepdefinitions;

import static com.amazon.Runnerclass.loginPage;
import static com.amazon.Runnerclass.loginPageInstance;
import static com.utilites.GenericDrivers.driver;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import com.utilites.Wait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions   
{
	
	@When("^The user is on the home page$")
	public void The_user_is_on_the_home_page() {
		
		driver.get("https://www.amazon.in/");
	};
	
	
	@Then("^Verify page title$")
	public void Verify_page_title() {
	
	    String actual = driver.getTitle();
	    String Exp = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	 
	  //  Assert.assertEquals( Exp	,actual);
	   
	    SoftAssertions sa = new SoftAssertions();
	    sa.assertThat(actual).isEqualToIgnoringCase(Exp);
	    System.out.println("------------------not working----------------------------");
		
	    sa.assertAll();
	
	};
		
	
	@Given("^The user is on the website page$")
	public void The_user_is_on_the_website_page() {
	
		driver.get("https://www.amazon.in/");
		
			};
	
	@When("^user clicks on the Login button$")
	public void  user_clicks_on_the_Login_button() 
	{
         //Wait.implicitwait(10);
		Wait.expicitwait(15, loginPageInstance.loginbutton);
	    Actions act = new Actions(driver);
	    act.doubleClick(loginPageInstance.loginbutton).build().perform();
	};
							
	@And("^user enter email \"([^\"]*)\"$")
	public void user_enter_email(String email_id)	
	{
		System.out.println(email_id);
		Wait.expicitwait(15, loginPage.emailTxtBox);
		loginPage.emailTxtBox.sendKeys(email_id);		
		//System.out.println(arg1);
	   
	};
	@And("^clicks on continue$")
	public void clicks_on_continue()
	{

		Wait.implicitwait(10);	
		loginPage.continueLogin.click();
	  
	};
   @And("^user enter password \"([^\"]*)\"$")
	public void user_enter_password(String password)
	
	{
		Wait.implicitwait(10);	
		loginPage.password.sendKeys(password);		
		//System.out.println(password);
	   
	};
	@And("^user click on Login$")
	public void user_click_on_Login()
	{

		Wait.implicitwait(10);	
		loginPage.loginButton.click();
	  
	};

	@Then("^user should be logged into the application$")
	public void user_should_be_logged_into_the_application()
	{
	    
	}
	
	
}

