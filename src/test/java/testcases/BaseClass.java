package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseClass {
	public static WebDriver driver;

	@BeforeMethod
	public void setUpDriver() throws IOException {

		Properties pro = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\resources\\GlobalData.properties");
		pro.load(fis);
		String browserName = pro.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().clearDriverCache().setup();
			driver = new ChromeDriver();
			

		} else if (browserName.equalsIgnoreCase("browser")) {

			WebDriverManager.chromedriver().clearDriverCache().setup();
			driver = new FirefoxDriver();
		//	driver.get(" https://www.saucedemo.com/v1/index.html");
			
		} else if (browserName.equalsIgnoreCase("browser")) {
			WebDriverManager.chromedriver().clearDriverCache().setup();
			driver = new EdgeDriver();
			
		
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" https://www.saucedemo.com/v1/index.html");
	}

	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	

	

}
