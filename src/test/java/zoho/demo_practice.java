package zoho;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_practice {
	@Test
	public void op0() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
	    op.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver();
	      driver.get("https://blazedemo.com/index.php");
	      System.out.println("Launch the URL ");
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     String ExpR="Welcome to the Simple Travel Agency!";
	     WebElement ActR = driver.findElement(By.xpath("//h1[text()='Welcome to the Simple Travel Agency!']"));
	     if(ExpR.equals(ActR)) {
	    	System.out.println("The Successful Home Page Opened"); 
	     }
	     else {
	    	 System.out.println("The Home Page is Not Opened");
	     }
	     WebElement departurecity = driver.findElement(By.xpath("(//select[@class=\"form-inline\"])[1]"));
	     Select s=new Select(departurecity);
	     s.selectByValue("Mexico City");
	  
	     WebElement destniation = driver.findElement(By.xpath("(//select[@class=\"form-inline\"])[2]"));
	     Select p=new Select(destniation);
	     p.selectByValue("London");

	     driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	     System.out.println("Click Find Flight Button");
	     
	    List<WebElement> list = driver.findElements(By.xpath("//table[@class=\"table\"]//td"));
	    for(int i=0;i<list.size();i++) {
	    	String text=list.get(i).getText();
	    	System.out.println("The Result is ="+text);
	    	if(text.contains("(//input[@value='Choose This Flight'])[3]")) {
	    		list.get(i).click();
	    	  break;
	    	}
	    }
	     driver.findElement(By.xpath("(//input[@class=\"btn btn-small\"])[3]")).click();
	     System.out.println("Choose the Flight");
	     
	     driver.findElement(By.xpath("//input[@value=\"Purchase Flight\"]")).click();
	   
	    
	     System.out.println("Thank you for your purchase today! - Page opended ");
	 

	}
}
