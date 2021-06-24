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
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class appiumtestgooglepay {
	
	public static AndroidDriver<AndroidElement>driver;

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
		
		cap.setCapability("appPackage", "com.google.android.apps.nbu.paisa.user");
	//	cap.setCapability("appActivity", "com.google.android.apps.nbu.paisa.user.applock.ui.AppLockVerificationActivity");
		cap.setCapability("appActivity", "com.google.android.apps.nbu.paisa.user.launcher.LauncherActivity");
		
		
	//	Activity act = new Activity("com.google.android.apps.nbu.paisa.user","com.google.android.apps.nbu.paisa.user.applock.ui.AppLockVerificationActivity");				
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver<AndroidElement>(url, cap);
		System.out.println("Hello");
		System.out.println("Hello....Hiiii");
		System.out.println("Bye");
		Thread.sleep(5000);
		System.out.println("Bye1");
		
	
		
		
		

		
		
	}
	

}
