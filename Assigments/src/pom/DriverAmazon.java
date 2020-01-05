package pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverAmazon {
	
@Test
public void amazonAndFlipkart()
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
Pom_Amazon pa=new Pom_Amazon(driver);
pa.getSearchBox().sendKeys("iPhone XR(64GB)-Yellow");
pa.getSubmit().click();
String amazon_price=pa.getPrice().getText();
driver.get("https://www.flipkart.com/");
pa.getPopUp().click();
pa.getSearchBoxFlipkart().sendKeys("iPhone XR(64GB)-Yellow");
pa.getSubmitFlipkart().click();
String flipkart_price=pa.getPriceFlipkart().getText();
flipkart_price=flipkart_price.substring(1);
flipkart_price=flipkart_price.replaceAll(",", "");
amazon_price=amazon_price.replace(",", "");

int amazon_price1=Integer.parseInt(amazon_price);
int flipkart_price1=Integer.parseInt(flipkart_price);
while(amazon_price1<flipkart_price1)
{
	System.out.println("Amazon price is "+amazon_price1+" lesser than flipkart price which is "+flipkart_price);
	break;
}
while(amazon_price1>flipkart_price1)
{
	System.out.println("Flipkart price is "+flipkart_price1+" lesser than Amazon price which is "+amazon_price);
	break;
}

	
driver.close();

}

}
