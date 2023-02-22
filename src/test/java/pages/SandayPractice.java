package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SandayPractice {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box");
		
		WebElement sel = driver.findElement(By.id("userName"));
		sel.sendKeys("Somnath Baraskar");
		
		
		WebElement sel2 = driver.findElement(By.id("userEmail"));
		sel2.sendKeys("baraskarsomnath75@gmail.com");
		
		WebElement sel3 = driver.findElement(By.id("currentAddress"));
		sel3.sendKeys("Ahmednagar");
		
		WebElement sel4 = driver.findElement(By.id("permanentAddress"));
		sel4.sendKeys("Pune");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2000)");
		
		
		WebElement sel5 = driver.findElement(By.id("submit"));
		sel5.click();
	    }
	    }
