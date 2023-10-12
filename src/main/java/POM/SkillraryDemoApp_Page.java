package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp_Page {
	
	//Declaration
	//address of course WE
	@FindBy (xpath="//a[text()='COURSE']")
	private WebElement coursebtn;
	//address of feedback
	@FindBy (xpath="//a[text()='FEEDBACK']")
	private WebElement feedback;
	//address of catagory dropdown
	@FindBy (xpath="//select[@class='chosen-select']")
	private WebElement catagoryDD;
	
	//initialization
	
	public SkillraryDemoApp_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization

	public WebElement getCoursebtn() {
		return coursebtn;
	}

	public WebElement getCatagoryDD() {
		return catagoryDD;
	}

	public void feedbackbutton()
	{
		feedback.click();
	}
	

	
	
	

}
