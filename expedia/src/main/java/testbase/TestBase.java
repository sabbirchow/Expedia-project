package testbase;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	WebDriver driver;

	String baseURL = "https://www.expedia.com/Flights";

	public static final Logger log = Logger.getLogger(TestBase.class.getName());

	public void init() {

		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Selenium\\expedia\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		log.info("Initializing chrome browser");
		driver.manage().window().maximize();
		log.info("Maximizing chrome browser window");
		driver.manage().deleteAllCookies();
		log.info("Deleting cookies from previous session");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Implicitly waiting 10 seconds for all elements to load on webpage");
		driver.get(baseURL);
		log.info("Directing browser to expedia flight page");

	}

}
