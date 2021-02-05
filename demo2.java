package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\Seleniumlinks\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.spicejet.com/");  
		
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		
		System.out.println(d.getPageSource());
		d.get("https://www.google.com");
		
		d.navigate().back();
		d.close();
			
		
		}

	}


