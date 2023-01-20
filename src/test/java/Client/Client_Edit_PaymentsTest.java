package Client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Life_Insurance.Generic_Utilities.BaseClass;
import com.Life_Insurance.Generic_Utilities.ExcelUtility;
import com.Life_Insurance.Generic_Utilities.FileUtility;
import com.Life_Insurance.Generic_Utilities.WebDriverUtility;
import com.Life_Insurance.ObjectRepo.ClientsPage;
import com.Life_Insurance.ObjectRepo.ClientsStatusPage;
import com.Life_Insurance.ObjectRepo.EditPaymentPage;
import com.Life_Insurance.ObjectRepo.HomePage;
import com.Life_Insurance.ObjectRepo.LoginPage;
import com.Life_Insurance.ObjectRepo.UpdatePaymentPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Client_Edit_PaymentsTest extends BaseClass {

@Test(groups="smoke")
public void clientEditPayments() throws Throwable
{
		
		ExcelUtility e = new ExcelUtility();
		
		HomePage hp = new HomePage(driver);
		hp.getClientTab().click();
				
		ClientsPage cp = new ClientsPage(driver);
		String clientId = e.getExcelData("EditPayment", 0, 1);
		cp.clickClientStatus(driver,clientId);
		
		ClientsStatusPage csp = new ClientsStatusPage(driver);
		csp.clickOnEditPayment(driver, e.getExcelData("EditPayment",1, 1));
		
		EditPaymentPage ep = new EditPaymentPage(driver);
		ep.getUpdatebtn().click();
		
		UpdatePaymentPage up = new UpdatePaymentPage(driver);
		String text = up.getConfirmationtxt().getText();
		
		if(text.contains("New record updated successfully")) {
			System.out.println("payment updated successfully");
		}
		else {
			System.out.println("unable to update payment");
		}
		
			
		
	}

}
