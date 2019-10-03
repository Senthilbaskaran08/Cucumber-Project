package org.stefdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Senthil B\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Feature\\ScenarioOutline.feature",
glue= "org.stefdefination", dryRun= false, monochrome= true, 
plugin = {"html:target"})

public class RunnerScenarioOutlinenew {

}
