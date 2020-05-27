package co.com.sophos.certification.challenge.runners;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/co/com/sophos/certification/challenge/features/BanistmoAbrirPdf.feature",
		glue = "co.com.sophos.certification.challenge.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class BanistmoAbrirPdfRunner {
	
	private BanistmoAbrirPdfRunner() {
		
	}
}
