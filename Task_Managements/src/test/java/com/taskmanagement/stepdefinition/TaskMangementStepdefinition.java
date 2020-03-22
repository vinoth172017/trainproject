package com.taskmanagement.stepdefinition;
import com.taskmanagement.excelutilitty.ExelUlities;
import com.taskmanagement.pagesobjects.LoginPage;
import com.taskmanagement.pagesobjects.DeleteTaskPage;
import com.taskmanagement.pagesobjects.SearchDeleteTaskPage;
import com.taskmanagement.pagesobjects.EditTaskPage;
import com.taskmanagement.pagesobjects.EmployeeDatailsPage;
import com.taskmanagement.pagesobjects.AddTaskPage;
import com.taskmanagement.pagesobjects.AddEmployeePage;
import com.taskmanagement.pagesobjects.EmployeeLoginPage;
import com.taskmanagement.pagesobjects.TaskTablePage;
import com.taskmanagement.pagesobjects.PriorityHighTaskPage;
import com.taskmanagement.pagesobjects.SearchClosedStatusPage;
import com.taskmanagement.pagesobjects.AddTaskTypePage;
import com.taskmanagement.pagesobjects.SearchPage;
import com.taskmanagement.pagesobjects.SearchProjectPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskMangementStepdefinition {
		
		LoginPage tasklogin=new LoginPage(); 		//Creating Object for login Pages	
		ExelUlities taskexel = new ExelUlities();	 //Creating Object for Excel ulities
		AddTaskPage taskadd=new AddTaskPage();		 //Creating Object for Add task
		SearchPage tasksearch=new SearchPage(); 		//Creating Object for Search Task
		TaskTablePage taskprint=new TaskTablePage(); 	//Creating Object for print Task list
		EditTaskPage taskedit = new EditTaskPage(); 		//creating object for edit task
		DeleteTaskPage taskdelete= new DeleteTaskPage(); 	//creating object for deleting task
		SearchDeleteTaskPage deletesearch=new SearchDeleteTaskPage(); 		//creating object for search deleted task
		SearchProjectPage searchproject = new SearchProjectPage();	 	//creating object for search particular project
		EmployeeDatailsPage employee=new EmployeeDatailsPage(); 	//creating object for employee details
		AddEmployeePage addempl= new AddEmployeePage(); 	 		// creating object for add employee
		EmployeeLoginPage employeelogin= new EmployeeLoginPage(); // creating object for employee login
		AddTaskTypePage tasktype=new AddTaskTypePage();  //creating object for task type
		SearchClosedStatusPage taskclosed= new SearchClosedStatusPage();	 // creating object for searching closed status
		PriorityHighTaskPage priority= new PriorityHighTaskPage();	 //creating object for Prioritytask to print console 
		
//@TC01	Login scenario methods 	
		
	@Given("^The user launch the Chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		tasklogin.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("^Clicking on administration to nagivate Login Page$")
	public void clicking_on_Administration_to_nagivate_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tasklogin.loginPage();
	}

	@Then("^The user login using username and password with vaild and invaild deatils$")
	public void the_user_login_using_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tasklogin.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));
		tasklogin.loginClick();
		    int count=taskexel.row_count();
		    for(int i=2;i<=count;i++)
		    {
		    	tasklogin.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		    	tasklogin.loginPage();
		    	tasklogin.loginDetails(taskexel.Task_Management_username(i),taskexel.Task_Management_password(i));
		    if (i==2) {
		    	tasklogin.loginClick();
		    }
		    }
	}

	@Then("^Clicking on login button$")
	public void click_on_login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tasklogin.loginClick();
	}
	
//@TC02 Add Task Scenario Methods
	
	@Given("^Click on AddTask and login$")
	public void click_AddTask_and_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskadd.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		taskadd.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));

	}
	@When("^Enter the task details$")
	public void clicking_on_AddTask_to_nagivate_Add_Task_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskadd.taskDeatils();
	}

	@Then("^Click on addbutton to add Task$")
	public void click_on_Addbutton_to_add_Task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskadd.addTask();
	}
	
//@TC03 Search Scenario Methods
	
	@Given("^Enter correct details to search the added task$")
	public void enter_Correct_Details_to_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tasksearch.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		tasksearch.searchDetails();
	}

	@When("^Click on search button to get the details of the task$")
	public void click_Search_Button_to_Get_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tasksearch.search();
	}
	
//TC 04 Printing the web table Scenario Methods
	
	@Given("^Open the home page$")
	public void Open_the_home_page()
	{
		taskprint.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}
	
	@Then("^In task web table get the first row in the console$")
	public void print_the_home_page_Task_Table_in_the_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	
		taskprint.printTable();
	}

