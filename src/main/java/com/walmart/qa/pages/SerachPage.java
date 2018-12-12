package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.Base;

public class SerachPage extends Base {

// object repository or page library
	@FindBy(xpath = "//span[@class='elc-icon elc-icon-spark']")
	WebElement logo;

	@FindBy(xpath = "//*[@id='global-search-input']")
	WebElement serachField;

	@FindBy(xpath = "//*[@id=\"povActive\"]")
	WebElement imgage;

	@FindBy(xpath = "//span[@class=BubbleButton-hoverLabel]")
	WebElement accountButton;
	
	@FindBy(xpath="//span[@class='elc-icon elc-icon-search-nav elc-icon-18']")
	WebElement searchButton;

	// to initialize page elements

	public SerachPage() {
		PageFactory.initElements(driver, this);
	}
	//actions
	
	public boolean validateImage() {
		return imgage.isDisplayed();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
		
	}
	
	public  ProductListPage validateSearchField()
	{
		if(serachField.isDisplayed() && serachField.isEnabled())
		{
			serachField.sendKeys("laptop");
			searchButton.click();
			}
		
		return new ProductListPage();
		
	}

}
