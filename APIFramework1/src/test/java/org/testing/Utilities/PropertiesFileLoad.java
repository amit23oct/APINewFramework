package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*  Class will load the properties file here and fetch the uri values*/
public class PropertiesFileLoad {
	
	public static Properties properetiesLoad(String path) throws IOException
	{
		File f = new File(path);
		FileInputStream fi =new FileInputStream(f);
		Properties pr =new Properties();
		pr.load(fi);
		return pr;
	}

}
