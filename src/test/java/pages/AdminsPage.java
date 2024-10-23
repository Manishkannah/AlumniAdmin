package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdminsPage extends BaseClass {
	
	@And("click on the add admin")
	public void clickAddAdmins() throws IOException {
		
		try {
			driver.findElement(By.xpath("//a[@class='btn btn-success mb-0']")).click();
			reportStep("Add Admin is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Add Admin is not clicked successfully","fail");
			e.printStackTrace();
		}
		
	}
	
	@Then("admin added successfully message displayed on the screen")
	public void VerifyAddAdmin() throws IOException {
		
		try {
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
			reportStep("Created Admin verfied successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Created Admin is not verifed ","fail");
			e.printStackTrace();
		}
		
	}

}
