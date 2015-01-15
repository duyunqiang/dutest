//==============================================================================
//
//	@author Slive
//	@date  2013-6-18
//
//==============================================================================
package org.slive.logging;


/**
 * Self-defining logger interface.
 * it can replace any loggers simply,when using it,you will compress your developing time.
 * <ul>	
 * 	<li>{@linkplain java.util.logging.Logger}
 * 	<li>{@linkplain org.slf4j.Logger}
 * 	<li>{@linkplain org.apache.log4j.Logger}
 * 	<li>{@org.apache.commons.logging.Log}
 * </ul>
 * @author Slive
 */
public interface LoggerAdapter
{
	public void info(String msg);
	public void info(Throwable ex);
	public void info(String msg,Throwable ex);
	public void info(String msg,Object... params);
	
	public void debug(String msg,Throwable ex);
	public void debug(String msg);
	public void debug(Throwable ex);
	public void debug(String msg,Object... params);
	
	public void error(String msg,Throwable ex);
	public void error(String msg);
	public void error(Throwable ex);
	public void error(String msg,Object... params);
	
	public void warn(String msg);
	public void warn(Throwable ex);
	public void warn(String msg,Throwable ex);
	public void warn(String msg,Object... params);
	
}
