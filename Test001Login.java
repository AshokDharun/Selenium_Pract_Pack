package org.boom.test;

import org.boom.base.BroswerBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import orq.boom.pages.Login;

public class Test001Login  extends BroswerBase
{
	@BeforeTest
	public void setFilename()
	{
		filename="Test001";
	}
	
	
	@Test(dataProvider="Dprovide")
public void logintest001(String[] data)
{
		
		Login lp=new Login(driver);
		boolean usernamelbl = lp.getUsernameLabel();
		Assert.assertEquals(usernamelbl, true);
		boolean passlabl=lp.getPasswordLabel();
		Assert.assertTrue(passlabl);
		System.out.println("Assertion part"); 
		

		new Login(driver).enterUserame(data[0])
		.enterPassword(data[1])
		.clickLogin();
		System.out.println("Test case001 Login");
}
}
