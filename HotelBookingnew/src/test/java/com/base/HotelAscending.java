package com.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

public class HotelAscending extends BaseClass{
	public void hoteltask() throws IOException, InterruptedException {
		BrowserLaunch();
        maximizewindow();		
	    EnterUrl("https://omrbranch.com/");
	    ImplicityWait(2000);
	    
	     WebElement email = LocatorXpath("//input[@id='email']");
		SendKeysEnter(email, getCelldata("Datas",1,0 ));
		WebElement pass = LocatorXpath("//input[@id='pass']");
		SendKeysEnter(pass, getCelldata("Datas",1,1));
		WebElement login = LocatorXpath("//button[@value='login']");
		click(login);		  
		
		 WebElement welcometext = LocatorXpath("//a[@class='icoTwitter mr-2 dropdown-toggle']");
		String welocome = gettextfrompage(welcometext);
	     System.out.println(welocome);
	    
	      WebElement state = LocatorXpath("//select[@name='state']");      
	      SendKeysEnter(state, getCelldata("Datas",1,2));
	      Thread.sleep(2000);
	      
	      WebElement city = LocatorXpath("//select[@name='city']");
	      selectindex(city,2);
	      Thread.sleep(2000);
	      
	      WebElement room = LocatorXpath("//textarea[contains(@class,'select2-search__field')]");
	      SendKeysEnter(room, getCelldata("Datas",1,4));
	      Thread.sleep(2000);
	      
	      WebElement checkin = LocatorXpath("//input[@class='form-control from hasDatepicker']");
	      SendKeysEnter(checkin,"2024-05-31");
	      Thread.sleep(2000);
	      
	      WebElement checkout = LocatorXpath("//input[@name='check_out']");
	      sendkeysjs(checkout,"2024-06-03");
	      Thread.sleep(2000);
	      
	      WebElement numroom = LocatorXpath("//select[@name='no_rooms']");
	      selectindex(numroom,2);
	      
	      WebElement numadult = LocatorXpath("//select[@name='no_adults']");
	      SendKeysEnter(numadult, getCelldata("Datas",1,8));
	      
	      WebElement numofchild = LocatorXpath("//input[@name='no_child']");
	      SendKeysEnter(numofchild, getCelldata("Datas",1,9));
	      
	      WebElement search = LocatorXpath("//iframe[@id='hotelsearch_iframe']");
	      switchtoFrame(search);
	      WebElement searchclick = LocatorXpath("//button[text()='Search']");
	      elementClickJs(searchclick);
	      Thread.sleep(2000);
	      
	          

	      //Ascendin hotel Name
	      
	      WebElement ascending = LocatorXpath("//label[text()='Name Ascending']");
          elementClickJs(ascending);
	      Thread.sleep(2000);
	      
	      List<String> devassce=findElementsByXpathList("//div[@class='col-md-5 hotel-suites']//h5");
	      System.out.println(devassce);
	      
	      List<String> testascen=new ArrayList<>();
	      testascen.addAll(devassce);
         Collections.sort(testascen);
         System.out.println(testascen);
         Thread.sleep(2000);
          if(testascen.equals(devassce)) {
	     
	      System.out.println("ascending pass");
	      }
	      else {
	      System.out.println("ascending fail");
	      }
	      
          //Reverse of hotel name
          
          WebElement decending = LocatorXpath("//label[text()='Name Descending']");
          elementClickJs(decending);
	      Thread.sleep(2000);
	      
     List<String> devdecen=findElementsByXpathList("//div[@class='col-md-5 hotel-suites']//h5");
    System.out.println(devdecen);
	      
	      List<String> testdecse=new ArrayList<>();
	      testdecse.addAll(testascen);
         Collections.reverse(testdecse);
         System.out.println(testdecse);
         Thread.sleep(2000);
          if(testdecse.equals(devdecen)) {
	     
	      System.out.println("decending pass");
	      }
	      else {
	      System.out.println("decending fail");
	      }
	      
	      
	     //Hotel price low to high 
          
          
	      WebElement lowtohigh = LocatorXpath("//label[text()='Price low to high']");
	      elementClickJs(lowtohigh);
	      Thread.sleep(2000);
	     
	      List<String> devpricelow=findElementsByXpathList("//strong[@class='total-prize']");
	      ArrayList<Integer> testlow=new ArrayList<>();
	      
	      for(String st:devpricelow) {
	    	  String replace=st.replace("$","");
	    	  String trim=replace.replace(",","").trim();
	    	  int ParseInt = Integer.parseInt(trim);
	    	  testlow.add(ParseInt);
        }
	      System.out.println("Developer price low to high");
	      System.out.println(testlow);
	      ArrayList<Integer> qapricelow= new ArrayList<>();
	      qapricelow.addAll(testlow);
	       Collections.sort(qapricelow);
	       System.out.println(qapricelow);
	      if(testlow.equals(qapricelow)) {
	     
	      System.out.println("Hotel LowToHigh pass");
	      }    else {
	      System.out.println("Hotel LowToHigh fail");	   
	      }
	      
      	// Hotel price high to low
	

    WebElement hightolow = LocatorXpath("//label[text()='Price High to low']");
    elementClickJs(hightolow);
    Thread.sleep(2000);
    
    List<String> devpricehigh=findElementsByXpathList("//strong[@class='total-prize']");
    ArrayList<Integer> testhigh=new ArrayList<>();
    
   
    for(String str:devpricehigh) {
  	  String replace=str.replace("$","");
  	  String trim=replace.replace(",","").trim();
  	  int ParseInt1 = Integer.parseInt(trim);
  	testhigh.add(ParseInt1);
  }
    System.out.println("Developer price low to high");
    System.out.println(testhigh);
    ArrayList<Integer> qapricehightolow= new ArrayList<>();
    qapricehightolow.addAll(qapricelow);
     Collections.reverse(qapricehightolow);
     System.out.println(qapricehightolow);
    if(testhigh.equals(qapricehightolow)) {
   
    System.out.println("Hotel HighToLow pass");
    }    else {
    System.out.println("Hotel HighToLow fail");	   
    }
    
  
	
	}	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		HotelAscending ha=new HotelAscending();
		ha.hoteltask();
	}

}
