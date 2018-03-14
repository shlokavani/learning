package sample.project;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReports_generation {
	
	public static ExtentReports extent;
	
	
	public static ExtentReports generateReports() {
		
		extent  = new ExtentReports("./Reports/test_output.html");
		extent.loadConfig(new File("./Resources/extent-config.xml"));
		return extent;
	}
}
