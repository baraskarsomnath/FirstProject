package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FaceBookLaunching {

	WebDriver driver;
	@Parameters("Browser")
	@Test
	public void init(String URL) throws InterruptedException {
	if(URL.equals("chrome")) {
	System.setProperty("WebDriver.chrome.driver", "/src/test/resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/r.php?local=en_GB");
    Thread.sleep(2000);
    System.out.println("Somnath browser title: -" +driver.getTitle());
    }
	else if(URL.equals("firefox")) {
	System.setProperty("WebDriver.firefox.driver", "/src/test/resources/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php?local=en_GB");
    Thread.sleep(2000);
    System.out.println("Somnath browser title: -" +driver.getTitle());
    }
	}
	@Test
	public void teardown() {
	driver.close();
    }
	}