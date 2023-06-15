package assesment;

import org.boom.base.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import propertices.Broswers;
import propertices.Locaters;

public class GoogleTest  extends  SeleniumBase
{
	@Test
void searchLetcode() throws InterruptedException
{
	setup(Broswers.CHROME,"https://www.google.com/");
	WebElement search=ele(Locaters.name,"q");//lcater is enum
	type(search, "code with cowsick",Keys.ENTER);//type(ele("name", "p"),"code with cowsic")
	Thread.sleep(3000);
	quit();
}
}
