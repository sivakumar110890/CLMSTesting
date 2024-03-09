package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.commonFuntions;
import pageObject.TriggerRunningPageObject;

public class TriggerRunningTestCase extends commonFuntions{
	static Logger log=Logger.getLogger(TriggerRunningTestCase.class);


	public void TriggerRun() {
		PageFactory.initElements(driver, TriggerRunningPageObject.class);
		TriggerRunningPageObject.FirstRowOutput.click();
		log.info("First Row been selected");
		TriggerRunningPageObject.ModifyButtonClick.click();
		log.info("Modify button clicked");
		TriggerRunningPageObject.ParticipationListInputBox.clear();
		log.info("PArticipation list been cleared");
		TriggerRunningPageObject.ParticipationListInputBox.sendKeys(prop.getProperty("MSISDN"));
		log.info("MSISDN has been added into the Participation list");
		TriggerRunningPageObject.NextRunDateClick.click();
		log.info("Next Run Date button is clicked");
		TriggerRunningPageObject.ClickSubmitButton.click();
		log.info("Submit button clicked");


	}

	@Test
	public void TestTriggerRun() {
		TriggerRun();
		log.info("Trigger run test case executed successfully");
	}
}
