package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingPage {
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(id="cartArea")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-twitter'])[2]")
	private WebElement twitter;
	
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}
	
	public WebElement getCart() {
		return cart;
	}
	public WebElement getTwitter() {
		return twitter;
		
	
	}
	}


