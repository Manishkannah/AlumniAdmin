package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.CucumberOptions;
import pages.BaseClass;


@CucumberOptions(features="src/test/java/features/Login.feature",
				glue="pages",
				monochrome= true,
				publish= true
				)
public class CucumberRunner extends BaseClass {
	@BeforeTest
	public void setValue () throws IOException{
		testingName="VerifyLogin";
		testingDescription="verifying the login functionality";
		testingCategory="smoke";
		testingAuthor="manish";
	}
	
	

}
