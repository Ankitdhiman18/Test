package SampleMaven.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogintestCase 
{
	public static WebDriver driver;
	@Test
	public void browserSetUp()
	{
		String driverpath=System.getProperty("user.dir")+"\\src\\test\\java\\Browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
