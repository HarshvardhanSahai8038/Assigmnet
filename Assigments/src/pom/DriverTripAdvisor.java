package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverTripAdvisor {

	@Test
	public void tripadvisor() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		PomTripAdvisor pta=new PomTripAdvisor(driver);
		pta.getSearchBox().click();
		pta.getSearchtext().sendKeys("Club Mahindra");
		pta.getSearchGo().click();
		pta.getResult().click();
		
		pta.scrollDown();
		Thread.sleep(2000);
		pta.getWriteReview().click();
		
	driver.findElement(By.xpath("//span[@title='Reviews']"));
		pta.mouseHover();
		String title=driver.findElement(pta.hotelRating).getText();
		
		if (title.equalsIgnoreCase("Hotel Ratings"))
	 {
		pta.mouseHover2();
		
		}
		pta.getReviewTitle().sendKeys("nice experience");
		pta.getReviewText().sendKeys("Great experience here");
		pta.getCheckBox().click();
		pta.getReviewSubmit().click();
		
		
	}
	
	

}
