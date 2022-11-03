package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtocartpage;
import pomPages.SkillraryDemoLogin;
import pomPages.Skillraryloginpage;

public class Testcase1 extends BaseClass {
	
	@Test
	
	public void tc1() throws InterruptedException {
		Skillraryloginpage sl=new Skillraryloginpage(driver);
		sl.gearsbutton();
		sl.skillrarydemoapp();
		
		driverutilities.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		Thread.sleep(30000);
		
		Addtocartpage ad=new Addtocartpage(driver);
		driverutilities.doubleclick(driver, ad.getPlus());
		ad.cartbutton();
		driverutilities.alertpopup(driver);
		
	}

}
