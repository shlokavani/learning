package sample.project;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Test_Sample extends Browser_config{

	@Test
	public  void main() {
		extent.startTest("TestCase1");
		test.log(LogStatus.PASS,"Hello");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Hello Jenkins World! So excited to view the result");
		test.log(LogStatus.INFO,"How are You");
		extent.endTest(test);
	}
}
