package org.testing.Utilities;

import org.json.JSONArray;

import com.jayway.restassured.response.Response;

public class ParsingIDValue {
	
	public static String[] JsonExtractIdValue(Response res, String keyValue)
	{
		
		JSONArray jsonArr= new JSONArray(res.asString());
		int jsonLength = jsonArr.length();
		
		
			String idArr[] = new String[jsonLength];
			  for(int i=0;i<jsonLength;i++) 
			  { 
				 idArr[i] = (String)jsonArr.getJSONObject(i).get(keyValue); 
				//System.out.println(idArr[i]); 
			  }
			  return idArr;
			 
	}

}
