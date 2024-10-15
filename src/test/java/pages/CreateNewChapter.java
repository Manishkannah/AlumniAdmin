package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateNewChapter extends BaseClass {
	
	@And("enter chapter name")
	public void chapterName() {
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test Chapter");
	}
	
	@And("enter chapter city name")
	public void chapterCityName() {
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Test Chapter");
	}
	
	@And("enter chapter banner image")
	public void chapterBannerImage() {
		driver.findElement(By.id("banner_image")).sendKeys("C:\\Users\\S.M\\Desktop\\250x250 image JPG.jpg");
		
	}
	
	@And("enter chapter type")
	public void chapterType() {
		driver.findElement(By.id("international")).click();
		
	}
	
	@And("enter chapter description")
	public void chapterDescription() {
		
		driver.findElement(By.xpath("//div[contains(@class,'ck ck-content ck-editor')]")).sendKeys("This is a test para");
		WebElement scroll1 = driver.findElement(By.xpath("//p[contains(text(),'Copyright © 2024 The Old Sanawa')]"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(scroll1).perform();
	}
	
	@And("enter chapter alumni")
	public void chapterAlumni() throws InterruptedException {
		
		driver.findElement(By.id("user")).sendKeys("man");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-menu-item-wrapper'])[1]")).click();
		
	}
	
	@When("click on the save button for chapter")
	public void chapterSaveButton() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

	

}
