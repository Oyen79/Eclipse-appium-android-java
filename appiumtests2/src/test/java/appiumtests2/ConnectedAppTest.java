package appiumtests2;

import java.net.URL;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
//import io.appium.java_client.MobileElement;

public class ConnectedAppTest {
	
	static AndroidDriver driver;

	public static void main(String[] args) {
		
	try {
		openConnectedApp();
		
		}catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
	}		 
}
			 	 
	public static void openConnectedApp() throws Exception {
			 
		DesiredCapabilities cap = new DesiredCapabilities();
				 
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		cap.setCapability("deviceName", "Galaxy A13");
		cap.setCapability("udid", "R58T349N8TJ");
		//cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformName", MobilePlatform.ANDROID);
		cap.setCapability("platformVersion", "12");
				 
		cap.setCapability("appPackage", "com.connected.v2.android.dev");
		cap.setCapability("appActivity", "com.connected.MainActivity");
				 
		URL url = new URL("http", "0.0.0.0", 4723, "/wd/hub");
				 
		driver = new AndroidDriver(url, cap);	
		
		System.out.println("Application started");
		
		//WebElement one = driver.findElement(By.id(""));
		
				 
	}
}
