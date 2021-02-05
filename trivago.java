package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Assert;
public class trivago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\Seleniumlinks\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.trivago.com");
		
		d.findElement(By.xpath("(//span[contains(@class,'dealform-button__head')])[3]")).click();
	int i=1;
	while(i>5)
		d.findElement(By.xpath("//button[contains(@data-role,'addAdult')]")).click();
	i++;
	}
	d.findElement(By.xpath("//button[contains(@data-role,'addAdult')]")).click();

    
	

}
