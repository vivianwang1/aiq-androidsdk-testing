import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Scanner extends BaseScanner{
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		//test
		
		//1)xpath syntax: tagname[@atrribute='value']
		//2)            or  tagname[2]
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByAndroidUIAutomator("text(\"OPEN SCANNER\")").click();
		driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
		driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click(); 
 
		////first install will show the hints view. lets wait for 5 seconds to see this hints keep showing
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}   
//		
		//close the hints view
		driver.findElementById("tech.aiq.aiqkit.sample.scanner:id/hints_close").click();
		
		//driver.findElementById("tech.aiq.aiqkit.sample.scanner:id/camera_button_bar_hints").click();

		 
		//so for now you should be able close the autoshown hintsview with hints_close button or camera_button_bar_hints
		//both way work for me
		//below i just want to try show the hint again manually
		
		/////////lets try open again the hints view
		driver.findElementById("tech.aiq.aiqkit.sample.scanner:id/camera_button_bar_hints").click();
		
		////then close again after 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		driver.findElementById("tech.aiq.aiqkit.sample.scanner:id/hints_close").click();

	}
}