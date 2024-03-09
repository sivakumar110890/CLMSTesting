package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonFuntions {

	public static Properties prop=null;
	public static WebDriver driver;
	static Logger log=Logger.getLogger(commonFuntions.class);


	public static Properties PropertyFileLoad() throws IOException {		
		FileInputStream fileinput = new FileInputStream("config.properties");
		prop=new Properties();
		prop.load(fileinput);
		return prop;
	}



	@BeforeSuite
	public void launchBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		PropertyFileLoad();
		log.info("Property file loaded");
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String TriggerName=prop.getProperty("TriggerName");
		String MSISDN=prop.getProperty("MSISDN");

		if(browser.equalsIgnoreCase("chrome")) {
			log.info("Chrome browser is selected");
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chrome_latest\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if (browser.equalsIgnoreCase("firefox")) {
			log.info("Firefox browser is selected");
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		log.info("Browser launched and Opened the URL :"+url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}







	@AfterSuite
	public void tearDown() {
		//driver.quit();

	}
}
