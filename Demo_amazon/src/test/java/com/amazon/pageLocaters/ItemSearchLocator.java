package com.amazon.pageLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ItemSearchLocator extends AbstractPage{

	public ItemSearchLocator(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement searchfield;
	
	
//	@FindBy(xpath="//div[@id='issDiv4']")
//	public WebElement searchlist;
	
	
	@FindBy(xpath="//div[@class='s-suggestion']")
	public List<WebElement> searchsuggest;
	
	
	

}
