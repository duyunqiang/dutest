//==============================================================================
//
//	@author Slive
//	@date  2013-6-18
//
//==============================================================================
package org.slive.logging.java;

import org.slive.logging.LoggerAdapter;

/**
 *
 * @author Slive
 */
public class LoggerJavaAdapterTest
{
	private static LoggerAdapter logger = LoggerAdapterFacory.getLoggerAdapter(LoggerJavaAdapterTest.class);

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
