package org.testing.TestScripts;

import java.io.FileNotFoundException;

import org.testing.Utilities.JsonEmployeeFileLoad;
import org.testing.Utilities.JsonFileLoad;
import org.testing.Utilities.UpdateUsingOrgJson;
import org.testng.annotations.Test;

public class UpdateData {
	@Test
	public void updateJsonOrg() throws FileNotFoundException
	{
		
		String  data= JsonEmployeeFileLoad.fileLoad("../APIFramework1/src/test/java/org/testing/Resources/EmployeeDetails.json");
		System.out.println("data before updating " +data);
	data= UpdateUsingOrgJson.updateJsonData(data, "lastname", "Singhania");
	System.out.println("data after updating " + data);
	}

}
