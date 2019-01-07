import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class camera extends BaseCamera{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
	
		 driver.findElementByAndroidUIAutomator("text(\"TAKE PICTURE\")").click();
		driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
		
		//take picture - click okay
		driver.findElementByClassName("android.widget.LinearLayout").click();
		driver.findElementByClassName("android.widget.ImageView").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		//take picture - click retake
		driver.findElementById("com.android.camera2:id/shutter_button").click(); 
		driver.findElementById("com.android.camera2:id/retake_button").click();
		
		
		//take picture - click cancel
		driver.findElementById("com.android.camera2:id/shutter_button").click(); 
		driver.findElementById("com.android.camera2:id/cancel_button").click();
		
		//test 3 functions(timer, grid, front camera) for taking picture
		driver.findElementByClassName("android.widget.LinearLayout").click();  
		driver.findElementByClassName("android.widget.ImageView").click();
		driver.findElementById("com.android.camera2:id/countdown_toggle_button").click();
		driver.findElementById("com.android.camera2:id/countdown_toggle_button").click();
		driver.findElementById("com.android.camera2:id/countdown_toggle_button").click();
		driver.findElementById("com.android.camera2:id/grid_lines_toggle_button").click();
		driver.findElementById("com.android.camera2:id/camera_toggle_button").click();
		driver.findElementById("com.android.camera2:id/camera_toggle_button").click();
		
		//return to home page after testing
		//driver.findElementByClassName("android.widget.LinearLayout").click();
		driver.findElementByClassName("android.widget.ImageView").click();
		driver.findElementById("com.android.camera2:id/cancel_button").click();
		
		//compare Text
		//System.out.print((driver.findElementByAndroidUIAutomator("text(\"Search an image from camera capture.\")").getAttribute("text").equals("Search an image from camera capture.")));
		
	}

}
