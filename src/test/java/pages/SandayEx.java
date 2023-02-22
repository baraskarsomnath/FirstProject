package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SandayEx {

	public static void main(String[] args) {
			System.setProperty("WebDriver.chrome.driver", "/src/test/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// browser open
			driver.get("https://demoqa.com/text-box");
			WebElement select=driver.findElement(By.id("userName"));
			select.sendKeys("Somnath Baraskar");

			WebElement select1=driver.findElement(By.id("userEmail"));
			select1.sendKeys("baraskarsomnath75gmail.com");
				
			WebElement select3=driver.findElement(By.id("currentAddress"));
			select3.sendKeys("Ahmednagar");
			WebElement select4=driver.findElement(By.id("permanentAddress"));
			select4.sendKeys("Jamkhed");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,2000)");
             
			WebElement select5=driver.findElement(By.id("submit"));
			select5.click();
		}

	}

