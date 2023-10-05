package zoho;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_Provider {
	@Test(dataProvider="metho")
	public void test(String username,String password) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
	    op.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(op);
	      driver.get("https://www.saucedemo.com/");
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      driver.findElement(By.id("user-name")).sendKeys("username");
	      driver.findElement(By.id("password")).sendKeys("password");
	      driver.findElement(By.id("login-button")).click();
	      //driver.close();

	}
	@DataProvider (name="metho")
	public Object[][] dataset()
	{
		return new Object[][]
				{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"}, 
			{"performance_glitch_use","secret_sauce"},
				};
	}

}
