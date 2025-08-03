package com.stepdefinations;

import java.io.IOException;

import com.Baseclass.Library;
import com.Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_Testcase extends Library{
	SearchPage sp;
	@Given("Launch the Flipkart Application")
	public void launch_the_Flipkart_Application() throws IOException {
	    launchapplication();
	}

	@When("Close the popup")
	public void close_the_popup() {
	   System.out.println(driver.getTitle());
	}

	@Then("It should Navigate to the Home page")
	public void it_should_Navigate_to_the_Home_page() {
	    sp=new SearchPage(driver);
	   sp.homescreen();
	}

	@Given("User enter the Text in Search field")
	public void user_enter_the_Text_in_Search_field() {
	   sp.Search("Mobile");
	}

	@When("Click the search button")
	public void click_the_search_button() {
	    sp.ClickSearch();
	}

	@Then("It should navigate to search result page and display the relevant details")
	public void it_should_navigate_to_search_result_page_and_display_the_relevant_details() {
	   sp.Result();
		
	}

	
}
