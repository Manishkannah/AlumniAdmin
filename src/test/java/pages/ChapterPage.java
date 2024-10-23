package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ChapterPage extends BaseClass {
	
	@And("click on the add chapter button")
	public void AddChapter() throws IOException {
		
		try {
			driver.findElement(By.xpath("//i[@class='material-icons text-sm']")).click();
			reportStep("Clicked on Add chapter button successfully","pass");
		} catch (Exception e) {
			reportStep("Clicked on Add chapter button is not successful","fail");
			e.printStackTrace();
		}
		
	}
	
	@Then("chapter added successfully message is displayed on the screen")
	public void VerifyChapterAdded() throws IOException {
	
		try {
			String text = driver.findElement(By.xpath("//span[@class='text-sm']")).getText();
			if(text.contains("created ")) {
			
				System.out.println("chapter created successfully");
			}
			
			else {
				System.out.println("chapter is not created successfully");
			}
			reportStep("Chapter verified successfully","pass");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Chapter is not verified successfully","fail");
			e.printStackTrace();
		}
	
	}

}
