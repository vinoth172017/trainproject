package com.taskmanagement.pagesobjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EmployeeDatailsPage {
	WebDriver driver;  
		//locators for getting employee name and mail id in console
	By admin =By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]/a");
	By employee=By.linkText("Employees");
	By employeename= By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[3]/td[1]/a");
	By employeemail=By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[3]/td[3]/a");
	By Login =By.name("login");
	By Password=By.name("password");
	By Loginclick=By.name("DoLogin");
	
	public void browserLaunch(String browser,String url)
	{
	
		try {
			//To launch firefox Browser
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
	// Methods for getting employee name and mail id
	public void adminstration() 
	{
		driver.findElement(admin).click();
	}
	
	public void loginDetails(String login, String Pass) throws IOException 
	{
		driver.findElement(Login).sendKeys(login);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(Loginclick).click();
	}
	
	public void employe() {
		driver.findElement(employee).click();
		
	}
	
	public void printEmp() throws InterruptedException {
		String empname = driver.findElement(employeename).getText();
		String email = driver.findElement(employeemail).getText();
		System.out.println("Employee Deatils \n Employe name: "+empname+ "\n Employee Mailid: "+email);
		Thread.sleep(3000);
		driver.close();
	}
	
}
