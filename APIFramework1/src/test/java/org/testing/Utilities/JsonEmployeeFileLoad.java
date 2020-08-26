package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonEmployeeFileLoad {
	
	public static String fileLoad(String pathUrl) throws FileNotFoundException 
	{
		File file = new File(pathUrl);
		FileReader fr = new FileReader(file);
		JSONTokener jt = new JSONTokener(fr);
		JSONArray data = new JSONArray(jt);
		return data.toString();
	}
	

}
