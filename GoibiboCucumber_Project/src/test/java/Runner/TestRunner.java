package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//step1 - @runwith
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Goibibo/testing.feature",
    glue = "Step_definitions",
    plugin = {"html:testoutput/cucumber.html", "junit:testoutput/cucumber.xml", "json:testoutput/cucumber.json"}
)
public class TestRunner {

}

