package UIstore;

import org.openqa.selenium.By;

public class LoginUi {

	public static By register=By.xpath("//a[normalize-space()='Register']");
	public static By sign=By.xpath("//a[@class='event_internal_link']");
	//signin
	/*public static By name=By.xpath("//input[@id='name']");
	public static By mail=By.xpath("//input[@id='email']");
	public static By pswd=By.xpath("//input[@id='password']");
	public static By sbtn=By.xpath("//input[@value='CREATE ACCOUNT']");*/
	
	//login
	public static By login=By.xpath("//button[normalize-space()='Log in']");
	public static By usern=By.xpath("//input[@id='login-email']");
	public static By pssd=By.xpath("//input[@id='login-password']");
	public static By lbtn=By.xpath("//input[@value='LOG IN']");
}
