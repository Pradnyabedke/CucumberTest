package com.csg.tau;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import assi.HomePage;
import assi.Supportpage;

public class Support_test {
@Test
	public void Support() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		HomePage hp=new HomePage(driver);
		hp.clickonSupport();
		
		Supportpage sp = new Supportpage(driver);
		sp.goBackToHomePage();
		Thread.sleep(5000);
		driver.close();
		

	}

}
