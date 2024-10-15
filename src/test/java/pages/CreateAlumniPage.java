package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateAlumniPage extends BaseClass {
	
	@And("enter first name")
	public void EnterFirstName() throws IOException {
		
		try {
			driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys("Rohit");
			reportStep("Name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("First name is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter last name")
	public void EnterLastName() throws IOException {
		
		try {
			driver.findElement(By.xpath("//input[@aria-label='Last Name']")).sendKeys("Tharun");
			reportStep("Last name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Last Name is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter gender")
	public void EnterGender() throws IOException {
		try {
			WebElement selectgender = driver.findElement(By.id("gender"));
			Select dd = new Select(selectgender);
			dd.selectByIndex(1);
			reportStep("Gender entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Gender is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter email id")
	public void EnterEmailId() throws IOException {
		
		try {
			driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("rohit89@gmail.com");
			reportStep("Email entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Email is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	
	@And("enter phone number")
	public void EnterPhonenumber() throws IOException {
		
		try {
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9878978998");
			reportStep("Phone number entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Phone number is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter alumni department")
	public void enterDepartment() throws IOException {
		
		try {
			WebElement department = driver.findElement(By.id("school_name"));
			Select dd = new Select(department);
			dd.selectByIndex(1);
			reportStep("department entered successfully", "pass");
		} catch (Exception e) {
			reportStep("department is not entered successfully", "Fail");
			e.printStackTrace();
		}
	}
	
	@And("enter program")
	public void EnterProgrammeDgree() throws IOException {
		
		try {
			WebElement selectcourse = driver.findElement(By.id("course_attended"));
			Select dd = new Select(selectcourse);
			dd.selectByIndex(1);
			reportStep("Program entered successfully", "pass");
		} catch (Exception e) {
			reportStep("program is not entered successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@And("enter joining year")
	public void EnterJoinyear() throws IOException {
		
		try {
			driver.findElement(By.name("batch_start")).sendKeys("1999");
			reportStep("Joining year entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Joining year is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter passout year")
	public void EnterpassOutyear() throws IOException {
		
		try {
			driver.findElement(By.name("batch_end")).sendKeys("1999");
			reportStep("Passout Year entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Passout year is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@When("click on the create alumni button")
	public void ClickCreateAlumniButton() throws IOException {
		
		try {
			WebElement scroll = driver.findElement(By.xpath("//button[@type='submit']"));
			Actions mouse = new Actions(driver);
			mouse.moveToElement(scroll).perform();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			reportStep("Clicked on the create alumni button", "pass");
		} catch (Exception e) {
			reportStep("Doesn't clicked on the create alumni button", "fail");
			e.printStackTrace();
		}
		
	}
	


}
