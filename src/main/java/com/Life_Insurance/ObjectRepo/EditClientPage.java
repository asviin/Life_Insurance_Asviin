package com.Life_Insurance.ObjectRepo;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditClientPage {
	
	@FindBy(linkText = "Add Client")
	private WebElement addClientLink;
	
	@FindBy(xpath = "//input[@name='fileToUpload']")
	private WebElement fileUploadBtn;
	
	@FindBy(xpath = "//input[@value='UPDATE']")
	private WebElement updateBtn;
	
	@FindBy(linkText = "Delete Client")
	private WebElement deleteClientLink;
	
	@FindBy(name = "client_id")
	private WebElement clientIdtxtbox;
	
	@FindBy(name = "client_password")
	private WebElement clientPwdtxtbox;
	
	@FindBy(name = "name")
	private WebElement clientNametxtbox;
	
	@FindBy(name = "sex")
	private WebElement clientGendertxtbox;
	
	@FindBy(name = "birth_date")
	private WebElement clientBirthdatetxtbox;
	
	@FindBy(name = "marital_status")
	private WebElement clientMaritaltxtbox;
	
	@FindBy(name = "nid")
	private WebElement clientNidtxtbox;
	
	@FindBy(name = "phone")
	private WebElement clientPhonetxtbox;
	
	@FindBy(name = "phone")
	private WebElement clientphonetxtbox;
	
	@FindBy(name = "address")
	private WebElement clientAddresstxtbox;
	
	@FindBy(name = "policy_id")
	private WebElement clientPolicytxtbox;
	
	@FindBy(name = "agent_id")
	private WebElement clientAgenttxtbox;
	
	
	
	
	public EditClientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}




	public WebElement getAddClientLink() {
		return addClientLink;
	}




	public WebElement getFileUploadBtn() {
		return fileUploadBtn;
	}




	public WebElement getUpdateBtn() {
		return updateBtn;
	}




	public WebElement getDeleteClientLink() {
		return deleteClientLink;
	}




	public WebElement getClientIdtxtbox() {
		return clientIdtxtbox;
	}




	public WebElement getClientPwdtxtbox() {
		return clientPwdtxtbox;
	}




	public WebElement getClientNametxtbox() {
		return clientNametxtbox;
	}




	public WebElement getClientGendertxtbox() {
		return clientGendertxtbox;
	}




	public WebElement getClientBirthdatetxtbox() {
		return clientBirthdatetxtbox;
	}




	public WebElement getClientMaritaltxtbox() {
		return clientMaritaltxtbox;
	}




	public WebElement getClientNidtxtbox() {
		return clientNidtxtbox;
	}




	public WebElement getClientPhonetxtbox() {
		return clientPhonetxtbox;
	}




	public WebElement getClientphonetxtbox() {
		return clientphonetxtbox;
	}




	public WebElement getClientAddresstxtbox() {
		return clientAddresstxtbox;
	}




	public WebElement getClientPolicytxtbox() {
		return clientPolicytxtbox;
	}




	public WebElement getClientAgenttxtbox() {
		return clientAgenttxtbox;
	}
	
	public void editClientDetails(WebDriver driver, String sheetName) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
	}
	
	

}
