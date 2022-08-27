package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import UIstore.CommitmentUI;

public class Commitment {

	WebDriver driver;
	public Commitment(WebDriver driver) {
		
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void commitment()
	{
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(CommitmentUI.click).click();
		driver.findElement(CommitmentUI.select).click();
	}
}
