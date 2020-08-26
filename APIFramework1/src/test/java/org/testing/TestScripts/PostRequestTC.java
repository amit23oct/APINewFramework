package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.TestSteps.HttpMethod;
import org.testing.Utilities.JsonDataInseration;
import org.testing.Utilities.JsonFileLoad;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseDataValidation;
import org.testing.Utilities.ResponseStatusValidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PostRequestTC {
	/*json file load + Properties file load
	 * provide the id value of json file
	 * hit post request
	 * response validation
	 * data validation
	 *  */
  static String idVal;
  @Test
	public void TC1() throws IOException
    
  {
		
	//properties file load
	 Properties p = PropertiesFileLoad.properetiesLoad("../APIFramework1/URIs.properties");
	 
	 //loading body data from json file
	 	 String bodyData = JsonFileLoad.jsonData("../APIFramework1/src/test/java/org/testing/Resources/BodyData.json");
	 	 
	 //Generating Random value
	 Random r = new Random();
	 Integer idValue = r.nextInt();
	 
	 //entering first name
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please Enter first Name to insert");
	 String firstName = sc.next();
	 sc.close();
	 //inserting idValue
     bodyData = JsonDataInseration.insertValueJson(bodyData, "idvalue", idValue.toString());
     //inserting firstname
     bodyData=  JsonDataInseration.insertValueJson(bodyData, "fname", firstName);
	 //calling http class for doing post request
     HttpMethod ht = new HttpMethod(p);
	 Response res1 = ht.PostReq(bodyData, "QA_URI");
	
	 //System.out.println("status code will be after inserting record " +res1.statusCode());
	 
	 ResponseStatusValidation.responseStatus(201,  res1);
	// System.out.println("record after inserting  " +res1.asString());
	
	 ResponseDataValidation.responseDataValidUsingJson(firstName, res1, "firstname");
	 //storing id value to pass in to get req method
	 idVal = idValue.toString();
}
	
}
 