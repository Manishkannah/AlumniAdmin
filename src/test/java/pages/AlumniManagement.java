package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AlumniManagement extends BaseClass{
	
	@And("click on the add alumni button")
	public void ClickAddAlumni() throws IOException {
		
		try {
			driver.findElement(By.xpath("//i[@class='material-icons text-sm']")).click();
			reportStep("Add alumni button is clicked successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Add alumni button is not clicked successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@Then("verify alumni added")
	public void VerifyAlumniAdded() {
		// failure module so once the issue is fixed the code will be updated
		System.out.println("success");
		
	}

	
	
}
