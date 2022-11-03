package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.CorejavaPage;
import pomPages.Skillraryloginpage;
import pomPages.Wishlistpage;

public class Testcase3 extends BaseClass {
	
	@Test
	public void tc3()
	{
		Skillraryloginpage sl=new Skillraryloginpage(driver);
		sl.searchtextbox(pdata.getdata("coursename"));
		sl.searchbutton();
		
		CorejavaPage cp=new CorejavaPage(driver);
		cp.java();
		
		Wishlistpage wp=new Wishlistpage(driver);
		driverutilities.switchFrame(driver);
		wp.playbutton();
		Thread.sleep(10000);
		wp.pausebutton();
		driverutilities.switchbackframe(driver);
		wp.addtowishlistbtn();
	}

}
