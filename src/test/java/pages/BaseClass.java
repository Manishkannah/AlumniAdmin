package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	
public static RemoteWebDriver driver;
public static ExtentReports extent;
public static ExtentTest test;
public String testingName,testingDescription,testingCategory,testingAuthor;

@BeforeSuite
public void startReport() {
	
	ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/result.html");
	report.setAppendExisting(true);
	extent = new ExtentReports();
	extent.attachReporter(report);
}

@BeforeClass
public void testDetails() {
	
	test = extent.createTest(testingName,testingDescription);
	test.assignCategory(testingCategory);
	test.assignAuthor(testingAuthor);
}

public int createShot() throws IOException {
	int ranNum = (int)(Math.random()*9999999+1000000);
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destination = new File ("./snaps/img"+ranNum+".png");
	FileUtils.copyFile(source, destination);
	return ranNum;
}

public void reportStep(String msg, String status) throws IOException {
	
	if(status.equalsIgnoreCase("pass")) {
		
		test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+createShot()+".png").build());
	}
	else if (status.equalsIgnoreCase("fail")) {
		
		test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+createShot()+".png").build());
	}
}
	
  
	@BeforeMethod
	public void preCondtition() {
		
		driver = new EdgeDriver();
		driver.get("https://alumni-portal-uat.alumnetworks.com/sign-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@AfterMethod
	public void postCondition() {
		//driver.close();
		
	}
	@AfterSuite
	public void stopReport() {
		
		extent.flush();
		
	}

}
