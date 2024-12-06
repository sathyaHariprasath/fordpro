package com.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.reporters.jq.Main;

public class HotelBooking extends BaseClass {
	
	public void createid() throws IOException, InterruptedException {
		
		BrowserLaunch();
		maximizewindow();
		ImplicityWait(60);
		ImplicityWait(60);
		Enterurl("https://www.omrbranch.com/");
		
			
		
		WebElement username = LocatorId("email");
	InsertTxt(username,getCelldata("Sheet1", 1,0));
	//InsertKeys(username, "sathyaramesh2601@gmail.com");
		
	
	
	
		WebElement password = LocatorId("pass");
		InsertTxt(password,getCelldata("Sheet1",1,1));
		//InsertKeys(password, "Sathya@123");
		
		WebElement login = LocatorXpath("//button[@value='login']");
		
		click(login);
		
		Thread.sleep(1000);
		
		
		//WebElement search = LocatorId("searchBtn");
		
				
				
		WebElement framesearch = LocatorXpath("//iframe[@id='hotelsearch_iframe']");
		FrameswitchbyId(framesearch);
		
		WebElement searchbtn = LocatorXpath("//button[@id='searchBtn']");
		click(searchbtn);
		
		driver.switchTo().parentFrame();
	
		WebElement stateerror = LocatorXpath("//div[@id='invalid-state']");
		String errorstate = stateerror.getText();
		System.out.println(errorstate);
		
		WebElement city = LocatorXpath("//div[@id='invalid-city']");
		String cityerror = city.getText();
		System.out.println(cityerror);
		
		
		WebElement checkin = LocatorXpath("//div[@id='invalid-check_in']");
		String checkinerror = checkin.getText();
		System.out.println(checkinerror);
		
		WebElement checkout = LocatorXpath("//div[@id='invalid-check_out']");
		String checkouterror = checkout.getText();
		System.out.println(checkouterror);
		
		WebElement adult = LocatorXpath("//div[@id='invalid-no_adultst']");
		String adulterror = adult.getText();
		System.out.println(adulterror);
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		HotelBooking hb=new HotelBooking();
		
		hb.createid();
	}
	
	
	

}
