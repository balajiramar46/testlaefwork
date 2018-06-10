package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	public MyLeadsPage() {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
		private WebElement eleCreateLead;
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
public CreateLeadPage clickFindLead() {
	click(eleFindLead);
	return new CreateLeadPage();
}
}
