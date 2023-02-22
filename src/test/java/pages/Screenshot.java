package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("WebDriver.firefox.driver", "/seleniump/src/test/resources/geckodriver.exe");
		   WebDriver driver = new FirefoxDriver ();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/r.php?local=en_GB");
		   Thread.sleep(3000);
		   TakesScreenshot ss= (TakesScreenshot)driver;
		   File source = ss.getScreenshotAs(OutputType.FILE);
		   File Folder  = new File ("C:\\Users\\BaraskarSomnath\\OneDrive\\Desktop\\New folder\\soma.png");
		   FileUtils.copyFile(source, Folder);
		   driver.close();

	
	}
}
