package zoho;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class testng_Practice {
	@Test
	public void TC1() 
	 { 
	 String s="shubham";
	 String p="shubha";
	 SoftAssert sp=new SoftAssert();
	 sp.assertEquals(s, p,"both result are same");
	 
	 } 
	 
	@Test
	public void TC2() 
	 { 
	 Reporter.log("Running TC2", true); 
	 } 
	 
}
