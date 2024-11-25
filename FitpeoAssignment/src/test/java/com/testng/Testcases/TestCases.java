package com.testng.Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testng.Base.BaseClass;

public class TestCases {
	
	BaseClass base = new BaseClass();
	@BeforeTest
	public void launchBrowser()
	{
		base.launchChromeBrowser();
	}
	@Test(priority = 0)
	public void search() throws InterruptedException
	{
		base.searchAndAccessApp();
	}
	@Test(priority = 1)
	public void validateCheckbox() throws InterruptedException
	{
		base.validateCheckbox();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
		public void validateValue() throws InterruptedException
		{
		base.validateValue();
		Thread.sleep(2000);

	}
	@AfterTest
	public void closeBrowser()
	{
		base.closeBrowser();
	}
}
