package com.csg.tau;

//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import assi.Data;
import assi.HomePage;
import assi.Registerpage;
import junit.framework.Assert;
//import assi.Supportpage;
//import junit.framework.Assert;

//@SuppressWarnings("deprecation")
@SuppressWarnings("deprecation")
public class Login_test {
	@Test(dataProvider = "RegisterData", dataProviderClass = Data.class)
	public void f1(String firstname, String lastname) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		HomePage hp=new HomePage(driver);
        //hp.clickonRegister();
		Assert.assertTrue(hp.clickonRegister());
		//Assert.assertTrue("click on register link", hp.clickonRegister());
		Registerpage reg = new Registerpage(driver);
		Assert.assertTrue("click first name", reg.Enterfname(firstname));
		Assert.assertTrue("click last name", reg.Enterlname(lastname));

//		WebElement country=driver.findElement(By.name("country"));
//		
//		Select sel=new Select(country);
//		sel.selectByVisibleText("IRAN");
//		driver.switchTo().alert().sendKeys("abc");
//		Alert alt=driver.switchTo().alert();
//		//alt.accept();
//		alt.sendKeys("");
//		alt.dismiss();

//		WebElement fname=driver.findElement(By.name("firstName"));
//		fname.sendKeys("Paras");
//		WebElement lname=driver.findElement(By.name("lastName"));
//		lname.sendKeys("Sharma");
//		WebElement phn=driver.findElement(By.name("phone"));
//		phn.sendKeys("7894561230");
//		WebElement 
		Thread.sleep(5000);
		driver.close();
		
}
	
//	public void close()
//	{
//		
//	}
}

