package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;

public class BaseClass {
	public static void main(String[] args) {
		AndroidDriver driver = null;
		try {
			UiAutomator2Options caps = new UiAutomator2Options();
			caps.setCapability("platformName", "Android");
			caps.setCapability("appium:automationName", "UiAutomator2");
			caps.setCapability("appium:deviceName", "emulator-5554");  // Ensure the device is available
			caps.setCapability("appium:appPackage", "com.wdiodemoapp");
			caps.setCapability("appium:appActivity", "com.wdiodemoapp.MainActivity");

			
			URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AndroidDriver(appiumServer, caps);
			System.out.println("Session started!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}