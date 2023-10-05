package Runner_class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\hp\\eclipse-workspace\\cucumber_op\\src\\test\\resources\\Features\\purchproductflip.feature",
				glue ="step_defination",
				dryRun = false,
				monochrome = true,
				plugin = {"pretty","junit:target\\flipkart1.xml",
                                   "html:target\\flipkart0.html",
                                   "json:target\\flipkart01.json"}
		)
public class flipkart_runner {

}
