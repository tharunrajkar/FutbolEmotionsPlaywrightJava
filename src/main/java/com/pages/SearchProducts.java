package com.pages;

import com.microsoft.playwright.Page;

public class SearchProducts {
	public String trainingModule;
	public String footballClothingForMen;
	public String selectSize;
	public String brandFilter;
	public String shorts;
	public String sortByFillter;
	
	
	public SearchProducts(Page page) {
		this.trainingModule = "(//li[@class='nav-item dropdown']/a[@title='Football clothing'])[1]";
		this.footballClothingForMen = "//a[.='Football clothing for men']";
		this.selectSize ="//span[normalize-space(text())='L']";
		this.brandFilter = "//span[normalize-space(text())='adidas']";
		this.shorts = "//span[normalize-space(text())='Shorts']";
		this.sortByFillter = "(//select[@id='select_ordenacion_1'])[1]";
		
	}

}
