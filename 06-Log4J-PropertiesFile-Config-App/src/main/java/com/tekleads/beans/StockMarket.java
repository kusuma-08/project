package com.tekleads.beans;

import org.apache.log4j.Logger;

public class StockMarket {

	private static Logger logger = Logger.getLogger(StockMarket.class);

	public static void main(String[] args) {
		logger.trace("This is trace msg");
		logger.debug("This is debug msg");
		logger.info("This is info msg");
		logger.warn("This is warn msg");
		logger.error("This is error msg");
		logger.fatal("This is fatal msg");
	}

}
