package com.abc.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoApp {

	@Test
	void posCredentials1() throws Exception {

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.magento.com");

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("subramanyaraj87@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		driver.findElement(By.id("send2")).click();
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Log Out")).click();
		driver.quit();

	}

	@Test
	void posCredentials2() throws Exception {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.magento.com");

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("subramanyaraj87@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		driver.findElement(By.id("send2")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log Out")).click();
		driver.quit();

	}

}
