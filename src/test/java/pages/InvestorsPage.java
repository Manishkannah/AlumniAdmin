package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvestorsPage extends BaseClass {
	
	
	@And("click enlist as a investor")
	public void EnlistAsInvestor() {
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
	}

	@Then("verfiy investor submitted")
	public void VerifyInvestorSubmitted() {
		
		String text = driver.findElement(By.xpath("//span[@class='text-sm']")).getText();
		if(text.contains("Thank you for submitting your listing")) {
			
			System.out.println("investor request sent successfully");
			
		}
		
		else {
			
			System.out.println("investor request is not sent successfully");
			
		}
		
	}
}