//TC 05 Edit task Scenario Methods
	
	@Given("^Click first task from the tasks list$")
	public void click_any_task_from_the_Tasks_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskedit.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");	
		taskedit.selectTask();
		
		taskedit.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));
		//taskedit.login();
	}

	@When("^Edit name field from Add/Edit task$")
	public void edit_any_one_field_from_Add_Edit_task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskedit.Edit();
	}

	@Then("^Click on submit Button to update task$")
	public void click_on_submit_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  taskedit.submit(); 
	}
	
//TC 06 TaskManagement Delete
	
	@Given("^Click first task from tasks list$")
	public void click_any_task_from_tasks_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskdelete.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		taskdelete.selectTask();
		taskdelete.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));
	}

	@When("^Click delete button to delete the task$")
	public void click_delete_button_to_delete_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskdelete.delete();
	}
	
//TC 07 Searching Deleted deatils is there are not
	
	@Given("^Fill the deleted task details in Search box$")
	public void fill_the_deleted_details_in_Search_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		deletesearch.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		deletesearch.searchData();
	}

	@When("^Click the search button$")
	public void click_the_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		deletesearch.submit();
	}

	@Then("^Print the search result in the console$")
	public void print_the_search_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		deletesearch.print();
	}
	
//TC 08 Search the Codecharge project
	
	@Given("^Search as Codecharge in Project$")
	public void click_dropdown_box_in_project_from_search_and_select_codecharge() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchproject.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		searchproject.searchProject();
	}

	@Then("^click on the search button get the search result$")
	public void click_on_the_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchproject.submit();  
	}
	
//TC 09 get the employee deatils
	
	@Given("^Clicking Adminstration$")
	public void clicking_Adminstration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		employee.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		employee.adminstration();
		employee.loginDetails(taskexel.Task_Management_username(1),taskexel.Task_Management_password(1));
	}

	@Then("^Click on employee details$")
	public void click_on_employee_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		employee.employe();
	}

	@Then("^Print the anyone Employee name and email in the console$")
	public void print_the_anyone_Employees_list_in_the_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		employee.printEmp();
	}
	
//TC 10 AddEmployee sceanrio methods
	
	@Given("^the user click on administartion and login is proceeded$")
	public void the_user_click_on_Administartion_and_Login_is_proceeded() throws Throwable {
		addempl.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		addempl.administartion();
	}

	@When("^the user click on employee field$")
	public void the_user_click_on_Employee_field() throws Throwable {
		addempl.employee();
	   
	}

	@Then("^the user click on add employee field and enter the credentials$")
	public void the_user_click_on_Add_Employee_field_and_enter_the_credentials() throws Throwable {
		addempl.employeeDetails();
	}

	@And("^click on add button$")
	public void click_on_Add_button() throws Throwable {
		addempl.add();
	}
	
//TC 11 Check employee login
	
	@Given("^the user click on Administration tab$")
	public void the_user_click_on_Administration_tab() throws Throwable {
		employeelogin.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		employeelogin.administration();
	    
	}

	@Then("^the user enters login credentials and clicks login$")
	public void the_user_enters_login_credentials_and_clicks_login() throws Throwable {
		employeelogin.loginCheck();
	    
	}
	
//TC 12 add Hold type in task
	
	@Given("^the user click  Administration tab and do valid login$")
	public void the_user_click_Administration_tab_and_do_valid_login()  
	{
		tasktype.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		tasktype.administration();
	}

	@Then("^the user click on Types field and clicks Add New Type$")
	public void the_user_click_on_Types_field_and_clicks_Add_New_Type() {
		tasktype.type();
	    
	}

	@Then("^the user enters Type Name and submit$")
	public void the_user_enters_Type_Name() throws InterruptedException  {
		tasktype.addType();
	    
	}
	
//TC 13 Search Closed Status
	
	@Given("the user enter the home page and select the status")
	public void the_user_enter_the_home_page_and_select_the_status ()
	{
	taskclosed.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}
	@Then("^the status field is inspected and search button is clicked$")
	public void the_status_field_is_inspected_and_search_button_is_clicked() throws Throwable {
		taskclosed.search_table();
	}

//TC 14 Print the priority high task table

	@Given("^Priority field is inspected and search button should be clicked$")
	public void priority_field_is_inspected_and_search_button_should_be_clicked()  
	{
	priority.browserLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	priority.priority();   
	}

	@And("^Print the priority high Task table in the console$")
	public void print_Task_table() throws InterruptedException  
	{
	priority.print();   
}	
}
