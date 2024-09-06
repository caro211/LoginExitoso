package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(
        features = {"src/test/resources/features/Login.feature"}
        ,glue = {"stepDefinitions"}
        ,snippets = CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}