import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class photo extends BasePhoto{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"PICK IMAGE\")").click();	
		driver.findElementById("com.android.documentsui:id/icon_thumb").click();
		
	}
}
