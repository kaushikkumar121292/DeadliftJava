package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements Constant {
 public WebDriver driver;
	@BeforeMethod
	@Parameters("mBrowser")
	public void launchBrouser(String mBrowser) {
		if(mBrowser.equalsIgnoreCase("chrome")) {
		System.setProperty(CHROME_KEY,CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}else if(mBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
	}
	@AfterMethod
	public void closeBrouser() {
		driver.quit();
	}
}
