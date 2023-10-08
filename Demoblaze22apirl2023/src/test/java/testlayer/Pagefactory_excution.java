package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagelayer.Pagefactory_withpom;

public class Pagefactory_excution {
	
	//with page factory
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Pagefactory_withpom homepag = new Pagefactory_withpom(driver);
		
		driver.get("https://demoblaze.com/index.html");
		Thread.sleep(3000);
		homepag.loginlink();
		Thread.sleep(2000);
		homepag.verifyusername();
		
		homepag.verifypassword();
		homepag.loginbutton();
}
}
