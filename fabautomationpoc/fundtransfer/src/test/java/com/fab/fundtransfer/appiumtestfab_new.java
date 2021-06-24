package com.fab.fundtransfer;


import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;

public class appiumtestfab_new {

	public static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openApp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void openApp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("noReset", "true");
		// cap.setCapability("fullReset","false");
		cap.setCapability("deviceName", "SamsungS9Plus");
		cap.setCapability("udid", "231427221c027ece");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		// cap.setCapability(�autoGrantPermissions�,true);
		// cap.setCapability("autoAcceptAlerts",true);

		cap.setCapability("appPackage", "com.fab.personalbankingSIT");
		// cap.setCapability("appActivity",
		// "com.fab.personalbanking.login.views.LoginHomeActivity");
		// cap.setCapability("appActivity",
		// "com.fab.personalbanking.login.views.LoginHomeActivity");
		cap.setCapability("appActivity", "com.fab.personalbanking.SplashActivity"); // working

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, cap);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		System.out.println("Execution Started");
		Thread.sleep(3000);
		try {
			if (driver.findElementByXPath("//*[@text='Remind me later']").isEnabled())

			{
				driver.findElementByXPath("//*[@text='Remind me later']").click();
			}
		} catch (Exception e) {
			System.out.println("Update the app soon....");
		}
		driver.findElementByXPath("//*[@text='Login']").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Cancel']")));
		driver.findElementByXPath("//*[@text='Cancel']").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
		driver.findElementByClassName("android.widget.EditText").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
		driver.findElementByClassName("android.widget.EditText").sendKeys("123456");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Between My Accounts']")));
		driver.findElementByXPath("//*[@text='Between My Accounts']").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Select Account or Credit Card']")));
		driver.findElementByXPath("//*[@text='Select Account or Credit Card']").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='1234 5679 7496 5496 0']")));
		driver.findElementByXPath("//*[@text='1234 5679 7496 5496 0']").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='TRANSFER TO:']")));
		driver.findElementByXPath("//*[@text='TRANSFER TO:']").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='1234 5679 7121 2121 8778 70']")));
		driver.findElementByXPath("//*[@text='1234 5679 7121 2121 8778 70']").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
		driver.findElementByClassName("android.widget.EditText").sendKeys("101");
		Thread.sleep(2000);
		driver.findElementById("com.fab.personalbankingSIT:id/enable_recurring_transfer").click();
		Thread.sleep(2000);
		//driver.findElementById("(//*[@resource-id='android:id/text1'])[1]").click();
		List<MobileElement> list =driver.findElementsByXPath("//*[@text='Select']");
		System.out.println(list.size());
		list.get(0).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@text='ONETIME']").click();
		list.get(1).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@text='1']").click();
//	 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"Continue\"))")).click();     
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Continue\").instance(0))"))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Transfer Now']")));
		driver.findElementByXPath("//*[@text='Transfer Now']").click();
		//Thread.sleep(2000);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.fab.personalbankingSIT:id/alert_title")));
		String alert_title =driver.findElementById("com.fab.personalbankingSIT:id/alert_title").getAttribute("text");
		System.out.println("Alert_Title :: " +alert_title);
		String transaction_number= driver.findElementById("com.fab.personalbankingSIT:id/transactionNumber").getAttribute("text");
		System.out.println("Transaction Details :: "+ transaction_number);
		driver.findElementByXPath("//*[@text='Back To Home']").click();	
		System.out.println("Transaction completed sucessfully");
		
		
		
		
		
		
	 
	

	
		
		
	}
	

}
