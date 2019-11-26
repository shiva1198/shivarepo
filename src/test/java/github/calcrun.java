package github;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {
				"json:src/main/java/CustomerReports/output/cucumber.json"
				})
public class calcrun {

}
