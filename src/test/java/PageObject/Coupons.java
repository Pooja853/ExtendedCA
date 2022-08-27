package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UIstore.CouponsUI;

public class Coupons {

	WebDriver driver;
	public Coupons(WebDriver driver) {
		
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void coupons()
	{
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(CouponsUI.click).click();
		//driver.findElement(CouponsUI.select).click();
	}
}
