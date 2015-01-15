//==============================================================================
//
//	@author Slive
//	@date  2013-6-18
//
//==============================================================================
package org.slive.logging.log4j;

import org.apache.log4j.Logger;
import org.slive.logging.LoggerAdapter;

/**
 * A simple logger's adapter of <code>org.apache.log4j.Logger</code>
 * @see org.apache.log4j.Logger
 * @date 2013-6-18
 */
public class LoggerLog4jAdapter implements LoggerAdapter
{
	private Logger logger;
	
	public LoggerLog4jAdapter(Class clazz)
	{
		logger = Logger.getLogger(clazz);
	}
	
	@Override
	public void debug(String msg, Throwable ex)
	{
		logger.debug(msg, ex);
	}

	@Override
	public void debug(String msg)
	{
		logger.debug(msg);
	}

	@Override
	public void debug(Throwable ex)
	{
		if(ex == null){
			logger.debug(null);
		}else{
			logger.debug(ex.getMessage(),ex);
		}
	}

	/**
	 * @deprecated
	 */
	@Override
	public void debug(String msg, Object... params)
	{
		logger.debug(params,new Exception(msg));
		
	}

	@Override
	public void error(String msg, Throwable ex)
	{
		logger.error(msg, ex);
	}

	@Override
	public void error(String msg)
	{
		logger.error(msg);
	}

	@Override
	public void error(Throwable ex)
	{
		if(ex == null){
			logger.error(null);
		}else{
			logger.error(ex.getMessage(),ex);
		}
	}

	/**
	 * @deprecated
	 */
	@Override
	public void error(String msg, Object... params)
	{
		logger.error(params,new Exception(msg));		
	}

	@Override
	public void info(String msg, Throwable ex)
	{
		logger.info(msg, ex);
	}

	@Override
	public void info(String msg)
	{
		logger.info(msg);
	}

	@Override
	public void info(Throwable ex)
	{
		if(ex == null){
			logger.info(null);
		}else{
			logger.info(ex.getMessage(),ex);
		}
	}
	
	/**
	 * @deprecated
	 */
	@Override
	public void info(String msg, Object... params)
	{
		logger.info(params,new Exception(msg));
	}
	
	@Override
	public void warn(String msg, Throwable ex)
	{
		logger.warn(msg, ex);
	}

	@Override
	public void warn(String msg)
	{
		logger.warn(msg);
	}

	@Override
	public void warn(Throwable ex){
		if (ex == null){
			logger.warn(null);
		} else{
			logger.warn(ex.getMessage(), ex);
		}
	}

	/**
	 * @deprecated
	 */
	@Override
	public void warn(String msg, Object... params)
	{
		logger.warn(params,new Exception(msg));
	}

}
