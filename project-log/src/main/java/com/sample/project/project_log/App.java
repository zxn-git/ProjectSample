package com.sample.project.project_log;

import org.apache.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * 测试log4j 
	 * @param args
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Logger logger = Logger.getLogger("测试");
        logger.error("error");
        logger.debug("debug");;
        logger.info("info");
        
        
    }
}
