package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class ManageContactForm extends BaseClass{
	
	@And("click on the add contact form")
	public static void AddForm() {
		driver.findElement(By.xpath("//a[@class='btn bg-gradient-dark mb-0 me-4']")).click();
	}

}
