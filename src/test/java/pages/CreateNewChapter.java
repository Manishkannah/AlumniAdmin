package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewChapter extends BaseClass {
	
	@And("enter chapter name(.*)$")
	public void chapterName(String ChName) throws IOException {
		
		try {
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys(ChName);
			reportStep("Chapter name is entered successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Chapter name is not entered successfully","fail");
			e.printStackTrace();
		}
	}
	
	@And("enter chapter city name")
	public void chapterCityName() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Test Chapter");
			reportStep("Chapter city name is entered successfully","pass");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Chapter name is not entered successfully","fail");
			e.printStackTrace();
		}
	}
	
	@And("enter chapter banner image")
	public void chapterBannerImage() throws IOException {
		try {
			driver.findElement(By.id("banner_image")).sendKeys("C:\\Users\\S.M\\Desktop\\250x250 image JPG.jpg");
			reportStep("Chapter banner image is entered successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Chapter banner image is not entered successfully","fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter chapter type")
	public void chapterType() throws IOException {
		try {
			driver.findElement(By.id("international")).click();
			reportStep("Chapter type is entered successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Chapter type is not entered successfully","fail");
			e.printStackTrace();
		}
		
	}
	
	@And("enter chapter description")
	public void chapterDescription() throws IOException {
		
		try {
			driver.findElement(By.xpath("//div[contains(@class,'ck ck-content ck-editor')]")).sendKeys("This is a test para");
			WebElement scroll1 = driver.findElement(By.xpath("//p[contains(text(),'Copyright © 2024 The Old Sanawa')]"));
			Actions mouse = new Actions(driver);
			mouse.moveToElement(scroll1).perform();
			reportStep("Chapter description is entered successfully","pass");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Chapter description is not entered successfully","fail");
			e.printStackTrace();
		}
	}
	
	@And("enter chapter alumni")
	public void chapterAlumni() throws InterruptedException, IOException {
		
		
			try {
				driver.findElement(By.id("user")).sendKeys("man");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='ui-menu-item-wrapper'])[1]")).click();
				reportStep("chapter alumni name entered successfully","pass");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				reportStep("chapter alumni name is not entered successfully","fail");
				e.printStackTrace();
			}
			
		
		
	}
	
	@When("click on the save button for chapter")
	public void chapterSaveButton() throws IOException {
		
		try {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			reportStep("Chapter saved successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Chapter is not saved  successfully","fail");
			e.printStackTrace();
		}
		
	}
	

	

}
