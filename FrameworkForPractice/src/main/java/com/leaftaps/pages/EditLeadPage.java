package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
	public EditLeadPage editCompanyName(String string)
	{
		clearAndType(locateElement(Locators.ID,"updateLeadForm_companyName"),string);
		reportStep("Entered new Company Name", "Pass");
		return this;
	}

	public ViewLeadPage clickUpdateButton() {
		
		click(locateElement(Locators.NAME,"submitButton"));
		reportStep("Clicked on Update", "Pass");
		return new ViewLeadPage();
		
	}
}
