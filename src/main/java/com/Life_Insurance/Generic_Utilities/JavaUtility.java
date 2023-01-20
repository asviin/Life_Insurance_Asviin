package com.Life_Insurance.Generic_Utilities;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber() {
		Random rd = new Random();
		return rd.nextInt(10000);
	}

}
