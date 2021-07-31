package OnlinetimesheetLearnClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger Log = LogManager.getLogger(Log4jDemo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Log.info("This is info log.");
		Log.debug("This is debug log.");
		Log.error("This is error log.");
		Log.fatal("This is fatal log.");
		Log.warn("This is warn log.");

	}

}
