package testNGclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {
	
	@Test
	public void sample1()
	{		
		System.out.println("Failing assert");
		Assert.fail();
	}
	
	@Test
	public void sample2() {
		System.out.println("executed only sample 2");
	}
}