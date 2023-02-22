package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Face_URL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "/src/test/resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.facebook.com/r.php?local=en_GB");
	    System.out.println("Somnath Baraskar");
	
	    System.setProperty("WebDriver.firefox.driver", "/src/test/resources/geckodriver.exe");
	    WebDriver driver2 = new FirefoxDriver();
	    driver2.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.facebook.com/r.php?local=en_GB");
	    System.out.println("Somnath Baraskar");
	    }
	    }
