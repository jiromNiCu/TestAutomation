package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue={"stepDefinitions", "hooks"},
        tags = "@SAMPLE",
        format = {"pretty", "html:target/cucumber-htmlreport"})

public class TestRunner {

}
