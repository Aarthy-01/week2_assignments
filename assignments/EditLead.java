package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();//maximize
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//enter user name	
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enter pwd	
		driver.findElement(By.className("decorativeSubmit")).click();//click login
		driver.findElement(By.partialLinkText("CRM")).click();//click crm
		driver.findElement(By.linkText("Leads")).click();//Click on Leads Button
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();//Click Find leads		
		driver.findElement(By.xpath("( //input[@name='firstName'])[3] ")).sendKeys("aarthy");//	Enter first name
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();// 	Click Find leads button
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[(@class='x-grid3-cell-inner x-grid3-col-partyId')]/a)[1]")).click();
		String currentpage = driver.getTitle();//* 11 Verify title of the page
		System.out.println(currentpage);		
		driver.findElement(By.linkText("Edit")).click();//* 12 Click Edit
		WebElement updatecompany = driver.findElement(By.id("updateLeadForm_companyName"));//* 13 Change the company name
		updatecompany.clear();
		updatecompany.sendKeys("AMAZON");		
		driver.findElement(By.xpath("//input[@value='Update']")).click();//* 14 Click Update
		 String view = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if( view. contains("AMAZON")) {
			System.out.println("update successfully");
		}
		else {
			System.out.println("not updated");//* 15 Confirm the changed name appears		

}
		
		
	
		

		 driver.close();
	}}