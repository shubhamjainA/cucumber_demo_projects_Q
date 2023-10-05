package zoho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class facebook_registraion {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		JavascriptExecutor js = (JavascriptExecutor)driver;                                 //scrolling
//		   js.executeScript("scrollBy(0,500)");
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	
				driver.findElement(By.xpath("//a[contains(@class, \"_42ft _4jy0 _6lti _4jy6 _4jy2 s\")]")).click();
		WebElement MON = driver.findElement(By.id("month"));
		Select s=new Select(MON);
		System.out.println(s.getOptions().size());
		
		 List<WebElement> MON1 = driver.findElements(By.id("month"));
		// System.out.println(MON1.size()+ ""+"*****");
		  Iterator l=MON1.iterator();
		  
		System.out.println( l.next());
		  
		  
		  
		
		  WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select p=new Select(year);
		p.selectByIndex(15);
		p.selectByValue("1950");
		p.selectByVisibleText("2000");
		
		 boolean pl = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).isEnabled();
		System.out.println(pl);
		if(pl==true) {
			System.out.println("The button is selected ");
		}
		else {
			System.out.println("The button is Not  selected ");
	
		}
		
			 
			 }
			 
			
			 
		 }

	


