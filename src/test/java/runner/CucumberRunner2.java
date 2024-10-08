package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.CucumberOptions;
import pages.BaseClass;

public class CucumberRunner2 {
	

@CucumberOptions(features="src/test/java/features/AddEvent.feature",
				glue="pages",
				monochrome= true,
				publish= true
				)
public class CucumberRunner extends BaseClass {
	@BeforeTest
	public void setValue () throws IOException{
		testingName="AddEvent";
		testingDescription="verifying the Add event functionality";
		testingCategory="smoke";
		testingAuthor="manish";
	}
}

}
