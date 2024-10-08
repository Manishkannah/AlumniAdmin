package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RolesPage extends BaseClass {
	
	@And("click on the add role button")
	public void clickAddRole() {
		
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		
	}
	
	@Then("Success message to be displayed on the listing page")
	public void verifyRole() {
		
		String verifyrole = driver.findElement(By.xpath("//span[text()='Role successfully created.']")).getText();
		
		if(verifyrole.contains("successfully")) {
			
			System.out.println("The Role is created successfully");
			
		}
		
		else {
			System.out.println("The Role is not created successfully");
		}
		
		driver.findElement(By.xpath("//input[@class='dataTable-input']")).sendKeys("Board Member");
		driver.findElement(By.xpath("//i[text()='delete']")).click();
		System.out.println("Also the created role was deleted successfully");
		driver.switchTo().alert().accept();
		
		
	}

}
