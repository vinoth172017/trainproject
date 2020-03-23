package com.taskmanagement.stepdefinition;

import com.taskmanagement.pagesobjects.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStep {
	SearchPage tasksearch=new SearchPage(); 		//Creating Object for Search Task
	
	//@TC03 Search Scenario Methods
	
		@Given("^The user launch Chrome application$")
		public void the_user_launch_chrome_sear()
		{
		tasksearch.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		@When("^Enter correct details to search the added task$")
		public void enter_Correct_Details_to_search() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions	
			tasksearch.searchDetails();
		}

		@Then("^Click on search button to get the details of the task$")
		public void click_Search_Button_to_Get_Details() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			tasksearch.search();
		}

}
