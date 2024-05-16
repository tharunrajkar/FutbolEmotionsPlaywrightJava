package com.TestRunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Utills.FileReaderManger;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.playwrightBase.PlaywrightBase;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/com/LoginFeature/LoginFunctions.feature" }, 
glue = "com.StepDefnitions" , 
dryRun = false, 
snippets = SnippetType.CAMELCASE, 
monochrome = true, strict = true)

public class Runner {
	public static Playwright playwright;
	public static Browser launch;
	public static Page page;

	@BeforeClass
	public static void Browsersetup() throws IOException {

		playwright = Playwright.create();
        launch = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = launch.newPage();
 
	}

	@AfterClass
	public static void tearDown() {
//		page.close();
//		browser.close();
//		playwright.close();

	}

}
