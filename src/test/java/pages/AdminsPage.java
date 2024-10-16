package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdminsPage extends BaseClass {
	
	@And("click on the add admin")
	public void clickAddAdmins() {
		
		driver.findElement(By.xpath("//a[@class='btn btn-success mb-0']")).click();
		
	}
	
	@Then("admin added successfully message displayed on the screen")
	public void VerifyAddAdmin() {
		
		String text = driver.findElement(By.xpath("//span[@class='text-sm']")).getText();
		if(text.contains("successfully ")) {
			System.out.println("Admin created successfully");
			
		}
		else {
			System.out.println("Admin is not cretaed");
		}
		
		driver.findElement(By.xpath("//input[@class='dataTable-input']")).sendKeys("Unique");
		driver.findElement(By.xpath("//i[text()='delete']")).click();
		driver.switchTo().alert().accept();
		System.out.println("Also the created Admin role was deleted successfully");
		
	}

}
