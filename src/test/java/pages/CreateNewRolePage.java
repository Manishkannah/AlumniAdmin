package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewRolePage extends BaseClass {
	Actions mouse = new Actions(driver);
	@And("enter role name (.*)$")
	public void RoleName(String RoleName) {
		
		driver.findElement(By.id("exampleInputname")).sendKeys(RoleName);
	}
	
	@And("enter role type")
	public void RoleType() {
	
		WebElement rdd = driver.findElement(By.id("roleType"));
		Select dd1 = new Select(rdd);
		dd1.selectByIndex(0);
		
	}
	
	@And("enter election availability for role")
	public void ElectionAvailability() {
		WebElement ea = driver.findElement(By.id("electionAvailability"));
		Select dd2 = new Select(ea);
		dd2.selectByIndex(0);
		
	}
	
	@And("enter role description")
	public void RoleDescription() {
		
		driver.findElement(By.id("description")).sendKeys("this is a test role created for testing purpose");
	}
	
	@And("click on the necessary check box permissions")
	public void RolePermission() {
		WebElement scroll1 = driver.findElement(By.id("settings_add"));
		//Actions mouse = new Actions(driver);
		mouse.moveToElement(scroll1).perform();
		driver.findElement(By.id("users_add")).click();
		driver.findElement(By.id("roles_add")).click();
		driver.findElement(By.id("alumni_add")).click();
		driver.findElement(By.id("settings_add")).click();
		
	}
	
	@When("click on the create button Role")
	public void CreateRole() {
		WebElement scroll2 = driver.findElement(By.xpath("//button[@type='submit']"));
		mouse.moveToElement(scroll2).perform();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
