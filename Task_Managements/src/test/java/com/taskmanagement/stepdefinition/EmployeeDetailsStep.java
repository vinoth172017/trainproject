package com.taskmanagement.stepdefinition;

import com.taskmanagement.excelutilitty.ExelUlities;
import com.taskmanagement.pagesobjects.EmployeeDetailsPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeDetailsStep {
	EmployeeDetailsPage employee=new EmployeeDetailsPage(); 	//creating object for employee details
	ExelUlities taskexel = new ExelUlities();	 //Creating Object for Excel ulities
	
	//TC 09 get the employee deatils
		@Given ("^chrome application is launched$")
		public void the_user_launch_chrome_em()
		{
			employee.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		
		@When("^Clicking Adminstration$")
		public void clicking_Adminstration() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			employee.adminstration();
			employee.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));
		}

		@Then("^Click on employee details$")
		public void click_on_employee_details() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			employee.employe();
		}

		@And("^Print the anyone Employee name and email in the console$")
		public void print_the_anyone_Employees_list_in_the_console() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			employee.printEmp();
		}

}
