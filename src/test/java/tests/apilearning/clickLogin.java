package tests.apilearning;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExt;

import java.util.concurrent.TimeUnit;

public class clickLogin {
	public static void main(String[] args) {
		
		AndroidDriver androidDriver = AppiumDriverExt.getAndroidDriver();
		
		androidDriver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
		
		WebElement label = androidDriver.findElement(By.xpath("//*[@content-desc='Login']"));
		label.click();
		
	}
}
