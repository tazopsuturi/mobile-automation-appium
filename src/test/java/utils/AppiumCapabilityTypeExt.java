package utils;

import org.openqa.selenium.remote.CapabilityType;

public interface AppiumCapabilityTypeExt extends CapabilityType {
	String APP_PACKAGE = "appPackage";
	String APP_ACTIVITY = "appActivity";
	String AUOMATION_NAME = "automationName";
}
