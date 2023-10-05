package zoho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowser {
	
	@Parameters("browserName")
	@Test
	public void TC(String browserName)
	{
	WebDriver driver = null;
	if(browserName.equals("Chrome"))
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	org.openqa.selenium.Point p = new org.openqa.selenium.Point(500, 700);
	driver.manage().window().setPosition(p);
	}
	else if(browserName.equals("Firefox"))
	{
	 WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	}
	else if(browserName.equals("Edge"))
	{
   WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	driver.get("https://www.facebook.com/");
	}

}
