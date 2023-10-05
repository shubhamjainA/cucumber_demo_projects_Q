package step_defination;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class google_search_stepDefination {
 
	WebDriver driver=null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		driver=new ChromeDriver();
		
	}
	@SuppressWarnings("deprecation")
	@Given("user is open google search page")
	public void user_is_open_google_search_page() throws InterruptedException {
		
		driver.navigate().to("https://www.google.com/"); 
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  	Thread.sleep(2000);
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() throws InterruptedException {
	   
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	Thread.sleep(2000);
	}

	@When("hit enter")
	public void hit_enter() throws InterruptedException {
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
	    driver.getPageSource().contains("jmeter-beginner");
	    driver.close();
	}
}
