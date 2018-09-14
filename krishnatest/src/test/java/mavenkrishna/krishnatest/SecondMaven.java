package mavenkrishna.krishnatest;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondMaven {
	
public WebDriver driver;
	
	
	@BeforeMethod
	
	public void openfacebook()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	
	public void closefacebook() throws InterruptedException
	
	{
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
	@Test
	public void title() {
		
		System.out.println("Page Title is : "+driver.getTitle());
	}
	
	
	@Test
	public void signin() {
		
		driver.findElement(By.name("email")).sendKeys("kitkat.239@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("kitkat123");
		
		driver.findElement(By.id("loginbutton")).click();

    }
	
	

}
