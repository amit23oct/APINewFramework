package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.simple.parser.JSONParser;
import org.testing.TestSteps.HttpMethod;
import org.testing.Utilities.JsonFileLoad;
import org.testing.Utilities.JsonParsing;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetAllData {
	
	@Test
	public  void getAllDataTC3() throws IOException
	{
		//properties file load
		 Properties p2 = PropertiesFileLoad.properetiesLoad("../APIFramework1/URIs.properties");
	     HttpMethod http1 = new HttpMethod(p2);
		 Response resGetAllData = http1.getReqAllData(p2.getProperty("QA_URI"));
		 System.out.println("data after fetching in Get all Data  " +resGetAllData.asString());	
		//String a = resGetAllData.asString();
		// System.out.println("data after fetching in Get all Data  " +a);
		
		 
		 
	}

}
