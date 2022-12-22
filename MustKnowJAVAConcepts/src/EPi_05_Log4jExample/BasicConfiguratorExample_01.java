package EPi_05_Log4jExample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample_01 {
	
	static Logger logger = Logger.getLogger(BasicConfiguratorExample_01.class);
	//factory design pattern
	// this is for creating object for loggerClass like POM pagefactory.intielements.

	public static void main(String[] args) {
		
		//this must not be used this is can be used only 
		//to check your code alternative for sysout
		BasicConfigurator.configure();
		logger.debug("This is a DEBUG message");
		logger.info("This is an INFO");
		logger.warn("This is an WARNing");
		logger.error("This is an ERROR");
		logger.fatal("This is an FATAL message");
	}

}
