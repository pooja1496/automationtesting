package btes.automationDemo;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GlobalSQA.automationDemo.AlertPage;
import GlobalSQA.automationDemo.AlertsWindow;
import GlobalSQA.automationDemo.DemoSite;
import GlobalSQA.automationDemo.EnrollForm;
import GlobalSQA.automationDemo.HomePage;
import GlobalSQA.automationDemo.ToolsQA;


public class MyTest {
		@Test
		public  void mainmethod()throws InterruptedException {
	    HomePage homepage=new HomePage();
		homepage.openURL("https://demoqa.com/").clickbtn();
		Thread.sleep(2000);
		ToolsQA tools= new ToolsQA();
		//tools.clicktutorials();
		tools.clickreg();
		EnrollForm enroll=new EnrollForm();
		enroll.firstname("").lastname("").email("").Mobile("").City("").Message("").Country("").Code("").clickdemosite();
		DemoSite demosite= new DemoSite ();
		demosite.Scroll();
		demosite.Alert();
		AlertsWindow alertwindow = new AlertsWindow();
		alertwindow.clickalert();
		AlertPage alertpage = new AlertPage();
		alertpage.clickme();
		
		
		
		
		}
	}
	


