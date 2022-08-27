package Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
/*import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;*/
import org.testng.Reporter;


import Reusable.Helper;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;


public class BaseClass {
	public static WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	
	
	
	public WebDriver setup() {
		
		config=new ConfigDataProvider();
		
		Reporter.log("trying to start browser and ready",true);
		
		driver=BrowserFactory.startApp(driver,config.getBrowser(),config.getURL());
		
		Reporter.log("application and browser is running",true);
		
		    
		    return driver;
	
	}
	
	
	public void teardown() throws InterruptedException {
		
	BrowserFactory.quitBrowser(driver);
	}
	


}
