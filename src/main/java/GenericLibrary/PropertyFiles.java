package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFiles {
	
	public String getPropertyData(String key) throws Throwable
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertyfilepath);
		p.load(fis);
		return p.getProperty(key);
	}

}
