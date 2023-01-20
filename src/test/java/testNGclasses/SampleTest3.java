package testNGclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest3 {

WebDriver driver = null;
	
	@Test(groups = "smoke")
	public void sample5() {
		System.out.println("open browser sample---5");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.close();
	}
	
	@Test(groups = {"regression"})
	public void sample6() {
		System.out.println("open browser sample---6");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.close();
	}
	
	

	
	
}
