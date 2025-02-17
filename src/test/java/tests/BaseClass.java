package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;

public class BaseClass {
	public static void main(String[] args) {
		AndroidDriver driver = null;
		try {
			UiAutomator2Options options = new UiAutomator2Options()
					.setPlatformName("Android")
					.setAutomationName("UiAutomator2")
					.setUdid("emulator-5554")
					.setAppPackage("com.wdiodemoapp")
					.setAppActivity("com.wdiodemoapp.MainActivity");
			
			URL appiumServer = new URL("http://127.0.0.1:4723");
			driver = new AndroidDriver(appiumServer, options);
			System.out.println("Session started!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (driver != null) driver.quit();
		}
	}
}