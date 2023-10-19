package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
			
		driver.get("https://www.leafground.com/select.xhtml");
	//select favorite UI Automation tool:
		WebElement ui = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select drop1=new Select(ui);
		drop1.selectByVisibleText("Selenium");
	//select country:
		 driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		 driver.findElement(By.xpath("//li[text()='India']")).click();
	Thread.sleep(2000);
		 // Confirm Cities belongs to Country is loaded
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		  driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		  Thread.sleep(2000);
		  //Choose the Course
		 driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon-primary ')]")).click();
		 driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		 Thread.sleep(2000);
	// Choose language randomly
		 driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		 driver.findElement(By.xpath("//li[text()='English']")).click();
	//select value
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		 driver.findElement(By.xpath("//li[text()='Three']")).click();
		 driver.close();
		
		
	
	
	
	
	}

}
