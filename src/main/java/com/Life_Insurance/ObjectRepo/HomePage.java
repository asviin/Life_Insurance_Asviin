package com.Life_Insurance.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "CLIENTS")
	private WebElement clientTab;
	
	@FindBy(linkText = "AGENTS")
	private WebElement agentsTab;
	
	@FindBy(linkText = "POLICY")
	private WebElement policyTab;
	
	@FindBy(linkText = "NOMINEE")
	private WebElement nomineeTab;
	
	@FindBy(linkText = "PAYMENTS")
	private WebElement paymentsTab;
	
	@FindBy(xpath = "//a[@title='Logout']")
	private WebElement logoutbtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClientTab() {
		return clientTab;
	}

	public WebElement getAgentsTab() {
		return agentsTab;
	}

	public WebElement getPolicyTab() {
		return policyTab;
	}

	public WebElement getNomineeTab() {
		return nomineeTab;
	}

	public WebElement getPaymentsTab() {
		return paymentsTab;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	
	
	
}
