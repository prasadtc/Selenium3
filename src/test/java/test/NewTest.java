package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void checkTest() {
	  
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("About")).click();
		
		System.out.println(driver.getTitle());
	  
  }
  
  @Test
  public void checkIETest() {
	  
	  System.out.println("Test 2 - executing");
	  
  }
  
  
}
