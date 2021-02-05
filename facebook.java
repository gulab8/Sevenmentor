package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.tools.javac.util.Assert;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\Seleniumlinks\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com");
		
		d.findElement(By.id("email")).sendKeys("n.gulab@gmail.com");
		d.findElement(By.id("pass")).sendKeys("12345");    //input element
		d.findElement(By.xpath("//button[contains(.,'Log In')]")).click();
		
		d.close();    //close browser
	org.testng.Assert.assertTrue();    


		//https://www.salesforce.com/in/?ir=1
		
	}

}
