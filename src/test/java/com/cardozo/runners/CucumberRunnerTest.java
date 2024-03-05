package com.cardozo.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.cardozo.stepDefinitions", "com.cardozo.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@LOG-123"
)

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
