package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC003_EditLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Edit Lead";
		testDescription ="Edit Lead with new Company Name field";
		authors="Hari";
		category ="Smoke";
		excelFileName="EditLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password,String cName) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickFindLead()
		.clickPhoneTab()
		.enterPhoneNumber()
		.clickFindLeadsButton()
		.clickFirstLead().clickEditLeadButton().editCompanyName(cName).clickUpdateButton().verifyUpdatedName(cName);
		

	}

}
	

