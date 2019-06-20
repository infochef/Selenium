 package com.test.application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
	
	public static void main(String[] args) {
		
		//Set the path of the Driver executable -- chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		//Launch the Browser - Chrome Browser
		
		WebDriver driver = new ChromeDriver();
		
		//Enter the url
		
		driver.get("http://www.facebook.com");
		
		//Print the Title of the Page
		
		String title = driver.getTitle();
		System.out.println("Title of the page --> "+ title);
		
		//Print the url of the Current Page
		
		System.out.println("URL of the Current page is --> "+driver.getCurrentUrl());
		
		//close the Current Browser
		
		driver.quit();
	}

}

