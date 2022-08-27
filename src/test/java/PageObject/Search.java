package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UIstore.SearchUi;

public class Search {

	WebDriver driver;
	public Search(WebDriver driver) {
		
		this.driver=driver;
	}
	public void search()
	{
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(SearchUi.click).sendKeys("Tide");
		driver.findElement(SearchUi.serch).click();
	}
}
