package GenericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	
	//1.Mouse hovering
	
		public void mousehover(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions(driver);
			a.moveToElement(ele).perform();
		}
	   //2.double click
		
		public void doubleClick(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions(driver);
			a.doubleClick(ele).perform();
		}
		//3.right click
		
		public void rightClick(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions(driver);
			a.contextClick(ele).perform();
		}
		//4.drag and drop
		
		public void DragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2)
		{
			Actions a=new Actions(driver);
			a.dragAndDrop(ele1, ele2).perform();
		}
		//5.handing alter popup ok
		
		public void alterpopup(WebDriver driver)
		{
			driver.switchTo().alert().accept();
			
		}
		//6.//5.handing alter popup cancel
		
		public void altercancel(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		//7.switch to parent to child
		
		public void child(WebDriver driver)
		{
			Set<String> child = driver.getWindowHandles();
			for(String b:child)
			{
				driver.switchTo().window(b);
			}
		}
		
		//8.switch to child to parent
		
		public void parent(WebDriver driver)
		{
			String parent = driver.getWindowHandle();
			driver.switchTo().window(parent);
			
		}
		
		//9.scroll bar using webelement for using click
		
		public void scrollclick(WebDriver driver,WebElement ele)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",ele);
		}
		
		//scrollbar using getlocation
		
		public void scrollbarloc(WebDriver driver,int x,int y)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
		}
		
		public void scrollbar(WebDriver driver,WebElement ele)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",ele);
		}
		
		//10.handing with dropdown
		
		public void dropdown(WebElement ele,String text)
		{
			Select s=new Select(ele);
			s.selectByVisibleText(text);
					
		}
		
		
		

}
