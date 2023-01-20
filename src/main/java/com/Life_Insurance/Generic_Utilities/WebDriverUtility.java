package com.Life_Insurance.Generic_Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
	
	public void waitForPageToLoad(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
	}
	
	public void waitForPageToLoadForJSElement(WebDriver driver) {
		
		driver.manage().timeouts().setScriptTimeout(Duration.ofMillis(5000));
		
	}
	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	

}
