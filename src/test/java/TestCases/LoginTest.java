package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import Pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	
	public void test5() throws FilloException, InterruptedException {
		
		Recordset recordset = connection.executeQuery("select * from Sheet1 where TestName='test5'");
		recordset.next();
		
       String UserName = recordset.getField("UserName");
       String Password = recordset.getField("Password");
       
       LoginPage login = new LoginPage(driver);
       login.LoginFunction(UserName, Password);
       
       WebElement error = driver.findElement(By.id("msg_box"));
		
		String ActError = error.getText();
		String ExpError = "Epic sadface: Sorry, this user has been locked out.";
		
		Assert.assertEquals(ActError, ExpError);
       
	}
	

}
