package org.boom.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import propertices.Broswers;
import propertices.Locaters;

public class SeleniumBase implements SeleniumAPI {
	
	RemoteWebDriver driver=null;
	WebDriverWait wait=null;
  long  timeouts=30;
  long maxwait=10;
  
  
	public void setup(String url) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeouts,TimeUnit.SECONDS);
		driver.get(url);
		wait=new WebDriverWait(driver, maxwait);

	}

	public void setup(Broswers broswer, String url) {

		switch (broswer) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			 driver=new ChromeDriver();
			break;
		case FIREFOX:
			  driver=new FirefoxDriver();
			break;
		case EDGE:
			 driver=new EdgeDriver();
			break;

		default:
			System.err.println("drivwr is not defind");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		wait=new WebDriverWait(driver, maxwait);


	}

	public void close() {
		driver.close();

	}

	public void quit() {

		driver.quit();
	}

	public WebElement ele(Locaters type, String value) {
		switch (type) {
		case id:
			return driver.findElement(By.id(value));
		case name:
			return driver.findElement(By.name(value));
		case link:
			return driver.findElement(By.linkText(value));
			
		case xpath:
			return driver.findElement(By.xpath(value));

		default:
			break;
		}
		return null;
	}

	public void selectValue(WebElement el, String value) {


	}

	public void selectText(WebElement el, String text) {


	}

	public void selectIndex(WebElement el, int position) {


	}

	public void click(WebElement el) {
		
		WebElement element=wait.withMessage("element is not clickable").
				until(ExpectedConditions.elementToBeClickable(el));
		element.click();

	}

	public void type(WebElement el,String data) 
	{
		WebElement element=wait.until(ExpectedConditions.visibilityOf(el));
		element.clear();
		element.sendKeys(data);
	}
	public void type(WebElement el,String data,Keys keys) 
	{
		WebElement element=wait.until(ExpectedConditions.visibilityOf(el));
		element.clear();
		element.sendKeys(data, keys);
	}

	public String getTitle() {

		return null;
	}

	public String getURL() {

		return null;
	}

	public boolean isDisplay() {

		return false;
	}

}
