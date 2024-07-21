package selenium_programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A128_C43_getwindowHandle_Handles 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		System.out.println("Chrome > " +driver.getWindowHandle());
		Thread.sleep(2000);
		driver.close();
		
		EdgeDriver driver1 = new EdgeDriver();
		Thread.sleep(2000);
		driver1.get("https://flipkart.com");
		driver1.manage().window().maximize();
		System.out.println("Edge > "+driver1.getWindowHandles());	
		Thread.sleep(2000);
		driver1.close();
	}
}
