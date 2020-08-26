package org.testing.Utilities;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseDataValidation {

 public static void responseDataValidUsingJson(String expectedData, Response res,String jsonpath) {
	String actualData = res.jsonPath().getString(jsonpath);
	Assert.assertEquals(actualData, expectedData, "Data is not matching");
	
	
 }
}
