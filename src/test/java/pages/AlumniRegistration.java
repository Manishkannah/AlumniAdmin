package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlumniRegistration extends BaseClass {

	@Given("click on the sign up button")
	public void clickOnSignUp() {

		driver.findElement(By.xpath("(//a[contains(@class,'text-primary text-gradien')])[2]")).click();

	}

	@And("Enter the Personal Email Id")
	public void enterPersonalMailId() {
		driver.findElement(By.xpath("//input[@id='personal_email']")).sendKeys("kanna78@gmail.com");
	}

	@And("click on the next1 button")
	public void clickOnNext() {
		driver.findElement(By.xpath("(//input[@class='next action-button'])[1]")).click();
	}

	@And("Enter the First Name")
	public void EnterFirstName() {
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Jithesh");
	}

	@And("Enter the Middle Name")
	public void EnterMiddleName() {
		driver.findElement(By.xpath("//input[@id='middle_name']")).sendKeys("sharma");
	}

	@And("Enter the Last Name")
	public void EnterLastName() {
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Rao");
	}

	@And("Enter the Corporate Email Id")
	public void EnterCropMail() {
		driver.findElement(By.xpath("//input[@id='corporate_email']")).sendKeys("jithesh@abc.com");
	}

	@And("Enter the Date Of Birth")
	public void DOB() {
		driver.findElement(By.xpath("//input[@id='date_of_birth']")).sendKeys("13 Jul 2006");
	}

	@And("Enter the Gender")
	public void EnterGender() {
		WebElement gender = driver.findElement(By.xpath("//select[@id='gender']"));
		Select dd1 = new Select(gender);
		dd1.selectByIndex(1);
	}

	@And("Enter the Membership Number")
	public void MembershipNumber() {
		driver.findElement(By.xpath("//input[@id='membership_number']")).sendKeys("12313");
	}

	@And("Enter the Mobile Number")
	public void MobileNumber() {
		driver.findElement(By.xpath("//input[@id='altername_no']")).sendKeys("9876543215");
	}

	@And("Enter the WhatsApp Number")
	public void WhatsappNumber() {
		driver.findElement(By.xpath("//input[@id='altername_no']")).sendKeys("9876543215");
	}

	@And("click on the Is whatsApp available for same number ?")
	public void samenumbercheckbox() {
		driver.findElement(By.xpath("//input[@id='same_as_phone']")).click();
	}

	@And("click on the next2 button")
	public void clickOnNext3() {
		driver.findElement(By.xpath("(//input[@class='next action-button'])[2]")).click();
	}

	@And("Enter the Campus Name")
	public void EnterCampusName() {
		WebElement campus = driver.findElement(By.xpath("//select[@id='campus_name']"));
		Select dd2 = new Select(campus);
		dd2.selectByIndex(1);
	}

	@And("Enter the House Affiliation")
	public void EnterHouse() {
		WebElement house = driver.findElement(By.xpath("//select[@id='house_name']"));
		Select dd3 = new Select(house);
		dd3.selectByIndex(1);
	}

	@And("Enter the Stream/Department/School")
	public void Enterschool() {
		WebElement school = driver.findElement(By.xpath("//select[@id='school_name']"));
		Select dd4 = new Select(school);
		dd4.selectByIndex(1);
	}

	@And("Enter the Programme/Degree/Certificate")
	public void EnterProgram() {
		WebElement program = driver.findElement(By.xpath("//select[@id='course_attended']"));
		Select dd5 = new Select(program);
		dd5.selectByIndex(1);
	}

	@And("Enter the Joining Year")
	public void enterJoinYear() {
		driver.findElement(By.xpath("//input[@id='course_attended_from_year']")).sendKeys("1999");
	}

	@And("Enter the Year of Graduating/Passout Year")
	public void enterGraduationYear() {
		driver.findElement(By.xpath("//input[@id='course_attended_to_year']")).sendKeys("2017");
	}

	@And("Enter the Year of Leaving")
	public void leavingYear() {
		driver.findElement(By.xpath("//input[@id='year_of_leaving']")).sendKeys("2000");
	}

	@And("click the check box Same as year of graduation")
	public void sameAsGraducaitonYear() {
		driver.findElement(By.xpath("//input[@id='same_as_graduation_year_checkbox']")).click();
	}

	@And("Enter the Roll number")
	public void EnterRollNumber() {
		driver.findElement(By.xpath("//input[@id='roll_no']")).sendKeys("101");
	}

	@And("Enter the Specializations")
	public void EnterSpecialization() {
		driver.findElement(By.xpath("//input[@id='specializations']")).sendKeys("SoftwareTesting");
	}

	@And("click on the next3 button")
	public void clickOnNext4() {
		driver.findElement(By.xpath("(//input[@class='next action-button'])[3]")).click();
	}

	@And("click on the I'm an entrepreneur check box")
	public void entrepreneurCheckBox() {
		driver.findElement(By.xpath("//input[@id='entrepreneur']")).click();
	}

	@And("Enter the Company Name")
	public void EnterCompanyName() {
		driver.findElement(By.xpath("//input[@id='entrepreneur_organization_name']")).sendKeys("alpha.infoTech");
	}

	@And("Enter the Designation")
	public void DesignationOfEnterpernuer() {
		driver.findElement(By.xpath("//input[@id='entrepreneur_designation']")).sendKeys("CEO");
	}

	@And("Enter the Start Date")
	public void StartDate1() {
		driver.findElement(By.xpath("//input[@id='entrepreneur_start_date']")).sendKeys("2024-02");
	}

	@And("click on the I'm an employee check box")
	public void empCheckBox() {
		driver.findElement(By.xpath("//input[@id='employee']")).click();
	}

	@And("Enter the Emp Company Name")
	public void empCompanyName() {
		driver.findElement(By.xpath("//input[@id='employee_organization_name']")).sendKeys("Microwaves Tech");
	}

	@And("Enter the Emp Designation")
	public void empDesignation() {
		driver.findElement(By.xpath("//input[@id='employee_designation']")).sendKeys("Test Lead");
	}

	@And("Enter the Emp Start Date")
	public void EmpStartDate() {
		driver.findElement(By.xpath("//input[@id='employee_start_date']")).sendKeys("2024-03");
	}

	@And("click on the next4 button")
	public void clickOnNext5() {
		driver.findElement(By.xpath("(//input[@class='next action-button'])[4]")).click();
	}

	@And("Enter the Profile Picture")
	public void UploadProfilePic() {
		driver.findElement(By.xpath("//input[@id='picture']")).sendKeys("C:\\Users\\S.M\\Desktop\\250x250 image JPG.jpg");
	}

	@And("Enter the Current Location")
	public void EnterCurrentLocation() {
		driver.findElement(By.xpath("//input[@id='location']")).sendKeys("chennai");
	}

	@And("Enter the Facebook ")
	public void facebook() {
		driver.findElement(By.xpath("//input[@id='social_facebook']")).sendKeys("https://www.facebook.com/");
	}

	@And("Enter the Instagram")
	public void Instagram() {
		driver.findElement(By.xpath("//input[@id='social_instagram']")).sendKeys("https://www.instagram.com/");
	}

	@And("Enter the LinkedIn")
	public void LinkedIn() {
		driver.findElement(By.xpath("//input[@id='social_linkedin']")).sendKeys("https://www.linkedin.com/");
	}

	@And("Enter the Twitter")
	public void Twitter() {
		driver.findElement(By.xpath("//input[@id='social_twitter']")).sendKeys("https://x.com/");
	}

	@And("clicked radio button Marital Status as single")
	public void Single() {
		driver.findElement(By.xpath("//input[@id='single']")).click();
	}

	@And("clicked radio button Marital Status as married")
	public void married() {
		driver.findElement(By.xpath("//input[@id='married']")).click();
	}

	@And("Enter the Spouse Name")
	public void spouseName() {
		driver.findElement(By.xpath("//input[@id='spouse_name']")).sendKeys("samantha");
	}

	@And("Enter the Wedding Anniversary Date")
	public void AnniverdsaryDate() {
		driver.findElement(By.xpath("//input[@id='wedding_anniversary_date']")).sendKeys("18 Jun 2024");
	}

	@And("Enter the Child Name 1")
	public void childName1() {
		driver.findElement(By.xpath("//input[@id='child_name_1']")).sendKeys("manish");
	}

	@And("Enter the Child DOB 1")
	public void Child1DOB() {
		driver.findElement(By.xpath("//input[@id='child_dob_1']")).sendKeys("12 Jul 2023");
		}
		@And("Enter the Child Name 2")
		public void childName2() {
			driver.findElement(By.xpath("//input[@id='child_name_2']")).sendKeys("kannah");
		}

		@And("Enter the Child DOB 2")
		public void Child2DOB() {
			driver.findElement(By.xpath("//input[@id='child_dob_2']")).sendKeys("12 Jul 2023");
		}
		
		@When("Click on the submit button")
		public void Submit() {
			driver.findElement(By.xpath("//input[@id='registrationbtn']")).click();
		}
		
		@Then("success message is displayed")
		public void VerifySubmission() {
			String success = driver.findElement(By.xpath("//h2[text()='Your registration details have been received.']")).getText();
			if(success.contains("Your registration details have been received")) {
				System.out.println("Alumni Registered successfully");
			}
			
			else {
				System.out.println("Alumni Registration fail");
			}
		}

	}
