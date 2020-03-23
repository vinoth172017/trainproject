package com.taskmanagement.stepdefinition;

import com.taskmanagement.pagesobjects.SearchProjectPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchProjectStep {
	SearchProjectPage searchproject = new SearchProjectPage();	 	//creating object for search particular project
	//TC 08 Search the Codecharge project
	
		@Given ("^Chrome application launch$")
		public void the_user_launch_chrome_sepro()
		{
			searchproject.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		@When("^Search as Codecharge in Project$")
		public void click_dropdown_box_in_project_from_search_and_select_codecharge() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			searchproject.searchProject();
		}

		@Then("^click on the search button get the search result$")
		public void click_on_the_search_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			searchproject.submit();  
		}

}
