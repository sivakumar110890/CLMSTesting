package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginToCLMSPageObject {
	

	@FindBy(id="uid")
	public static WebElement UserNameInputField;
	
	@FindBy(id="pwd")
	public static WebElement PasswordInputField;
	
	@FindBy(id="submit")
	public static WebElement SubmitButton;
	
}
