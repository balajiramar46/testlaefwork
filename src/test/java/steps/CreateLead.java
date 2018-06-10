package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


public class CreateLead {
	public static RemoteWebDriver driver;
	@Given("launch the leaftaps page")
	public void startapp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("enter the username as (.*)")
	public void enterusername(String uName) {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	@And("enter the password as (.*)")
	public void enterpwd(String pwd) {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	@And("click login button")
	public void clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("click crmsfa")
	public void clickcrm() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("click create lead")
	public void clickcreatelead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("enter the company name as (.*)")
	public void entercmpyname(String cpmyname) {
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
	}
	@And("enter the first name as (.*)")
	public void enterfname(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys("BALAJI");
	}
	@And("enter the last name as (.*)")
		public void enterlname(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys("RAMAR");
	}
	@And("click create leadbutton")
	public void clicklead() {
		driver.findElementByClassName("smallSubmit").click();
	}
		
		
		
		
	}
	

