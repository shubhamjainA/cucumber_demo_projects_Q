package zoho;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class broken_links {
	public void op() throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions op=new ChromeOptions();
  op.addArguments("--remote-allow-origins=*");
  WebDriver driver=new ChromeDriver(op);
 driver.manage().window().maximize();
 driver.get("https://www.google.com/");
 Thread.sleep(2000);
 List<WebElement> links = driver.findElements(By.xpath("//a"));
 System.out.println(links.size());
 for(WebElement po:links) {
	 String linkurl = po.getAttribute("href");
	 URL url=new URL(linkurl);
	 URLConnection URLCON=url.openConnection();
	 HttpURLConnection httpurlconnection= (HttpURLConnection)URLCON;
	 httpurlconnection.setConnectTimeout(10000);
	 httpurlconnection.connect();
	 if(httpurlconnection.getResponseCode()==200) {
		 System.out.println(linkurl+" - "+httpurlconnection.getResponseMessage());	 
	 }
	 else {
		 System.err.println(linkurl+" - "+httpurlconnection.getResponseCode()+" - "+httpurlconnection.getResponseMessage());	  
	 }
	 httpurlconnection.disconnect();
 } 
 driver.close();
}

}
