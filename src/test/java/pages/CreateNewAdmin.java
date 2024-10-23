package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewAdmin extends BaseClass {

	@And("enter first name of admin")
	public void EnterAdminFirstName() throws IOException {
		try {
			driver.findElement(By.id("exampleInputname")).sendKeys("Unique");
			reportStep("Admin first name entered successfully","pass");
		} catch (Exception e) {
			reportStep("Admin first name is not entered successfully","fail");
			e.printStackTrace();
		}
	}
	
	@And("enter last name of admin")
	public void EnterAdminLastName() throws IOException{
		
		try {
			driver.findElement(By.xpath("(//input[@id='exampleInputname'])[2]")).sendKeys("Admin");
			reportStep("Admin last name is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Admin last name is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter email of admin (.*)$")
	public void EnterAdminEmail(String AEmail) throws IOException {
		
		try {
			driver.findElement(By.id("exampleInputemail")).sendKeys(AEmail);
			reportStep("Admin mail id is entred succesfully","pass");
		} catch (Exception e) {
			reportStep("Admin mail id is not entred successfully","fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter the admin role type")
	public void SelectRoleTypeAdmin() throws IOException {
		
		try {
			WebElement dd1 = driver.findElement(By.id("role"));
			Select role = new Select(dd1);
			role.selectByIndex(0);
			reportStep("Admin role type is entred successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Admin roile type is not entred successfully","fail");
			e.printStackTrace();
		}
	}
	
	@And("enter password of admin")
	public void EnterAdminPassword() throws IOException {
		try {
			driver.findElement(By.id("examplePassword")).sendKeys("Password123@");
			reportStep("Admin password entered successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Admin password is not entered successfully","fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter confirm password of admin")
	public void EnterAdminCnfPassword() throws IOException {
		try {
			driver.findElement(By.id("examplePassword2")).sendKeys("Password123@");
			reportStep("Admin password reentered successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Admin password is not re-entered successfully","fail");
			e.printStackTrace();
		}
	}
	
	@And("click on the is alumni check box")
	public void IsAlumniCheckBox() throws IOException {
		try {
			WebElement scroll1 = driver.findElement(By.id("is_alumni"));
			Actions mouse = new Actions(driver);
			mouse.moveToElement(scroll1).perform();
			driver.findElement(By.id("is_alumni")).click();
			reportStep("Alumni check box clicked successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Alumni check box is not clicked","fail");
			e.printStackTrace();
		}
		
	}
	
	@When("click on the submit button to submit")
	public void SubmitButtonAdmin() throws IOException {
		
		try {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			reportStep("Submit button clicked","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Submit button is not clicked", "fail");
			e.printStackTrace();
		}
		
	}
}
