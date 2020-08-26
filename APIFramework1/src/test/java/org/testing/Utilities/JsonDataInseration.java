package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonDataInseration {

	public static String insertValueJson(String jsonData, String variableName, String insertedValue)
	{
		String retrunUpdatedData = jsonData.replaceAll(Pattern.quote("{{"+variableName+"}}"),insertedValue);
		
		//System.out.println(jsonData);
		//System.out.println(retrunUpdatedData);
		return retrunUpdatedData;
		
	}
}
