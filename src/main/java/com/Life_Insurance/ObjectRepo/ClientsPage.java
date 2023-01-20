package com.Life_Insurance.ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsPage {
	
	@FindBy(linkText = "Add Client")
	private WebElement addClientBtn;
	

	
	public ClientsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickClientStatus(WebDriver driver, String clientID) {
		
		driver.findElement(By.xpath("//td[text()='"+clientID+"']/following-sibling::td[6]/child::a")).click();
	
}
	
	public void clickEditClient(WebDriver driver, String clientId) {
		
		driver.findElement(By.xpath("//td[text()='"+clientId+"']/following-sibling::td[7]/child::a")).click();
	}


	public void clickOnEditLink(WebDriver driver, String clientId) {
		
		driver.findElement(By.xpath("//td[text()='"+clientId+"']/../td[8]/a")).click();
		
	}
	
	public WebElement getAddClientBtn() {
		return addClientBtn;
	}
	
	
	
	}
