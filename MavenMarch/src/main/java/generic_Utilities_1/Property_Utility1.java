package generic_Utilities_1;

import java.io.FileInputStream;
import java.util.Properties;

public class Property_Utility1 {
	public String getPropertyValue(String Key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./vtiger_propertyfile.properties.txt");
		   Properties pro=new Properties();
		   pro.load(fis);
		   String Value = pro.getProperty(Key);
		return Value;
	}

}
