
package cucumberSelenium.JavaFaker.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "cucumberSelenium/JavaFaker/steps",
        tags = "@test1",
        dryRun = false
)
public class RunnerClass {

}
