package org.stepdefination.normal;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Senthil B\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Feature\\NormalFile.feature",
glue= "org.stepdefination.normal",
		dryRun= false, monochrome= true,
		plugin = {"html:target"})
public class RunnerClass {

}
