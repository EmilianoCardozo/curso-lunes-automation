package com.cardozo.opencart.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.cardozo.opencart.stepDefinitions", "com.cardozo.opencart.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE/*,
        tags = "@CUE-002"*/
)

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
