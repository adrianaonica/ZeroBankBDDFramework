package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Declare the where is the features files
@CucumberOptions(

        plugin = {"json:target/cucumber.json"},     // Creating JSON report

        features = "src/test/resources/features",   // Default cucumber doesn't know where are our features files
                                                    // That's why we tell to the Class what is the path.
        glue = "com/vytrack/step_definitions",      // Class doesn't know where is the step definitions and that's why need to tell path
        dryRun = false,                             // Default false, when its true it will not execute the step definitions if there is any undefined.
        tags = "@wip"                               // Tags are helping us which test cases we want to execute from *.feature file.
        // Run a scenario that matches both of two tags     : @driver and @VYT-123
        // Run a scenario that matches either of two tags   : @driver or @VYT-123
        // Skip the scenario that has a certain tag         : @login and not @smoke and not @wip  etc....
)
public class CukesRunner {
    // We will use this class for
    // running our cucumber framework
    // Executing feature files
    // and adjusting some settings.
}
