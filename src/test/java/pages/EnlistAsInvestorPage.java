package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;

public class EnlistAsInvestorPage extends BaseClass {
	
	
	@And("enter type of investor")
	public void TypeOfInvestors() {
		
		driver.findElement(By.id("type_of_investor")).sendKeys("Test type");
		
	}
	
	@And("enter type of funding")
	public void TypeofFunding() {
		
		driver.findElement(By.id("type_of_funding")).sendKeys("dollar");
		
	}
	
	@And("enter quantum of funds")
	public void Quantumoffunds () {
		
		driver.findElement(By.id("quantum_of_funds")).sendKeys("4");
		
	}
	
	@And("enter sector")
	public void Sectors() {
		
		driver.findElement(By.id("sectors")).sendKeys("education");
		
	}
	
	@And("enter previous investment")
	public void Previousinvestments() {
		
		driver.findElement(By.id("previous_investments")).sendKeys("angle funding");
		
		
	}
	
	@And("enter linkedin url")
	public void LinkedinUrl() {
		
		driver.findElement(By.id("linkedin_url")).sendKeys("https://www.linkedin.com/home");
		
	}
	
	
	@And("enter website url")
	public void WebsiteUrl() {
		
		driver.findElement(By.id("website_url")).sendKeys("https://www.linkedin.com/home");
		
	}
	
	
	
	@And("enter other details")
	public void OtherDetails() {
		
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("this is for test purpose");
		
	}
	
	@And("submit the investor")
	public void SubmitInvestor() {
		WebElement scroll = driver.findElement(By.xpath("//button[@type='submit']"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(scroll).perform();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
