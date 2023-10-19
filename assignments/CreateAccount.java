package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();//maximize
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//enter user name	
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enter pwd	
		driver.findElement(By.className("decorativeSubmit")).click();//click login
		driver.findElement(By.partialLinkText("CRM")).click();//click crm
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();//Click on Accounts Button
		   
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();// Click on Create Account
		    
		 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("debit ltd Account"); // Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		   
		  driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");  // Enter DEscriptiion as "Selenium Automation Tester"
		   
		  driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("mayiladuthurai");  //  Enter SiteName Field Using Xpath Locator 
		   
		  driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("koranad");//  Enter LocalName Field Using Xpath Locator
		   
		  driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("200000");//  Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		//Select Industry as ComputerSoftware
		   
		  WebElement industryId = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		  Select dropa1=new Select(industryId)  ; 
	      dropa1.selectByValue("IND_SOFTWARE");
		
	      
	      //13. Select OwnerShip as S-Corporation using SelectByVisibletext 
		     WebElement ownershipId = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
			Select dropa2=new Select(ownershipId)  ; 		
			dropa2.selectByVisibleText("S-Corporation");
		
			// 14. Select Source as Employee using SelectByValue
			WebElement dataSourceId = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
			Select dropa3=new Select(dataSourceId)  ; 		
			dropa3.selectByValue("LEAD_EMPLOYEE");
		
			//  15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
			WebElement marketingCampaignId = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
			Select dropa4=new Select(marketingCampaignId)  ; 		
			dropa4.selectByIndex(5);
		 
			// 16. Select State/Province as Texas using SelectByValue 
			WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
			Select dropa5=new Select(state)  ; 		
			dropa5.selectByValue("TX");
		  
			// 17. Click on Create Account using Xpath Locator
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
String currenttitle = driver.getTitle();
System.out.println(currenttitle);
	}

}
