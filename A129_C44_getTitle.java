package selenium_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class A129_C44_getTitle
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.close();
}
	
	
	
}
