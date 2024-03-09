package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.commonFuntions;
import pageObject.LoginToCLMSPageObject;

public class LoginTestCase extends commonFuntions{
	
	static Logger log=Logger.getLogger(LoginTestCase.class);
	
	public void login() {
		
		PageFactory.initElements(driver, LoginToCLMSPageObject.class);		
		LoginToCLMSPageObject.UserNameInputField.sendKeys(prop.getProperty("username"));
		LoginToCLMSPageObject.PasswordInputField.sendKeys(prop.getProperty("password"));
		LoginToCLMSPageObject.SubmitButton.click();
	}
	
	@Test
	public void loginTest() {
		login();
		
	}

}
