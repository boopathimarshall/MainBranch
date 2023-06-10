package com.leaftaps.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class FindLeadPage extends SeleniumBase {

	
	public FindLeadPage clickPhoneTab() {
		click(locateElement(Locators.XPATH,"//span[text()='Phone']"));
		reportStep("Phone Tab clicked","Pass");
		return this;
	}
	
	public FindLeadPage enterPhoneNumber() {
		
		
		clearAndType( locateElement(Locators.XPATH,"//input[@name='phoneNumber']"), " ");
		reportStep("Phone Number entered","Pass");
		return this;
	}
	public FindLeadPage clickFindLeadsButton() {
		click(locateElement(Locators.XPATH,"//button[text()='Find Leads']"));
		reportStep("Clicked on find Lead button","Pass");
		return this;
		
	}
	
	public ViewLeadPage clickFirstLead() {
		click(Locators.XPATH,"//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		reportStep("Clicked on First Appeared Lead","Pass");
		return new ViewLeadPage();
	}
	
	
	
	
	
	
	
}
