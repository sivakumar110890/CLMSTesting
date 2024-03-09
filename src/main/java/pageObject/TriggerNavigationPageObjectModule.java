package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TriggerNavigationPageObjectModule {
	
	@FindBy(xpath="//*[@id=\"sidebarMenu\"]/li[1]/a")
	public static WebElement ConfigurationManager;
	
	@FindBy(xpath="//*[@id=\"sidebarMenu\"]/li[1]/ul/li[7]/a")
	public static WebElement CustomerContact;
	
	@FindBy(xpath="//*[@code=\"trigger/search\"][contains(text(),'Triggers')]")
	public static WebElement TriggerClick;
	
	@FindBy(id="Search_Triggers_search1_val")
	public static WebElement SearchBox;
	
	@FindBy(id="Search_Triggers_lastrun_date1_cal_check")
	public static WebElement LastRunDateUntick;
	
	@FindBy(id="status")
	public static WebElement StatusSelect;
	
	@FindBy(xpath="//*[@id=\"Search_Triggers_search\"]/span/button")
	public static WebElement SearchButtonClick;
	
	
	

}
