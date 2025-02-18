package tests.apilearning;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverExt;

public class SetValues {
	public static void main(String[] args) {
		AndroidDriver androidDriver = AppiumDriverExt.getAndroidDriver();
		
		WebElement emailTxtBox = androidDriver.findElement
				(By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]"));
		emailTxtBox.sendKeys("tazo@emaildomain.com");
		
		WebElement passwordTxtBox = androidDriver.findElement
				(By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]"));
		passwordTxtBox.sendKeys("password");
		
		WebElement loginBtn = androidDriver.findElement
				(By.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup"));
		loginBtn.click();
	}
}
