package com.Life_Insurance.Generic_Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Life_Insurance.ObjectRepo.HomePage;
import com.Life_Insurance.ObjectRepo.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public FileUtility f = new FileUtility();
	public ExcelUtility e = new ExcelUtility();
	public JavaUtility j = new JavaUtility();
	public WebDriverUtility w = new WebDriverUtility();
	public static WebDriver driver=null;

	@BeforeSuite(groups={"smoke","regression"})
	public void  connectToDB() {
		System.out.println("Connected to DB");
	}
	@Parameters("Browser")
	@BeforeClass(groups={"smoke","regression"})
	public void configBC(String Browser) throws Throwable {
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();}
		else if(Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.setAcceptInsecureCerts(true);
			driver = new FirefoxDriver(options);
		}
		System.out.println("Browser launched");
		w.maximizeWindow(driver);
		w.waitForPageToLoad(driver);
		String url = f.getPropertyData("url");
		driver.get(url);
	}
	
	@BeforeMethod(groups={"smoke","regression"})
	public void loginToApp() throws Throwable {
		
		System.out.println("Login");
		String usn = f.getPropertyData("usn");
		String pwd = f.getPropertyData("pwd");
		LoginPage l = new LoginPage(driver);
		System.out.println(driver.getCurrentUrl());
		l.login(usn, pwd);
		System.out.println("Logged in");
	}
	
	@AfterMethod(groups={"smoke","regression"})
	public void logoutOfApp() {
		HomePage hp = new HomePage(driver);
		hp.getLogoutbtn().click();
		System.out.println("Logged out");
	}
	
	
	@AfterClass(groups={"smoke","regression"})
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser closed");
	}

	@AfterSuite(groups={"smoke","regression"})
	public void closeDB() {
		System.out.println("close the database");
	}
}
