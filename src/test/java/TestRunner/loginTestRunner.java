package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/FeatureFile"}, 
glue= {"StepDefinitions", "Hooks"}, 
plugin= {"pretty","html:target/htmlreport.html"} )



public class loginTestRunner extends AbstractTestNGCucumberTests  {
	
	
	

}
