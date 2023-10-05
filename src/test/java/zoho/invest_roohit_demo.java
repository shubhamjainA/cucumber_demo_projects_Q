package zoho;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class invest_roohit_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver  driver =new ChromeDriver();
       driver.get("http://3.7.08.");
       driver.manage().window().maximize();
      driver.findElement(By.id("dropdown-basic")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.xpath("(//a[@class=\"dropdown-item\"])[2]")).click();
      driver.findElement(By.xpath("//input[@name=\"firstname\"]")) .sendKeys("rohit");
      driver.findElement(By.xpath("//input[@name=\"lastname\"]")) .sendKeys("sonwan");
      driver.findElement(By.xpath("//input[@name=\"email\"]")) .sendKeys("rohitsonwane325@gmail.com");
      driver.findElement(By.xpath("//div[@class=\" css-1uccc91-singleValue\"]")).click();
 WebElement as = driver.findElement(By.xpath("//div[@class=\" css-1uccc91-singleValue\"]"));
//		Select s=new Select(as);
//		s.selectByIndex(10);
    Actions a=new Actions(driver);
   a.click(as).perform();
   Thread.sleep(2000);
  //  a.sendKeys(Keys.ARROW_DOWN).perform();
    for(int i=0;i<=101;i++) {
    	a.sendKeys(Keys.ARROW_DOWN).perform();
    }
    a.sendKeys(Keys.ENTER).perform();
	driver.findElement(By.xpath("//input[@name=\"mobile_number\"]")).sendKeys("8530744299");
	driver.findElement(By.xpath("//input[@name=\"citytext\"]")).sendKeys("Mumbai");
	driver.findElement(By.xpath("//input[@name=\"reference_name\"]")).sendKeys("WFC");
	WebElement op = driver.findElement(By.xpath("(//div[@class=\" css-2b097c-container\"])[1]"));
	Actions p=new Actions(driver);
	   p.click(op).perform();
	   for(int i=0;i<=2;i++) {
	    	p.sendKeys(Keys.ARROW_DOWN).perform();
	}
	   p.sendKeys(Keys.ENTER).perform();
	   Thread.sleep(2000);
	   WebElement op1 = driver.findElement(By.xpath("(//div[@class=\" css-2b097c-container\"])[2]"));
		Actions pp=new Actions(driver);
		   pp.click(op1).perform();
		   for(int i=0;i<=4;i++) {
		    	pp.sendKeys(Keys.ARROW_DOWN).perform();
		}
		   pp.sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000); 
		   driver.findElement(By.xpath("(//input[@name=\"linkedin_profile\"])[1]")).sendKeys("https://www.linkedin.com/in/shubham-jain-52900a229");
		   Thread.sleep(5000);
		//   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title=\"reCAPTCHA\"]")));
		   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title=\\\"reCAPTCHA\\\"]")));
		   WebElement po = driver.findElement(By.xpath("//label[@id=\"recaptcha-anchor-label\"]"));
		   System.out.println(po.getText());
		   driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]"));
		//  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	}


