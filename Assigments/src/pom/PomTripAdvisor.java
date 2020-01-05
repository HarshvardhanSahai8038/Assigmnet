package pom;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PomTripAdvisor {
WebDriver driver;
	
PomTripAdvisor(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

By search_box=By.cssSelector(".brand-global-nav-action-search-Search__searchButton--b9-IK");
By search_boxText=By.xpath("//div[@class='what_with_highlight']/child::input");
By searchGo=By.cssSelector("#SEARCH_BUTTON");
By result=By.xpath("//div[@class='location-meta-block']/descendant::span[text()='Club Mahindra Madikeri, Coorg']");
By review=By.cssSelector("span[title='Reviews']");
By writeReview=By.xpath("//a[text()='Write a review']");
By reviewTiltle=By.cssSelector("#ReviewTitle");
By reviewText=By.cssSelector("#ReviewText");
By checkBox=By.cssSelector("#noFraud");
By reviewSubmit=By.cssSelector("#SUBMIT");
By hotelRating=By.xpath("//div[@id='DQ_RATINGS']/descendant::div[text()='Hotel Ratings']");
By hotelService=By.xpath("//div[@id='tr_qid12']/descendant::div[@class='detailsRatings']");
By hotelLocation=By.xpath("//div[@id='tr_qid14']/descendant::div[@class='detailsRatings']");
By hotelRooms=By.xpath("//div[@id='tr_qid13']/descendant::div[@class='detailsRatings']");


public WebElement getSearchBox()
{
return driver.findElement(search_box);
}
public WebElement getSearchtext()
{
return driver.findElement(search_boxText);
}
public WebElement getSearchGo()
{
return driver.findElement(searchGo);
}
public WebElement getResult()
{
return driver.findElement(result);
}
public void scrollDown() throws InterruptedException
{
	
	Set<String> windos = driver.getWindowHandles();
	Iterator<String> it = windos.iterator();
	String parent = it.next();
	String child = it.next();

	driver.switchTo().window(child);
	
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  
	jse.executeScript("window.scrollBy(0,3600)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@title='Reviews']")).click();
	
	
	}
public WebElement getReview()
{
return driver.findElement(review);
}
public WebElement getWriteReview()
{
return driver.findElement(writeReview);
}
public void mouseHover() {
	
	Set<String> windos = driver.getWindowHandles();
	Iterator<String> it = windos.iterator();
	String parent = it.next();
	String child = it.next();
	String child2=it.next();
	driver.switchTo().window(child2);
	
	
Actions action = new Actions(driver);

action.moveToElement(driver.findElement(By.cssSelector("#bubble_rating"))).build().perform();
driver.findElement(By.cssSelector("#bubble_rating")).click();


}

	public void mouseHover2()
	{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  
	jse.executeScript("window.scrollBy(0,1000)");
	
		Actions action = new Actions(driver);

		
		action.moveToElement(driver.findElement(hotelService)).build().perform();
		driver.findElement(hotelService).click();
		
	}

public WebElement getReviewTitle()
{
return driver.findElement(reviewTiltle);
}
public WebElement getReviewText()
{
return driver.findElement(reviewText);
}
public WebElement getCheckBox()
{
return driver.findElement(checkBox);
}
public WebElement getReviewSubmit()
{
return driver.findElement(reviewSubmit);
}
}
