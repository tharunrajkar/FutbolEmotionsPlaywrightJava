//package com.StepDefnitions;
//
//import com.POMManger.PageObjectManager;
//import com.TestRunner.Runner;
//import com.Utills.FileReaderManger;
//import com.microsoft.playwright.Locator;
//import com.microsoft.playwright.Page;
//import com.microsoft.playwright.Response;
//import com.pages.LoginPage;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Steps extends Runner {
//	
//	
//	
//	public static PageObjectManager pom = new PageObjectManager(page);
//	
//	@Given("^Users launch the URL$")
//	public void usersLaunchTheURL() throws Throwable {
//		String url = FileReaderManger.getInstance().getInstanceConfig().getURL();
//		page.navigate(url);
//	}
//	@When("^User clicks Accept Cookies$")
//	public void user_clicks_Accept_Cookies() throws Throwable {
//	   String acceptCookie = pom.getInstanceLoginPage().accept;
//	   Locator accept = page.locator(acceptCookie);
//	   accept.click();
//	}
//
//	@When("^User clicks the login icon$")
//	public void user_clicks_the_login_icon() throws Throwable {
//		//pom.getInstanceLoginPage().loginIcon;
//		String loginLogo = pom.getInstanceLoginPage().loginIcon;
//		Locator clickLogin = page.locator(loginLogo);
//		clickLogin.click();
//		
//	  
//	}
//
////	@When("^User enters aswinco(\\d+)@gmail\\.com$")
////	public void user_enters_aswinco_gmail_com(String arg1) throws Throwable {
////	    String username = pom.getInstanceLoginPage().username;
////	    Locator email = page.locator(username);
////	    email.fill(arg1);
////	}
//
//	@When("^User enters valid J<_\\)@yw(\\d+)'#iP\\^U(\\d+)$")
//	public void userEntersValidJ_YwIPU(int arg1, int arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^Users clicks login button$")
//	public void usersClicksLoginButton() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//
//
//}
