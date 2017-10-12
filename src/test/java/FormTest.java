

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import info.scandi.fusion.core.Runner;

@RunWith(Runner.class)
@CucumberOptions(monochrome = true, features = { "src/test/resources/scenarii" }, glue = {
		"info.scandi.fusion.cucumber", "info.scandi.fusionTest" }, plugin = { "pretty" })
public class FormTest {

	@BeforeClass
	public static void beforeAll() {
		System.out.println("Starting test...");
	}

	@AfterClass
	public static void afterAll() {
		System.out.println("Finishsing test...");
	}
}
