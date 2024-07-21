package selenium_programs;

import org.openqa.selenium.chrome.ChromeDriver;
public class A125_C43_Flipkart_launch
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://flipkart.com");
	}
}