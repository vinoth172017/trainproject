package com.taskmanagement.stepdefinition;

import com.taskmanagement.pagesobjects.TaskTablePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TaskTableStep {
	TaskTablePage taskprint=new TaskTablePage(); 	//Creating Object for print Task list
	
	//TC 04 Printing the web table Scenario Methods
	
		@Given ("^user launch Chrome application$")
		public void the_user_launch_chrome_taskt()
		{
			taskprint.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		@Given("^Open the home page$")
		public void Open_the_home_page() throws InterruptedException
		{
			taskprint.printTable();
		}
		
		@Then("^In task web table get the first row in the console$")
		public void print_the_home_page_Task_Table_in_the_console() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions	
			taskprint.exit();
		}

}
