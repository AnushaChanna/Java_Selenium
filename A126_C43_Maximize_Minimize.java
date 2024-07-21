package selenium_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class A126_C43_Maximize_Minimize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://flipkart.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
	}
}
