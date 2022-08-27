package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UIstore.ContactUSUi;

public class ContactUS {

	WebDriver driver;
	public ContactUS(WebDriver driver) {
		
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void contact()
	{
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(ContactUSUi.click).click();
}
}