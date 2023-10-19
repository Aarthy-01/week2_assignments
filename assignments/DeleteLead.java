package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
		driver.findElement(By.xpath("( //input[@name='firstName'])[3] ")).sendKeys("aarthy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();// 	Click Find leads button	
		Thread.sleep(2000);
		String link = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();//Click First Resulting lead
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();//	Click Delete
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();//14	Click Find leads
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(link);//	Enter captured lead ID
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();//Click find leads button
		 String text= driver.findElement(By.xpath("//div[text()='No records to display']")).getText();//Verify message "No records to display" in the Lead List. This message confirms the successful deletion	
		System.out.println(text);
		
		//driver.close();//Close the browser (Do not log out)
	}
	
}
