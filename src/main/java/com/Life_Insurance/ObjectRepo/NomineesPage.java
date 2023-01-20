package com.Life_Insurance.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NomineesPage {
	
	@FindBy(linkText = "Add Nominee")
	private WebElement addNomineeLink;
	
	public NomineesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNomineeLink() {
		return addNomineeLink;
	}

	
	
	
}
