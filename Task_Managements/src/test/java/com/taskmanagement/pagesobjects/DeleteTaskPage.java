package com.taskmanagement.pagesobjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DeleteTaskPage {
	WebDriver driver;                   
	By select =By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[2]/td[1]/a");
	By delete =By.name("Delete");
	By Login =By.name("login");
	By Password=By.name("password");
	By Loginclick=By.name("DoLogin");
	public void browserLaunch(String browser,String url)
	{
	
		try {
			//To launch firefox browser
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			// TO launch Chrome Browser
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
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
		}
		catch (WebDriverException e) 
		{
			System.out.println("Browser could not be launched");
		}
	}
		//methods for deleting the task 
	public void selectTask()
	{
		driver.findElement(select).click();
	}
	
	public void loginDetails(String login, String Pass) throws IOException 
	{
		driver.findElement(Login).sendKeys(login);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(Loginclick).click();
	}
		public void delete() throws InterruptedException {
		driver.findElement(delete).click();
		Thread.sleep(3000);
		driver.close();
	}
}
