package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.j2objc.annotations.Weak;

public class BaseClass {

	
	public WebDriver driver;
	Actions action;
	String res;	
	Select select;
	
	//1.Browserlaunch
	
	public void BrowserLaunch() {
		driver=new ChromeDriver();
	}
	
	//2.loadurl
	
	public void Enterurl(String url) {
		
		driver.get(url);
	}
	
	//3.maximize the window
	
	public void maximizewindow() {
		
		driver.manage().window().maximize();
	}
	
	//enter email address
	
public void InsertTxt(WebElement element,String value) {
	
	VisibilityOf(element);
		if (isEnabled(element) && isDisplayed(element)) {
			element.sendKeys(value);
		}
 		}	
		
	
	public void InsertKeys(WebElement element, String value) {
		
		VisibilityOf(element);
		if (isEnabled(element) && isDisplayed(element)) {
			element.sendKeys(value, Keys.ENTER);	
	}
	}
		//4.click
		
		public void click(WebElement element) {
			
			element.click();
		}
		//sendkeys js
		
		public void sendkeysjs(WebElement element, String data) {
			
			VisibilityOf(element);
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0], setAttribute('value','"+data +"')",element);
			
			
		}
		

	//5.click ok in Alert
		
	public void clickalert(WebElement element) {
		
		Alert alertelement1 = driver.switchTo().alert();
	}
	
	//6.Cancel in Alert
	
	public void cancelalert(WebElement element) {
		
		Alert alertelement2 = driver.switchTo().alert();
	}
	
	//7.Get Text from Webpage
	
	
	public String gettextfrompage(WebElement element) {
		
		String text = element.getText();
		return text;
	}
	//8.Get inserted value from Text
	
	public String inserttext(WebElement element) {
		
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	//9.close all windows
	
	public void closeAll() {
		
		driver.quit();
		
	}
	//10.close current window
	
	public void currentwindowclose() {
		
		driver.close();
	}
	//11.get the title
	
	public String getTitle() {
		
		String title = driver.getTitle();
		return title;
		
	}
	//12.Get the Entered url
	
	public String EnterUrl(String url) {
		String currenturl = driver.getCurrentUrl();
		return currenturl;
	}
	//13.DropDown
	
	public void Selectdrop(WebElement element, String text) {
		
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	//14.Dropdown By attribute value
	
	public void selectvalue(WebElement element, String text) {
		
		Select select=new Select(element);
		select.selectByValue(text);
		
		
	}
	//15.Dropdown by indexposition
	
	public void selectindex(WebElement element, int index) {
		
		Select select=new Select(element);
		select.selectByIndex(index);
		
	}
		//16.Insert text using js
		
		public void Textusingjs(String txtvalue,WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//VisibilityOf(element);
			//if (isEnabled(element) && isDisplayed(element)) {
				//js.executeScript("arguments[0].SetAttribute('value','"+txtvalue+"')",element);
			}

		//17. Click Button using Java Script
		public void elementClickJs(WebElement element) {
			VisibilityOf(element);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
		}
		
		//17a.scroldddown using js
		public void Scrolldown(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
	
			js.executeScript("arguments[0].scrollIntoView(false)",element);
}

		
		//18.launch chrome
		
		public void Browserlaunch() {
			driver=new ChromeDriver();
			
		}
		//19.Switch to child window
		
		public Set<String> GetAllID(String parent) {
			Set<String> allwindows = driver.getWindowHandles();
			for (String Currentwindow : allwindows) {
				if(!Currentwindow.equals(parent)) 
					driver.switchTo().window(Currentwindow);
			}
			return allwindows;
		}


		//	20.Switch frame by index
		public void SwitchIndex(int index) {
			driver.switchTo().frame(index);
		}
		
		public void switchtoFrame(WebElement element) {
			
			driver.switchTo().frame(element);
		}
		
		
    //21.Switch frame by id
		public void FrameswitchbyId(WebElement element) {
			
			driver.switchTo().frame(element);
		}

		//22.Find locator By id
		
		//public WebElement LocatorId(String value) {
			//WebElement element = driver.findElement(By.id(value));
			//return element;
		//}	
		
		
		public WebElement LocatorId(String value) {
WebElement element = driver.findElement(By.id(value));
return element;


		}
	//23.Find Locator by name
			
			public WebElement LocatorName(String value) {
				WebElement element = driver.findElement(By.name(value));
				return element;
			}

			
			//24.Find LOcator by Classname
			
			public WebElement Locatorclass(String value) {
				
				WebElement element = driver.findElement(By.className(value));
				return element;
			
			}
			//25.Find locator by Xpath
				
				public WebElement LocatorXpath(String xpath) {
					
					WebElement element = driver.findElement(By.xpath(xpath));
					
					return element;
				}
				
				
//				26.Find LOcator by Css
				public WebElement LocatorCss(String value) {
					WebElement element = driver.findElement(By.cssSelector(value));
					return element;
				}	
				
				
				public List<String> dropdownGetAllOptions(WebElement element) {
					Select select = new Select(element);
					List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
					List<String> allOPtionsText = new ArrayList<>();
					for (WebElement webElement : allSelectedOptions) {
						String text = webElement.getText();
						allOPtionsText.add(text);

					}
					return allOPtionsText;
				}
				
//				28.Get First Selected Option from Dropdown
				public WebElement SelectFirstOption() {
					WebElement firstSelectedOption = select.getFirstSelectedOption();
					return firstSelectedOption;
				}
				

				//	29.Verify Dropdown is Multiple
				public boolean IsMultiple() {
					boolean multiple = select.isMultiple();
					return multiple;
				}
				
				
				
//				30.Deselect By index 
				public void DeselectByIndex(int index) {
					select.deselectByIndex(index);
				}


				//	31.Deselect By Value 
				public void DeselectByValue(String attribute) {
					select.deselectByValue(attribute);
				}


				//	32.Deselect By Visible Text 
				public void DeselectByText(String attribute) {
					select.deselectByVisibleText(attribute);
				}


				//	33.Deselect All 
				public void DeselectAll() {
					select.deselectAll();
				}


				//34.Implicit wait
				public void ImplicityWait(int seconds) {
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
				}


				//35.Explicit wait
				//	public void VisibilityOf(int seconds,WebElement element) {
				//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
				//		wait.until(ExpectedConditions.visibilityOf(element));
				//	}
				public void VisibilityOf(WebElement element) {
					WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
					wait.until(ExpectedConditions.visibilityOf(element));
				}


				//	36.Fluent WAIT
				//public void FluentWaitwait(int sec,int milli) {
					//Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofMillis(milli)).ignoring(Exception.class);
				//}


				//37.Get the Parent window
				public String GetParent() {
					String windowHandle = driver.getWindowHandle();
					return windowHandle;
				}


				//38.Get All window
				public Set<String> GetAll() {
					Set<String> windowHandles = driver.getWindowHandles();
					return windowHandles;
				}


				//	39.Clear Text box
				public void Clear(WebElement element) {
					VisibilityOf(element);
					if (isDisplayed(element)) {
						element.clear();
					}
				}


				//	40.Take ScreenShot
				public void TakeSS(String filelocation) throws IOException {

					TakesScreenshot ts = (TakesScreenshot) driver;
					File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
					File dest= new File(filelocation);
					FileUtils.copyFile(screenshotAs, dest);


				}
				//	41.TakeScreenshot for 
				public void TakeSS(WebElement element,String filelocation) throws IOException {
					TakesScreenshot ts = (TakesScreenshot) driver;
					VisibilityOf(element);
					if (isDisplayed(element)) {
						File screenshotAs = element.getScreenshotAs(OutputType.FILE);
						File dest= new File(filelocation);
						FileUtils.copyFile(screenshotAs, dest);
					}
				}


				//		42.Mouseover to single element
				public void MouseOver(Actions action,WebElement element) {
					VisibilityOf(element);
					if (isDisplayed(element)) {
						action.moveToElement(element).perform();

					}
				}


				//		43.Drag and Drop
				public void DragAndDrop(WebElement src,WebElement dest) {
					action.dragAndDrop(src,dest).perform();
				}


				//		44.RightClick
				public void RightClick() {
					action.contextClick().perform();
				}


				//		45.DoubleClick
				public void DoubleClick() {
					action.doubleClick().perform();
				}


				//		46.Refresh 
				public void Refresh() {
					driver.navigate().refresh();
				}


				//		47.Verify is displayed?
				public boolean isDisplayed(WebElement element) {
					boolean displayed = element.isDisplayed();
					return displayed;
				}


				//		48.Verify is 	Enabled?
				public boolean isEnabled(WebElement element) {
					boolean enabled = element.isEnabled();
					return enabled;
				}
				
				
				
				//STRING TO INT CONVERSION
				
				
				public int parseInt(String value) {
					
					int parseInt = Integer.parseInt(value);
					return parseInt;
					
				}


				//		49.Verify is Selected?
				public boolean isSelected(WebElement element) {
					boolean selected = element.isSelected();
					return selected;
				}


				//		50.Insert Value in Text Boxand Enter
				public void SendKeysEnter(WebElement element,String value) {
					VisibilityOf(element);

					if (isEnabled(element) && isDisplayed(element)) {
						element.sendKeys(value,Keys.ENTER);
					}


				}
//				
//				public List<WebElement> findElements(String xpath) {
//					List<WebElement> elements = driver.findElements(By.xpath(xpath));
////					for (WebElement webElement : elements) {
////						
////					}
//					return elements;
//					
//
//				}
//						
				
				
			public List<String> findElementsByXpathList(String path){					
					List<WebElement>allList=findElement(path);
					List<String>allListvalues=new ArrayList<>();
					for (WebElement a:allList) {
						String text=a.getText();
						allListvalues.add(text);
					}
					return allListvalues;
				}
				
				
				
private List<WebElement> findElement(String path) {
	// TODO Auto-generated method stub
	return null;
}

//				GET CELL DATA
			public String getCelldata(String sheetname,int rownumber,int cellnumber) throws IOException {
					File File = new File("C:\\HotelBookingnew\\target\\excel file\\hotelbookingtask.xlsx");
					FileInputStream stream = new FileInputStream(File);

					Workbook wbk = new XSSFWorkbook(stream);
					
					Sheet sheet = wbk.getSheet(sheetname);
					Row row = sheet.getRow(rownumber);
					Cell cell = row.getCell(cellnumber);


					CellType type = cell.getCellType();

					switch (type) {
					case STRING:
						res = cell.getStringCellValue();
						break;
					case NUMERIC:
						double numericCellValue = cell.getNumericCellValue();
						if (DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();

							SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
							res = dateformat.format(dateCellValue);

						} else {
							long round = Math.round(numericCellValue);
							if(round==numericCellValue) {
								res = String.valueOf(round);
							}else {
								res = String.valueOf(numericCellValue);
							}
						}
						break;
					default:
						break;

					}
					return res;
				}
				
								//	CREATE NEW CELL
				public String CreateCell(String sheetname,int rownumber,int cellnumber,String data) throws IOException {
					File File = new File("C:\\HotelBookingnew\\target\\excel file\\hotelbookingtask.xlsx");
					FileInputStream stream = new FileInputStream(File);

					Workbook workbook = new XSSFWorkbook(stream);

					Sheet sheet = workbook.getSheet(sheetname);
					Row row = sheet.createRow(rownumber);
					Cell cell = row.createCell(cellnumber);
					//		if(cell!=null) {
					cell.setCellValue(data);
					//		}
					FileOutputStream fileoutputstream = new FileOutputStream(File);
					workbook.write(fileoutputstream);
					return data;
				}

				//	UPDATE CELL DATA

				public String UpdateCell(String sheetname,int rownumber,int cellnumber,String olddata,String newdata) throws IOException {
					File file = new File("C:\\HotelBookingnew\\target\\excel file\\hotelbookingtask.xlsx");
					FileInputStream stream = new FileInputStream(file);

					Workbook workbook = new XSSFWorkbook(stream);

					Sheet sheet = workbook.getSheet(sheetname);
					Row row = sheet.getRow(rownumber);
					Cell cell = row.getCell(cellnumber);
					res = cell.getStringCellValue();

					if(res==olddata) {
						cell.setCellValue(newdata);
						FileOutputStream fileoutputstream = new FileOutputStream(file);
						workbook.write(fileoutputstream);
						
					}
					return newdata;
					
				}

}
		

	
