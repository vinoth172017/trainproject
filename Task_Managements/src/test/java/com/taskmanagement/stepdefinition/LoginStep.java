package com.taskmanagement.stepdefinition;

import com.taskmanagement.excelutilitty.ExelUlities;
import com.taskmanagement.pagesobjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	LoginPage tasklogin=new LoginPage(); 		//Creating Object for login Pages	
	ExelUlities taskexel = new ExelUlities();	 //Creating Object for Excel ulities

//@TC01	Login scenario methods 	
	
		@Given("^The user launch the Chrome application$")
		public void the_user_launch_the_chrome_application() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
			tasklogin.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}

		@When("^Clicking on administration to nagivate Login Page$")
		public void clicking_on_Administration_to_nagivate_Login_Page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			tasklogin.loginPage();
		}

		@Then("^The user login using username and password with vaild and invaild deatils$")
		public void the_user_login_using_username_and_password() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			tasklogin.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));
			tasklogin.loginClick();
			    int count=taskexel.row_count();
			    for(int i=2;i<=count;i++)
			    {
			    	tasklogin.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
			    	tasklogin.loginPage();
			    	tasklogin.loginDetails(taskexel.Task_Management_username(i),taskexel.Task_Management_password(i));
			    if (i==2) {
			    	tasklogin.loginClick();
			    }
			    }
		}
		@Then("^Clicking on login button$")
		public void click_on_login_Button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			tasklogin.loginClick();
		}

}
