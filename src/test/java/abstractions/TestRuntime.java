package abstractions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"src/test/abstractions/stepDefinitions"},
        features = {"classpath:features/Search.feature"},
        dryRun = true,
        monochrome = true
)

public class TestRuntime { }
