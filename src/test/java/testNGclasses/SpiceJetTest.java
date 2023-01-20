package testNGclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetTest {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(7000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("document.getElementsByClassName('css-76zvg2 css-bfa6kz r-homxoj r-ubezar').value='Wed, 18 Jan 2023'");
		
	}

}
