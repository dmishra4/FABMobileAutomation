package com.fab.fundtransfer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class appiumtest {
	
	public static AndroidDriver<MobileElement>driver;

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
		
		cap.setCapability("appPackage", "com.snapwork.hdfc");
	//	cap.setCapability("appActivity", "com.hdfc.retail.netbanking.HDFCBank");
	cap.setCapability("appActivity", "com.hdfc.retail.netbanking.LoginActivity");
		//com.google.android.packageinstaller/com.android.packageinstaller.permission.ui.GrantPermissionsActivity
		
	//	cap.setCapability("appPackage", "com.fabhotels.guests");
	//	cap.setCapability("appActivity", "com.fabhotels.guests.MainActivity");
	//	cap.setCapability("appActivity", "com.google.android.libraries.places.widget.AutocompleteActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver<MobileElement>(url, cap);
		System.out.println("Hello");
		Activity activity = new Activity("com.google.android.packageinstaller","com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
		System.out.println("Hello....Hiiii");
		
		driver.switchTo().alert().accept();
		System.out.println("Bye");
		
		
		
	}
	

}
