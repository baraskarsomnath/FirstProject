package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DProvider {
	WebDriver driver;
	@Test
	public void setup() throws InterruptedException {
	
	System.setProperty("WebDriver.chrome.driver", "/src/test/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(2000);
        
    driver.get("https://www.facebook.com/r.php?local=en_GB");
    Thread.sleep(2000);
	
      WebElement un=driver.findElement(By.xpath("//input[@name='firstname']"));
      un.sendKeys("Somnath");
    
      WebElement un1=driver.findElement(By.xpath("//input[@aria-label='Surname']"));
      un1.sendKeys("Baraskar");
   
      WebElement un2=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
      un2.sendKeys("9689370489baraskarsomnath75@gmail.com");
    
      WebElement un3=driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
      un3.sendKeys("baraskarsomnath75@gmail.com Ahmednagar");
        
      WebElement un4=driver.findElement(By.xpath("//input[@type='password']"));
      un4.sendKeys("652251");
      
      WebElement un5=driver.findElement(By.xpath("//*[@id=\"u_0_4_8W\"]"));
      un5.click();
  
	}
	}
