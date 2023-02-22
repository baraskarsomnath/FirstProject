package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Display_Selected {

	    public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?local=en_GB");
		//logo Display
		boolean display=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/img")).isDisplayed();
		
		if(display==true) {
			
		System.out.println("Logo is Displsay");
		
		} else {
			
		System.out.println("Logo is Not Displsay");
		}
		//enabled link
		boolean enabled=driver.findElement(By.xpath("//*[@id=\"content\"]")).isEnabled();
		
		if(enabled==true) {
			
		System.out.println("Link is availble");
			
		} else {
				
	    System.out.println("Link is Not availble ");
	    }
		//Selected
		//driver.findElement(By.xpath("//input[@value='2']")).click();

		boolean selected=driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		
		if(selected==true) {
			
		System.out.println("is selected");
			
		} else {

	    System.out.println("not selected");
		}
	    }   
		}
        