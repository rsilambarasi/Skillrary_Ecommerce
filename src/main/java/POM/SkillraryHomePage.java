package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	
	//Declaration
	//address of gears
	@FindBy (xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	//address of skillrary demo app
	@FindBy (xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemo;
	//address of search text feild
	@FindBy (xpath="//input[@type='search']")
	private WebElement searchTF;
	//address of search icon
	@FindBy (xpath="//input[@value='go']")
	private WebElement searchicon;
	//address of cookies
	@FindBy (xpath="//a[@class='close_cookies']")
	private WebElement cookies;
	
	//initialization
	
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public void gearbutton(){
		gearbtn.click();
	}
	public void skillrarydemoapp(){
		skillrarydemo.click();
	}
	public void searchTextfeild(String data){
		searchTF.sendKeys(data);;
	}
	public void searchIcon(){
		searchicon.click();
	}
	public void cookiesbutton(){
		cookies.click();
	}
	
	
	
	
	
	
	

}
