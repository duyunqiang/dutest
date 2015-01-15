//==============================================================================
//
//	@author Slive
//	@date  2013-6-18
//
//==============================================================================
package org.slive.logging.common;

import org.slive.logging.LoggerAdapter;

/**
 *  测试
 * @author Slive
 */
public class LoggerCommonAdapterTest
{ 

	private static LoggerAdapter logger = LoggerAdapterFacory.getLoggerAdapter(LoggerCommonAdapterTest.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String msg = "This logger is [" + logger.getClass().getName() + "]";
		logger.info(msg);
		logger.debug(msg);
		logger.warn(msg);
		logger.error(msg);
	}

}
