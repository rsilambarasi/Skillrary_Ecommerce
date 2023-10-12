package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.SkillraryDemoApp_Page;
import POM.SkillraryHomePage;
import POM.TestingPage;

public class TestCase1 extends BaseClass  {
	@Test
	public void TC1() throws Throwable {
	
	SkillraryHomePage s=new SkillraryHomePage(driver);
	s.gearbutton();
	s.skillrarydemoapp();
	utilities.child(driver);
	SkillraryDemoApp_Page SDP=new SkillraryDemoApp_Page(driver);
	utilities.dropdown(SDP.getCatagoryDD(),pdata.getPropertyData("coursedd"));
	TestingPage TP=new TestingPage(driver);
	utilities.scrollbar(driver, TP.getFbicon());
	TP.FacebookIcon();
	
	
	

}
}