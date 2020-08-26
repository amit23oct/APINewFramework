package org.testing.Utilities;

import org.json.JSONArray;

import com.jayway.restassured.response.Response;

public class JsonParsing {
	
	public static void JsonExtractValue(Response res, String keyValue)
	{
		
		JSONArray jsonArr= new JSONArray(res.asString());
		int jsonLength = jsonArr.length();
		System.out.println("length of an json array " +jsonLength);
		System.out.println("getting all id values first id value   ");
			
			  for(int i=0;i<jsonLength;i++) 
			  { 
				  //System.out.println(resGetAllData.jsonPath().getString("["+i+"].id")); 
				  System.out.println(jsonArr.getJSONObject(i).get(keyValue)); 
			  }
			 
	}
	

}
