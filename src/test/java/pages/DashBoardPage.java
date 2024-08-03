package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DashBoardPage extends BaseClass{
	Actions mouse = new Actions(driver);
	
	@Then("Dashboard to be displayed")
	public void verifyLogin() {
	
		String title = driver.getTitle();
				
		if(title.contains("B.J.B. Autonomous College Alumni Association")) {
			System.out.println("login success");
		}
		
		else {
			System.out.println("Login fail");
		}
		
		
	}
	
	@And("click on the alumni")
	public void ClickAlumni() throws IOException {
		
		try {
			driver.findElement(By.xpath("//a[@href='#alumniWrapper']")).click();
			reportStep("Clicked on the alumni module", "pass");
		} catch (Exception e) {
			reportStep(" Doesn't clicked on the alumni module", "fail");
			e.printStackTrace();
		}
	}
	
	
	@And("click on the alumni management")
	public void ClickAlumniManagement() throws IOException {
		
		try {
			driver.findElement(By.xpath("(//a[contains(@href,'https://alumni-portal-uat.alumnetworks.com/alumni-management')])[1]")).click();
			reportStep("Clicked on the alumni management", "pass");
		} catch (Exception e) {
			reportStep(" Doesn't clicked on the alumni management", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("click on the events")
	public void ClickEvents() throws IOException {
		
		try {
			driver.findElement(By.xpath("//a[@href='#eventWrapper']")).click();
			reportStep("Clicked on the events module", "pass");
		} catch (Exception e) {
			reportStep(" Doesn't clicked on the events", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("click on the events management")
	public void ClickEventManagement() throws IOException {
		
		try {
			driver.findElement(By.xpath("(//div[@id='eventWrapper']//a)[1]")).click();
			reportStep(" Clicked on the events management", "pass");
		} catch (Exception e) {
			reportStep(" Doesn't clicked on the events management", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("click on the email notification")
	public void ClickOnTheEmailNotification() throws IOException {
		
		try {
			driver.findElement(By.xpath("//a[@href='/email-notifications']")).click();
			reportStep(" Clicked on the email notification", "pass");
		} catch (Exception e) {
			reportStep(" Doesn't clicked on the email notification", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("click on the elections module")
	public void ClickOnTheElections() throws InterruptedException, IOException {
		try {
			Thread.sleep(2000);
			WebElement findElement = driver.findElement(By.xpath("(//span[@class='sidenav-normal  ms-3  ps-1'])[4]"));
//		Actions mouse = new Actions(driver);
			mouse.moveToElement(findElement).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@aria-controls='electionWrapper']")).click();
			reportStep(" Clicked on the elections module", "pass");
		} catch (InterruptedException e) {
			reportStep(" Doesn't clicked on the Election module", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("click on the election management")
	public void ClickOnTheElectionsManagement() throws IOException {
		
		try {
			driver.findElement(By.xpath("(//li[@class='nav-item ']/a)[24]")).click();
			reportStep("Clicked on the election management", "pass");
		} catch (Exception e) {
			reportStep(" Doesn't clicked on the election management", "fail");
			e.printStackTrace();
		}

		
	}
	
	@And("click on the whats new")
	public void ClickOnTheWhatsNew() throws IOException {
		try {
			WebElement settings = driver.findElement(By.xpath("(//span[@Class='material-icons-round'])[2]"));
			mouse.moveToElement(settings).perform();
			driver.findElement(By.xpath("//a[@href='#blogsWrapper']")).click();
			reportStep(" Clicked on the what's new", "pass");
		} catch (Exception e) {
			reportStep(" Doesn't clicked on the whats new", "fail");
			e.printStackTrace();
		}
		
	}
	
	@And("click on the posts")
	public void ClickOnPosts() throws InterruptedException, IOException {
		//Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//span[text()=' Posts ']/parent::a")).click();
			reportStep("Clicked on the posts module", "pass");
		} catch (Exception e) {
			reportStep(" Doesn't clicked on the posts module", "fail");
			e.printStackTrace();
		}
		
	}


}