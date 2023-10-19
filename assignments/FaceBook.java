package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();//  Launch the chromebrowser
	driver.get("https://en-gb.facebook.com/");// Load the URL https://en-gb.facebook.com/
	driver.manage().window().maximize();// Step 4: Maximise the window
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//  Add implicit wait
		
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();//  Click on Create New Account button
	
	driver.findElement(By.xpath( "//input[@name='firstname']")).sendKeys("Aarthy");//  Enter the first name
	Thread.sleep(2000);
	driver.findElement(By.xpath( "//input[@name='lastname']")).sendKeys("lena");//last name
	Thread.sleep(2000);

	driver.findElement(By.xpath( "//input[@name='reg_email__']")).sendKeys("Lena223@gmail.com");//Enter the email id
	Thread.sleep(2000);
	driver.findElement(By.xpath( "//input[@name='reg_passwd__']")).sendKeys("12345");// Step 10: Enterthe password
	WebElement day = driver.findElement(By.xpath( "//select[@id='day'] "));	// Step 11: Handle all the three drop downs
		Select drop1=new Select(day);
		drop1.selectByValue("17");
		WebElement month = driver.findElement(By.xpath(  "//select[@id='month']"));	// Step 11: Handle all the three drop downs
		Select drop2=new  Select(month);
		drop2 .selectByValue("3");
		WebElement year = driver.findElement(By.xpath( "//select[@id='year']"));	// Step 11: Handle all the three drop downs
		Select drop3=new Select(year);
		drop3.selectByValue("1997");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
 