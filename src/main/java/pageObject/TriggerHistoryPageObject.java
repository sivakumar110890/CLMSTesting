package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TriggerHistoryPageObject {


	@FindBy(xpath="//*[@id=\"sidebarMenu\"]/li[2]/a")
	public static WebElement OperationsManagerClick;

	@FindBy(xpath="//*[@id=\"sidebarMenu\"]/li[2]/ul/li[7]/a[contains(text(),'Application')]")
	public static WebElement ApplicationClick;

	@FindBy(id="Search_Trigger_History_search1_val")
	public static WebElement TriggerNameInputBox;

	@FindBy(id="search1")
	public static WebElement TriggerNameSelector;

	@FindBy(xpath="//a[@code=\"triggerhistory/search\"]")
	public static WebElement TriggerHistoryClick;


	@FindBy(id="Search_Trigger_History_executiondate_date1_cal_check")
	public static WebElement ExecutionDateUntick;

	@FindBy(xpath="//*[@id=\"Search_Trigger_History_search\"]/span/button")
	public static WebElement SearchButtonClick;
}




