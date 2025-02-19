package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.URL;

public class AppiumDriverExt {
	
	public static AndroidDriver getAndroidDriver() {
		
		AndroidDriver androidDriver = null;
		
		try {
			UiAutomator2Options caps = new UiAutomator2Options();
			caps.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
			caps.setDeviceName(AppiumCapabilityTypeExt.DEVICE_NAME);
			caps.setPlatformName(AppiumCapabilityTypeExt.PLATFORM_NAME);
			caps.setAppPackage(AppiumCapabilityTypeExt.APP_PACKAGE);
			caps.setAppActivity(AppiumCapabilityTypeExt.APP_ACTIVITY);
			
			URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");
			
			androidDriver = new AndroidDriver(appiumServer, caps);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return androidDriver;
	}
}
