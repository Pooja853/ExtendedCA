package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver startApp(WebDriver driver,String browserName,String appURL) {
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("browser not found");
		}
		driver.get("https://tide.com/en-us");
		
		driver.manage().window().maximize();
		
		
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
