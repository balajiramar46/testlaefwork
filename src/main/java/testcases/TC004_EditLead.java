package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="EditLead";
		testDescription="Edit lead in the application";
		testNodes="Leads";
		category="Smoke";
		authors="balaji";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uname,String pwd) {
		 {
			 new LoginPage()
				.enterUserName(uname)
				.enterPassword(pwd)
				.clickLogIn()
				.clickcrmsfa()
				.clickLeads()
			    .clickFindLead();
			    // return FindLeadPage();
			 
			    
         
}
	}
	private Object FindLeadPage() {
		// TODO Auto-generated method stub
		return null;
	}}
	
