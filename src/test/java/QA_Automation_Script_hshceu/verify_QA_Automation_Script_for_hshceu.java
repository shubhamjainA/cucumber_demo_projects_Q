package QA_Automation_Script_hshceu;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class verify_QA_Automation_Script_for_hshceu {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		  WebDriverManager.chromedriver().setup();    
	      WebDriver driver =new ChromeDriver();                                               // create instance of ChromeBrowser
	      driver.get("https://hshceu.com/");                                                  // Lunch the Browser
	      driver.manage().window().maximize();                                                //Maximize the Window
	      String EXPUR="https://hshceu.com/";                                                 
	      String acturl = driver.getCurrentUrl();                                             // Get Current URL For Validation
	      if(EXPUR.equalsIgnoreCase(acturl)) {
	    	  System.out.println("The Result is Pass- same URL");
	      }
	      else {
	    	  System.out.println("The Result is False- different URL");  
	      }                                         
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);                      // Using wait for synchronization
	        
	   driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();                  // click on course
	        
	   driver.findElement(By.xpath("//input[@placeholder=\"Search courses\"]")).sendKeys("1-Hour Post"); // enter courses-Page in search Field
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@placeholder=\"Search courses\"]")).clear();   // clear the text in search Field
       
       driver.findElement(By.xpath("//a[text()=' Free Trial']")).click();                 //click on Trial Page & enter the details 
       driver.findElement(By.id("firstName")).sendKeys("SHIV");
       driver.findElement(By.id("lastName")).sendKeys("Patil");
       driver.findElement(By.id("inputEmail")).sendKeys("shubhamjai014@gmail.com");
       driver.findElement(By.id("Phone")).sendKeys("8551015308");
       driver.findElement(By.id("inputpassword")).sendKeys("Sannadate85@");
       driver.findElement(By.id("password_confirmation")).sendKeys("Sannadate85@");
       driver.findElement(By.id("agree_terms_of_service")).click();
       driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
       String Exp_R="Sign up for Free Trial!";
       WebElement ACT_Result = driver.findElement(By.xpath("//h1[text()='Sign up for Free Trial!']"));
       String A_result = ACT_Result.getText();
       System.out.println(A_result);
       if(A_result.equalsIgnoreCase(Exp_R)) {
    	   System.out.println("The result pass for Sign page"); 
       }
       else {
    	   System.out.println("The result false for Sign Page");
       }
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Cucumber_Demo_Projects\\Screenshots\\Signup_first.png");                               // take screenshot 
	     org.openqa.selenium.io.FileHandler.copy(src, dest); 
       Thread.sleep(1000);
     driver.findElement(By.xpath("//a[text()='Login']")).click();                                //click on Login Page
     String exp ="Please log in to your account.";
     WebElement act = driver.findElement(By.xpath("//p[text()='Please log in to your account.']"));
     String po = act.getText();
     System.out.println(po);
     if(po.equalsIgnoreCase(exp)) {
    	 System.out.println("The result pass for Login Page");
     }
     else {
    	 System.out.println("The result false for Login Page");
     }
     driver.findElement(By.id("exampleInputEmail1")).sendKeys("shubhamjai014@gmail.com");      // enter Email-Id
     driver.findElement(By.id("inputPassword5")).sendKeys("Sannadate85@");                    // enter the Password
     driver.findElement(By.id("exampleCheck1")).click();                                       
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();                      //click on Login Button
     File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest2 = new File("C:\\Users\\hp\\eclipse-workspace\\Cucumber_Demo_Projects\\\\Screenshots\\Login_first.png");                              // take screenshot 
     org.openqa.selenium.io.FileHandler.copy(src1, dest2); 
     Thread.sleep(2000);
     driver.close();
     driver.quit();                                                                           //close the browser
   
	}

}
