package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import UIstore.LoginUi;


public class Login {

	WebDriver driver;
	public Login(WebDriver driver) {
		
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void login()
	{
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(LoginUi.register).click();
		driver.findElement(LoginUi.sign).click();
		
		/*driver.findElement(LoginUi.name).sendKeys("uber");
		driver.findElement(LoginUi.mail).sendKeys("uber@gmail.com");
		driver.findElement(LoginUi.pswd).sendKeys("Abc@123");
		driver.findElement(LoginUi.sbtn).click();
		
		//login
		
		driver.findElement(LoginUi.login).click();
		driver.findElement(LoginUi.usern).sendKeys("poojapruthvi1@gmail.com");
		driver.findElement(LoginUi.pssd).sendKeys("Pooja@123");
		driver.findElement(LoginUi.lbtn).click();*/
	}
}
