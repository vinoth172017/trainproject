package com.taskmanagement.stepdefinition;

import com.taskmanagement.pagesobjects.SearchDeleteTaskPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchDeleteStep {
	SearchDeleteTaskPage deletesearch=new SearchDeleteTaskPage(); 		//creating object for search deleted task
	
	//TC 07 Searching Deleted deatils is there are not
		@Given ("^The Chrome application launch$")
		public void the_user_launch_chrome_sde()
		{
			deletesearch.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
	
		@When("^Fill the deleted task details in Search box$")
		public void fill_the_deleted_details_in_Search_box() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			deletesearch.searchData();
		}

		@Then("^Click the search button$")
		public void click_the_search_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			deletesearch.submit();
		}

		@And("^Print the search result in the console$")
		public void print_the_search_result() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			deletesearch.print();
		}

}
