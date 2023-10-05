package zoho;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class omayo_blogspot_com_scroll {
	
	@Test
	public void op0() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
	    op.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver();
	      driver.get("https://tutorialsninja.com/demo/");
	      driver.manage().window().maximize();
//	      JavascriptExecutor js = (JavascriptExecutor)driver;                                 //scrolling
//	      js.executeScript("scrollBy(0,1500)");
	      Thread.sleep(2000);
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      WebElement serch = driver.findElement(By.name("search"));
       executor.executeScript("argumets[0].value='TATA POWER'", serch);

}}
