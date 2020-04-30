package Mytest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class Test {

    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = "pretty", features = "src/test/java/feature")
    public class RunCucumberTest {
    }
}
