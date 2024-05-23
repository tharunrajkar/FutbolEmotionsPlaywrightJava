package com.POMManger;

import com.microsoft.playwright.Page;
import com.pages.LoginPage;
import com.pages.SearchProducts;

public class PageObjectManager {
	public Page page;

	public PageObjectManager(Page page1) {
		this.page = page1;

	}

	private LoginPage loginPage;

	public LoginPage getInstanceLoginPage() {
		loginPage = new LoginPage(page);
		return loginPage;

	}

	private SearchProducts searchProducts;

	public SearchProducts getInstanceSearchProducts() {
		searchProducts = new SearchProducts(page);
		return searchProducts;

	}


}