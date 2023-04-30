package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	
	@FindBy(name="user-name")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(name="login-button")
	WebElement LoginBtn;
	
	public LoginPage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunction(String UserNameVal,String PwdVal) throws InterruptedException {
		

		
		Username.sendKeys(UserNameVal);
		Thread.sleep(1000);
		Password.sendKeys(PwdVal);
		LoginBtn.click();
		
}}