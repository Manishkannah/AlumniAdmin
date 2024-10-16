package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EnlistAsInvesteePage extends BaseClass{
	
	
	@And("enter organization name")
	public void OrganizationName() {
		
	driver.findElement(By.id("title")).sendKeys("ABC Crop");
		
	}
	
	@And("enter area of investement")
	public void AreaOfInvestement() {
		
		driver.findElement(By.id("area_of_investment")).sendKeys("Mutual Funds");
		
	}
	
	@And("enter details of founder in the investement")
	public void DetailsOfFounder() {
		
		driver.findElement(By.id("founder_details")).sendKeys("Manish Tester");
		
	}
	
	@And("enter the funding required")
	public void FundingRequired() {
		
		driver.findElement(By.id("amount")).sendKeys("2 Lakhs");
		
	}
	
	@And("enter the investement description")
	public void InvestmentDescription() {
		
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Test Description");
		
	}
	
	@When("click to submit the form")
	public void SubmitInvestement() {
		
		WebElement scroll = driver.findElement(By.xpath("//button[@type='submit']"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(scroll).perform();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
