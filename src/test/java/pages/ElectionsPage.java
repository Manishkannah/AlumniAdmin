package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ElectionsPage extends BaseClass {
	
	@And("click on the add election button")
	public void clickOntheAddElectionsButton() throws IOException {
		try {
			driver.findElement(By.xpath("//i[@class='material-icons text-sm']")).click();
			reportStep("clicked on the AddElections Button successfully", "pass");
		} catch (Exception e) {
			reportStep("Doesn't clicked on the AddElections Button successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@Then("redirect to election page")
	public void verifyElectionCreated() throws IOException {
		try {
			String text = driver.findElement(By.xpath("//span[contains(text(),'Election successfully created.')]")).getText();

			if(text.contentEquals("Election successfully created.")) {
				System.out.println("Election created successfully");
			}

			else {
				System.out.println("Election is not created");
			}
			reportStep("created election is verified successfully", "pass");
		} catch (Exception e) {
			reportStep("created election is not verified successfully", "fail");
			e.printStackTrace();
		}


	}

}
