package com.taskmanagement.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EmployeeLoginPage {
	WebDriver driver;
		//employee login locators
	By Administration=By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]");
	By Login =By.name("login");
	By Password=By.name("password");
	By Loginclick=By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input");
	

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
			// To launch internet explorer Browser
			else if(browser.equalsIgnoreCase("Internet Explore")) {
				System.setProperty("webdriver.ie.driver", "Driver/IEDriverServer.exe");//Internet Explore
				driver = new InternetExplorerDriver();
			}
       //to maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		
		} catch (WebDriverException e) {
			System.out.println("Browser could not be launched");
		}
	}
		//methods for checking created employee login
	public void administration()
	{
		driver.findElement(Administration).click();
	}
	public void loginCheck() throws InterruptedException
	{
		driver.findElement(Login).sendKeys("Sasi");
		driver.findElement(Password).sendKeys("sasi@123");
		driver.findElement(Loginclick).click();
		Thread.sleep(4000);
		driver.close();
	}

}
