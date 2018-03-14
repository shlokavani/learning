package sample.project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Browser_config {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	@Parameters("url")

	@BeforeSuite(alwaysRun = true)
	public void setup(String sURL) {
		extent = ExtentReports_generation.generateReports();
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(sURL);
		// Navigating to the url and browser window Settings
		driver.navigate().to(sURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get().manage().deleteAllCookies();
	}
	@AfterSuite
	public void afterSuite() throws Exception {
		extent.flush();
		//extent.close();
		driver.close();
		driver.quit();
		// EmailReportAfterTest.execute("emailable-report.html");
	}

}
