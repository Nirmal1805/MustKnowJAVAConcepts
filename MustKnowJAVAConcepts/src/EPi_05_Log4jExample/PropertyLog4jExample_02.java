package EPi_05_Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample_02 {
	
	static Logger logger = Logger.getLogger(PropertyLog4jExample_02.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.properties");//inside bracket this comes from
		//properties name which we created and given value
		logger.debug("This is a DEBUG message");
		logger.info("This is an INFO");
		logger.warn("This is an WARNing");
		logger.error("This is an ERROR");
		logger.fatal("This is an FATAL message");
	
	} 

}
