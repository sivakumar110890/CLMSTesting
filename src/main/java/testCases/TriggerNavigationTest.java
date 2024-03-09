package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.commonFuntions;
import pageObject.TriggerNavigationPageObjectModule;

public class TriggerNavigationTest extends commonFuntions{

	static Logger log=Logger.getLogger(TriggerNavigationTest.class);
	public void TriggerSearch() {
		PageFactory.initElements(driver, TriggerNavigationPageObjectModule.class);
		log.info("Test Trigger Search is begin");
		TriggerNavigationPageObjectModule.ConfigurationManager.click();
		log.info("Configuration manager button is clicked");
		TriggerNavigationPageObjectModule.CustomerContact.click();
		log.info("Customer Contact button is clicked");
		TriggerNavigationPageObjectModule.TriggerClick.click();
		log.info("Trigger button is clicked");
		TriggerNavigationPageObjectModule.SearchBox.sendKeys(prop.getProperty("TriggerName"));
		Select select=new Select(TriggerNavigationPageObjectModule.StatusSelect);
		select.selectByIndex(0);;
		log.info("Status selection was set to empty");
		TriggerNavigationPageObjectModule.LastRunDateUntick.click();
		log.info("LAst Run date button was unclicked");
		TriggerNavigationPageObjectModule.SearchButtonClick.click();
		log.info("Search Button is clicked");
	}

	@Test
	public void TestForTriggerSearch() {
		TriggerSearch();

	}
}


