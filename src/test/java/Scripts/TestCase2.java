package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.InvoicePage;
import POM.SkillraryDemoApp_Page;
import POM.SkillraryHomePage;

public class TestCase2 extends BaseClass {
	@Test
	public void TC2()
	{
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.gearbutton();
		s.skillrarydemoapp();
		utilities.child(driver);
		SkillraryDemoApp_Page SDP=new SkillraryDemoApp_Page(driver);
		SDP.feedbackbutton();
		InvoicePage IP=new InvoicePage(driver);
		IP.InvoiceButton();
	}

}
