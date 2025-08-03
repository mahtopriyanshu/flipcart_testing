package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeliniumReusable;

public class SearchPage extends Library{
	
	SeliniumReusable se ;
	
	public SearchPage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement Searchtext;
	
	@FindBy(xpath="//html[@lang='en-IN']")
	WebElement Homepage;
	
	@FindBy(xpath="//html")
	WebElement Searchresult;
	public void Search(String Text) {
		se = new SeliniumReusable();
		se.EnterValue(Searchtext, Text);
	}
	
	public void ClickSearch()
	{
		Searchtext.sendKeys(Keys.ENTER);
	}
	
	public void homescreen()
	{
		System.out.println(Homepage.isDisplayed());
	}
	
	public void Result()
	{
		System.out.println(Searchresult.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	
	
	
}
