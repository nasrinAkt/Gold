package Gold_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Gold_Utility.Gold_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/Gold_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Gold_StepDefinition",tags = {"@tag"})		


public class Gold_TestRunner extends AbstractTestNGCucumberTests {

	
	@BeforeTest
	public void goStartURL() {
		Gold_Base gol = new Gold_Base();
		gol.GoBrowser();
	}
	
	@AfterTest
	public void goCloseURL() {
		Gold_Base gol = new Gold_Base();
		gol.driver.quit();
	
	
	}
}
