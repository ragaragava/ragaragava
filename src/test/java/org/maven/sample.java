package org.maven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;



public class sample extends BaseClass {




public static void main(String[] args) {
	browserLaunch("chrome");
	urlLaunch("https://www.facebook.com/login/");

	WebElement txtUsername = driver.findElement(By.id("email"));
	sendkeys(txtUsername,"ragava");
	WebElement txtUsername1 = driver.findElement(By.id("pass"));
	sendkeys(txtUsername1,"09876");
	
	WebElement btnlogin =driver.findElement(By.name("login"));
click(btnlogin);
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
