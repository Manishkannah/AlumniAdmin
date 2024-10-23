package runner;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.CucumberOptions;
import pages.BaseClass;


@CucumberOptions(features="src/test/java/features/AddAlumni.feature",
				 glue = "pages",
				 monochrome=true,
				 publish=true)
public class CucumberRunnerAddAlumni extends BaseClass {
	
	@BeforeTest
	public void setValue() {
		
		testingName="Add Alumni feature";
		testingDescription= "verifying the add alumni feature";
		testingCategory ="Smoke";
		testingAuthor="Manish";
	}
	

}
