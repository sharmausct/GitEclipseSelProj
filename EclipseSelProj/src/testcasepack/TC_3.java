package testcasepack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_3 {
	
	@Test
	
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("Hello");
		driver.quit();
	}

}
