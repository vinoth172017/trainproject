package com.taskmanagement.stepdefinition;

import com.taskmanagement.pagesobjects.SearchClosedStatusPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchClosedStatusStep {
	SearchClosedStatusPage taskclosed= new SearchClosedStatusPage();	 // creating object for searching closed status
	//TC 13 Search Closed Status
		@Given ("^user launched Chrome application$")
		public void the_user_launch_chrome_cls()
		{
			taskclosed.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		}
		@When("the user enter the home page and select the status")
		public void the_user_enter_the_home_page_and_select_the_status () throws InterruptedException
		{
			taskclosed.search_table();
		}
		@Then("^the status field is inspected and search button is clicked$")
		public void the_status_field_is_inspected_and_search_button_is_clicked() throws Throwable {
			taskclosed.exit();
		}

}
