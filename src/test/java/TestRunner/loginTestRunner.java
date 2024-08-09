package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/FeatureFile"}, 
glue= {"StepDefinitions", "Hooks"}, 
plugin= {"pretty","html:target/htmlreport.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})



public class loginTestRunner extends AbstractTestNGCucumberTests  {
	
	
	

}
