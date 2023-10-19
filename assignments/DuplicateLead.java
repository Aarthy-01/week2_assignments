package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {

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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("yakshi");	// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("electrical");// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("be a tester");// Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aarthymar17@gmail.com");// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.className("smallSubmit")).click();//Click on create Lead Button // Click on Create Button
	
		//Get the Title of Resulting Page using driver.getTitle()
		String resultingPage = driver.getTitle();
		System.out.println(resultingPage);
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();//  16. Click on Duplicate button
     // Clear the CompanyName Field using .clear() And Enter new CompanyName
		WebElement comName = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
       comName.clear();
       comName.sendKeys("Amazon");
       
       //Clear the FirstName Field using .clear() And Enter new FirstName
     WebElement fName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
     fName.clear();
     fName.sendKeys("Divya");
     driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();//.Click on Create Lead Button
       
     String recentPage = driver.getTitle();// Get the Title of Resulting Page using driver.getTitle()

	System.out.println(recentPage);
	
	
	}

}
