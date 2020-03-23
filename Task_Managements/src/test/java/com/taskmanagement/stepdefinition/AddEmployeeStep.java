package com.taskmanagement.stepdefinition;

import com.taskmanagement.pagesobjects.AddEmployeePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeStep {
	AddEmployeePage addempl= new AddEmployeePage(); 	 		// creating object for add employee
	
	//TC 10 AddEmployee sceanrio methods
			
		@Given ("^chrome application launched$")
		public void the_user_launch_chrome_addemp()
		{
			addempl.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		
		@When("^the user click on administartion and login is proceeded$")
		public void the_user_click_on_Administartion_and_Login_is_proceeded() throws Throwable {
			addempl.administartion();
		}

		@Then("^the user click on employee field$")
		public void the_user_click_on_Employee_field() throws Throwable {
			addempl.employee();
		   
		}

		@Then("^the user click on add employee field and enter the credentials$")
		public void the_user_click_on_Add_Employee_field_and_enter_the_credentials() throws Throwable {
			addempl.employeeDetails();
		}

		@And("^click on add button$")
		public void click_on_Add_button() throws Throwable {
			addempl.add();
		}

}
