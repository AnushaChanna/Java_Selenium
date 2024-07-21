package selenium_programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A127_C43_Close_Quit_ 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://flipkart.com");
		Thread.sleep(3000);
		driver.close();
		
		EdgeDriver driver1 = new EdgeDriver();
		Thread.sleep(2000);
		driver1.get("https://flipkart.com");
		Thread.sleep(3000);
		driver1.quit();	
	}
}