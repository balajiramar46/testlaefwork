package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	public CreateLeadPage() {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecname;
	public CreateLeadPage enterCompanyName(String data) {
		type(elecname, data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefname;
	public CreateLeadPage enterFirstName(String data) {
		type(elefname,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelname;
	public CreateLeadPage enterLastName(String data) {
		type(elelname,data);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleLead;
	public ViewLead clickCreateLeadButton() {
		click(eleLead);
	    return new ViewLead();	
}

}
