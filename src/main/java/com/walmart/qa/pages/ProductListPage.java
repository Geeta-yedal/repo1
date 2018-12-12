package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.walmart.qa.base.Base;

public class ProductListPage extends Base{

	
	@FindBy(xpath="//img[contains(@data-pnodetype,'item img')]")
	WebElement productLaptop;
	
	//@FindBy(xpath="//img[@id='imgCtr']")
	//WebElement advImage;
	
	@FindBy(xpath="//div[@class='cta' and contains(text(),'Shop now')]")
	WebElement shopnowLink;
	
	public ProductListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ProductDetail clickOnProduct()
	{
		productLaptop.click();
		
		return new ProductDetail();
	}
	
	/*public boolean validateProductImage()
	{
		return advImage.isDisplayed();
		
	}*/
	
	public boolean validateShopnowLink()
	{
		return shopnowLink.isDisplayed();
		
	}
			
}
