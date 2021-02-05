package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class dynamicclass6 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\Seleniumlinks\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.spicejet.com/");
		
		
		d.findElement(By.xpath("//input@id='ctl00_mainContent_chk_friendsandfamily']")).click();
			Thread.sleep(2000);
			
			
		
	
	//Assert.assertTrue(d.findElement(By.xpath("//input@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
//	Assert.assertTrue(true);	
			
	}
}
