package com.taskmanagement.runner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/Taskmanagement.Feature",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport"},
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},

tags= {"@TC_01_Login,@TC_02_Add_Task,@TC_03_Search_Task,@TC_04_Task_Table_Printing,@TC_05_Edit,@TC_06_Delete,@TC_07_Searching_Delete_Task,@TC_08_TaskList_Search,@Tc_09_Employees_list_printing,@TC_10_Add_Employee,@TC_11_Check_Login,@TC_12_Add_Hold_Type,@TC_13_search_closed_status,@TC_14_Print_the_priority_field"},
glue = {"com.taskmanagement.stepdefinition"},
monochrome = true
)
public class TaskMangementRunner  {
//	@AfterClass
//    public static void teardown() {
//        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//        Reporter.setSystemInfo("os", "Mac OSX");
//        Reporter.setTestRunnerOutput("Sample test runner output message");
//
//}
}
	