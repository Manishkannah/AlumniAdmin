package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewAdmin extends BaseClass {

	@And("enter first name of admin")
	public void EnterAdminFirstName() {
		driver.findElement(By.id("exampleInputname")).sendKeys("Unique");
	}
	
	@And("enter last name of admin")
	public void EnterAdminLastName(){
		
		driver.findElement(By.xpath("(//input[@id='exampleInputname'])[2]")).sendKeys("Admin");
		
	}
	
	@And("enter email of admin (.*)$")
	public void EnterAdminEmail(String AEmail) {
		
		driver.findElement(By.id("exampleInputemail")).sendKeys(AEmail);
		
	}
	
	@And("enter the admin role type")
	public void SelectRoleTypeAdmin() {
		
		WebElement dd1 = driver.findElement(By.id("role"));
		Select role = new Select(dd1);
		role.selectByIndex(0);
	}
	
	@And("enter password of admin")
	public void EnterAdminPassword() {
		driver.findElement(By.id("examplePassword")).sendKeys("Password123@");
		
	}
	
	@And("enter confirm password of admin")
	public void EnterAdminCnfPassword() {
		driver.findElement(By.id("examplePassword2")).sendKeys("Password123@");
	}
	
	@And("click on the is alumni check box")
	public void IsAlumniCheckBox() {
		WebElement scroll1 = driver.findElement(By.id("is_alumni"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(scroll1).perform();
		driver.findElement(By.id("is_alumni")).click();
		
	}
	
	@When("click on the submit button to add admin")
	public void SubmitButtonAdmin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
