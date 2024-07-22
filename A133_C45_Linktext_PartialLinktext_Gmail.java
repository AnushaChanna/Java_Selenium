package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A133_C45_Linktext_PartialLinktext_Gmail 
{
	public static void main(String[] args) throws InterruptedException 
	{
	 ChromeDriver driver=new ChromeDriver();	
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com");
	 WebElement gmail=driver.findElement(By.linkText("Gmail"));
	 gmail.click();
	 Thread.sleep(3000);
	 driver.close();
	 EdgeDriver driver1=new EdgeDriver();	
	 driver1.manage().window().maximize();
	 driver1.get("https://www.google.com");
	 WebElement gmail1=driver1.findElement(By.partialLinkText("mai"));
	 gmail1.click();
	 Thread.sleep(3000);
	 driver1.close();
	}
}
