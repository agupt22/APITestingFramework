package com.amit.APITesttingFramework.rough;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class TestPaypal {
	
	//static String access_token = 
	
	@Test
	public void getAuthKey() {
		
		RestAssured.baseURI = "https://api.sandbox.paypal.com/";
		
	}

}
