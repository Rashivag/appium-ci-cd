import io.appium.java_client.android.AndroidTouchAction;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.HomePage;

import java.time.Duration;

public class SampleTests extends MainDriver {
    HomePage homePage;
    @Test
    public void verifyHomePageElementCount() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        homePage = new HomePage(driver);
//        Assert.assertEquals(12, homePage.getCountOfElements());
        System.out.println("Executed");

    }
}
