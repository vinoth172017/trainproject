package com.taskmanagement.stepdefinition;

import com.taskmanagement.pagesobjects.AddTaskTypePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTaskTypeStep {
	AddTaskTypePage tasktype=new AddTaskTypePage();  //creating object for task type
	//TC 12 add Hold type in task
	
		@Given ("^The user launched the Chrome application$")
		public void the_user_launch_chrome_type()
		{
			tasktype.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		
		@When("^the user click  Administration tab and do valid login$")
		public void the_user_click_Administration_tab_and_do_valid_login()  
		{
			tasktype.administration();
		}

		@Then("^the user click on Types field and clicks Add New Type$")
		public void the_user_click_on_Types_field_and_clicks_Add_New_Type() {
			tasktype.type();
		}
		
		@And("^the user enters Type Name and submit$")
		public void the_user_enters_Type_Name() throws InterruptedException  {
			tasktype.addType();
		    
		}

}
