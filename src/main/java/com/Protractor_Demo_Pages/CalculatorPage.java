package com.Protractor_Demo_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorPage 
{
	public static WebDriver driver;
	NgWebDriver ngWebDriver;
	JavascriptExecutor jsDriver;
	ByAngularModel first = ByAngular.model("first");
	ByAngularModel second = ByAngular.model("second");
	ByAngularModel operator = ByAngular.model("operator");
	ByAngularButtonText go =ByAngular.buttonText("Go!");
	
	By result = By.tagName("h2");
	
	public CalculatorPage()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		jsDriver = (JavascriptExecutor)driver;
		ngWebDriver = new NgWebDriver(jsDriver);
		driver.get("http://localhost:3456");
		ngWebDriver.waitForAngularRequestsToFinish();
		
	}
	public String doSum(String value1, String value2)
	{
		driver.findElement(first).clear();
		driver.findElement(first).sendKeys(value1);
		
		driver.findElement(second).clear();
		driver.findElement(second).sendKeys(value2);
		
		driver.findElement(operator).sendKeys("+");
		
		driver.findElement(go).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		System.out.println(driver.findElement(result).getText());
		return driver.findElement(result).getText();
	}
	
	public String doSub(String value1, String value2)
	{
		driver.findElement(first).clear();
		driver.findElement(first).sendKeys(value1);
		
		driver.findElement(second).clear();
		driver.findElement(second).sendKeys(value2);
		
		driver.findElement(operator).sendKeys("-");
		
		driver.findElement(go).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		System.out.println(driver.findElement(result).getText());
		return driver.findElement(result).getText();
	}
	
	public String doDivision(String value1, String value2)
	{
		driver.findElement(first).clear();
		driver.findElement(first).sendKeys(value1);
		
		driver.findElement(second).clear();
		driver.findElement(second).sendKeys(value2);
		
		driver.findElement(operator).sendKeys("/");
		
		driver.findElement(go).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		System.out.println(driver.findElement(result).getText());
		return driver.findElement(result).getText();
	}
	
	public String doProduct(String value1, String value2)
	{
		driver.findElement(first).clear();
		driver.findElement(first).sendKeys(value1);
		
		driver.findElement(second).clear();
		driver.findElement(second).sendKeys(value2);
		
		driver.findElement(operator).sendKeys("*");
		
		driver.findElement(go).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		System.out.println(driver.findElement(result).getText());
		return driver.findElement(result).getText();
	}
	
	public String doMode(String value1, String value2)
	{
		driver.findElement(first).clear();
		driver.findElement(first).sendKeys(value1);
		
		driver.findElement(second).clear();
		driver.findElement(second).sendKeys(value2);
		
		driver.findElement(operator).sendKeys("%");
		
		driver.findElement(go).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		System.out.println(driver.findElement(result).getText());
		return driver.findElement(result).getText();
	}
	
	

}
