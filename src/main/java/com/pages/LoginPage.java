package com.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	public String accept;

	public String getAccept() {
		return accept;
	}

	public void setLoginIcon(String loginIcon) {
		this.loginIcon = loginIcon;
	}

	public  String loginIcon;
	public  String username;
	public String passWord;

	public String clickLogin;

	public LoginPage(Page page) {
		this.accept = "//button[.='I Accept']";
		this.loginIcon = "//small[.='Log in']";
		this.username = "//input[@placeholder='email']";
		this.passWord = "//input[@placeholder='password']";
		this.clickLogin = "//input[@title='Log in']";
	}

	public String getLoginIcon() {
		return loginIcon;
	}

	public String getUsername() {
		return username;
	}

	public String getPassWord() {
		return passWord;
	}

}