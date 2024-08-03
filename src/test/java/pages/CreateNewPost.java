package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewPost extends BaseClass{

	@And("enter post title")
	public void postTitle() throws IOException {
		try {
			driver.findElement(By.id("input-title")).sendKeys("Test Purpose");
			reportStep("enter post title entered successfully", "pass");
		} catch (Exception e) {
			reportStep("enter post title is not entered successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@And("enter upload feature image")
	public void featureimage() throws IOException {
		
		try {
			driver.findElement(By.id("picture")).sendKeys("C:\\Users\\S.M\\Desktop\\250x250 image JPG.jpg");
			reportStep("feature image entered successfully", "pass");
		} catch (Exception e) {
			reportStep("feature image is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter publish date")
	public void date() throws IOException {
		try {
			driver.findElement(By.id("publish_date")).sendKeys("2024-12-12");
			reportStep("publish date entered successfully", "pass");
		} catch (Exception e) {
			reportStep("publish date is not entered successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@And("enter description")
	public void description() throws IOException {
		
		try {
			driver.findElement(By.xpath("//div[contains(@class,'ck ck-content ck-editor__editable ')]")).sendKeys("This is a test purpose please ignore this post");
			reportStep(" post description entered successfully", "pass");
		} catch (Exception e) {
			reportStep(" post description is not entered successfully", "fail");
			e.printStackTrace();
		}
		
	}
	
	@When("click on the create post button")
	public void createPost() throws IOException {
		
		try {
			WebElement savepost = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			Actions mouse = new Actions(driver);
			mouse.moveToElement(savepost).perform();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			reportStep("clicked on create post button successfully", "pass");
		} catch (Exception e) {
			reportStep("DOesn't clicked on create post button successfully", "fail");
			e.printStackTrace();
		}
		
	}
}
