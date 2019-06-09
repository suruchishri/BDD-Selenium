package testRunner;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\features\\feature01.feature",glue= {"stepDefinitions"})
	public class TestRunner {
}
