package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailNotificationpage extends BaseClass {
	
	@And("click on the create notification")	
	public void createNotificationButton() throws IOException {
		
		try {
			driver.findElement(By.xpath("//a[@href='https://alumni-portal-uat.alumnetworks.com/email-notifications/create']")).click();
			reportStep("Clicked on create notification button successfully", "pass");
		} catch (Exception e) {
			reportStep("Doesn't clicked on create notification button successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@Then("verify the added notification")
	public void clickAddButton() throws IOException {
		
		try {
			String text = driver.findElement(By.xpath("//span[@class='text-sm']")).getText();
			
			if(text.contains("Notification created successfully.")) {
				System.out.println("The notification is created successfully");
			}
			
			else {
				
				System.out.println("The notification is not created successfully");
				
			}
			
			reportStep("notification verified successfully", "pass");
		} catch (Exception e) {
			reportStep("notification is not verified successfully", "fail");
			e.printStackTrace();
		}
		
		
	}
}
