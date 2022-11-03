package scripting;



import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLogin;
import pomPages.Skillraryloginpage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException {
		Skillraryloginpage s=new Skillraryloginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		
		driverutilities.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilities.dropdown(sd.getCourseadd(), pdata.getdata("dropdownopt"));
		
		
		TestingPage tp=new TestingPage();
		driverutilities.draganddrop(driver, tp.getSeleniumtraining(), tp.getCart());
		
		
		Point loc=tp.getTwitter().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		driverutilities.scrollBar(driver, x, y);
		
		tp.getTwitter().click();
		
	}
	

}
