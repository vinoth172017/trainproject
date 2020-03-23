package com.taskmanagement.stepdefinition;

import com.taskmanagement.excelutilitty.ExelUlities;
import com.taskmanagement.pagesobjects.AddTaskPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTaskStep {
	AddTaskPage taskadd=new AddTaskPage();		 //Creating Object for Add task
	ExelUlities taskexel = new ExelUlities();	 //Creating Object for Excel ulities
	
//@TC02 Add Task Scenario Methods
	
	@Given ("^user launch the Chrome application$")
	public void the_user_launch_chrome_addtask()
	{
		taskadd.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("^Click on AddTask and login$")
	public void click_AddTask_and_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		taskadd.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));

	}
	@Then("^Enter the task details$")
	public void clicking_on_AddTask_to_nagivate_Add_Task_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskadd.taskDeatils();
	}

	@And("^Click on addbutton to add Task$")
	public void click_on_Addbutton_to_add_Task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskadd.addTask();
	}
	

}
