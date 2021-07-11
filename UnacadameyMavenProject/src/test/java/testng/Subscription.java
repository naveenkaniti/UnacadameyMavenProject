package testng;

import org.testng.annotations.Test;

import configu.ConfigFileReader;
import pom.HomePagePom;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Subscription {
	WebDriver driver;
	HomePagePom WebElements;
	String baseUrl;
	ConfigFileReader configFileReader;
  @Test
  public void getSubscription() {
	  WebElements.clickOnGetSubscription();
	  WebElements.clickOnSelectPlus();
	  WebElements.clickOnPlan();
	  WebElements.clickOnPay();
	  WebElements.clickOnPay();
  }
  @BeforeTest
  public void launchApplication() {
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

  @AfterTest
  public void closeBrowser() {
	  driver.quit();
  }

}
