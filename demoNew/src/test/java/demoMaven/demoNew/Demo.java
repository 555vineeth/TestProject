package demoMaven.demoNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void demo(){
		
		System.setProperty("webdriver.gecko.driver", "./exes/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://network-rctp.qa.gtnexus.com/login");
		
	}
	
}
