package runner;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.CucumberOptions;
import pages.BaseClass;


@CucumberOptions(features="src/test/java/features/AddChapter.feature",
				glue = "pages",
				monochrome= true,
				publish = true)
public class CucumberRunnerAddChapter extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		
		testingName="Add chapter feature";
		testingDescription= "verifying the add chapter feature";
		testingCategory ="Smoke";
		testingAuthor="Manish";
	}

}
