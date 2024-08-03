package pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewEventPage extends BaseClass {
	
	Actions mouse= new Actions(driver);
	
@Then("add new events page")
public void verifyAddEventsPage() throws IOException {
	
	try {
		String title = driver.getTitle();
		
		System.out.println(title);
		reportStep("event page is verified successfully", "pass");
	} catch (Exception e) {
		reportStep("event page is not verified successfully", "fail");
		e.printStackTrace();
	}
	
	}

@And("enter the event type")
public void AddEventType() throws IOException {
	
	try {
		WebElement EventType = driver.findElement(By.id("eventType"));
		Select dd = new Select(EventType);
		dd.selectByIndex(1);
		reportStep("event type entered successfully", "pass");
	} catch (Exception e) {
		reportStep("event type is not entered successfully", "fail");
		e.printStackTrace();
	}
	
}

@And("enter new event type name")
public void AddNewTypeEventName() throws IOException {
	try {
		driver.findElement(By.id("eventTypeName")).sendKeys("New type of event added");
		reportStep("new event type name entered successfully", "pass");
	} catch (Exception e) {
		reportStep("new event type name is not entered successfully", "fail");
		e.printStackTrace();
	}
}

@And("enter new event description")
public void AddNewEventTypeDescription() throws IOException {
	try {
		driver.findElement(By.id("eventTypeDescription")).sendKeys("This is a test event created for testing purpose");
		reportStep("new event description entered successfully", "pass");
	} catch (Exception e) {
		reportStep("new event type description is not entered successfully", "fail");
		e.printStackTrace();
	}
}

@And("enter the new city")
public void SelectCity() throws IOException {
	try {
		WebElement newcity = driver.findElement(By.id("eventcity"));
		Select dd1 = new Select(newcity);
		dd1.selectByIndex(1);
		reportStep("clicked new city  successfully", "pass");
	} catch (Exception e) {
		reportStep("clicked new city is not successfully", "fail");
		e.printStackTrace();
	}	
	
}

@And("enter the city name")
public void NewCityname() throws IOException {
	try {
		driver.findElement(By.id("eventCityName")).sendKeys("chennai city");
		reportStep("new city name entered successfully", "pass");
	} catch (Exception e) {
		reportStep("new city name is not entered successfully", "fail");
		e.printStackTrace();
	}
	
}
@And("enter event name (.*)$")
public void AddEventname(String Eventname) throws IOException {
	try {
		driver.findElement(By.id("eventName")).sendKeys(Eventname);
		reportStep("event name entered successfully", "pass");
	} catch (Exception e) {
		reportStep("event name is not entered successfully", "fail");
		e.printStackTrace();
	}
}

@And("upload the feature image")
public void Uploadimage() throws IOException {
	
	try {
		driver.findElement(By.id("featuredImage")).sendKeys("C:\\Users\\S.M\\Desktop\\250x250 image JPG.jpg");
		reportStep("feature image uploaded successfully", "pass");
	} catch (Exception e) {
		reportStep("feature image is not uploaded successfully", "fail");
		e.printStackTrace();
	}
	
}

@And("enter event description")
public void entereventDescription() throws InterruptedException, IOException {
	try {
		driver.findElement(By.xpath("//p[@class='ck-placeholder']")).sendKeys("it's a piece of copy that tells people the basic information they need to know to decide whether or not they want to attend the event. It should always include the 5 W's (who, what, when, where, and why) and, if necessary, an H for how.");
		JavascriptExecutor js2 = (JavascriptExecutor) driver; js2.executeScript("window.scrollBy(0,1000)","Date And Time");
		Thread.sleep(2000);
		reportStep("event description entered successfully", "pass");
	} catch (InterruptedException e) {
		reportStep("event description is not entered successfully", "fail");
		e.printStackTrace();
	}
}

@And("enter event venu")
public void enterVenue() throws IOException {
	
	try {
		WebElement selectvenue = driver.findElement(By.id("eventSite"));
		Select dd2 = new Select(selectvenue);
		dd2.selectByIndex(3);
		//select[@class='flatpickr-monthDropdown-months'])[3]
		reportStep("event venue entered successfully", "pass");
	} catch (Exception e) {
		reportStep("event venue is not entered successfully", "fail");
		e.printStackTrace();
	}
}

@And("choose event day")
public void Eventdate() throws IOException {
	
	try {
		driver.findElement(By.id("signle_day")).click();
		driver.findElement(By.id("eventStartDate")).sendKeys("2025-12-12");
//		driver.findElement(By.xpath("(//span[@class='arrowUp'])[3]")).click();
//		WebElement month = driver.findElement(By.xpath("(//select[@class='flatpickr-monthDropdown-months'])[3]"));
//		Select dd7 = new Select(month);
//		dd7.selectByValue("8");
//		driver.findElement(By.xpath("(//span[text()='28'])[3]")).click();
		System.out.println("Event start date entered successfully");
		reportStep("event date entered successfully", "pass");
	} catch (Exception e) {
		reportStep("event date is not entered successfully", "fail");
		e.printStackTrace();
	}
	

	}

@And("enable event booking")
public void EnableBooking() throws InterruptedException, IOException {
	try {
		driver.findElement(By.id("bookingEnabledCheckbox")).click();
		driver.findElement(By.xpath("//input[@id='eventBookingStartDate']")).sendKeys("2025-08-13");
//		Thread.sleep(1000);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver; js2.executeScript("window.scrollBy(0,1000)","Booking Details");
//		driver.findElement(By.xpath("(//span[@class='arrowUp'])[1]")).click();
//		driver.findElement(By.xpath("(//span[@aria-label='August 1, 2025'])[1]")).click();
		System.out.println("Bookinig start date entered successfully");
		driver.findElement(By.xpath("//input[@id='eventBookingEndDate']")).sendKeys("2025-08-15");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//span[@class='arrowUp'])[2]")).click();
//		Thread.sleep(1000);
//		
//		WebElement Bmonth = driver.findElement(By.xpath("(//select[@class='flatpickr-monthDropdown-months'])[2]"));
//		Select dd8 = new Select(Bmonth);
//		dd8.selectByValue("7");
//		driver.findElement(By.xpath("(//span[text()='5'])[3]")).click();
		
		System.out.println("Booking end date is entered successfully");
		driver.findElement(By.id("bookingPrice")).sendKeys("2000");
		driver.findElement(By.id("eventCapacity")).sendKeys("100");
		driver.findElement(By.id("payment_qr")).sendKeys("C:\\Users\\S.M\\Desktop\\250x250 image JPG.jpg");
		JavascriptExecutor js3 = (JavascriptExecutor) driver; js3.executeScript("window.scrollBy(0,500)","Is organise by chapter?");
		reportStep("event booking date is entered successfully", "pass");
	} catch (Exception e) {
		reportStep("event date is not entered successfully", "fail");
		e.printStackTrace();
	}
	
	
	
}

@And("Select Food")
public void FoodandBreverages() throws InterruptedException, IOException {

	try {
		Thread.sleep(1000);
		driver.findElement(By.id("foodAvilableCheckbox")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.id("vegPrice")).sendKeys("100");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		driver.findElement(By.id("noneVegPrice")).sendKeys("200");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
		driver.findElement(By.id("other_food_name")).sendKeys("vegan");
		driver.findElement(By.id("otherPrice")).sendKeys("200");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
		driver.findElement(By.id("alcoholPrice")).sendKeys("500");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		driver.findElement(By.id("nonAlcoholPrice")).sendKeys("200");
		System.out.println("Food details entered successfully");
		reportStep("food details entered successfully", "pass");
	} catch (InterruptedException e) {
		reportStep("food details are not entered successfully", "fail");
		e.printStackTrace();
	}
	
	
}

@And("select chapter")
public void selectChapter() throws IOException {
	try {
		driver.findElement(By.id("chapterAvailableCheckbox")).click();
		WebElement chapter = driver.findElement(By.id("chapter"));
		Select dd6 = new Select(chapter);
		dd6.selectByIndex(5);
		System.out.println("Chapter entered successfully");
		WebElement chapterelement = driver.findElement(By.id("uploadModalButton"));
		mouse.clickAndHold(chapterelement).build().perform();
		reportStep("chapter selected successfully", "pass");
	} catch (Exception e) {
		reportStep("chapter is not selected successfully", "fail");
		e.printStackTrace();
	}
	
}

@And("upload gallery image")
public void uploadGallery() throws InterruptedException, IOException {
	
	try {
		driver.findElement(By.id("uploadModalButton")).click();
		driver.findElement(By.id("gallery-image")).sendKeys("C:\\Users\\S.M\\Desktop\\250x250 image JPG.jpg");
		driver.findElement(By.id("uploadgalleryImages")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println("Gallery image uploaded successfully");
		Thread.sleep(2000);
		reportStep("gallery images uploaded successfully", "pass");
	} catch (InterruptedException e) {
		reportStep("gallery images are not uploaded successfully", "fail");
		e.printStackTrace();
	}
	
	
}

@And("enter note for attendee")
public void NoticeforAttendee() throws IOException {
	try {
		JavascriptExecutor js3 = (JavascriptExecutor) driver; js3.executeScript("window.scrollBy(0,1000)","Note for Attendees");
		driver.findElement(By.id("eventNoteForAttendees")).sendKeys("were black dress");
		System.out.println("Note entered successfully");
		WebElement findElement = driver.findElement(By.id("eventCreateFormBtn"));
		mouse.moveToElement(findElement).build().perform();
		reportStep("note for attendees entered successfully", "pass");
	} catch (Exception e) {
		reportStep("note for attendees are not entered successfully", "fail");
		e.printStackTrace();
	}
	
	
}

@When("click on add event button")
public void addEvent() throws IOException {

	try {
		driver.findElement(By.id("eventCreateFormBtn")).click();
//	mouse.contextClick(findElement).build().perform();
		System.out.println("Event added successfully");
		reportStep("add event button clicked successfully", "pass");
	} catch (Exception e) {
		reportStep("add event button is not clicked successfully", "fail");
		e.printStackTrace();
	}
	
}

}
