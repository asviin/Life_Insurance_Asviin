package com.Life_Insurance.ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsStatusPage {
	
	@FindBy(linkText = "Edit Client")
	private WebElement editClientLink;
	
	@FindBy(linkText = "Add Payment")
	private WebElement addPaymentLink;
	
	@FindBy(linkText = "Add Nominee")
	private WebElement addNomineeLink;
	
	@FindBy(linkText = "Delete Client")
	private WebElement deleteClient;
	
	@FindBy(xpath = "(//a[text()='Edit'])[2]")
	private WebElement editPaymentlink;
	
	public ClientsStatusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getEditPaymentlink() {
		return editPaymentlink;
	}

	public void clickOnEditPayment(WebDriver driver, String receiptNo) {
		
		driver.findElement(By.xpath("//td[text()='1671787812_159057673']/../td[7]/a")).click();
	}
	
	public void clickOnEditNominee(WebDriver driver, String nomineeName) {
		
		driver.findElement(By.xpath("//td[text()='Nominee_14']/../td[7]/a")).click();
		
	}

	public WebElement getEditClientLink() {
		return editClientLink;
	}

	public WebElement getAddPaymentLink() {
		return addPaymentLink;
	}

	public WebElement getAddNomineeLink() {
		return addNomineeLink;
	}

	public WebElement getDeleteClient() {
		return deleteClient;
	}
		
	
	

}
