package com.Life_Insurance.Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	/**
	 * 
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	
	public String getPropertyData(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(IpathConstants.FILE_PATH);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}
