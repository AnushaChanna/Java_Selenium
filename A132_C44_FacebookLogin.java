package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A132_C44_FacebookLogin 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	
	WebElement username=driver.findElement(By.name("email"));
	username.sendKeys("Anusha@gmail.com");
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("CDSFDS#E@");
	WebElement Loginbutton=driver.findElement(By.name("login"));
	Loginbutton.click();
	Thread.sleep(20000);
	
	//driver.close();
		
}
}
