package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features="FeatureFiles",
		glue={"step_Definition"}
                  )
public class Runner {

}
