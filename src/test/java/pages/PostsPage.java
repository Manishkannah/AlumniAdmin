package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PostsPage extends BaseClass{
	
	
	@And("click on the post content button")
	public void clickCreatePost() throws IOException {
		try {
			driver.findElement(By.xpath("//a[text()='Post Content']")).click();
			reportStep("post content button successfully", "pass");
		} catch (Exception e) {
			reportStep("post content button is not clicked successfully", "fail");
			e.printStackTrace();
		}
	}
	
	@Then("verify post added")
	public void verifyPost() throws IOException {
		try {
			String text = driver.findElement(By.xpath("//span[text()='Article created successfully.']")).getText();

			if(text.contains("Article created successfully.")) {
				System.out.println("post added successfully");
			}
			else {
				System.out.println("The post is not created ");
			}
			reportStep("verifying the post successfully", "pass");
		} catch (Exception e) {
			reportStep("verifying the post is not successfully", "fail");
			e.printStackTrace();
		}
	}

}
