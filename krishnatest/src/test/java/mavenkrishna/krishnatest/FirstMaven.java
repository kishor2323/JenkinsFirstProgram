package mavenkrishna.krishnatest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstMaven {
	
public WebDriver driver;
	

    @BeforeMethod
    
    public void third() throws InterruptedException
    {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\system8\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	driver=new ChromeDriver();
    	
    	driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    	
    	driver.manage().window().maximize();
    	
        }
    
    @AfterMethod
    
    public void closeapp() throws InterruptedException
    {
    	        	
    	//close the application
    	
    	Thread.sleep(3000);
    	
    	driver.close();
    }
    
   @Test
    public void register() {
    	
    	driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
    	
    	Select s=new Select(driver.findElement(By.name("country")));
    	
    	s.selectByVisibleText("INDIA");
    	
    }
    
    @Test
    public void username() {
    	
    	driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
    	
    	driver.findElement(By.name("email")).sendKeys("kishor", Keys.TAB, "kittu123",Keys.TAB,"kittu123",Keys.TAB,Keys.ENTER);
    }
    
    
    @Test
    public void username1() {
    	
    	driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
    	
    	driver.findElement(By.name("email")).sendKeys("kishor", Keys.TAB, "kittu123",Keys.TAB,"kittu123",Keys.TAB,Keys.ENTER);
    	
    	driver.findElement(By.xpath("//a[text()='Flights']")).click();
    	
    	List<WebElement> l=driver.findElements(By.xpath("//input[@type='radio']"));
    	
    	System.out.println("radio button count is "+l.size());
    	
    	l.get(4).click();
    }

}
