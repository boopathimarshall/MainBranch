package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(locateElement(Locators.ID,"viewLead_firstName_sp"), data);
		reportStep(data+" is matching with first name", "pass");
		return this;
	}

	
	public EditLeadPage clickEditLeadButton() {
		click(locateElement(Locators.LINK_TEXT,"Edit"));
		reportStep(" Edit button Clicked", "pass");
		return new EditLeadPage();
		
	}
	
	public void verifyUpdatedName(String data) {
		verifyPartialText(locateElement(Locators.ID,"viewLead_companyName_sp"),data );
		reportStep(" Edit is successfull", "pass");
		
	}
	
	
	
}
