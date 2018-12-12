package com.walmart.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.Base;
import com.walmart.qa.pages.ProductDetail;
import com.walmart.qa.pages.ProductListPage;

public class ProductListTest extends Base {

	 public ProductListPage productList;
	public  ProductDetail productDetail;

	public ProductListTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialzation();
		 productList=new ProductListPage();
	}
	
	@Test(priority=2)
	public void productTest()
	{
		productDetail=productList.clickOnProduct();
	}
	
	/*@Test(priority=2)
	public void advImageTest()
	{
		boolean flag=productList.validateProductImage();
	 Assert.assertTrue(flag);
		
	}*/
	
	@Test(priority=1)
	public void shopnowLinkTest()
	{
		boolean flagDisplayed=productList.validateShopnowLink();
		Assert.assertTrue(flagDisplayed);

		}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
