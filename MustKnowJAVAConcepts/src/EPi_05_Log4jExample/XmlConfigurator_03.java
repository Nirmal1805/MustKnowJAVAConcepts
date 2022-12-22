package EPi_05_Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XmlConfigurator_03 {
	
	static Logger logger = Logger.getLogger(XmlConfigurator_03.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is a DEBUG message");
		logger.info("This is an INFO");
		logger.warn("This is an WARNing");
		logger.error("This is an ERROR");
		logger.fatal("This is an FATAL message");
	}

}
