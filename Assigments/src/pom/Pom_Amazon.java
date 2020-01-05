package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom_Amazon {
	WebDriver driver;
	
	Pom_Amazon(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	
	By search_box=By.xpath("//div[@class='nav-search-field ']/child::input[@id='twotabsearchtextbox']");
	By sumbit_button=By.xpath("//div[@class='nav-search-submit nav-sprite']/child::input[@type='submit']");
	By price_detail=By.xpath("//div[@class='s-result-list s-search-results sg-row']/descendant::span[text()='47,900'][1]");
	By close_popupButton=By.xpath("//button[@class='_2AkmmA _29YdH8']");
	By searchBoxFlipkart=By.xpath("//div[@class='O8ZS_U']/child::input");
	By submitFlipkart=By.cssSelector(".vh79eN");
	By priceFlipkart=By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])[1]");
	
	public WebElement getSearchBox()
	{
	return driver.findElement(search_box);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(sumbit_button);
	}
	public WebElement getPrice()
	{
		return driver.findElement(price_detail);
	}
	public WebElement getPopUp()
	{
	return driver.findElement(close_popupButton);
	}
	public WebElement getSearchBoxFlipkart()
	{
	return driver.findElement(searchBoxFlipkart);
	}
	public WebElement getSubmitFlipkart()
	{
	return driver.findElement(submitFlipkart);
	}
	public WebElement getPriceFlipkart()
	{
	return driver.findElement(priceFlipkart);
	}
}