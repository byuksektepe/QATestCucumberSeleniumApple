package abstractions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = {"abstractions/stepDefinitions"
        },
        features = {"classpath:features"}
)

public class TestRuntime {
}
