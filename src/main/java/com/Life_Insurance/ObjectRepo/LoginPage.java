package com.Life_Insurance.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name = "username")
	private WebElement usntbx;
	
	@FindBy(name = "password")
	private WebElement pwdtbx;
	
	@FindBy(xpath = "//button[text()='login']")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsntbx() {
		return usntbx;
	}

	public WebElement getPwdtbx() {
		return pwdtbx;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void login(String usn, String pwd) {
		usntbx.sendKeys(usn);
		pwdtbx.sendKeys(pwd);
		loginbtn.click();
	}
	
	
	
}
