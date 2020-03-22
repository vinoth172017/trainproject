package com.taskmanagement.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AddTaskTypePage {
 
	WebDriver driver;
		//Add task type locators
	By Administration=By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]");
	By Login =By.name("login");
	By Password=By.name("password");
	By Loginclick=By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input");
	By Types = By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[5]/td/a");
	By Add_New_Type = By.linkText("Add New Type");
	By Name = By.name("type_name");
	By click_add = By.name("Insert1");
	
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
			//methods for add task type 
	public void administration()
	{
		driver.findElement(Administration).click();
		driver.findElement(Login).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Loginclick).click();
	}
	public void type()
	{
		driver.findElement(Types).click();
		driver.findElement(Add_New_Type).click();
	}
	public void addType() throws InterruptedException
	{
		driver.findElement(Name).sendKeys("Hold");
		driver.findElement(click_add).click();
		Thread.sleep(4000);
		driver.close();
	}
}
