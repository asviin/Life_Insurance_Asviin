package testNGclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest2 {
	
	WebDriver driver = null;
	
	@Test(groups = "regression")
	public void sample3() {
		System.out.println("open browser sample---3");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.close();
	}
	
	@Test(groups = {"smoke","regression"})
	public void sample4() {
		System.out.println("open browser sample---4");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.close();
	}
	
	
	

}
