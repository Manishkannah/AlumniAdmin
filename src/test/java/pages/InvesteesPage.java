package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvesteesPage extends BaseClass {
	
	
	@And("click on looking for investment")
	public void clickLookingForInvestment() {
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
	}
	
	@Then("verify the submitted investment form")
	public void verifyInvtestmentSubmited() {
		
		String text = driver.findElement(By.className("text-sm")).getText();
		
		if(text.contains("Thank you for submitting your requirements post")) {
			
			System.out.println("Investee details submitted successfully");
			
		}
		else {
			
			System.out.println("Investee details is not submitted successfully");
		}
	}

}
