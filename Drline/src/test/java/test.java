import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.BaseClass;

public class test  extends BaseClass{
	
	BaseClass objBasePage = new BaseClass();
	
	//@Test(priority=1, dataProvider="test1")
	
	
	/*@Test
	public void Fblogin() throws InterruptedException {
		
		
		
		
		objBasePage.LocalBrowserInit("https://www.facebook.com/");
		objBasePage.setText("//*[@id=\"u_0_j\"]", "vijay");
		//objBasePage.selectDropDown("//*[@id=\"month\"]", FName);
		objBasePage.selectCheckbox("//*[@id=\"u_0_a\"]");
	
		objBasePage.click("//*[@id=\"u_0_11\"]");

	}*/
	@Test
	public void testone() {
		Assert.assertTrue(true);
		
	}
	
	
	@Test
	public void testtwo() {
		Assert.assertTrue(false);
		
	}
	
	
	
	
	
	
	
	
	

}
