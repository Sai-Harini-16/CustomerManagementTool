package com.CRM.CustomerManager.GenericLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public String getDateAndTime(String pattern)
	{
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String dateandtime = sdf.format(d);
		
		return dateandtime;
	}
	public int getRandomNumber(int number)
	{
		Random r = new Random();
		int data = r.nextInt(number);
		return data;
	}

}
