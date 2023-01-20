package com.Life_Insurance.ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPaymentPage {
	
	@FindBy(name = "recipt_no")
	private WebElement receipttbx;
	
	@FindBy(name = "client_id")
	private WebElement clientIdtbx;
	
	@FindBy(name = "month")
	private WebElement monthtbx;
	
	@FindBy(name = "amount")
	private WebElement amttbx;
	
	@FindBy(name = "due")
	private WebElement duetbx;
	
	@FindBy(name = "fine")
	private WebElement finetbx;
	
	@FindBy(name = "agent_id")
	private WebElement agentIdtbx;
	
	@FindBy(xpath = "//input[@value='UPDATE']")
	private WebElement updatebtn;
	
	public EditPaymentPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getReceipttbx() {
		return receipttbx;
	}

	public WebElement getClientIdtbx() {
		return clientIdtbx;
	}

	public WebElement getMonthtbx() {
		return monthtbx;
	}

	public WebElement getAmttbx() {
		return amttbx;
	}

	public WebElement getDuetbx() {
		return duetbx;
	}

	public WebElement getFinetbx() {
		return finetbx;
	}

	public WebElement getAgentIdtbx() {
		return agentIdtbx;
	}

	public WebElement getUpdatebtn() {
		return updatebtn;
	}
	
	
	
	
	
	
	

}
