package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EventsManagementPage extends BaseClass{
	
	@When("click on the add event")
	public void ClickAddEvent() throws IOException {
		
		try {
			driver.findElement(By.xpath("//span[@class='material-symbols-outlined']")).click();
			reportStep("Clicked on add event button successfully", "pass");
		} catch (Exception e) {
			reportStep("Doesn't Clicked on add event button successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@Then("verify event created")
	public void verifyEventAdded() throws IOException {

		try {
			String verifysuccess = driver.findElement(By.xpath("//span[text()='Event added successfully.']")).getText();
			
			if(verifysuccess.contains("Event added successfully.")) {
				System.out.println("The event is created successfully");
			}
			
			else {
				System.out.println("The event is not created successfully");
			}
			reportStep("event verified successfully", "pass");
		} catch (Exception e) {
			reportStep("event is not verified ", "fail");
			e.printStackTrace();
		}
		}

}
