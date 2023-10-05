package zoho;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class flipkart {
public void demo() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions op=new ChromeOptions();
//    op.addArguments("--remote-allow-origins=*");
//    WebDriver driver=new ChromeDriver(op);
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/ul/li[1]/div/a")).click();

     WebElement element = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
     Actions actions = new Actions(driver);
     actions.moveToElement(element).perform();
     actions.click(element).perform();

	driver.findElement(By.xpath("//img[@class='_396cs4'][1]")).click();
	
	Set<String> firstwindow= driver.getWindowHandles();
	Iterator<String> itr = firstwindow.iterator();
	String main= itr.next();
	String child =itr.next();
	driver.switchTo().window(child);
	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _3-J4S1']")).click();
	
	driver.switchTo().window(main);
	driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
	String s = driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();
	System.out.println(s);
	driver.quit();
	


}
}
