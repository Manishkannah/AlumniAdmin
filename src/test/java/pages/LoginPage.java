package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {


	@Given("enter the valid username")
	public void EnterUsername() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manishkannah@gmail.com");
			reportStep("username enter successfully", "pass");
		} catch (Exception e) {
			reportStep("username is not enter successfully", "fail");
			e.printStackTrace();
		}	
		
	}
	
	@And("enter the valid password")
	public void EnterPassword() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Manish1234@");
			reportStep("password enter successfully", "pass");
		} catch (Exception e) {
			reportStep("password is not enter successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@When("click on the sign in button")
	public void ClickSignButton() throws IOException {

		try {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			reportStep("signin button clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("signin button is not clicked successfully", "fail");
			e.printStackTrace();
		}
		

	}

}
