package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class HomePage extends BaseClass {
	
	@And("click on the funding")
	public void clickFunding() {
		
		driver.findElement(By.id("navbarDropdown64")).click();
		
	}
	
	@And("click on the investors")
	public void clickInvestors() {
		
		driver.findElement(By.xpath("//ul[@data-bs-popper='none']//a")).click();
		
	}
	
	@And("click on investees")
	public void clickInvestees() {
		
		driver.findElement(By.xpath("(//ul[@data-bs-popper='none']//a)[2]")).click();

		
	}


}
