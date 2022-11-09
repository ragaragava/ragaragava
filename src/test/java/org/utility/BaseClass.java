package org.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
	}
	//url browser
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	//time
	public static void implicitwait(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
		
	}
	
	//sendkeys
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	//click
	public static void click(WebElement e){
		e.click();
		
	}
	//quit
	public static void quit() {
		driver.quit();
	}
	
	//current url
	public static String currentUrl() {
		String url = driver.getCurrentUrl();
		return url;
		}
	//title
	public static String title() {
		String title = driver.getCurrentUrl();
		return title;
		}
	
	//getattribute
	public static String getAttribute(WebElement e) {
		String att = e.getAttribute("value");
		return att;
		}
	//move to element
	public static void moveToElement(WebElement target) {
	Actions a=new Actions(driver);
	a.moveToElement(target).perform();
	}
	//drag and drop
	public static void dragAndDrop(WebElement src,WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	//select by index
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	