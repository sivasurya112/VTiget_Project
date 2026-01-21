package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is an utility class which deals with property file
 * @author CLASS
 * @version 25-12-11
 */

public class PropertiesUtility {
/**
 * 
 * @param key
 * @return
 * @throws IOException
 */
	
		public String getDataFromPropFile(String key ) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop= new Properties();
		prop.load(fileInputStream);
		String value = prop.getProperty(key);
		return value;
		}
	

}
