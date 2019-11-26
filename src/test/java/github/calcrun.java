package github;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"html:src/main/java/CustomerReports/output/cucumber-html-report",
				"json:src/main/java/CustomerReports/output/cucumber.json",
				"junit:src/main/java/CustomerReports/output/cucumber-results.xml"})
public class calcrun {

}
