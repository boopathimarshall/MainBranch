package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME, "decorativeSubmit"));
		reportStep("Login button clicked successfully", "pass");
		return new HomePage();
	}
	
	/*---------------------------------------------------------------*/
	
	
	

}
