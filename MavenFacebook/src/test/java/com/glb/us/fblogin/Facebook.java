package com.glb.us.fblogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver d;
	WebElement sign, emailId, Pwd,Login;
@BeforeMethod
public void launch_website()
{
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumJars\\chromedriver.exe");
	 d= new ChromeDriver();
	d.get("https://www.facebook.com");
	d.manage().window().maximize();
}

@AfterMethod
public void title_catch()
{
	String S= d.getTitle();
	System.out.println("The title of the Amazon Webpage is :" + S);
}

@Test
public void login()
{
	emailId=d.findElement(By.id("email"));
	emailId.sendKeys("serena");
	Pwd=d.findElement(By.id("pass"));
	Pwd.sendKeys("Swamisamartha10");
	Login=d.findElement(By.xpath("//*[@type='submit']"));
	Login.click();
}
}
