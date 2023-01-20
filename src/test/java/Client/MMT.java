package Client;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMT {

	public static void main(String[] args) throws Throwable {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.makemytrip.com/");
	Actions a = new Actions(driver);
	a.moveByOffset(10, 10).click().perform();
	a.moveByOffset(10, 10).click().perform();
	driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	driver.findElement(By.xpath("//p[text()='1']/ancestor::div[@class='February']/div[@class='DayPicker-Day']/div/p[text()='1']")).click();
	driver.findElement(By.xpath("//span[text()='RETURN']")).click();
	driver.findElement(By.xpath(""));
	
	}

}
