package com.Life_Insurance.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePaymentPage {
	
	@FindBy(xpath = "//div[@class='col-md-12']")
	private WebElement confirmationtxt;
	
	public UpdatePaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirmationtxt() {
		return confirmationtxt;
	}
	
	
	
	

}
