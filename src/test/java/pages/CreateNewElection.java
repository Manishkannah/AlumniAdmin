package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class CreateNewElection extends BaseClass {
	
	@And("enter the election name as (.*)$")
	public void electionName(String Ename) throws IOException {
		
		try {
			driver.findElement(By.id("elction_name")).sendKeys(Ename);
			reportStep("election name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("election name is not entered successfully", "fail");
			e.printStackTrace();
		}
	
		
	}
	
	@And("enter the election type")
	public void electionType() throws IOException {
		
		try {
			WebElement FL1 = driver.findElement(By.id("election_type"));
			
			Select dd = new Select(FL1);
			
			dd.selectByIndex(0);
			reportStep("election type entered successfully", "pass");
		} catch (Exception e) {
			reportStep("election type is not entered successfully", "fail");
			e.printStackTrace();
		}
		
		
	}
	
	
	@And("enter the posts")
	public void post() throws IOException {
		
		try {
			WebElement FL2 = driver.findElement(By.id("posts"));
			Select dd = new Select(FL2);
			
			dd.selectByIndex(1);
			dd.selectByIndex(2);
			reportStep("election posts entered successfully", "pass");
		} catch (Exception e) {
			reportStep("election post is not entered successfully", "fail");
			e.printStackTrace();
		}
	
		
		
	}
	
	@And("upload the rules and regulation pdf")
	public void ruleRegulationPDF() throws IOException {
		
		try {
			driver.findElement(By.id("rules_regulation_file")).sendKeys("C:\\Users\\S.M\\Desktop\\000.pdf");
			reportStep("election pdf entered successfully", "pass");
		} catch (Exception e) {
			reportStep("election pdf is not entered successfully", "fail");
			e.printStackTrace();
		}
		
		
	}
	
	@And("select the ro")
	public void SelectReturningofficer() throws InterruptedException, IOException {
		
		try {
			driver.findElement(By.xpath("//input[@id='user']")).sendKeys("man");
			WebElement findElement = driver.findElement(By.xpath("(//div[@class='ui-menu-item-wrapper'])[1]"));
			Actions mouse = new Actions(driver);
			mouse.moveToElement(findElement).click().perform();
			reportStep("election RO entered successfully", "pass");
		} catch (Exception e) {
			reportStep("election RO is not entered successfully", "fail");
			e.printStackTrace();
		}

	}
	
	
	@When("click on the create button")
	public void CreateElection () throws InterruptedException, IOException {
		try {
			JavascriptExecutor js2 = (JavascriptExecutor) driver; js2.executeScript("window.scrollBy(0,2000)","Add New Returning officer");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Create Election']")).click();
			reportStep("create election button clicked successfully", "pass");
		} catch (InterruptedException e) {
			reportStep("create election button is not clicked successfully", "fail");
			e.printStackTrace();
		}
		
	
	}


}
