package com.fab.fundtransfer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;

public class appiumtestfab {
	
	public static AppiumDriver<MobileElement>driver;

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
	
	public static void openApp() throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("noReset","true");
       //cap.setCapability("fullReset","false");
		cap.setCapability("deviceName", "SamsungS9Plus");
		cap.setCapability("udid", "231427221c027ece");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
	//	cap.setCapability(“autoGrantPermissions”,true);
	//	cap.setCapability("autoAcceptAlerts",true);
		
	//	cap.setCapability("appPackage", "com.fab.personalbankingSIT");
	//	cap.setCapability("appActivity", "com.fab.personalbanking.login.views.LoginHomeActivity");
		
		cap.setCapability("appPackage", "ae.uaepass.mainapp");
		cap.setCapability("appActivity", "ae.uaepass.mainapp.core.platform.main.MainActivity");
		

		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("Hello");
	//	Activity activity = new Activity("com.google.android.packageinstaller","com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
		System.out.println("Hello....Hiiii");
		System.out.println("Bye");
		Thread.sleep(5000);
		System.out.println("Bye1");
		
	//	WebDriverWait wait = new WebDriverWait(driver,20);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Skip']")));
		driver.findElementById("ae.uaepass.mainapp:id/skipButton").click();
		Thread.sleep(5000);
		driver.findElementById("ae.uaepass.mainapp:id/sign_up").click();
		Thread.sleep(2000);
		driver.findElementById("ae.uaepass.mainapp:id/scanLaterButton").click();
		Thread.sleep(3000);
		driver.findElementById("ae.uaepass.mainapp:id/first_name_edit_view").sendKeys("Deepak");
		//driver.findElementByAccessibilityId("First Name").sendKeys("Deepak");
		//driver.findElementByXPath("//*[text()='First Name']").sendKeys("Deepak");
		Thread.sleep(2000);
		driver.findElementById("last_name_edit_view").sendKeys("Mishra");
		//driver.findElementByXPath("//*[text()='Last Name']").sendKeys("Mishra");
		//driver.findElementByAccessibilityId("Last Name").sendKeys("Mishra");
		Thread.sleep(2000);
		driver.findElementById("enrollmentConfirmButton").click();
		Thread.sleep(2000);
		driver.findElementById("phone_without_code").sendKeys("526350557");
		driver.findElementById("email_view").sendKeys("deepak.applabs@gmail.com");
		driver.findElementById("verify").click();
		driver.findElementById("ae.uaepass.mainapp:id/pin_0").sendKeys("1");
		driver.findElementById("ae.uaepass.mainapp:id/pin_1").sendKeys("2");
		driver.findElementById("ae.uaepass.mainapp:id/pin_2").sendKeys("3");
		driver.findElementById("ae.uaepass.mainapp:id/pin_3").sendKeys("4");
		
		
	}
	

}
