package pageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClass1 {
	
	Properties prop ;
	String path;
	FileInputStream fis;
	
	public  BaseClass1 () throws IOException
	{
		 prop =new Properties();
		 path = System.getProperty("user.dir")+"\\config.properties";
		
		fis = new FileInputStream(path);
		
		prop.load(fis);
	}

}