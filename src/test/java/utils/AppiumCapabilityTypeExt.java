package utils;

import org.openqa.selenium.remote.CapabilityType;

public interface AppiumCapabilityTypeExt extends CapabilityType {
	String DEVICE_NAME = "Android";
	String PLATFORM_NAME = "emulator-5554";
	String APP_PACKAGE = "com.wdiodemoapp";
	String APP_ACTIVITY = "com.wdiodemoapp.MainActivity";
}
