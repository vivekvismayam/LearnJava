package com.pack1;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class PersonalTimeManager {
	public static Date GetTime() {
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //import java.text.SimpleDateFormat;  This formats date for Date d = new Date();
		Date d = new Date(); //import java.util.Date; Above lie formats date
		//System.out.println(formatter.format(d));  // line to use formatter
		//LocalDateTime now = LocalDateTime.now();//import java.time.LocalDateTime; Same as LocalDateTime.now() in print ln
		//System.out.println(LocalDateTime.now()+"LocalDateTime.now()");//op:2020-12-05T21:29:33.675281900LocalDateTime.now()
		//System.out.println(LocalTime.now()+"LocalDateTime.now()"); //op: 21:29:33.675281900LocalDateTime.now()
		return d;
	}
}
