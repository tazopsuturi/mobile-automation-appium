package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;
import java.util.concurrent.TimeUnit;

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
			
			URL appiumServer = new URL("http://127.0.0.1:4725/wd/hub");
			
			androidDriver = new AndroidDriver(appiumServer, caps);
			
			androidDriver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
			
			WebElement label = androidDriver.findElement(By.xpath("//*[@content-desc='Login']"));
			label.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return androidDriver;
	}
}
