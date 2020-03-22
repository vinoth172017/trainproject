package com.taskmanagement.pagesobjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TaskTablePage {
	WebDriver driver;
	//locators for web table rows
	By Rows=By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr/td[1]");
	public void browserLaunch(String browser,String url)
	{
		try {
			//To launch firefox Browser
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
					System.setProperty("webdriver.ie.driver","src//test//resources//Driver//IEDriverServer.exe");
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

	public void printTable() throws InterruptedException
	{
		List <WebElement> row=driver.findElements(Rows);		//storing the row in webelement using list
		System.out.println("col "+row.size());
		System.out.println("Printing the Task details in the consloe "+row.size()); // size of the row
		for (int i =1;i<row.size();i++)
		{	
				String a= driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[" + (i+1)+ "]")).getText();
				//locator for the column and for loop for itration printing to end column 
				System.out.println(a);
		}			// printing the web table column in console
		Thread.sleep(3000);
		driver.close();		
}
}
