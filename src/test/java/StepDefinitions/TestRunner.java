package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\resources\\feature", glue = {"StepDefinitions"},
        monochrome = true,
       plugin = {"pretty","html:target/HtmlReports"})
public class TestRunner {
}
