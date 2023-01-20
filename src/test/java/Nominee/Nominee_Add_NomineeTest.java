package Nominee;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Life_Insurance.Generic_Utilities.BaseClass;
import com.Life_Insurance.Generic_Utilities.ExcelUtility;
import com.Life_Insurance.Generic_Utilities.FileUtility;
import com.Life_Insurance.Generic_Utilities.WebDriverUtility;
import com.Life_Insurance.ObjectRepo.AddNomineePage;
import com.Life_Insurance.ObjectRepo.HomePage;
import com.Life_Insurance.ObjectRepo.InsertNomineePage;
import com.Life_Insurance.ObjectRepo.LoginPage;
import com.Life_Insurance.ObjectRepo.NomineesPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nominee_Add_NomineeTest extends BaseClass {
	
	@Test
	public void AddNominee() throws Throwable{
		
				
		HomePage hp = new HomePage(driver);
		hp.getNomineeTab().click();
		
		ExcelUtility e = new ExcelUtility();
		NomineesPage np = new NomineesPage(driver);
		np.getAddNomineeLink().click();
		
		Assert.fail();
		AddNomineePage anp = new AddNomineePage(driver);
		String clientId = e.getExcelData("Add_Nominee", 0, 1);
		String name = e.getExcelData("Add_Nominee", 1, 1);
		String gender = e.getExcelData("Add_Nominee", 2, 1);
		String bdate = e.getExcelData("Add_Nominee", 3, 1);
		String nid = e.getExcelData("Add_Nominee", 4, 1);
		String rel = e.getExcelData("Add_Nominee", 5, 1);
		String pr = e.getExcelData("Add_Nominee", 6, 1);
		String ph = e.getExcelData("Add_Nominee", 7, 1);
		anp.addNomineeDetails(clientId, name, gender,bdate,nid,rel,pr,ph);
		
		InsertNomineePage inp = new InsertNomineePage(driver);
		String text = inp.getConfirmationtxt().getText();
		
		if(text.contains("New Nominee ADDED")) {
			System.out.println("New nominee has been added");
		}
		else {
			System.out.println("Unable to add nominee");
		}
	
	}
}
