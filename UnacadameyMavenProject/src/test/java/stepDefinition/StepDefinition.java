package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import configu.ConfigFileReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.HomePagePom;

public class StepDefinition {
	WebDriver driver;
	HomePagePom WebElements;
	String baseUrl;
	ConfigFileReader configFileReader;
    @Before
	public void lanchApplication() throws IOException 
    {     
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        configFileReader=new ConfigFileReader();
        baseUrl=configFileReader.getApplicationUrl();
          System.out.println("before senario");
          System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
          driver =new ChromeDriver(options);
          driver.manage().window().maximize();
          driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
          driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
          driver.get(baseUrl); 
          WebElements=new HomePagePom(driver);
       
    }

	@Given("user is on the homepage of unacademy")
	public void user_is_on_the_homepage_of_unacademy() {
		String actualPagetitle="UPSC 2021- UPSC Civil Service Exam and Preparation on Unacademy.";
		String pageTitle=driver.getTitle();
		assertEquals(actualPagetitle, pageTitle);
	   
	    
	}

	@When("user clicks on get subscription")
	public void user_clicks_on_get_subscription() {
		
		WebElements.clickOnGetSubscription();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	}

	@Then("user is in the Getsubscription part of unacademy")
	public void user_is_in_the_Getsubscription_part_of_unacademy() {
	   
	    
	}

	@Then("user can see benefits of the Plus subscription")
	public void user_can_see_benefits_of_the_Plus_subscription() {
	   
		WebElements.clickOnSelectPlus();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	}

	@When("user clicks on desired option as {string}")
	public void user_clicks_on_desired_option_as(String string) {
	   
	    
	}

	@Then("user can see respective subscription plans")
	public void user_can_see_respective_subscription_plans() {
	   
	    
	}

	@When("user selects a required paln as {string}")
	public void user_selects_a_required_paln_as(String string) {
		
		WebElements.clickOnPlan();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	   
	    
	}

	@Then("user can see selected subscription plan page")
	public void user_can_see_selected_subscription_plan_page() {
	   
	    
	}

	@When("user clicks on proceed to pay")
	public void user_clicks_on_proceed_to_pay() {
		
		WebElements.clickOnPay();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	    
	}


	@Then("user can see payment method page")
	public void user_can_see_payment_method_page() {
		WebElements.clickOnPay();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	   
	    
	}
}
