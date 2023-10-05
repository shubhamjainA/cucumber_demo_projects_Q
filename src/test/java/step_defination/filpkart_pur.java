package step_defination;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class filpkart_pur {
	WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@Given("Browser is opened")
	public void browser_is_opened() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/"); //enter URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();   }

	@Given("user click on search field")
	public void user_click_on_search_field() {
		//driver.findElement(By.name("q")).click();
	}
	@When("user enter iphone as product")
	public void user_enter_iphone_as_product() {
		driver.findElement(By.name("q")).sendKeys("ipone");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);      
	}
	@When("hit entered and handle window")
	public void hit_entered() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER); 
		driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
		   Set<String> firstwindow= driver.getWindowHandles();                                    // handle window
		Iterator<String> itr = firstwindow.iterator();
		String main= itr.next();
		String child =itr.next();
		driver.switchTo().window(child);    
	}
	@Then("handle windows and scroll a add to kart button")
	public void handle_windows_and_scroll_a_add_to_kart_button() throws InterruptedException {
		 Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;                                          //scrolling
		   js.executeScript("scrollBy(0,1500)");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();// click add to cart button
		   Thread.sleep(3000);  }

	@Then("click on add to kart after taikng scrren shot for validation")
	public void click_on_add_to_kart_after_taikng_scrren_shot_for_validation() throws IOException, InterruptedException {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		 Thread.sleep(3000);
		 File dest = new File("C:\\eclipse\\screenshot\\product01.jpg");                // take screenshot 
	     org.openqa.selenium.io.FileHandler.copy(src, dest); 
	}
	@Then("closed the browser.")
	public void closed_the_browser() {
		driver.close();
		  driver.quit();
	    
	}

}
