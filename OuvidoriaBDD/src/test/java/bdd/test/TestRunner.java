package bdd.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"feature/EfetuarDenuncia.feature", "feature/ConsultarDenuncia.feature"}, 
				 glue = {"step.definition"}, 
				 plugin = {"pretty"})
public class TestRunner {
	
}
