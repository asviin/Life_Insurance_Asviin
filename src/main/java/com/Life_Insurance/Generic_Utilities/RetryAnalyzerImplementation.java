package com.Life_Insurance.Generic_Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {

	int i=0;
	
	
	public boolean retry(ITestResult result) {
		
		while(i<4) {
		i++;
		return true;
		}
		
		return false;
	}
	
	
	
}
