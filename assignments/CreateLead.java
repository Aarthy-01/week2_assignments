package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();//maximize
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");//enter user name	
	driver.findElement(By.id("password")).sendKeys("crmsfa");//enter pwd	
	driver.findElement(By.className("decorativeSubmit")).click();//click login
	driver.findElement(By.partialLinkText("CRM")).click();//click crm
	driver.findElement(By.linkText("Leads")).click();//Click on Leads Button	
	driver.findElement(By.linkText("Create Lead")).click();// Click on create Lead Button
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");//Enter CompanyName 
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("aarthy");//Enter firstName 
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lena");// lastName 
	//driver.findElement(By.xpath(" (//input[@name='primaryPhoneAreaCode'])[4]")).sendKeys("01");// lastName
	//driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber'] ")).sendKeys("1234567890");//phonenmber
	// Select value as Employee in Source 
	WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select drop1=new Select(Source);
	drop1.selectByValue("LEAD_EMPLOYEE");
	
	// Select value as Pay Per Click Advertising in MarketingCampaign
	WebElement MarketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select drop2=new Select(MarketingCampaign);
	drop2.selectByVisibleText("Pay Per Click Advertising");
	
	
	
	
	//Select value as Corporation in OwnerShip field 
	WebElement OwnerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select drop3=new Select(OwnerShip);
	drop3.selectByIndex(4);
	   
	//  Select value as India in Country Field Using SelectbyVisibletext
	WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select drop4=new Select(Country);
	drop4.selectByVisibleText("India");
	driver.findElement(By.className("smallSubmit")).click();//Click on create Lead Button
	   //Get the Title of the resulting Page
	
	String resultingPage = driver.getTitle();
	System.out.println(resultingPage);
	
	
	}

}
