package runner;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/UnacademyFeatures/Getsubscription.feature",
        glue={"stepDefinition"},
        dryRun = false,
        monochrome = true
)

 

public class TestRunner {

 

}
