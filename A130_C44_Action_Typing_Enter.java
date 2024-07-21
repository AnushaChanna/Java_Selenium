package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class A130_C44_Action_Typing_Enter 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.findElement(By.id("APjFqb")).sendKeys("tiger");
	driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.close();
}	
}
