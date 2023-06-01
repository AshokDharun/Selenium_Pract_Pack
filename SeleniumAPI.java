package org.boom.base;

import org.openqa.selenium.WebElement;

import propertices.Broswers;
import propertices.Locaters;

public interface SeleniumAPI
{
	/**
	 * this will launch the chrome broswer with given url
	 * @author LENOVO
	 * @param url
	 */
	void setup(String url);
	
	
	
	/**
	 * this will launch the chrome broswer with given broswername & url
	 * @param broswer
	 * @param url
	 * @exception nullpointer, urlmalfunction
	 */
	void setup(Broswers broswer,String url);
	
	
	/**
	 * this method will close the broswer
	 */
	void close();
	

	/**
	 * this method will quite the broswer
	 */
	void quit();
	/**
	 * this method will use to find webelement with type & value
	 * @author LENOVO
	 * @param type - elemnet tye
	 * @param value- ele value
	 * @return webelement
	 */
	WebElement ele(Locaters type, String value);
	
	/**
	 * this use to select dropdown with value
	 * @param el
	 * @param value
	 */
	void selectValue(WebElement el, String value);
	
	/**
	 * this use to select dropdown with text
	 * @param el
	 * @param text
	 */
	void selectText(WebElement el, String text);
	/**
	 * this use to select dropdown with index
	 * @param el
	 * @param text
	 */
	void selectIndex(WebElement el, int position);
	
	/**
	 * use to click the button with element
	 * @param el
	 */
	void click(WebElement el);
	
	/**
	 * use to type /enter the text  with elem
	 * @param el
	 */
	void type(WebElement el,String testdata);
	/**
	 * use to get title
	 * @return
	 */
	String getTitle();
	/**
	 * use to get url
	 * @return
	 */
	String getURL();
	
	/**
	 * use to show the valus is display or not
	 * @return
	 */
	boolean isDisplay();
	
}
