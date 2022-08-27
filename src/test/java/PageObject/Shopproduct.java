package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import UIstore.ShopproductUi;

public class Shopproduct {
	
	WebDriver driver;
	public Shopproduct(WebDriver driver) {
		
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void shop()
	{
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(ShopproductUi.shop).click();
		//driver.findElement(ShopproductUi.select).click();
	}
}
