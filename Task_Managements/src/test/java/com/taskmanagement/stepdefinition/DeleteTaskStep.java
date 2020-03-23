package com.taskmanagement.stepdefinition;

import com.taskmanagement.excelutilitty.ExelUlities;
import com.taskmanagement.pagesobjects.DeleteTaskPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteTaskStep {
	DeleteTaskPage taskdelete= new DeleteTaskPage(); 	//creating object for deleting task
	ExelUlities taskexel = new ExelUlities();	 //Creating Object for Excel ulities
	//TC 06 TaskManagement Delete
	
		@Given ("^launch chrome application$")
		public void the_user_launch_chrome_de()
		{
			taskdelete.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		@When("^Click first task from tasks list$")
		public void click_any_task_from_tasks_list() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			taskdelete.selectTask();
			taskdelete.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));
		}

		@Then("^Click delete button to delete the task$")
		public void click_delete_button_to_delete_details() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			taskdelete.delete();
		}
		
}
