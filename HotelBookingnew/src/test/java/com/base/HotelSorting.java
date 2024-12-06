package com.base;

import java.awt.AWTException;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import jdk.javadoc.internal.doclets.toolkit.taglets.snippet.Replace;

public class HotelSorting extends BaseClass{

	
	public void sorting() throws IOException, InterruptedException {
		
		BrowserLaunch();
		maximizewindow();
		EnterUrl("https://www.omrbranch.com/");
		
		
		
		WebElement username = LocatorId("email");
		InsertTxt(username, getCelldata("Sheet1", 1, 0));
		
		WebElement password = LocatorId("pass");
		InsertTxt(password, getCelldata("Sheet1", 1, 1));
		
		WebElement loginbtn = LocatorXpath("//button[@value='login']");
		(loginbtn).click();
		
		
		WebElement stateselect = LocatorXpath("//select[@id='state']");
		
		selectvalue(stateselect, "Kerala");
		
		
		WebElement cityselect = LocatorXpath("//span[@id='select2-city-container']");
		
		selectvalue(cityselect, "kochi");
		
		WebElement roomtype = LocatorXpath("//textarea[@type='search']");
		
		selectvalue(roomtype, "Deluxe");
		
		
		WebElement cehcekin = LocatorXpath("//input[@name='check_in']");
		click(cehcekin);
		
		
		WebElement selectDate = LocatorXpath("(//td[@data-handler='selectDay']//child::a)[2]");
		click(selectDate);
		
		WebElement checkoutDatePicker = LocatorXpath("//input[@name='check_out']");
		click(checkoutDatePicker);
		
		WebElement checkoutselectDate = LocatorXpath("(//td[@data-handler='selectDay']//child::a)[2]");
		click(checkoutselectDate);
		
		WebElement selectNoOfRoom = LocatorXpath("//select[@id='no_rooms']");
		Selectdrop(selectNoOfRoom, "1-One");
		
		WebElement selectNoOfAdult = LocatorXpath("//select[@id='no_adults']");
		Selectdrop(selectNoOfAdult, "2-Two");
		

		WebElement txtNoOfChild = LocatorId("no_child");
		SendKeysEnter(txtNoOfChild, "1");
		
		Thread.sleep(500);
		WebElement frameSearchButton = LocatorXpath("//iframe[@class='iframe']");
		FrameswitchbyId(frameSearchButton);
		
		WebElement btnSearch = LocatorXpath("//button[text()='Search']");
		click(btnSearch);
		
		WebElement lowtohigh = LocatorXpath("//label[text()='Price low to high']");
		click(lowtohigh);
		
		List<String>asList=Arrays.asList("$ 20,178","$ 19,116","$ 18,054","$ 16,992","$ 15,930","$ 18,054","$ 16,992","$ 15,930","$ 14,868","$ 13,806","$ 19,116","$ 18,054","$ 16,992","$ 15,930","$ 14,868");
		
		
		System.out.println("asList");
		for(String i:asList) {
			String removingdoller = i.replace("$", " ");
			String doublequotes = removingdoller.replace(" ", "");
			System.out.println(doublequotes);
			
			int parseint=parseInt(doublequotes);
			System.out.println(parseint);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		

public static void main(String[] args) throws IOException, InterruptedException {
	HotelSorting hs=new HotelSorting();
	hs.sorting();
	
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

