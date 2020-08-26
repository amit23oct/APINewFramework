package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.Utilities.JsonFileLoad;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetRequest {
	/*json file load + Properties file load
	 * provide the id value of json file
	 * hit get request
	 * response validation
	 * data validation
	 *  */
	@Test
	public void TC2() throws IOException {
	Properties p1 = PropertiesFileLoad.properetiesLoad("../APIFramework1/URIs.properties");
	HttpMethod htt = new HttpMethod(p1);
	Response resGet= htt.getReq(p1.getProperty("QA_URI"), PostRequestTC.idVal);
	System.out.println("data after fetching in Get request " +resGet.asString());
		
	
	}
}
