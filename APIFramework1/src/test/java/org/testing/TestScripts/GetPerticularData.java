package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.Utilities.JsonParsing;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetPerticularData {
	@Test
	public void getPertData() throws IOException {
		Properties pro = PropertiesFileLoad.properetiesLoad("../APIFramework1/URIs.properties");
		HttpMethod http2 = new HttpMethod(pro);
		Response resAllData = http2.getReqAllData(pro.getProperty("QA_URI"));
		 //System.out.println("data after fetching in Get all Data  " +resGetAllData.asString());	
		//String a = resGetAllData.asString();
		// System.out.println("data after fetching in Get all Data  " +a);
		
		JsonParsing.JsonExtractValue(resAllData, "id");
		JsonParsing.JsonExtractValue(resAllData, "firstname");
	}


}
