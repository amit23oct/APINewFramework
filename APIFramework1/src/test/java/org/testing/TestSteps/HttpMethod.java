package org.testing.TestSteps;

import java.util.Properties;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import  static com.jayway.restassured.RestAssured.*;

public class HttpMethod {
	Properties pr;
	public HttpMethod(Properties pr)
	{
		this.pr=pr;
			
	}

	public Response PostReq(String bodydata, String uriname)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(uriname));
		
		return res;
			
	}
	
	public Response getReq(String baseURI,String idvalue) {
		
		String getUri = baseURI+"/"+idvalue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(getUri);
		
		 return res;
		
	}
	
	public Response getReqAllData(String baseURI) {
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(baseURI);
		
		 return res;
}
	
public Response putReq(String bodyData,String bUri,String idVal) {
		
	JSONObject requestParams = new JSONObject();
	 requestParams.put("firstname", "Ravindra Pratap"); 
	 requestParams.put("lastName", "Singh");
	 requestParams.put("employeeId", "123456");
	 requestParams.put("projectName", "Citi Bank");
	 
	 // Cast
		String putUri = bUri+"/"+idVal;
		
		Response res1=
		given()
		.contentType(ContentType.JSON)
		.body(requestParams.toString())
		.when()
		.put(putUri);
		
		 return res1;
		
	}

public Response deleteReq(String bUri,String idVal1) {
	 
	 // Cast
		String putUri = bUri+"/"+idVal1;
		
		Response res1=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(putUri);
		
		 return res1;
		
	}
       
}

