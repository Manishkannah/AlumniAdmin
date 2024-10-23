package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	public void InputEmail() {
		
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

	
// text Area field starts

	
	@And("click text area as mandatory")
	public void TextAreaMandatory() {
		
		 WebElement t1 = driver.findElement(By.xpath("(//input[@id='inputName'])[4]")); 
		 tt.moveToElement(t1).build().perform();
		driver.findElement(By.xpath("(//input[@id='isRequired'])[4]")).click();
	
	}	
	
	@And("enter the input type as text area")
	public void InputTextArea() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[4]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(3);

	}	
	
	@And("enter the input name as text area")
	public void InputNameTextArea() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[4]")).sendKeys("text area");
	
	}	
	
	@And("enter the input label as text area")
	public void InputLabelTextArea() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[4]")).sendKeys("text area");
	
	}
	
// file field starts
	
	
	@And("enter the input type as file")
	public void InputFile() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[5]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(4);

	}	
	
	@And("enter the input name as file")
	public void InputNameFile() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[5]")).sendKeys("file");
	
	}	
	
	@And("enter the input label as file")
	public void InputLabelfile() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[5]")).sendKeys("file");
	
	}

	
// number field starts
	
	@And("enter the input type as number")
	public void InputNumber() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[6]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(5);

	}	
	
	@And("enter the input name as number")
	public void InputNameNumber() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[6]")).sendKeys("membership no");
	
	}	
	
	@And("enter the input label as number")
	public void InputLabelNumber() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[6]")).sendKeys("membership no");
	
	}	
	
	
//phone field starts
	
	
	@And("enter the input type as phone")
	public void InputPhoneNumber() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[7]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(6);

	}	
	
	@And("enter the input name as phone")
	public void InputNamePhoneNumber() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[7]")).sendKeys("Phone no");
	
	}	
	
	@And("enter the input label as phone")
	public void InputLabelPhoneNumber() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[7]")).sendKeys("Phone no");
	
	}
	
	
// select field starts
	
	@And("enter the input type as select")
	public void InputSelect() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[8]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(7);

	}	
	
	@And("enter the input name as select")
	public void InputNameSelect() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[8]")).sendKeys("Select");
	
	}	
	
	@And("enter the input label as select")
	public void InputLabelSelect() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[8]")).sendKeys("select");
	
	}
	
	@And("enter the select options")
	public void enterOptions() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//input[@id='isRequired'])[10]"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(element).perform();
		driver.findElement(By.xpath("(//textarea[@id='options'])[8]")).sendKeys("red",Keys.ENTER,"blue",Keys.ENTER,"green");
		
	}
	
// check box field starts
	
	@And("enter the input type as checkbox")
	public void InputCheckBox() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[9]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(8);

	}	
	
	@And("enter the input name as checkbox")
	public void InputNameCheckBox() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[9]")).sendKeys("checkBox");
	
	}	
	
	@And("enter the input label as checkbox")
	public void InputLabelCheckBox() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[9]")).sendKeys("checkbox");
	
	}
	
	@And("enter the checkbox options")
	public void enterCheckBoxOptions() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//input[@id='isRequired'])[10]"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(element).perform();
		driver.findElement(By.xpath("(//textarea[@id='options'])[9]")).sendKeys("one",Keys.ENTER,"two",Keys.ENTER,"three");
		
	}	
	
	
// Radio Button Field starts
	
	@And("enter the input type as radio button")
	public void InputRadioButton() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[10]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(9);

	}	
	
	@And("enter the input name as radio button")
	public void InputNameRadioButton() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[10]")).sendKeys("Radio");
	
	}	
	
	@And("enter the input label as radio button")
	public void InputLabelRadioButton() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[10]")).sendKeys("Radio");
	
	}
	
	@And("enter the radio button options")
	public void enterRadioButtonOptions() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//input[@id='isRequired'])[10]"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(element).perform();
		driver.findElement(By.xpath("(//textarea[@id='options'])[10]")).sendKeys("male",Keys.ENTER,"female",Keys.ENTER,"others");
		
	}	
	
	
// date field starts
	
	
	@And("enter the input type as date")
	public void InputDate() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[11]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(10);

	}	
	
	@And("enter the input name as date")
	public void InputNameDate() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[11]")).sendKeys("date");
	
	}	
	
	@And("enter the input label as date")
	public void InputLabelDate() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[11]")).sendKeys("date");
	
	}	
	
// time field starts
	
	@And("enter the input type as time")
	public void InputTime() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[12]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(11);

	}	
	
	@And("enter the input name as time")
	public void InputNameTime() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[12]")).sendKeys("time");
	
	}	
	
	@And("enter the input label as time")
	public void InputLabelTime() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[12]")).sendKeys("time");
	
	}
	
	
// Date and Time Field starts
	
	@And("enter the input type as date and time")
	public void InputDateTime() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[13]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(12);

	}	
	
	@And("enter the input name as date and time")
	public void InputNameDateTime() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[13]")).sendKeys("Date time");
	
	}	
	
	@And("enter the input label as date and time")
	public void InputLabelDateTime() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[13]")).sendKeys("Date time");
	
	}
	
	
// Link field starts
	
	@And("enter the input type as link")
	public void InputLink() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[14]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(13);

	}	
	
	@And("enter the input name as link")
	public void InputNameLink() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[14]")).sendKeys("Link");
	
	}	
	
	@And("enter the input label as link")
	public void InputLabelLink() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[14]")).sendKeys("Link");
	
	}
	
	
// agreement field starts
	
	
	@And("enter the input type as agreement")
	public void InputAgreement() {
		
		WebElement field = driver.findElement(By.xpath("(//select[@id='selectField'])[15]"));
		Select dd1 = new Select(field);
		dd1.selectByIndex(14);

	}	
	
	@And("enter the input name as agreement")
	public void InputNameAgreement() {
		
		driver.findElement(By.xpath("(//input[@id='inputName'])[15]")).sendKeys("Agreement");
	
	}	
	
	@And("enter the input label as agreement")
	public void InputLabelAgreement() {
		
		driver.findElement(By.xpath("(//input[@id='inputLabel'])[15]")).sendKeys("Agreement");
	
	}
	
	@And("click agreement as mandatory")
	public void agreementmandatory() {
		
		driver.findElement(By.xpath("(//input[@id='isRequired'])[14]")).click();
		
	}
	
	
// Others
	
	@And("enter the admin mail subject")
	public void AdminMailSubject() {
		
		driver.findElement(By.id("admin_mail_subject")).sendKeys("Test admin mail ");
	}
	
	@And("enter the admin mail content")
	public void AdminMailContent() {
		
		driver.findElement(By.id("admin_message")).sendKeys("new lead please check");
	}
	
	@And("enter the user mail subject")
	public void UserMailSubject() {
		
		driver.findElement(By.id("user_mail_subject")).sendKeys("submitted successfully");
	}
	
	@And("enter the user mail content")
	public void UserMailContent() {
		
		driver.findElement(By.id("user_message")).sendKeys("our admin will contact you");
	}
	
	
	@And("enter success notification")
	public void SuccessNotificaiton() {
		
		driver.findElement(By.id("success_notification")).sendKeys("thank you");
		
	}
	
	@And("enter the error notification")
	public void ErrorNotificaiton() {
		
		driver.findElement(By.id("error_notification")).sendKeys("Please contact admin");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
