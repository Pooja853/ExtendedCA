package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UIstore.LanguageUi;

public class Language {
	
	WebDriver driver;
	public Language(WebDriver driver) {
		
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void language()
	{
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(LanguageUi.click).click();
		driver.findElement(LanguageUi.select).click();
	}
}
