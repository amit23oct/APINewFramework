package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.Utilities.ParsingIDValue;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class DeleteReq {
	@Test
	public void delReq() throws IOException {
	Properties p = PropertiesFileLoad.properetiesLoad("../APIFramework1/URIs.properties");
HttpMethod ht = new HttpMethod(p);
Response res = ht.getReqAllData(p.getProperty("QA_URI"));
String idArrayValue[] = ParsingIDValue.JsonExtractIdValue(res,"id");
String idValue= idArrayValue[0];

//Response res1 = ht.putReq(res.asString(), "QA_URI", idArrayValue[0]);
Response res1= ht.deleteReq(p.getProperty("QA_URI"), idValue);
System.out.println("Resonse code is  " + res1.getStatusCode());
	}
}
