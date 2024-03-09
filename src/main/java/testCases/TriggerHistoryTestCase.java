package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.commonFuntions;
import pageObject.TriggerHistoryPageObject;

public class TriggerHistoryTestCase extends commonFuntions{

	static Logger log=Logger.getLogger(TriggerHistoryTestCase.class);
	public void TriggerHistory() throws InterruptedException {		
		PageFactory.initElements(driver,TriggerHistoryPageObject.class);
		log.info("Trigger History test scenario is executing");
		TriggerHistoryPageObject.OperationsManagerClick.click();
		log.info("Operations Manager Button clicked");
		Thread.sleep(4000);
		TriggerHistoryPageObject.ApplicationClick.click();
		log.info("Application button is clicked");
		TriggerHistoryPageObject.TriggerNameInputBox.sendKeys(prop.getProperty("TriggerName"));
		log.info("Trigger name has been entered : "+ prop.getProperty("TriggerName"));
		Select select=new Select(TriggerHistoryPageObject.TriggerNameSelector);
		select.selectByVisibleText("Trigger Name");
		
		TriggerHistoryPageObject.ExecutionDateUntick.click();
		TriggerHistoryPageObject.SearchButtonClick.click();
		log.info("Search Button is clicked");
		log.info("Trigger history search testing was completed successfully");
	}
	
	@Test
		public void TriggerHistoryTest() throws InterruptedException {
		TriggerHistory();

	}

}
