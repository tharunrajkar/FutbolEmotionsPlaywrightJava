package com.StepDefnitions;

import java.nio.file.Paths;

import com.POMManger.PageObjectManager;
import com.TestRunner.Runner;
import com.Utills.FileReaderManger;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends Runner {

	public static PageObjectManager pom = new PageObjectManager(page);

	@Given("^Users launch the URL$")
	public void usersLaunchTheURL() throws Throwable {
		try {
			String url = FileReaderManger.getInstance().getInstanceConfig().getURL();
			page.navigate(url);

		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("usersLaunchTheURLf.png")));

		}

	}

	@When("^User clicks Accept Cookies$")
	public void userClicksAcceptCookies() throws Throwable {
		try {
			String acceptCookie = pom.getInstanceLoginPage().accept;
			Locator accept = page.locator(acceptCookie);
			accept.click();
		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("userClicksAcceptCookies.png")));

			// TODO: handle exception
		}

	}

	@When("^User clicks the login icon$")
	public void userClicksTheLoginIcon() throws Throwable {
		try {
			// pom.getInstanceLoginPage().loginIcon;
			String loginLogo = pom.getInstanceLoginPage().loginIcon;
			Locator clickLogin = page.locator(loginLogo);
			clickLogin.click();

		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("userClicksTheLoginIcon.png")));

			// TODO: handle exception
		}

	}

	@When("^User enters a valid userName \"([^\"]*)\"$")
	public void userEntersAValidUserName(String userName) throws Throwable {
		try {
			String validUsername = pom.getInstanceLoginPage().username;
			Locator email = page.locator(validUsername);
			email.fill(userName);

		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("userEntersAValidUserName.png")));

			// TODO: handle exception
		}

	}

	@When("^User enters a valid password \"([^\"]*)\"$")
	public void userEntersAValidPassword(String passWord) throws Throwable {
		try {
			String validPassWord = pom.getInstanceLoginPage().passWord;
			Locator password = page.locator(validPassWord);
			password.fill(validPassWord);

		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("userEntersAValidPassword.png")));

			// TODO: handle exception
		}

	}

	@Then("^Users click the login button$")
	public void usersClickTheLoginButton() throws Throwable {
		try {
			String logInButton = pom.getInstanceLoginPage().clickLogin;
			Locator logIn = page.locator(logInButton);
			logIn.click();
		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("usersClickTheLoginButton.png")));

			// TODO: handle exception
		}

	}

	@When("^the user mouse hover on \"([^\"]*)\"$")
	public void theUserMouseHoverOn(String hovering) throws Throwable {
		try {
			String trainingModule = pom.getInstanceSearchProducts().trainingModule;
			Locator training = page.locator(trainingModule);
			training.hover();
		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("theUserMouseHoverOn.png")));

			// TODO: handle exception
		}

	}

	@When("^the user clicks on \"([^\"]*)\"$")
	public void theUserClicksOn(String arg1) throws Throwable {
		try {
			String footballClothingForMen = pom.getInstanceSearchProducts().footballClothingForMen;
			Locator clothing = page.locator(footballClothingForMen);
			clothing.click();
		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("theUserClicksOn.png")));

			// TODO: handle exception
		}

	}

	@When("^the user applies the \"([^\"]*)\" filter$")
	public void theUserAppliesTheFilter(String arg1) throws Throwable {
		try {
			String selectSize = pom.getInstanceSearchProducts().selectSize;
			Locator size = page.locator(selectSize);
			size.click();
		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("theUserAppliesTheFilter.png")));
		}

	}

	@When("^the user applies the \"([^\"]*)\" brand filter$")
	public void theUserAppliesTheBrandFilter(String arg1) throws Throwable {
		try {
			String brandFilter = pom.getInstanceSearchProducts().brandFilter;
			Locator selectBrand = page.locator(brandFilter);
			selectBrand.click();

			String shorts = pom.getInstanceSearchProducts().shorts;
			Locator SelectCloth = page.locator(shorts);
			SelectCloth.click();

		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("theUserAppliesTheBrandFilter.png")));
		}

	}

	@When("^the user clicks the order by dropdown menu and selects \"([^\"]*)\"$")
	public void theUserClicksTheOrderByDropdownMenuAndSelects(String arg1) throws Throwable {
		try {
			String sortByFillter = pom.getInstanceSearchProducts().sortByFillter;
			page.selectOption(sortByFillter, "Price: Less expensive first");

		} catch (Exception e) {
			page.screenshot(new Page.ScreenshotOptions()
					.setPath(Paths.get("theUserClicksTheOrderByDropdownMenuAndSelects.png")));
		}

	}

}
