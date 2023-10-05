package step_defination;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class hshceu_stepDefination_class {
	public static WebDriver driver;
	@Given("ChromeBrowser is opened")
	public void chrome_browser_is_opened() {
		
		driver=new ChromeDriver();
	}
	@SuppressWarnings("deprecation")
	@When("user enter url")
	public void user_enter_url() {
		driver.get("https://hshceu.com/");                               //enter URL
	    driver.manage().window().maximize();                             //maximize the window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  // Using wait for synchronization  
	}

	@Then("open the hshceu website And validate the URL")
	public void open_the_hshceu_website_and_validate_the_url() throws InterruptedException {
		System.out.println(driver.getCurrentUrl());                 // By using get_currenturl method
		
	}

	@Given("open the course page")
	public void open_the_course_page() throws InterruptedException  {
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();  // click on course
	}

	@Then("click on searchbox field")
	public void click_on_searchbox_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder=\"Search courses\"]")).sendKeys("1-Hour Post");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder=\"Search courses\"]")).clear();
	}

	@Then("search the respected Result which you want")
	public void search_the_respected_result_which_you_want() {
		driver.findElement(By.xpath("//input[@placeholder=\"Search courses\"]")).sendKeys("Advanced");
	}

	@Given("opened the Trail Page")
	public void opened_the_trail_page() {
		driver.findElement(By.xpath("//a[text()=' Free Trial']")).click();
	}

	@Then("enter the deatils")
	public void enter_the_deatils()  {
		 driver.findElement(By.id("firstName")).sendKeys("SHIV");                    //click on Trial Page & enter the details 
	       driver.findElement(By.id("lastName")).sendKeys("Patil");
	       driver.findElement(By.id("inputEmail")).sendKeys("shubhamjai014@gmail.com");
	       driver.findElement(By.id("Phone")).sendKeys("855101530808");
	       driver.findElement(By.id("inputpassword")).sendKeys("Sannadate85@");
	       driver.findElement(By.id("password_confirmation")).sendKeys("Sannadate85@");
	       driver.findElement(By.id("agree_terms_of_service")).click();
	      
	}

	@Then("click on signup Button & Take the screenshot for validation")
	public void click_on_signup_button_take_the_screenshot_for_validation() throws InterruptedException, IOException {
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			 Thread.sleep(500);
			 File dest = new File("C:\\Users\\hp\\eclipse-workspace\\cucumber_demo_projects_Q\\Screenshots\\Signup.png");                // take screenshot for validation
		     org.openqa.selenium.io.FileHandler.copy(src, dest); 
	      
	   
	}

	@Given("click on Login page")
	public void click_on_login_page() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@When("User enter the EmailAddress & Password")
	public void user_enter_the_email_address_password() {
	    driver.findElement(By.id("exampleInputEmail1")).sendKeys("shubhamjai014@gmail.com");
	    driver.findElement(By.id("inputPassword5")).sendKeys("Sannadate85@");
	    
	}

	@Then("click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.id("exampleCheck1")).click();
	   
	}

	@Then("Take screenshot for validation")
	public void take_screenshot_for_validation() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(500);
 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
 File dest = new File("C:\\Users\\hp\\eclipse-workspace\\cucumber_demo_projects_Q\\Screenshots\\Login.png"); // take screenshot for validation
		org.openqa.selenium.io.FileHandler.copy(src, dest); 
	     Thread.sleep(500);
      
      driver.close();
	  driver.quit();                                                                                //close the browser 
     
	    
	}

}
