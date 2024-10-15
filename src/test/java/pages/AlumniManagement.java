package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AlumniManagement extends BaseClass{
	
	@And("click on the add alumni button")
	public void ClickAddAlumni() {
		
		driver.findElement(By.xpath("//i[@class='material-icons text-sm']")).click();
		
	}
	
	@Then("verify alumni added")
	public void VerifyAlumniAdded() {
		
		System.out.println("success");
		
	}

	
	
}
