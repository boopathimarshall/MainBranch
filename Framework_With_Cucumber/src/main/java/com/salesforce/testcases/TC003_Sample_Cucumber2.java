package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/F01_Login.feature", glue= {"com.salesforce.pages"}, monochrome=true)
public class TC003_Sample_Cucumber2 extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality";
		authors="Hari";
		category ="Smoke";
		
	}
	
	public void add()
	{
		System.out.println("Test method new one");
	}
	

}
