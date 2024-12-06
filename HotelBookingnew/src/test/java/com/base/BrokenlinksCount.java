package com.base;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlinksCount {
	
	public static void main(String []args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com//");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int size = links.size();
		
		System.out.println("links count " +size);
		
//	int count=0;
	
for(int i=0; i<links.size(); i++) {
	
	String attribute = links.get(i).getAttribute("href");
	
	if(!(attribute==null)) {
		
		URL url=new URL(attribute);
		URLConnection openConnection = url.openConnection();
		
		HttpsURLConnection httpsconnection=(HttpsURLConnection)openConnection;
		
		int responseCode = httpsconnection.getResponseCode();
		
		if(responseCode !=200) {
			System.out.println(attribute);
//			count++;
			
			
			
		}
			
		
	}
	
	
	
	
}
//		System.out.println(count);		
		
		
		
	}

}
