package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlumniRegistration extends BaseClass {
	public Actions mouse ;

	@Given("click on the sign up button")
	public void clickOnSignUp() throws IOException {

		try {
			driver.findElement(By.xpath("(//a[contains(@class,'text-primary text-gradien')])[2]")).click();
			reportStep("signup button is clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("signup button is not clicked successfully", "fail");
			e.printStackTrace();
		}

	}

	@And("Enter the Personal (.*)$")
	public void enterPersonalMailId(String emailid) throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='personal_email']")).sendKeys(emailid);
			reportStep("personal mail entered successfully", "pass");
		} catch (Exception e) {
			reportStep("personal mail is not entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("click on the next1 button")
	public void clickOnNext() throws IOException {
		try {
			driver.findElement(By.xpath("(//input[@class='next action-button'])[1]")).click();
			reportStep("next button is clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("next button is not clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the First Name")
	public void EnterFirstName() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Jithesh");
			reportStep("first name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("first name isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Middle Name")
	public void EnterMiddleName() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='middle_name']")).sendKeys("sharma");
			reportStep("middle name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("middle name isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Last Name")
	public void EnterLastName() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Rao");
			reportStep("last name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("last name isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Corporate Email Id")
	public void EnterCropMail() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='corporate_email']")).sendKeys("jithesh@abc.com");
			reportStep("corp mail id entered successfully", "pass");
		} catch (Exception e) {
			reportStep("crop mail id isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Date Of Birth")
	public void DOB() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='date_of_birth']")).sendKeys("13 Jul 2006");
			reportStep("DOB entered successfully", "pass");
		} catch (Exception e) {
			reportStep("DOB isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Gender")
	public void EnterGender() throws IOException {
		try {
			WebElement gender = driver.findElement(By.xpath("//select[@id='gender']"));
			Select dd1 = new Select(gender);
			dd1.selectByIndex(1);
			reportStep("gender entered successfully", "pass");
		} catch (Exception e) {
			reportStep("gender isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Membership Number")
	public void MembershipNumber() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='membership_number']")).sendKeys("12313");
			reportStep("Membership number entered successfully", "pass");
		} catch (Exception e) {
			reportStep("membership number isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Mobile Number")
	public void MobileNumber() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='altername_no']")).sendKeys("9876543215");
			reportStep("Mobile number entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Mobile number isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the WhatsApp Number")
	public void WhatsappNumber() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='whatsapp_no']")).sendKeys("9876543215");
			reportStep("Whatsapp no entered successfully", "pass");
		} catch (Exception e) {
			reportStep("whatsapp no isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("click on the Is whatsApp available for same number ?")
	public void samenumbercheckbox() throws InterruptedException, IOException {
		try {
			driver.findElement(By.xpath("//input[@id='same_as_phone']")).click();
			Thread.sleep(2000);
			reportStep("same phone number checkbox clicked successfully", "pass");
		} catch (InterruptedException e) {
			reportStep("same phone number checkbox isn't clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("click on the next2 button")
	public void clickOnNext3() throws IOException {
		try {
			WebElement movent = driver.findElement(By.xpath("(//input[@class='next action-button'])[2]"));
			mouse = new Actions(driver);
			mouse.moveToElement(movent).build().perform();
			driver.findElement(By.xpath("(//input[@class='next action-button'])[2]")).click();
			reportStep("Next button clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Next button isn't clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Campus Name")
	public void EnterCampusName() throws IOException {
		try {
			WebElement campus = driver.findElement(By.xpath("//select[@id='campus_name']"));
			Select dd2 = new Select(campus);
			dd2.selectByIndex(1);
			reportStep("Campus name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("campus name isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the House Affiliation")
	public void EnterHouse() throws IOException {
		try {
			WebElement house = driver.findElement(By.xpath("//select[@id='house_name']"));
			Select dd3 = new Select(house);
			dd3.selectByIndex(1);
			reportStep("House entered successfully", "pass");
		} catch (Exception e) {
			reportStep("House isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Stream school")
	public void enter_the_stream_department_school() throws InterruptedException, IOException {
		try {
			Thread.sleep(2000);
			WebElement school = driver.findElement(By.xpath("//select[@id='school_name']"));
			Select dsc = new Select(school);
			dsc.selectByIndex(1);
			Thread.sleep(2000);
			reportStep("stream school entered successfully", "pass");
		} catch (InterruptedException e) {
			reportStep("stream school isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Programme Degree")
	public void EnterProgram() throws IOException {
		try {
			WebElement program = driver.findElement(By.xpath("//select[@id='course_attended']"));
			Select dd5 = new Select(program);
			dd5.selectByIndex(1);
			reportStep("program entered successfully", "pass");
		} catch (Exception e) {
			reportStep("program isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Joining Year")
	public void enterJoinYear() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='course_attended_from_year']")).sendKeys("1999");
			reportStep("Joining year entered successfully", "pass");
		} catch (Exception e) {
			reportStep("joining year isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Year of Graduating Passout Year")
	public void enterGraduationYear() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='course_attended_to_year']")).sendKeys("2017");
			reportStep("passout year entered successfully", "pass");
		} catch (Exception e) {
			reportStep("passout year isn't  entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Year of Leaving")
	public void leavingYear() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='year_of_leaving']")).sendKeys("2000");
			reportStep("leaving year entered successfully", "pass");
		} catch (Exception e) {
			reportStep("leaving year isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("click the check box Same as year of graduation")
	public void sameAsGraducaitonYear() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='same_as_graduation_year_checkbox']")).click();
			reportStep("check box Same as year of graduation clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("check box Same as year of graduation isn't clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Roll number")
	public void EnterRollNumber() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='roll_no']")).sendKeys("101");
			reportStep("roll no entered successfully", "pass");
		} catch (Exception e) {
			reportStep("roll no isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Specializations")
	public void EnterSpecialization() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='specializations']")).sendKeys("SoftwareTesting");
			reportStep("specialization entered successfully", "pass");
		} catch (Exception e) {
			reportStep("specialization isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("click on the next3 button")
	public void clickOnNext4() throws IOException {
		try {
			driver.findElement(By.xpath("(//input[@class='next action-button'])[3]")).click();
			reportStep("next button clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("next button isn't clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("click on the I'm an entrepreneur check box")
	public void entrepreneurCheckBox() throws IOException {
		try {
			WebElement ck = driver.findElement(By.xpath("//input[@id='entrepreneur']"));
			mouse = new Actions(driver);
			mouse.moveToElement(ck).build().perform();
			driver.findElement(By.xpath("//input[@id='entrepreneur']")).click();
			reportStep("entrepreneur check box clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("entrepreneur check box isn't clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Company Name")
	public void EnterCompanyName() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='entrepreneur_organization_name']")).sendKeys("alpha.infoTech");
			reportStep("Company name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Company name isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Designation")
	public void DesignationOfEnterpernuer() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='entrepreneur_designation']")).sendKeys("CEO");
			reportStep("Designation entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Designation isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Start Date")
	public void StartDate1() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='entrepreneur_start_date']")).sendKeys("2024-02");
			driver.findElement(By.xpath("//div[@id='occupation_entrepreneur']")).click();
			reportStep("Start Date entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Start Date isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("click on the I'm an employee check box")
	public void empCheckBox() throws IOException {
		try {
			WebElement epk = driver.findElement(By.xpath("//input[@id='employee']"));
			mouse = new Actions(driver);
			mouse.moveToElement(epk).build().perform();
			driver.findElement(By.xpath("//input[@id='employee']")).click();
			reportStep("emp checkbox clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("emp check box isn't clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Emp Company Name")
	public void empCompanyName() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='employee_organization_name']")).sendKeys("Microwaves Tech");
			reportStep("emp company name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("emp company name isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Emp Designation")
	public void empDesignation() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='employee_designation']")).sendKeys("Test Lead");
			reportStep("emp designation entered successfully", "pass");
		} catch (Exception e) {
			reportStep("emp designation isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Emp Start Date")
	public void EmpStartDate() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='employee_start_date']")).sendKeys("2024-03");
			reportStep("emp Start Date entered successfully", "pass");
		} catch (Exception e) {
			reportStep("emp Start Date isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("click on the next4 button")
	public void clickOnNext5() throws IOException {
		try {
			WebElement nb = driver.findElement(By.xpath("(//input[@class='next action-button'])[4]"));
			mouse = new Actions(driver);
			mouse.moveToElement(nb).build().perform();
			driver.findElement(By.xpath("(//input[@class='next action-button'])[4]")).click();
			reportStep("next button clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("next button isn't clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Profile Picture")
	public void UploadProfilePic() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='picture']")).sendKeys("C:\\Users\\S.M\\Desktop\\250x250 image JPG.jpg");
			reportStep("profile pic entered successfully", "pass");
		} catch (Exception e) {
			reportStep("profile pic isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Current Location")
	public void EnterCurrentLocation() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='location']")).sendKeys("chennai");
			reportStep("location entered successfully", "pass");
		} catch (Exception e) {
			reportStep("location isn't  entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Facebook")
	public void facebook() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='social_facebook']")).sendKeys("https://www.facebook.com/");
			reportStep("facebook url entered successfully", "pass");
		} catch (Exception e) {
			reportStep("facebook url isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Instagram")
	public void Instagram() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='social_instagram']")).sendKeys("https://www.instagram.com/");
			reportStep("Insta url entered successfully", "pass");
		} catch (Exception e) {
			reportStep("insta url isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the LinkedIn")
	public void LinkedIn() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='social_linkedin']")).sendKeys("https://www.linkedin.com/");
			reportStep("Linkedin url entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Linkedin url isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Twitter")
	public void Twitter() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='social_twitter']")).sendKeys("https://x.com/");
			reportStep("Twitter url entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Twitter url isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("clicked radio button Marital Status as single")
	public void Single() throws IOException {
		try {
			WebElement ms = driver.findElement(By.xpath("//input[@id='single']"));
			mouse = new Actions(driver);
			mouse.moveToElement(ms).build().perform();
			driver.findElement(By.xpath("//input[@id='single']")).click();
			reportStep("marital status as signle clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Marital status as single isn't clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("clicked radio button Marital Status as married")
	public void married() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='married']")).click();
			reportStep("marital status as married clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Marital status as married isn't clicked successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Spouse Name")
	public void spouseName() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='spouse_name']")).sendKeys("samantha");
			reportStep("spouse name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("spouse name isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Wedding Anniversary Date")
	public void AnniverdsaryDate() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='wedding_anniversary_date']")).sendKeys("18 Jun 2024");
			reportStep("Anniversary date entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Anniversary date isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Child Name 1")
	public void childName1() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='child_name_1']")).sendKeys("manish");
			reportStep("child 1 name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("cgild 1 name isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Child DOB 1")
	public void Child1DOB() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='child_dob_1']")).sendKeys("12 Jul 2023");
			reportStep("child 1 dob entered successfully", "pass");
		} catch (Exception e) {
			reportStep("child 1 dob isn't entered successfully", "fail");
			e.printStackTrace();
		}
		}
	
	@And("Enter the Child Name 2")
	public void childName2() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='child_name_2']")).sendKeys("kannah");
			reportStep("child 2 name entered successfully", "pass");
		} catch (Exception e) {
			reportStep("child 2 name isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}

	@And("Enter the Child DOB 2")
	public void Child2DOB() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@id='child_dob_2']")).sendKeys("12 Jul 2023");
			reportStep("child 2 dob entered successfully", "pass");
		} catch (Exception e) {
			reportStep("child 2 dob isn't entered successfully", "fail");
			e.printStackTrace();
		}
	}
		
		@When("Click on the submit button")
		public void Submit() throws IOException {
			try {
				WebElement sb = driver.findElement(By.xpath("//input[@id='registrationbtn']"));
				mouse = new Actions(driver);
				mouse.moveToElement(sb).build().perform();
				driver.findElement(By.xpath("//input[@id='registrationbtn']")).click();
				reportStep("submit clicked successfully", "pass");
			} catch (Exception e) {
				reportStep("submit button isn't clicked successfully", "fail");
				e.printStackTrace();
			}
		}
		
		@Then("success message is displayed")
		public void VerifySubmission() throws IOException {
			try {
				String success = driver.findElement(By.xpath("//h2[text()='Your registration details have been received.']")).getText();
				if(success.contains("Your registration details have been received")) {
					System.out.println("Alumni Registered successfully");
				}
				
				else {
					System.out.println("Alumni Registration fail");
				}
				reportStep("success message displayed successfully", "pass");
			} catch (Exception e) {
				reportStep("success message isn't displayed ", "fail");
				e.printStackTrace();
			}
		}

	}
