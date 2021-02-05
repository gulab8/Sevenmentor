package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select ;


public class demoo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\Seleniumlinks\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.spicejet.com/");
		
		WebElement element = d.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s = new Select(element);
		s.selectByIndex(3);
	
		
		
	}

}
