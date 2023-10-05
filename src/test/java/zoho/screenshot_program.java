package zoho;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot_program {
	@Test
	public void screenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		 driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize();
		 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		 
		 File dest = new File("C:\\eclipse\\screenshot\\.jpg"); 
		 
	 org.openqa.selenium.io.FileHandler.copy(src, dest); 
	}

}
