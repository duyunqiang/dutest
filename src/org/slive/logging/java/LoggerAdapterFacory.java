//==============================================================================
//
//	@author Slive
//	@date  2013-6-18
//
//==============================================================================
package org.slive.logging.java;

import org.slive.logging.LoggerAdapter;


/**
 * The factory of implements logger adapter.if is in need,you can rewrite it.
 * @author Slive
 */
public class LoggerAdapterFacory
{
	public static LoggerAdapter getLoggerAdapter(Class clazz)
	{
		//TODO according to specific circumstance
		//such as 'LoggerJava'
		return new LoggerJavaAdapter(clazz);
	}
}
