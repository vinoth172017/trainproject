package com.taskmanagement.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AddEmployeePage {
	WebDriver driver;
		//Add employee locators
	By Administration=By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]");
	By Login =By.name("login");
	By Password=By.name("password");
	By Loginclick=By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input");
	By employeefield = By.linkText("Employees");
	By addemployee = By.linkText("Add New Employee");
    By name = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/input");
	By mail = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/input");
	By click_add = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/input[1]");
	
	public void browserLaunch(String browser,String url)
	{
		try {
			//To launch Firefox browser
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","src//test//resources//Driver//geckodriver.exe");
				driver = new FirefoxDriver();
			}
			// TO launch chrome Browser
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
		//methods for add employee in the task management
	public void administartion() throws InterruptedException	
	{
		driver.findElement(Administration).click();
		driver.findElement(Login).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Loginclick).click();
		Thread.sleep(4000);
	}
	public void employee()
	{
		driver.findElement(employeefield).click();
	}
	//creating employee as admin to login  
	public void employeeDetails()
	{
		driver.findElement(addemployee).click();
		driver.findElement(name).sendKeys("Sasi");
		driver.findElement(mail).sendKeys("sasi123@gmail.com");
		driver.findElement(Login).sendKeys("Sasi");
		driver.findElement(Password).sendKeys("sasi@123");
	    driver.findElement(By.name("security_group_id")).click();
	    driver.findElement(By.name("security_group_id")).sendKeys(Keys.DOWN);
	    driver.findElement(By.name("security_group_id")).sendKeys(Keys.ENTER);		
	}
	public void add() throws InterruptedException
	{
		driver.findElement(click_add).click();
        Thread.sleep(4000);		
        driver.close();
	}
}
