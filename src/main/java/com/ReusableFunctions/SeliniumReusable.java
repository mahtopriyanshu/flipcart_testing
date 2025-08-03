package com.ReusableFunctions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Baseclass.Library;

public class SeliniumReusable extends Library {
	
	public void SeleniumReusable(WebDriver driver) {
		
		this.driver=driver;
		
	}
	//Enter the text of element
	public void EnterValue(WebElement element,String Text) {
		try
		{
			element.sendKeys(Text);
		}
		catch(Exception e)
		{
			System.out.println("No such element Exception");
		}
		
	}
	
	//click the element 
	public void click(WebElement element) {
		
		try
		{
			element.click();
		}
		catch(Exception e)
		{
			System.out.println("No such element Exception");
		}
	}

	//gets the title of the page 
	public void gettitle() {
		 try {
	            System.out.println( driver.getTitle());
	        } catch (Exception e) {
	            System.out.println("Unable to fetch title");
	        }
	}
	
	//take screen shot of the test cases 
	public void Screenshot(String path) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    try {
	        FileUtils.copyFile(src, new File(path));
	        
	    } catch (Exception e) {
	        System.out.println("screenshot could not be found");
	    }
	}

}
