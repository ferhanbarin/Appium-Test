package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"summary","pretty", "html:target/default-cucumber-reports",
                "json:target/cucumber-reports",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features="src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@DoTest",
        monochrome = true,
        dryRun = false
)

public class Runner {

}
