package TestAutomation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestAutomation.helpers.BasePage;
import TestAutomation.helpers.Config;
import TestAutomation.helpers.WaitHelper;

public class MidtransHomePage extends BasePage
{
	
	@FindBy(css = ".btn.buy")
	private WebElement buyButton;
	
	Config testConfig;
	
	public MidtransHomePage(Config testConfig)
	{
		PageFactory.initElements(testConfig.driver, this);
		this.testConfig = testConfig;
	}
	
	public void clickBuyButton()
	{
		WaitHelper.waitForElementToBeClickable(testConfig, buyButton, "waiting for buy button");
		click(testConfig, buyButton, "buyButton is being clicked here");
	}
}