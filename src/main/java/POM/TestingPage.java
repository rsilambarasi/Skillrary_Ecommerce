package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//Declaration
	
	//address of facebook Webelement
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbicon;
	
	//initialization
	
		public TestingPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
	//utilization
		
		public void FacebookIcon()
		{
			fbicon.click();
		}

		public WebElement getFbicon() {
			return fbicon;
		}

		

}
