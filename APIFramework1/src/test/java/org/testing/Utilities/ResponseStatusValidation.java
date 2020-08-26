package org.testing.Utilities;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseStatusValidation {

	public static void responseStatus(int expectedStatusCode, Response res)
	{
	Assert.assertEquals(res.getStatusCode(), expectedStatusCode, "Status code is not matching");
	}
	
}
