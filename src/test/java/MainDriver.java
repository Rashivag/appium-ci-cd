import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class MainDriver {
    AndroidDriver driver;
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    @BeforeSuite
    public void setUp() throws MalformedURLException {
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android" );
        desiredCapabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554" );
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4_API_31");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/rashia/Downloads/ApiDemos-debug.apk");
        //adesiredCapabilities.setCapab
        // ility(MobileCapabilityType.FULL_RESET, "true");















        //driver = new AndroidDriver(new URL("http://127.0.0.1:9000/wd/hub"), desiredCapabilities);


    }

    @AfterSuite
    public void tearDown(){
        //driver.quit();
    }
}
