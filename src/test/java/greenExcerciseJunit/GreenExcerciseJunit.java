package greenExcerciseJunit;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import base.BaseClass;
import pageElements.PageElementsForLogin;
import pageElements.PageForBook;
import pageElements.PageForSearchHotel;
import pageFlipkart.FlipkartPageOfRegister;
public class GreenExcerciseJunit extends BaseClass{
	@BeforeClass
	public static void BrowserLaunch() throws IOException {
		launchUrl("http://adactinhotelapp.com/");
	}
	@Before
	public void sTtime() {
		startTime();
	}
	@After
	public void edTime() {
		endTime();
	}
	@Test
	public void tc1() throws IOException {
		PageElementsForLogin l = new PageElementsForLogin();
		enterText(l.getUser(), readExcel("Sheet1", 0, 0));
		enterText(l.getPass(), readExcel("Sheet1", 1, 0));
		TakesScreenShot("C:\\Users\\Britto\\Desktop\\JAVA\\Green Excersise\\Selenium\\ScreenShot\\FrameWork\\login1.jpeg");
		l.getLogin().click();		
	}
	@Test
	public void tc2() throws IOException, AWTException {
		PageForSearchHotel s = new PageForSearchHotel();
		selectByValue(s.getLocation(), readExcel("Sheet2", 0, 0));
		selectByValue(s.getHotels(), readExcel("Sheet2", 1, 0));
		selectByValue(s.getRoomType(), readExcel("Sheet2", 2, 0));
		selectByValue(s.getNoRoom(), readExcel("Sheet2", 3, 0));
		Clear(s.getDatein());
		enterText(s.getDatein(), readExcel("Sheet2", 4, 0));
		Clear(s.getDateout());
		enterText(s.getDateout(), readExcel("Sheet2", 5, 0));
		selectByValue(s.getAdult(), readExcel("Sheet2", 6, 0));
		selectByValue(s.getChild(), readExcel("Sheet2", 7, 0));
		RobotScreenShot("C:\\Users\\Britto\\Desktop\\JAVA\\Green Excersise\\Selenium\\ScreenShot\\FrameWork\\search1.jpeg");
		Click(s.getSubmit());
		Click(s.getRadio());
		Click(s.getContinue());
	}
	@Test
	public void tc3() throws IOException {
		PageForBook b = new PageForBook();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterText(b.getFirstName(), readExcel("Sheet3", 0, 0));
		enterText(b.getLastName(), readExcel("Sheet3", 1, 0));
		enterText(b.getAddress(), readExcel("Sheet3", 2, 0));
		enterText(b.getCardNumber(), readExcel("Sheet3", 3, 0));
		selectByValue(b.getCardType(), readExcel("Sheet3", 4, 0));
		selectByValue(b.getMonth(), readExcel("Sheet3", 5, 0));
		selectByValue(b.getYear(), readExcel("Sheet3", 6, 0));
		enterText(b.getCvv(), readExcel("Sheet3", 7, 0));
		TakesScreenShot("C:\\Users\\Britto\\Desktop\\JAVA\\Green Excersise\\Selenium\\ScreenShot\\FrameWork\\book1.png");
		Click(b.getBook());
		inputValues("order_no");
		writeExcel(2, 0, inputValues("order_no"));
	}
	@AfterClass
	public static void workOver() {
		System.out.println("All the best");
		
	}
}
