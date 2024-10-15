package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ChapterPage extends BaseClass {
	
	@And("click on the add chapter button")
	public void AddChapter() {
		
		driver.findElement(By.xpath("//i[@class='material-icons text-sm']")).click();
		
	}
	
	@Then("chapter added successfully message is displayed on the screen")
	public void VerifyChapterAdded() {
	
		String text = driver.findElement(By.xpath("//span[@class='text-sm']")).getText();
		if(text.contains("created ")) {
		
			System.out.println("chapter created successfully");
		}
		
		else {
			System.out.println("chapter is not created successfully");
		}
	
	}

}
