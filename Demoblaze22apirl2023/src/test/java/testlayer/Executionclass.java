package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagelayer.Homepage;


public class Executionclass {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Homepage v = new Homepage(driver);
		
		
		v.loginlink();
		Thread.sleep(3000);
		
		v.verifyusername();
		
		v.verifypassword();
		Thread.sleep(3000);
		v.loginbutton();
		Thread.sleep(3000);
		System.out.println("browser sucessfully launch");
		driver.quit();
	}
	

}
