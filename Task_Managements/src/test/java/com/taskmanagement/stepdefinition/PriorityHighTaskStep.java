package com.taskmanagement.stepdefinition;

import com.taskmanagement.pagesobjects.PriorityHighTaskPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class PriorityHighTaskStep {
	PriorityHighTaskPage priority= new PriorityHighTaskPage();	 //creating object for Prioritytask to print console 

	//TC 14 Print the priority high task table

		@Given ("^chrome launch$")
		public void the_user_launch_chrome_pri()
		{
			priority.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		@Given("^Priority field is inspected and search button should be clicked$")
		public void priority_field_is_inspected_and_search_button_should_be_clicked()  
		{
		priority.priority();   
		}

		@And("^Print the priority high Task table in the console$")
		public void print_Task_table() throws InterruptedException  
		{
		priority.print();   
	}
}
