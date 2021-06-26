package com.pack1;

import org.apache.log4j.*;

public class Log4j {
	public static void Logging(int i) {
		System.out.println("Start log"+i);
		final Logger logger=Logger.getLogger(Log4j.class);
	//Use log4j.properties file from classes folder to set the properties	
		
		logger.debug("Debug Message "+i);
		logger.info("Info Message" +i);
		logger.warn("warning Message "+i);
		logger.error("error Message "+i);
		logger.fatal("fatal Message "+i);
		
		System.out.println("end log "+i);
	}
}
