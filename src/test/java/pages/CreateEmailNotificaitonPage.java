package pages;

import java.awt.event.MouseAdapter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateEmailNotificaitonPage extends BaseClass{
	Actions mouse= new Actions(driver);	

@And("enter mail content")
public void EnterMailContent() throws IOException {
	try {
		driver.findElement(By.xpath("//div[contains(@class,'ck ck-content ck-editor__editable ck-rounded')]")).sendKeys("The email content is a communication sent to customers, prospective customers', or subscribers' inbox using an automation platform, a dedicated email builder, or personally. Basically, it's the text, images and other multimedia you include in your email.");
		reportStep("mail content entered successfully", "pass");
	} catch (Exception e) {
		reportStep("mail content is not entered successfully", "fail");
		e.printStackTrace();
	}
	
}

@And("enter the subject")
public void EnterSubject() throws IOException {
	try {
		driver.findElement(By.id("inputSubject")).sendKeys("Testing All users");
		WebElement date = driver.findElement(By.id("inputNotificationdate"));
		mouse.scrollToElement(date).build().perform();
		reportStep("mail subject entered successfully", "pass");
	} catch (Exception e) {
		reportStep("mail subject is not entered successfully", "fail");
		e.printStackTrace();
	}
	
}

@And("enter the notificaiton date")
public void EnterNotificationdate() throws IOException {
	
	try {
		driver.findElement(By.id("inputNotificationdate")).sendKeys("28-07-2025");
		reportStep("mail notification date entered successfully", "pass");
	} catch (Exception e) {
		reportStep("mail notification date is not entered successfully", "fail");
		e.printStackTrace();
	}
	
	
	
}

@And("enter the notification time")
public void EnterNotificationTime() throws IOException {
	try {
		driver.findElement(By.id("inputNotificationtime")).sendKeys("20:00");
		WebElement ta = driver.findElement(By.xpath("(//input[@name='target_users_type'])[1]"));
		mouse.scrollToElement(ta).build().perform();
		reportStep("mail notification time entered successfully", "pass");
	} catch (Exception e) {
		reportStep("mail notification time is not entered successfully", "fail");
		e.printStackTrace();
	}
	
	
}

@And("select the target user as all")
public void EnterTargetasAll() throws IOException {
//	WebElement ta = driver.findElement(By.xpath("(//input[@name='target_users_type'])[1]"));
//	mouse.scrollToElement(ta).build().perform();
	try {
		driver.findElement(By.xpath("(//input[@name='target_users_type'])[1]")).click();
		reportStep("mail targeted users entered successfully as all", "pass");
	} catch (Exception e) {
		reportStep("mail targeted users is not entered successfully", "fail");
		e.printStackTrace();
	}
	
	
}


@And("select the target user as batch")
public void selectBatch() throws IOException {
	try {
		driver.findElement(By.xpath("//input[@value='batch']")).click();
		reportStep("mail targeted users entered successfully as batch", "pass");
	} catch (Exception e) {
		reportStep("mail targeted users is not entered successfully", "fail");
		e.printStackTrace();
	}
}

@And("select the target user as custome")
public void selectcustom() throws IOException {
	try {
		driver.findElement(By.xpath("//input[@value='custom']")).click();
		reportStep("mail targeted users entered successfully as custom", "pass");
	} catch (Exception e) {
		reportStep("mail targeted users is not entered successfully", "fail");
		e.printStackTrace();
	}
}

@And("upload the file")
public void uploadCustomFile() throws IOException {
	try {
		driver.findElement(By.xpath("//input[@id='custom_data']")).sendKeys("C:\\Users\\S.M\\Desktop\\EmailNotification.csv");
		reportStep("file uploaded successfully", "pass");
	} catch (Exception e) {
		reportStep("file is not uploaded successfully", "fail");
		e.printStackTrace();
	}
}


@And("enter the batch start date")
public void batchStartDate() throws IOException {
	
	try {
		driver.findElement(By.id("start_year")).sendKeys("1999");
		reportStep("batch start date entered successfully", "pass");
	} catch (Exception e) {
		reportStep("batch start date is not entered successfully", "fail");
		e.printStackTrace();
	}
	
}

@And("enter the batch end date")
public void batchEndDate() throws IOException {
	
	try {
		driver.findElement(By.id("end_year")).sendKeys("1999");
		reportStep("batch end date entered successfully", "pass");
	} catch (Exception e) {
		reportStep("batch end date is not entered successfully", "fail");
		e.printStackTrace();
	}
	
}

@And("select the target user as chapter")
public void selectChapter() throws IOException {
	try {
		driver.findElement(By.xpath("//input[@value='chapter']")).click();
		reportStep("mail targeted users entered successfully as chapter", "pass");
	} catch (Exception e) {
		reportStep("mail targeted users is not entered successfully", "fail");
		e.printStackTrace();
	}
	
}

@And("select the chapter from the dropdown")
public void selectChapterFromList() throws IOException {
	
	try {
		WebElement chapter = driver.findElement(By.id("chapters"));
		Select dd = new Select(chapter);
		dd.selectByIndex(10);
		reportStep("chapter entered successfully", "pass");
	} catch (Exception e) {
		reportStep("chapter is not entered successfully", "fail");
		e.printStackTrace();
	}
}

@When("click on add notification button")
public void clickAddButton() throws IOException {
	
	try {
		WebElement sv = driver.findElement(By.id("emailNotificationFormBtn"));
		mouse.moveToElement(sv).build().perform();
		driver.findElement(By.id("emailNotificationFormBtn")).click();
		reportStep("Clicked on add notification button successfully", "pass");
	} catch (Exception e) {
		reportStep("Doesn't clicked on add notification button  successfully", "fail");
		e.printStackTrace();
	}
	
	
}



}
