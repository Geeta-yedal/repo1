package com.walmart.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.Base;
import com.walmart.qa.pages.ProductListPage;
import com.walmart.qa.pages.SerachPage;

public class SearchPageTest extends Base {
	SerachPage searchpage;
 ProductListPage productlistPage;
	
	public SearchPageTest()
	{
		super();
		
		
	}
	
	@BeforeMethod	
	public void setUp()
	{
		initialzation();
		searchpage=new SerachPage();
		
		
	}
	
	@Test(priority=1)
	public void imageTest()
	{
		boolean imageFlag=searchpage.validateImage();
		Assert.assertTrue(imageFlag);
	}
	

	@Test(priority=2)
	public void logoTest()
	{
		boolean logoFlag=searchpage.validateLogo();
		Assert.assertTrue(logoFlag);
	}
	@Test(priority=3)
	public void searchfieldTest()
	{
		productlistPage=searchpage.validateSearchField();
		
	}
	
	
	
	@AfterMethod
	 void tearDown()
	{
		driver.quit();
	}
	
}
