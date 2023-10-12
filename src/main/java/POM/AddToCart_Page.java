package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Page {
	
	//Declaration
	//address of plus icon
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusicon;
	
	//address of add to cart button
	@FindBy(xpath=" Add to Cart")
	private WebElement addtocart;
	
	//initializing
	
	public AddToCart_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization

	public WebElement getPlusicon() {
		return plusicon;
	}
	public void ADDTOCART()
	{
		addtocart.click();
	}

	
	
	
	
	

}
