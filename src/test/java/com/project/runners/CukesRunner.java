package com.project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-report",
                "rerun:target/rerun.txt" },
        features = "src/test/resources/features",
        glue = "com/project/step_definition",
        dryRun = false,
        tags = "@contact"

)

public class CukesRunner {

}
