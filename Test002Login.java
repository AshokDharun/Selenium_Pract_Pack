package org.boom.test;

import org.boom.base.BroswerBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import orq.boom.pages.Login;

public class Test002Login extends BroswerBase
{
	@BeforeTest
	public void setFilename()
	{
		filename="Test002";
	}
	
	@Test(dataProvider="Dprovide")
	public void logintest002(String username,String password)// herer we can use string[] arge also refer test001 class
	{
			
			Login lp=new Login(driver);
			boolean usernamelbl = lp.getUsernameLabel();
			Assert.assertEquals(usernamelbl, true);
			boolean passlabl=lp.getPasswordLabel();
			Assert.assertTrue(passlabl);
			System.out.println(" test002 Assertion part");
			

			new Login(driver).enterUserame(username).enterPassword(password).clickLogin();
			System.out.println("Test case Login test 002");
	}
}
