package cucum.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/file1.feature",glue="cucum.stepdefinition",dryRun=false,monochrome=true,plugin= {"html:target"})

public class TestRunner {

}
