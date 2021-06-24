package com.fab.fundtransfer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;

// The startActivity method is provided by an interface StartsActivity implemented by AndroidDriver only

public class appiumtestphonepay {
	
	public static  AppiumDriver mDriver;
	//private static StartsActivity startsActivity;

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
	//	cap.setCapability(�autoGrantPermissions�,true);
	//	cap.setCapability("autoAcceptAlerts",true);
		
	//	cap.setCapability("appPackage", "com.fab.personalbankingSIT");
	//	cap.setCapability("appActivity", "com.fab.personalbanking.login.views.LoginHomeActivity");
		
		cap.setCapability("appPackage", "com.phonepe.app");
	//	cap.setCapability("appActivity", "com.google.android.apps.nbu.paisa.user.applock.ui.AppLockVerificationActivity");
		cap.setCapability("appActivity", "com.phonepe.app.ui.activity.Navigator_MainActivity");
		
		
	//	Activity act = new Activity("com.google.android.apps.nbu.paisa.user","com.google.android.apps.nbu.paisa.user.applock.ui.AppLockVerificationActivity");				
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		mDriver = new AndroidDriver(url, cap);
		
		mDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Hello");
		System.out.println("Hello....Hiiii");
		System.out.println("Bye");
		Thread.sleep(3000);
		System.out.println(mDriver.getContext());
		mDriver.findElementByXPath("//*[@text='Recharge']").click();
		Thread.sleep(3000);
		System.out.println(mDriver.getContext());
		
		
		//StartsActivity startsActivity = new StartsActivity();
	   // Activity activity = new Activity("com.phonepe.app", "com.phonepe.app.v4.nativeapps.rechargeandbillpayment.ui.activity.Navigator_BillProviderActivity"); 
	  //  ((AndroidDriver) mDriver).startActivity(activity);
	    
	 //  startsActivity.startActivity(activity); 
	    mDriver.findElementById("com.phonepe.app:id/tvSearch").click();
	    Thread.sleep(2000);
		mDriver.findElementById("com.phonepe.app:id/et_search_box").sendKeys("8600639104");
		Thread.sleep(3000);
		String x = mDriver.findElementById("com.phonepe.app:id/tv_title").getAttribute("text");
		System.out.println(x);
		String y = mDriver.findElementById("com.phonepe.app:id/tv_title").getAttribute("name");
		
		System.out.println(y);
		//mDriver.startActivity(new Activity("com.phonepe.app", "com.phonepe.app.v4.nativeapps.rechargeandbillpayment.ui.activity.Navigator_BillProviderActivity"));
		//mDriver.startActivity(new Activity("", ""));
		
		//Activity act = new Activity("com.phonepe.app","com.phonepe.app.v4.nativeapps.rechargeandbillpayment.ui.activity.Navigator_BillProviderActivity");
		//mDriver.startActivity(act);
		//((AndroidDriver) mDriver).startActivity(act);
		//mDriver.findElementByXPath("//*[@text='Search by Number or Name']").sendKeys("9075107773");
		/*
		 * System.out.println("Bye1");
		 * if(mDriver.currentActivity().equals("com.xxx.xxx.xxxx.login.LoginActivity")){
		 * }
		 * 
		 * // mDriver.st
		 * 
		 * ((AndroidDriver) mDriver).startActivity(act);
		 */
		 
		 
	}
	
	    
	
		
	 
		
		
		

		
		
	}
	


