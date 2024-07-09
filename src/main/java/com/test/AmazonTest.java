package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTest {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\poojasharma03\\eclipse\\chromedriver-win64\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'])")).sendKeys("Iphone 15 pro max");
	  
	  
   }
}