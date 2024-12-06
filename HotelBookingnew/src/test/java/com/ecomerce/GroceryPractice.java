package com.ecomerce;

import org.openqa.selenium.WebElement;
import org.testng.reporters.jq.Main;

import com.base.BaseClass;

public class GroceryPractice extends BaseClass {

	public void searchproduct() {

		Browserlaunch();
		maximizewindow();
		ImplicityWait(2000);
		Enterurl("https://www.omrbranch.com/");

		WebElement username = LocatorId("email");
		InsertTxt(username, "sathyaramesh2601@gmail.com");

		WebElement password = LocatorId("pass");
		InsertTxt(password, "Sathya@123");
		
		WebElement loginbtn = LocatorXpath("//button[text()='Login']");
		click(loginbtn);

		WebElement groceryclick = LocatorXpath("//h3[text()='Grocery']");
		click(groceryclick);
		
		
		WebElement add1 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[1]");
		click(add1);
		
		WebElement subadd1 = LocatorXpath("//button[@id='cart-53']");
		click(subadd1);
		
		WebElement close = LocatorXpath("//img[@src='https://www.omrbranch.com/front/images/cross.png']");
		click(close);
		
		WebElement add2 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[2]");
		click(add2);
		
		WebElement subadd2 = LocatorXpath("//button[@id='cart-50']");
		click(subadd2);
		
		WebElement close2 = LocatorXpath("//img[@src='https://www.omrbranch.com/front/images/cross.png']");
		click(close2);
		
		WebElement add3 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[3]");
		click(add3);
		
		
		
		WebElement add4 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[4");
		click(add4);
		
		WebElement add5 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[5");
		click(add5);
		
		WebElement add6 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[6]");
		click(add6);
		
		WebElement add7 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[7]");
		click(add7);
		
		WebElement add8 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[8]");
		click(add8);
		
		WebElement add9 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[9]");
		click(add9);
		
		WebElement add10 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[10]");
		click(add10);
		
		WebElement add11 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[11]");
		click(add11);
		
		WebElement add12 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[12]");
		click(add12);
		
		WebElement add13 = LocatorXpath("(//a[@onclick='fetchProductVariants(this)'])[13]");
		click(add13);
		
		
	}
public static void main(String[] args) {
	
	GroceryPractice gp=new GroceryPractice();
	gp.searchproduct();
}
}
