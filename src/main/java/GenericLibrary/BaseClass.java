package GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public PropertyFiles pdata=new PropertyFiles();
	public WebdriverUtilities utilities=new WebdriverUtilities();
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(pdata.getPropertyData("url"));
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws Throwable {
		int status=res.getStatus();
		String name=res.getName();
		if(status==2)
		{
			photo p=new photo();
			p.getPhoto(driver, name);
		}
		driver.quit();
		
	}
	

}
