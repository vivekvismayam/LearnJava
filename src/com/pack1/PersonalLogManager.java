package com.pack1;

import java.text.SimpleDateFormat;
import java.io.*;

public class PersonalLogManager {
	public static void WriteLogFile(String message)  {
		SimpleDateFormat date_formatter = new SimpleDateFormat("ddMMyyyy");//format time as needed _This is for timestamp in logfilename
		System.out.println(date_formatter.format(PersonalTimeManager.GetTime()));
		String filename="C:\\Users\\Vivek\\Desktop\\LearnJava\\Log_"+date_formatter.format(PersonalTimeManager.GetTime())+".xml";// Date stamp in log file. new file is created every day
		File logfile=new File(filename);//Default log file
		//Method to add passed message prefixing the time stamp
	try {
		PrintWriter writer = new PrintWriter(new FileOutputStream(logfile, true));
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//format time as needed in log file
		writer.println(formatter.format(PersonalTimeManager.GetTime())+" : " +message); 
		writer.close(); 
		System.out.println("Log Write Success : "+message);
		}
	catch (Exception e) {
			System.out.println("Error: "+e.fillInStackTrace());
			//e.printStackTrace();
		
		}
	finally {
		System.out.println("Exiting Log writer method");
	}
}
}
