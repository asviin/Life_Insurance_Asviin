package com.Life_Insurance.ObjectRepo;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNomineePage {
	
	@FindBy(name = "client_id")
	private WebElement clientIdtbx;
	
	@FindBy(name = "name")
	private WebElement nametbx;
	
	@FindBy(name = "sex")
	private WebElement gendertbx;
	
	@FindBy(name = "birth_date")
	private WebElement birthdatetbx;
	
	@FindBy(name = "nid")
	private WebElement nidtbx;
	
	@FindBy(name = "relationship")
	private WebElement relationshiptbx;
	
	@FindBy(name = "priority")
	private WebElement prioritytbx;
	
	@FindBy(name = "phone")
	private WebElement phonetbx;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitbtn;
	
	public AddNomineePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getClientIdtbx() {
		return clientIdtbx;
	}

	public WebElement getNametbx() {
		return nametbx;
	}

	public WebElement getGendertbx() {
		return gendertbx;
	}

	public WebElement getBirthdatetbx() {
		return birthdatetbx;
	}

	public WebElement getNidtbx() {
		return nidtbx;
	}

	public WebElement getRelationshiptbx() {
		return relationshiptbx;
	}

	public WebElement getPrioritytbx() {
		return prioritytbx;
	}

	public WebElement getPhonetbx() {
		return phonetbx;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	ArrayList<String> al = new ArrayList<String>();
	public void addWebelements() {
		al.add("birthdatetbx");
		al.add("clientIdtbx");
		al.add("gendertbx");
		al.add("nametbx");
		al.add("phonetbx");
		al.add("relationshiptbx");
		al.add("nidtbx");
		al.add("prioritytbx");
	}

	
	
	
	
	
	
	public void addNomineeDetails(String client_id,String name,String sex,String bdate,String nid,String rel, String pr,  String ph) {
		
		clientIdtbx.sendKeys(client_id);
		nametbx.sendKeys(name);
		gendertbx.sendKeys(sex);
		birthdatetbx.sendKeys(bdate);
		nidtbx.sendKeys(nid);
		relationshiptbx.sendKeys(rel);
		prioritytbx.sendKeys(pr);
		phonetbx.sendKeys(ph);
		submitbtn.click();
	}	
	
}
