package DataProvider;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.testng.annotations.Test;
    
    @Test
    public class Example {
	public WebDriver getWebDriver() throws InterruptedException {
	
    System.setProperty("WebDriver.chrome.driver", "/src/test/resources/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/r.php?local=en_GB");
	System.out.println("somnath");
	return driver;
		}
	
	@Test	
    public void f1() throws InterruptedException {
	System.out.println("somnath");  
	System.setProperty("WebDriver.firefox.driver", "/src/test/resources/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/r.php?local=en_GB");
	}
	}
