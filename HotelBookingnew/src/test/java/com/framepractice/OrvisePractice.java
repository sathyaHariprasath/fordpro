package com.framepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrvisePractice {
public static void main(String[] args) {
	
	
WebDriver driver=new ChromeDriver();

driver.get("https://www.orvis.com/");

driver.manage().window().maximize();


	WebElement tripple = driver.findElement(By.xpath("//button[@class='js-nav-drawer-toggler st-global-header__hamburger']"));
	
	tripple.click();
	
	
	WebElement storeloactorbtn = driver.findElement(By.xpath("(//span[@class='c-menu-drawer__secondary-item__link__text'])[1]"));
	
	storeloactorbtn.click();
	
	
	
	
	
	
	
	
	
	
	
}
}
                      