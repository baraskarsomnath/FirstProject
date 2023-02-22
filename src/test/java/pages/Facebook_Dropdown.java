package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.chrome.driver", "/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?local=en_GB");
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		day.click();
		
		Select sel = new Select(day);
		sel.selectByVisibleText("24");
		Thread.sleep(1000);
		
		WebElement Month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	    Month.click();
	    Select Sel1= new Select (Month);
        Sel1.selectByVisibleText("May");
        Thread.sleep(1000);
        
        WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
        year.click();
        Select sel2 = new Select(year);
        sel2.selectByVisibleText("2025");
        Thread.sleep(4000);
        //driver.close();
	    }
        }
