package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom 
{
	public WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//div[@id=\"preSubscribedBlocks\"]/div[@class=\"PageHead__Wrapper-sc-1xvuona-0 dVSjLO\"]/button[@type=\"button\"]") WebElement cmdgetsub;
    @FindBy(xpath = "//button[text()='Select PLUS']") WebElement cmdplus;
    @FindBy(xpath = "//*[@id='__next']/div[1]/div/div[2]/div[3]/div[3]/h4") WebElement cmdplan;
    @FindBy(xpath = "//button[text()='Proceed to pay']") WebElement cmdpay;
	public HomePagePom(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
    public void clickOnGetSubscription() 
    {
    	cmdgetsub.click();
		
	}
    public void clickOnSelectPlus() 
    {
    	cmdplus.click();
    	
    }
    public void clickOnPlan() 
    {
    	cmdplan.click();
    }
    public void clickOnPay() 
    {
    	cmdpay.click();
    }

}
