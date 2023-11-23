package MyTestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/Login.feature","src/test/resources/Features/LawyerProfile.feature"},
        tags = "@signin or @admin or @lawyer", // Specify the tags to include
        glue = {"StepDefinitions", "AppHooks"},
        plugin = {"pretty"
        }

)
public class TestRunner {
}
