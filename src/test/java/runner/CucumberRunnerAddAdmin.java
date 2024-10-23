package runner;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.CucumberOptions;
import pages.BaseClass;



@CucumberOptions(features="src/test/java/features/AddAdmin.feature",
				  glue = "pages",
				  monochrome= true,
				  publish=true)
public class CucumberRunnerAddAdmin extends BaseClass {
	
	@BeforeTest
	public void setvalues() {
		testingName="Add Admin Feature";
		testingDescription ="verify the admin is added successfully";
		testingCategory="smoke";
		testingAuthor="Manish";
	}
	
	 

}
