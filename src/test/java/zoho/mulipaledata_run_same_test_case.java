package zoho;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mulipaledata_run_same_test_case {

	@Test(dataProvider="getdata")
	public void login(String user,String passw) {
		
		System.out.println(user);
		System.out.println(passw);
	}
	
	@DataProvider()
	public Object[][] getdata(){
		
		Object[][] data=new Object[3][2];
		 data[0][0]="user1";
		 data[0][1]="user2"; 
		 data[1][0]="user3";
		 data[1][1]="user4";
		return data;
	}
	
}
