package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;

public class CreateNewContactForm extends BaseClass {
	
	Actions tt = new Actions(driver);
	
	@And("enter the form name")
	public void formName() {
		
		driver.findElement(By.xpath("//input[@id='form_name']")).sendKeys("Test Form");
	}
	
	@And("enter the submit button name")
	public void SubmitButtonName() {
		
		driver.findElement(By.xpath("//input[@id='submit_button_name']")).sendKeys("save");
	}
	
	@And("click on the add field button")
	public void AddFieldButton() {
		
		WebElement element = driver.findElement(By.xpath("//i[@id='add-form']"));
		
		for(int i =0; i<17;i++) {
			
			element.click();
			
		}
		
	}
	
// Text field
	@And("click name as text mandatory")
	public void textMandatory() {
		
		driver.findElement(By.xpath("(//input[@id='isRequired'])[1]")).click();
	
	}	
	
	@And("enter the input type as text")
	public void Inputtext() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[1]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(0);
	

	}	
	
	@And("enter the input name as text")
	public void InputNameText() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[1]")).sendKeys("text");
	
	}	
	
	@And("enter the input label as text")
	public void InputLabelText() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[1]")).sendKeys("Text");
	
	}	
	
// Name field starts
	
	@And("click name as name mandatory")
	public void NameMandatory() {
		
		 WebElement t1 = driver.findElement(By.xpath("(//input[@id='inputName'])[2]")); 
		 tt.moveToElement(t1).build().perform();
		driver.findElement(By.xpath("(//input[@id='isRequired'])[2]")).click();
	
	}	
	
	@And("enter the input type as name")
	public void InputName() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[2]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(1);

	}	
	
	@And("enter the input name as name")
	public void InputNameName() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[2]")).sendKeys("name");
	
	}	
	
	@And("enter the input label as name")
	public void InputLabelName() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[2]")).sendKeys("Name");
	
	}
	
// Email field starts	
	@And("click email as mandatory")
	public void EmailMandatory() {
		
		 WebElement t1 = driver.findElement(By.xpath("(//input[@id='inputName'])[3]")); 
		 tt.moveToElement(t1).build().perform();
		driver.findElement(By.xpath("(//input[@id='isRequired'])[3]")).click();
	
	}	
	
	@And("enter the input type as email")
	public void InputEnmail() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[3]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(2);

	}	
	
	@And("enter the input name as email")
	public void InputNameEmail() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[3]")).sendKeys("email");
	
	}	
	
	@And("enter the input label as email")
	public void InputLabelEmail() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[3]")).sendKeys("Email");
	
	}

	
//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
