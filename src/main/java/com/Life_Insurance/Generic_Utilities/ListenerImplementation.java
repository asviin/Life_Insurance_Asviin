package com.Life_Insurance.Generic_Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation extends BaseClass implements ITestListener {
	
	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test = report.createTest(methodName);
		Reporter.log(methodName+"Test script execution start");
	}

	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+"---- passed");
		Reporter.log(methodName+"-----> test execution successful");
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		EventFiringWebDriver efd = new EventFiringWebDriver(driver);
		File src = efd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+name+".png");
		String filePath = dest.getAbsolutePath();
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filePath);
		test.log(Status.FAIL, result.getThrowable());
		Reporter.log("Testscript Execution failed");
	}

	public void onTestSkipped(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+"---> test has skipped");
		Reporter.log(methodName+"--> script execution skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("SDET 45 extent report");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("Life Insurance Report ");
		
		report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base Browser", "Chrome");
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("Base Url", "https://localhost:8888");
		report.setSystemInfo("Reporter Name", "Asviin");
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}
	
	

}
