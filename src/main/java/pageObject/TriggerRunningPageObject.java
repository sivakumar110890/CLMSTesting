package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonFunctions.commonFuntions;

public class TriggerRunningPageObject extends commonFuntions {
	
	@FindBy(id="yui-dt0-bdrow0")
	public static WebElement FirstRowOutput;
	
	@FindBy(xpath="//button[@type=\"button\"][contains(text(),'Modify')]")
	public static WebElement ModifyButtonClick;
	
	@FindBy(xpath="//textarea[@cname=\"Participant List\"]")
	public static WebElement ParticipationListInputBox;
	
	@FindBy(xpath="//*[@cid=\"nextrundt_dcheck\"]")
	public static WebElement NextRunDateClick;
	
	@FindBy(xpath="//button[@type=\"button\"][contains(text(),'OK')]")
	public static WebElement ClickSubmitButton;
	
	
	
	
	
	

}
