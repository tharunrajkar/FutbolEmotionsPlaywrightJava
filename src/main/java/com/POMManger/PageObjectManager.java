package com.POMManger;

import com.microsoft.playwright.Page;
import com.pages.LoginPage;

public class PageObjectManager {
	public static Page page;
	
	public PageObjectManager(Page page1) {
		this.page=page1;
		
	}
	private LoginPage loginPage;
	
	public LoginPage getInstanceLoginPage() {
		loginPage = new LoginPage(page);
		return loginPage;
		
	}

}
