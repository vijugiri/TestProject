package com.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {

	private static Logger logger=LogManager.getLogger(Log4j.class);
	
	public static void main(String[] args) {
		System.out.println("Hello vijay");
		logger.info("this in info msg print is passing");
		
	}
}
