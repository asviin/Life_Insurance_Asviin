package Client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Life_Insurance.Generic_Utilities.BaseClass;
import com.Life_Insurance.Generic_Utilities.ExcelUtility;
import com.Life_Insurance.Generic_Utilities.FileUtility;
import com.Life_Insurance.Generic_Utilities.WebDriverUtility;
import com.Life_Insurance.ObjectRepo.ClientsPage;
import com.Life_Insurance.ObjectRepo.ClientsStatusPage;
import com.Life_Insurance.ObjectRepo.EditClientPage;
import com.Life_Insurance.ObjectRepo.HomePage;
import com.Life_Insurance.ObjectRepo.LoginPage;
import com.Life_Insurance.ObjectRepo.UpdateClientPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clients_Edit_ClientTest extends BaseClass {

	@Test(groups="smoke")
	public void editClient() throws Throwable
	{
		ExcelUtility e = new ExcelUtility();
		HomePage hp = new HomePage(driver);
		hp.getClientTab().click();
		
		String clientId = e.getExcelData("EditPayment", 0, 1);
		ClientsPage cp = new ClientsPage(driver);
		cp.clickEditClient(driver, clientId);
				
		EditClientPage ecp = new EditClientPage(driver);
		ecp.getUpdateBtn().click();
		
		UpdateClientPage ucp = new UpdateClientPage(driver);
		String text = ucp.getConfirmationtxt().getText();
		
		if(text.contains("Client record updated successfully")) {
			System.out.println("Client has been updated");
		}
		
		else {
			System.out.println("Client record not updated");
		}
		
}

}


