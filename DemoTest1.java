package org.boom.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoTest1
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.out.println("property set");//TestNG_POM/driver/chromedriver.exe
	RemoteWebDriver driver=new ChromeDriver();
	System.out.println("ctreate driver wih chrome ref");
	driver.get("http://52.66.129.203:4200/#/auth/login");
	System.out.println("broswer launch");
	driver.findElementByXPath("//input[@placeholder='Username']").sendKeys("8680097929");
	System.out.println("set user name");
	driver.findElementByXPath("//input[@placeholder='Password']").sendKeys("Ashok@123");
	System.out.println("set password");
	driver.findElementByXPath("//button[text()='Sign In']").click();
}
}
