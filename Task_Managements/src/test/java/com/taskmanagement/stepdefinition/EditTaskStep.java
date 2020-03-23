package com.taskmanagement.stepdefinition;

import com.taskmanagement.excelutilitty.ExelUlities;
import com.taskmanagement.pagesobjects.EditTaskPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditTaskStep {
	ExelUlities taskexel = new ExelUlities();	 //Creating Object for Excel ulities
	EditTaskPage taskedit = new EditTaskPage(); 		//creating object for edit task
	//TC 05 Edit task Scenario Methods
		
		@Given ("^launch the Chrome application$")
		public void the_user_launch_chrome_edit()
		{
			taskedit.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		
		@When("^Click first task from the tasks list$")
		public void click_any_task_from_the_Tasks_list() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			taskedit.selectTask();
			taskedit.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));
		}

		@Then("^Edit name field from Add/Edit task$")
		public void edit_any_one_field_from_Add_Edit_task() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			taskedit.Edit();
		}

		@And("^Click on submit Button to update task$")
		public void click_on_submit_Button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  taskedit.submit(); 
		}

}
