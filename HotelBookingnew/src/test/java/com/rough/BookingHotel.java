package com.rough;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BookingHotel extends BaseClass1{
	
	public void CreateBookingId() throws IOException, InterruptedException, AWTException {
		

		
		BrowserLaunch();
		Maximizewindow();
		ImplicityWait(60);
		EnterUrl("https://www.omrbranch.com/");
		

		
		WebElement username = LocatorId("email");
		InsertTxt(username,getCelldata("Sheet1", 1, 0));
		//InsertTxtKeys(username, "sathyaramesh2601@gmail.com");
		
		WebElement password = LocatorId("pass");
		InsertTxt(password, getCelldata("Sheet1", 1, 1));
		//InsertTxtKeys(password, "Sathya@123");
		
		
		WebElement loginbtn = LocatorXpath("//button[text()='Login']");
		ClickElement(loginbtn);
		
		Thread.sleep(1000);
		WebElement welcometxt = LocatorCss(".icoTwitter.mr-2.dropdown-toggle");
		String welcome = getText(welcometxt);
		System.out.println("Welcome use Message :" +welcome);
		
		WebElement selectState = LocatorXpath("//select[@id='state']");
		SelectByText(selectState, "Tamil Nadu");

		WebElement selectCity = LocatorXpath("//select[@id='city']");
		SelectByText(selectCity, "Chennai");
		
		WebElement selectRoomType = LocatorXpath("//select[@id='room_type']");
		SelectByText(selectRoomType, "Deluxe");
		
		WebElement checkinDatePicker = LocatorXpath("//input[@name='check_in']");
		ClickElement(checkinDatePicker);
		
		WebElement selectDate = LocatorXpath("(//td[@data-handler='selectDay']//child::a)[2]");
		ClickElement(selectDate);
		
		WebElement checkoutDatePicker = LocatorXpath("//input[@name='check_out']");
		ClickElement(checkoutDatePicker);
		
		WebElement checkoutselectDate = LocatorXpath("(//td[@data-handler='selectDay']//child::a)[2]");
		ClickElement(checkoutselectDate);
		
		WebElement selectNoOfRoom = LocatorXpath("//select[@id='no_rooms']");
		SelectByText(selectNoOfRoom, "1-One");
		
		WebElement selectNoOfAdult = LocatorXpath("//select[@id='no_adults']");
		SelectByText(selectNoOfAdult, "2-Two");
		

		WebElement txtNoOfChild = LocatorId("no_child");
		SendKeysEnter(txtNoOfChild, "1");
		
		Thread.sleep(500);
		WebElement frameSearchButton = LocatorXpath("//iframe[@class='iframe']");
		switchtoFrame(frameSearchButton);
		
		WebElement btnSearch = LocatorXpath("//button[text()='Search']");
		ClickElement(btnSearch);
		
		Thread.sleep(500);
		WebElement txtSelectHotel = LocatorXpath("//h5[text()='Select Hotel']");
		String txt = getText(txtSelectHotel);
		System.out.println("Select Hotel Text :" + txt);
		
		WebElement txtFirstHotel = LocatorXpath("//h5[text()='Hyatt Regency Chennai Deluxe']");
		String txt1 = getText(txtFirstHotel);
		System.out.println("First Hotel Name :" + txt1);
		
		WebElement txtFirstHotelPrice = LocatorXpath("//a[text()='Continue']//preceding-sibling::strong[text()='$ 2,832']");
		String txt2 = getText(txtFirstHotelPrice);
		System.out.println("Hotel Price :" + txt2);
		
		WebElement btnContinue = LocatorXpath("(//a[@class='btn filter_btn'])[1]");
		Scrolldown(btnContinue);
		ClickElement(btnContinue);
		Thread.sleep(500);
		RobotEnter();
		
		//ClickAlert(btnContinue);
		
		
		Thread.sleep(500);
		WebElement txtBookHotel = LocatorXpath("//h2[contains(text(),'Hyatt')]");
		String txt3 = getText(txtBookHotel);
		System.out.println("Booking Hotel Name  :" + txt3);
		
		WebElement srollDown = LocatorXpath("//label[text()='Enter GST Details (Optional)']");
		Scrolldown(srollDown);
		
		WebElement radioBtnMyself = LocatorId("own");
		ClickElement(radioBtnMyself);
		
		WebElement selectSalutation = LocatorXpath("//select[@name='title']");
		SelectByText(selectSalutation, "Ms.");
		
		WebElement txtFirstName = LocatorXpath("//input[@id='first_name']");
		InsertTxt(txtFirstName, getCelldata("Sheet1", 1, 5));
		
		WebElement txtLastName = LocatorXpath("//input[@id='last_name']");
		InsertTxt(txtLastName, getCelldata("Sheet1", 1, 6));
		
		WebElement txtPhoneNo = LocatorXpath("//input[@id='user_phone']");
		InsertTxt(txtPhoneNo, getCelldata("Sheet1", 1, 7));
		
		WebElement txtEmail = LocatorXpath("//input[@id='user_email']");
		InsertTxt(txtEmail, getCelldata("Sheet1", 1, 8));
		
		WebElement radioBtnGst = LocatorXpath("//input[@id='gst']");
		ClickElement(radioBtnGst);

		WebElement txtGstNo = LocatorXpath("//input[@id='gst_registration']");
		InsertTxt(txtGstNo, getCelldata("Sheet1", 1, 9));
		
		WebElement txtCompanyName = LocatorXpath("//input[@id='company_name']");
		InsertTxt(txtCompanyName, getCelldata("Sheet1", 1, 10));
		
		WebElement txtAddress = LocatorXpath("//input[@id='company_address']");
		InsertTxt(txtAddress, getCelldata("Sheet1", 1,11));
		
		Thread.sleep(500);
		WebElement btnNext = LocatorXpath("//button[@type='button'][@id='step1next']");
		Scrolldown(btnNext);
		ClickElement(btnNext);
		
//		WebElement radioBtnEarlyArrival = LocatorId("early");
//		ClickElement(radioBtnEarlyArrival);
//		
//		WebElement txtSpecialRequest = LocatorXpath("//textarea[@name='other_request']");
//		InsertTxt(txtSpecialRequest, getCelldata("Sheet1", 1, 12));
		
//		Thread.sleep(500);
		WebElement btnNext2 = LocatorXpath("//button[@type='button'][@id='step2next']");
//		Scrolldown(btnNext2);
		ClickElement(btnNext2);
		
		WebElement btnCardPayment = LocatorXpath("//div[@class='credit-card pm']");
		ClickElement(btnCardPayment);
		
		WebElement ScrollDownToSubmit = LocatorId("submitBtn");
		Scrolldown(ScrollDownToSubmit);

		WebElement selectPaymentType = LocatorXpath("//select[@id='payment_type']");
		SelectByText(selectPaymentType, "Debit Card");
		
		WebElement selectCardType = LocatorXpath("//select[@id='card_type']");
		SelectByText(selectCardType, "Visa");
		
		WebElement txtCardNumber = LocatorXpath("//input[@name='card_no']");
		SendKeysEnter(txtCardNumber, "5555555555552222");
		
		WebElement txtCardName = LocatorXpath("//input[@name='card_name']");
		SendKeysEnter(txtCardName,"sathya");

		WebElement selectMonth = LocatorXpath("//select[@id='card_month']");
		SelectByText(selectMonth, "July");
		
		WebElement selectYear = LocatorXpath("//select[@id='card_year']");
		SelectByText(selectYear, "2025"); 
		
		WebElement txtCardCvv = LocatorXpath("//input[@id='cvv']");
		InsertTxt(txtCardCvv, getCelldata("Sheet1", 1, 15));
		
		
		WebElement nextstep2 = LocatorXpath("//button[@id='submitBtn']");
		ClickElement(nextstep2);
		
		
		
		
		
		WebElement btnSubmit = LocatorXpath("//button[@class='btn filter_btn']");
		
		ClickElement(btnSubmit);
		
		
		Thread.sleep(1000);
		
		WebElement txtOrderId = LocatorXpath("//strong[starts-with(text(),'#')]");
		String orderId = getText(txtOrderId);
		System.out.println("Booking Order Id :"+ orderId);
		
		WebElement txtConfirmBooking = LocatorXpath("//h2[text()=' Booking is Confirmed ']");
		String BookingConfirm = getText(txtConfirmBooking);
		System.out.println("Booking Confirmation Message  :" + BookingConfirm);
		
		WebElement txtHyatt = LocatorXpath("//strong[text()='Hyatt Regency Chennai']");
		String HotelName = getText(txtHyatt);
		System.out.println("Booked Hotel Name  :" + HotelName);
		
		WebElement btnMyBooking = LocatorXpath("//button[@class='btn filter_btn'][text()='My Booking']");
		ClickElement(btnMyBooking);
		
		WebElement txtBookings = LocatorXpath("//div[@class='col-md-5']//child::h4");
		String txtBookings1 = getText(txtBookings);
		System.out.println("Booking Message  :" + txtBookings1);
		
		
		WebElement txtPrice = LocatorXpath("//p[text()='Total Amount Paid']//following-sibling::strong");
		String txtPrice1 = getText(txtPrice);
		System.out.println("Booked Hotel Price  :" + txtPrice1);
		
		WebElement btnEditBooking = LocatorXpath("//button[@class='edit btn filter_btn']");
		ClickElement(btnEditBooking);
		
		WebElement btnConfirm = LocatorXpath("//button[@class='edit btn filter_btn'][text()='Confirm']");
		Scrolldown(btnConfirm);
		
		WebElement checkinDatePicker1 = LocatorXpath("//input[@name='check_in'][@type='text']");
		ClickElement(checkinDatePicker1);
		
		WebElement updateDate1 = LocatorXpath("//a[@class='ui-state-default'][text()='30']");
		ClickElement(updateDate1);
		
		ClickElement(btnConfirm);
		
		
		WebElement btnCancel = LocatorXpath("//a[@class='cancle btn filter_btn'][text()='Cancel']");
		ClickElement(btnCancel);
		//RobotEnter();
		
		WebElement txtCancelBooking = LocatorXpath("//li[@class='alertMsg'][text()='Your booking cancelled successfully']");
		String txtCancelMsg = getText(txtCancelBooking);
		System.out.println("Cancel Message  :" + txtCancelMsg);
		
		CloseCurrent();
		

	}
		
		

		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			BookingHotel bh = new BookingHotel();
			bh.CreateBookingId();	

		}
		
	}


