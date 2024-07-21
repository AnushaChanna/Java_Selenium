package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class A131_C44_Flipkart_SearchAnything
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	driver.findElement(By.name("q")).sendKeys("shoes");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.close();
	}
}
