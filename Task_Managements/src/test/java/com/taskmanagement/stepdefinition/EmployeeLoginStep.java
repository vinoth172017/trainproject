package com.taskmanagement.stepdefinition;

import com.taskmanagement.pagesobjects.EmployeeLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EmployeeLoginStep {

	EmployeeLoginPage employeelogin= new EmployeeLoginPage(); // creating object for employee login
	//TC 11 Check employee login
		@Given ("^user launched the Chrome application$")
		public void the_user_launch_chrome_emplo()
		{
			employeelogin.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
	
		@Given("^the user click on Administration tab$")
		public void the_user_click_on_Administration_tab() throws Throwable {
			employeelogin.administration();
		    
		}

		@Then("^the user enters login credentials and clicks login$")
		public void the_user_enters_login_credentials_and_clicks_login() throws Throwable {
			employeelogin.loginCheck();
		    
		}
}
