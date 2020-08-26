package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.TestSteps.HttpMethod;
import org.testing.Utilities.JsonDataInseration;
import org.testing.Utilities.JsonFileLoad;
import org.testing.Utilities.ParsingIDValue;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseDataValidation;
import org.testing.Utilities.ResponseStatusValidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PutReqTC5 {
	/*Load Propertiy file
	 * laod json file
	 * create http clss object
	 * call pt request method*/
	@Test
	public void updateReq() throws IOException
	{
	Properties p = PropertiesFileLoad.properetiesLoad("../APIFramework1/URIs.properties");
	 //loading body data from json file
	 //String bodyData = JsonFileLoad.jsonData("../APIFramework1/src/test/java/org/testing/Resources/BodyData.json");
//calling http class for doing post request
HttpMethod ht = new HttpMethod(p);
Response res = ht.getReqAllData(p.getProperty("QA_URI"));
String idArrayValue[] = ParsingIDValue.JsonExtractIdValue(res,"id");
String idValue= idArrayValue[0];
System.out.println(idArrayValue[0]);
//Response res1 = ht.putReq(res.asString(), "QA_URI", idArrayValue[0]);
Response res1= ht.putReq(res.toString(), p.getProperty("QA_URI"), idValue);
System.out.println("updated value is " + res1.asString());
	}
}
