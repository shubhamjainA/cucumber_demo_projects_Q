package Runner_class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\hp\\eclipse-workspace\\cucumber_op\\src\\test\\resources\\Features\\hshceu.com.feature",
				glue ="step_defination",
				dryRun = false,
				monochrome = true,
				plugin = {"pretty","junit:target\\HSHCEU.xml",
                                   "html:target\\HSHCEU.html",
                                   "json:target\\HSHCEU.json"}
		)
public class hshceu_Runner_class {
	

}
