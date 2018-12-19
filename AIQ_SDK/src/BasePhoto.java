import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;


public class BasePhoto {
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
		
		File f = new File("src");
		File fs = new File(f, "photo-release.apk"); 
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VivianTestingDevice1");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver <AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap); 
		return driver;
	}

}