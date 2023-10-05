package zoho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class launch_spice_jet_1 {
 public void demo() throws InterruptedException {
	//public static void main(String[] args) 
		WebDriverManager.chromedriver().setup();
        WebDriver  driver =new ChromeDriver();
       driver.get("https://www.spicejet.com/");
       driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-19h5ruw r-136ojw6\"]//div//div//div//div//div)[2]")).click();
	Thread.sleep(1000);
     driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[16]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("((//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[4]//div)[2]")).click();
}
}