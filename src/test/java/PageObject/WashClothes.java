package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UIstore.WashUi;

public class WashClothes {

	WebDriver driver;
	public WashClothes(WebDriver driver) {
		
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void wash()
	{
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(WashUi.click).click();
		//driver.findElement(WashUi.select).click();
	}
}
