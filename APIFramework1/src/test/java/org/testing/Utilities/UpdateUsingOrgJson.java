package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class UpdateUsingOrgJson {
	
	public static String updateJsonData(String body,String key,String keyValue)
	{
		JSONArray jsonArr = new JSONArray(body);
		
		  for(int i=0;i<jsonArr.length();i++) 
		  { 
			JSONObject dta=   jsonArr.getJSONObject(i);
			System.out.println(dta); 
			dta.put(key, keyValue);
			if (i== 2)
				break;
		  }
		  return jsonArr.toString();
		 
		
	 }

}
