package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverExt {
	
	public static AndroidDriver getAndroidDriver() {
		
		AndroidDriver androidDriver = null;
		
		try {
			UiAutomator2Options caps = new UiAutomator2Options();
			caps.setCapability(AppiumCapabilityTypeExt.PLATFORM_NAME, "Android");
			caps.setCapability(AppiumCapabilityTypeExt.AUOMATION_NAME, "UiAutomator2");
			caps.setCapability(AppiumCapabilityTypeExt.PLATFORM_NAME, "emulator-5554");  // Ensure the device is available
			caps.setCapability(AppiumCapabilityTypeExt.APP_PACKAGE, "com.wdiodemoapp");
			caps.setCapability(AppiumCapabilityTypeExt.APP_ACTIVITY, "com.wdiodemoapp.MainActivity");
			
			URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");
			
			androidDriver = new AndroidDriver(appiumServer, caps);
			System.out.println("Session started!");
			
			androidDriver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
			
			WebElement label = androidDriver.findElement(By.xpath("//*[@content-desc='Login']"));
			label.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return androidDriver;
	}
}
