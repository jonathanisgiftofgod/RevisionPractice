package finalPackage;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjectClass.LoginPage;

public class ExecutionClass extends BaseClass {
	@BeforeClass
	public void BrowserLaunch() {
		launchUrl("http://adactinhotelapp.com/");
	}
	@BeforeTest
	public void startTime() {
		Date d = new Date();
		System.out.println("Start Time : " + d);
	}
	@Test
	public void userDetails() throws IOException {
		LoginPage l = new LoginPage();
		enterText(l.getUserName(), readExcel("Sheet1", 0, 0));
		enterText(l.getPassword(), readExcel("Sheet1", 1, 0));
		btnClick(l.getLogin());
		selectByValue(l.getLocation(), readExcel("Sheet2", 0, 0));
		enterText(l.getHotel(), readExcel("Sheet2", 1, 0));
		selectByValue(l.getRoomType(), readExcel("Sheet2", 2, 0));
		enterText(l.getRoomNo(), readExcel("Sheet2", 3, 0));
		btnClear(l.getDateIn());
		enterText(l.getDateIn(), readExcel("Sheet2", 4, 0));
		btnClear(l.getDateOut());
		enterText(l.getDateOut(), readExcel("Sheet2", 5, 0));
		enterText(l.getAdult(), readExcel("Sheet2", 6, 0));
		enterText(l.getChild(), readExcel("Sheet2", 7, 0));
		btnClick(l.getSubmit());
		btnClick(l.getRadio());
		btnClick(l.getContinues());
		enterText(l.getFirstName(), readExcel("Sheet3", 0, 0));
		enterText(l.getLastName(), readExcel("Sheet3", 1, 0));
		enterText(l.getAddress(), readExcel("Sheet3", 2, 0));
		enterText(l.getCardNumber(), readExcel("Sheet3", 3, 0));
		enterText(l.getCardType(), readExcel("Sheet3", 4, 0));
		enterText(l.getMonth(), readExcel("Sheet3", 5, 0));
		enterText(l.getYear(), readExcel("Sheet3", 6, 0));
		enterText(l.getCvv(), readExcel("Sheet3", 7, 0));
		btnClick(l.getBook());
	}
	@AfterTest
	public void endTime() {
		Date d = new Date();
		System.out.println("End Time : " + d);
	}
	@AfterClass
	public void verifyMethod() throws InterruptedException {
		System.out.println("God is with you Britto, Surely you will get the success. All the Best");
	}
}
