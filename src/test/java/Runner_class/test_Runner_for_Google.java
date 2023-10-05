package Runner_class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\hp\\eclipse-workspace\\cucumber_op\\src\\test\\resources\\Features\\google.feature",
				glue ="step_defination",
				dryRun = false,
				monochrome = true,
				plugin = {"pretty","junit:target\\Google.xml",
                                   "html:target\\google.html",
                                   "json:target\\google.json"}
		)
public class test_Runner_for_Google {

}
