package stepDefination;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(
		features = {"./FeatureFiles/login.feature"},
		glue="stepDefination",
		dryRun = false,
		monochrome = true,
		tags = "@tag1",
		plugin = {"json:Reports/Testng/Cucumber.json","html:Reports/Testng/Cucumber.html"}

		)
public class RunnerTestng extends AbstractTestNGCucumberTests{

	
}
