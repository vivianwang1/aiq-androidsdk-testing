import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Scanner extends BaseScanner{
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		//1)xpath syntax: tagname[@atrribute='value']
		//2)            or  tagname[2]
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByAndroidUIAutomator("text(\"OPEN SCANNER\")").click();
		driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
		driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
		
		//Error: for hint view, it stuck here
		driver.findElementById("tech.aiq.aiqkit.sample.scanner:id/camera_button_bar_hints").click();
		//driver.findElementById("tech.aiq.aiqkit.sample.scanner:id/hints_close").click();
	}
}