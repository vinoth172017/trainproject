$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Taskmanagement.Feature");
formatter.feature({
  "line": 2,
  "name": "Task_Management Website",
  "description": "",
  "id": "task-management-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Task_Management"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "Login into Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01_Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The user launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Clicking on administration to nagivate Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The user login using username and password with vaild and invaild deatils",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Clicking on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 7744110500,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.clicking_on_Administration_to_nagivate_Login_Page()"
});
formatter.result({
  "duration": 1929028900,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_login_using_username_and_password()"
});
formatter.result({
  "duration": 26688688700,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_login_Button()"
});
formatter.result({
  "duration": 4421941100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "Add Task in Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TC_02_Add_Task"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Click on AddTask and login",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Enter the task details",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on addbutton to add Task",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_AddTask_and_login()"
});
formatter.result({
  "duration": 4780962900,
  "error_message": "java.lang.NullPointerException\r\n\tat com.taskmanagement.pagesobjects.AddTaskPage.loginDetails(AddTaskPage.java:64)\r\n\tat com.taskmanagement.stepdefinition.TaskMangementStepdefinition.click_AddTask_and_login(TaskMangementStepdefinition.java:83)\r\n\tat ✽.Given Click on AddTask and login(src/main/resources/feature/Taskmanagement.Feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.clicking_on_AddTask_to_nagivate_Add_Task_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_Addbutton_to_add_Task()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "Searching in Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC_03_Search_Task"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Enter correct details to search the added task",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Click on search button to get the details of the task",
  "keyword": "When "
});
formatter.match({
  "location": "TaskMangementStepdefinition.enter_Correct_Details_to_search()"
});
formatter.result({
  "duration": 6512783000,
  "error_message": "java.lang.NullPointerException\r\n\tat com.taskmanagement.pagesobjects.SearchPage.searchDetails(SearchPage.java:52)\r\n\tat com.taskmanagement.stepdefinition.TaskMangementStepdefinition.enter_Correct_Details_to_search(TaskMangementStepdefinition.java:104)\r\n\tat ✽.Given Enter correct details to search the added task(src/main/resources/feature/Taskmanagement.Feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_Search_Button_to_Get_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "Printing Task Table in Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TC_04_Task_Table_Printing"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Open the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "In task web table get the first row in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.Open_the_home_page()"
});
formatter.result({
  "duration": 6729982700,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.print_the_home_page_Task_Table_in_the_console()"
});
