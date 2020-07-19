package com.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Protractor_Demo_Pages.CalculatorPage;

public class CalculatorTest 
{
	CalculatorPage calPage;
	@BeforeTest
	public void setup() 
	{
		calPage = new CalculatorPage();
		
	}
	
	@Test(priority=1)
	public void sumTest()
	{
		String result = calPage.doSum("20", "30");
		Assert.assertEquals(result, "50");
	}
	
	@Test(priority=2)
	public void subTest()
	{
		String result = calPage.doSub("100", "60");
		Assert.assertEquals(result, "40");
	}
	
	@Test(priority=3)
	public void divisionTest()
	{
		String result = calPage.doDivision("60", "2");
		Assert.assertEquals(result, "30");
	}
	
	@Test(priority=4)
	public void productTest()
	{
		String result = calPage.doProduct("5", "4");
		Assert.assertEquals(result, "20");
	}
	
	@Test(priority=5)
	public void modeTest()
	{
		String result = calPage.doMode("40", "7");
		Assert.assertEquals(result, "5");
	}
	
	@AfterMethod
	public void tearDown()
	{
		CalculatorPage.driver.close();
	}


}
