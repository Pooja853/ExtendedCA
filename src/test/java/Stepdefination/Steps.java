package Stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObject.Commitment;
import PageObject.ContactUS;
import PageObject.Coupons;
import PageObject.Facebook;
import PageObject.Footer;
import PageObject.Language;
import PageObject.Login;
import PageObject.Search;
import PageObject.Shopproduct;
import PageObject.WashClothes;
import PageObject.WhatsNew;
import Utility.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {
	public static WebDriver driver;
	public static Logger log=LogManager.getLogger();
	
	@Given("Chrome browser")
	public void chrome_browser() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("click on register")
	public void click_on_register() throws InterruptedException {
		log.info("Verifying login in the application ");
	   Login lg=new Login(driver);
	   lg.login();
	  
	}

	@Given("click on the Shop Product")
	public void click_on_the_shop_product() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("check for the Shop Product details")
	public void check_for_the_shop_product_details() throws InterruptedException {
		log.info("Verifying Shopproducts in the application ");
	    Shopproduct sp=new Shopproduct(driver);
	    sp.shop();
	    	

	}
	@Given("launch Chrome and start browser")
	public void launch_chrome_and_start_browser() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("click on the Commitment")
	public void click_on_the_commitment() {
		log.info("Verifying commitment in the application ");
		Commitment cm=new Commitment(driver);
		cm.commitment();
	}

	@Then("check for the commitments")
	public void check_for_the_commitments() throws InterruptedException {
		
	}
	
	@Given("chrome and Start browser")
	public void chrome_and_start_browser() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("click on the Search")
	public void click_on_the_search() {
		log.info("Verifying Search in the application ");
		Search srh=new Search(driver);
		srh.search();
	}
	@Given("Chrome browser start")
	public void chrome_browser_start() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("click on the Contact")
	public void click_on_the_contact() throws InterruptedException {
		log.info("Verifying Contact Us in the application ");
		ContactUS ct=new ContactUS(driver);
		ct.contact();
		
		}
	@Given("open chrome browser")
	public void open_chrome_browser() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("click on the Whats New")
	public void click_on_the_whats_new() throws InterruptedException {
		log.info("Verifying latestnews in the application ");
		WhatsNew wn=new WhatsNew(driver);
		wn.New();
		
	}
	@Given("launch chrome and Start the browser")
	public void launch_chrome_and_start_the_browser() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("click on the Facebook")
	public void click_on_the_facebook() {
		log.info("Verifying Facebook in the application ");
		Facebook fb=new Facebook(driver);
		fb.facebook();
		
	}

	@Then("check for the Facebook page details")
	public void check_for_the_facebook_page_details() throws InterruptedException {
		
	}
	@Given("start the browser")
	public void start_the_browser() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("click on the Coupons")
	public void click_on_the_coupons() throws InterruptedException {
		log.info("Verifying coupons in the application ");
		Coupons cp=new Coupons(driver);
		cp.coupons();
		
	}
	@Given("open chrome and launch")
	public void open_chrome_and_launch() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("check for the Footer page details")
	public void check_for_the_footer_page_details() throws InterruptedException {
		log.info("Verifying Footer in the application ");
		Footer ft=new Footer(driver);
		ft.footer();
		
	}
	@Given("Start chrome and run")
	public void start_chrome_and_run() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("click on the language")
	public void click_on_the_language() throws InterruptedException {
		log.info("Verifying language in the application ");
		Language lg=new Language(driver);
		lg.language();
		
	}
	@Given("Lunch chrome browser")
	public void lunch_chrome_browser() {
		Utility.BaseClass bc=new Utility.BaseClass();
		  driver= bc.setup();
	}

	@Then("check for the wash details")
	public void check_for_the_wash_details() throws InterruptedException {
		log.info("Verifying Wash in the application ");
		WashClothes wc=new WashClothes(driver);
		wc.wash();
		
		
	}
	@AfterStep
    public static void tearDown(Scenario scenario) {
         
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
             
}
	@After
	public static void after() throws InterruptedException {
	BrowserFactory.quitBrowser(driver);
	}
}
