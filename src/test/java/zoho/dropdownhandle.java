package zoho;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownhandle {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver	driver=new ChromeDriver();
     driver.navigate().to("https://www.flipkart.com/")   ; 
     driver.manage().window().maximize();                                                                      //7973580642-aditi roy
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
//     Thread.sleep(5000);
//     driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("iphone");
//     Thread.sleep(2000);
//     WebElement element = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
//     Actions actions = new Actions(driver);
//     actions.moveToElement(element).perform();
//     actions.click(element).perform();
//
//	driver.findElement(By.xpath("//img[@class='_396cs4'][1]")).click();
//	
//	Set<String> firstwindow= driver.getWindowHandles();
//	Iterator<String> itr = firstwindow.iterator();
//	String main= itr.next();
//	String child =itr.next();
//	driver.switchTo().window(main);
//	driver.switchTo().window(child);
// 
//                                  //(//div[@class="_4rR01T"])[2]
// 	driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[2]")).click();
//
//
//   File src = (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//         File des = new File("C:\\Users\\hp\\Desktop\\ST\\STUDY\\.jpg");
//         org.openqa.selenium.io.FileHandler.copy(src, des);
         
     List<WebElement> list = driver.findElements(By.xpath("//a"));
     System.out.println(list.size());
     ArrayList ar=new ArrayList ();
     for(WebElement lo:list) {
    	 if(((WebElement) list).getAttribute("href") != null) {
    	 ar.add(list) ;
    		
    	 }
     }
    
     
	}
	

}
