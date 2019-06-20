package com.test.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeLogin {
	
	public static void main(String[] args) {
		
		//set the path of chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		//Enter the url
		
		driver.get("https://demo.actitime.com/login.do");
		
		//Enter username 
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//Enter Password
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//click on login button
		
		driver.findElement(By.xpath("//div[text()= 'Login ']")).click();
		
		//click on logout button
		
		/*driver.findElement(By.xpath("//div[text()= 'Logout ']")).click();*/
	}

}
