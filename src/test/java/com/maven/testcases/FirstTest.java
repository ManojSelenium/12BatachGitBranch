package com.maven.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

	
	
	@Test
	public void tc_1() {
		System.out.println("First Branch Commit 1");
		System.out.println("Master Branch");
		System.setProperty("webdriver.chrome.driver","C:\\LatestChrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.co.in");
	}
}
