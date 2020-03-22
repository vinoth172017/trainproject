package com.taskmanagement.pagesobjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PriorityHighTaskPage {
 WebDriver driver;
//locators print console priority are high 
 By Priority = By.name("priority_id");
 By Search = By.name("DoSearch");
 By row_1 =By.xpath("/html/body/table[3]/tbody/tr/td/table[1]/tbody/tr/th");
 By row_2 =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[1]");
 By row_3 =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[2]");
 By row_4 =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[3]");
 By row_5 =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[4]");
 By row_6 =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[5]");
 By row_7 =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[6]");
 By row_8 =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[7]");
 By row_9 =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[8]");
 By row_10 =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[9]");
 
 public void browserLaunch(String browser,String url)
	{
		try {
			//To launch firefox BROWSER
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","src//test//resources//Driver//geckodriver.exe");
				driver = new FirefoxDriver();
			}
			// TO launch Chrome Browser
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
				driver=new ChromeDriver();
			}
			// To launch InternetExplorer
			else if (browser.equalsIgnoreCase("Internet Explore")) {
				System.setProperty("webdriver.ie.driver","src/test/resources/Driver/IEDriverServer.exe");
				driver=new InternetExplorerDriver();  
			}
    //to maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		
		} catch (WebDriverException e) {
			System.out.println("Browser could not be launched");
		}
	}
 public void priority()
 {
	 driver.findElement(Priority).click();
	 driver.findElement(Priority).sendKeys(Keys.DOWN);
	 driver.findElement(Priority).sendKeys(Keys.DOWN);
	 driver.findElement(Priority).sendKeys(Keys.ENTER);
	 driver.findElement(Search).click();
 }
 //printing priority high task in the console
 public void print() throws InterruptedException
 {
	 String a = driver.findElement(row_1).getText();
	System.out.println(a+ " ");
	String b = driver.findElement(row_2).getText();
	System.out.println(b+ " ");
	String c = driver.findElement(row_3).getText();
	System.out.println(c+ " ");
	String d = driver.findElement(row_4).getText();
	System.out.println(d+ " ");
	String e = driver.findElement(row_5).getText();
	System.out.println(e+ " ");
	String f = driver.findElement(row_6).getText();
	System.out.println(f+ " ");
	String g = driver.findElement(row_7).getText();
	System.out.println(g+ " ");
	String h = driver.findElement(row_8).getText();
	System.out.println(h+ " ");
	String i = driver.findElement(row_9).getText();
	System.out.println(i+ " ");
	String j = driver.findElement(row_10).getText();
	System.out.println(j+ " ");
	Thread.sleep(4000);
	driver.close();
 }

}
