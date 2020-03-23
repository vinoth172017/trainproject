@Task_Management
Feature: Task_Management Website

@TC_01_Login
Scenario:
	Login into Task_Mangement Website
Given The user launch the Chrome application
When Clicking on administration to nagivate Login Page
Then The user login using username and password with vaild and invaild deatils
Then Clicking on login button

@TC_02_Add_Task
Scenario:
	Add Task in Task_Mangement Website
Given user launch the Chrome application
When Click on AddTask and login
Then Enter the task details
And Click on addbutton to add Task

@TC_03_Search_Task
Scenario:
	Searching in Task_Mangement Website
Given The user launch Chrome application
When Enter correct details to search the added task
Then Click on search button to get the details of the task

@TC_04_Task_Table_Printing
Scenario:
	Printing Task Table in Task_Mangement Website
Given user launch Chrome application
When Open the home page
Then In task web table get the first row in the console

@TC_05_Edit
Scenario:
	Add/Edit Task in TaskMangement Website
Given launch the Chrome application
When Click first task from the tasks list
Then Edit name field from Add/Edit task
And Click on submit Button to update task

@TC_06_Delete
Scenario:
	Deleting a Task in TaskMangement Website
Given launch chrome application
When Click first task from tasks list
Then Click delete button to delete the task

@TC_07_Searching_Delete_Task
Scenario:
  Checking Deleted details is show are not in TaskMangement Website
Given The Chrome application launch
When Fill the deleted task details in Search box
Then Click the search button
And Print the search result in the console

@TC_08_TaskList_Search
Scenario:
	Searching Codecharge Project in TaskMangement Website
Given Chrome application launch
When Search as Codecharge in Project
Then click on the search button get the search result

@Tc_09_Employees_list_printing
Scenario:
    Printing anyone employee name and email from employee Deatils in TaskMangement Website
Given chrome application is launched
When Clicking Adminstration
Then Click on employee details
And Print the anyone Employee name and email in the console

@TC_10_Add_Employee
Scenario:
      Add New Employee in Employee list
Given chrome application launched
When the user click on administartion and login is proceeded
Then the user click on employee field
Then the user click on add employee field and enter the credentials
And click on add button

@TC_11_Check_Login
Scenario:
    To check the added employee getting logged in
Given user launched the Chrome application
When the user click on Administration tab
Then the user enters login credentials and clicks login

@TC_12_Add_Hold_Type
 Scenario:
      To add Hold Type
Given The user launched the Chrome application
When the user click  Administration tab and do valid login
Then the user click on Types field and clicks Add New Type
And the user enters Type Name and submit

@TC_13_search_closed_status
Scenario:
   To search closed status 
Given user launched Chrome application
When the user enter the home page and select the status
Then the status field is inspected and search button is clicked

@TC_14_Print_the_priority_field
Scenario:
Given chrome launch
When Priority field is inspected and search button should be clicked
Then Print the priority high Task table in the console

