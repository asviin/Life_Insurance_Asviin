package testNGclasses;

import java.sql.Connection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Life_Insurance.Generic_Utilities.ExcelUtility;
import com.mysql.cj.xdevapi.Statement;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class NewTest  {
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser has been launched");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("You have logged in");
	}
		
	@Test
  public void transport() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Future Planet']"));
		int y = ele.getLocation().getY();
		System.out.println(y);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,"+y+")");
		driver.close();
  }

  
  @AfterMethod
  public void logout() {
	  System.out.println("Logged out");
  }
  
  @AfterClass
  public void closeBrowser() {
	  System.out.println("browser closed");
  }
  
  
  
   
}
