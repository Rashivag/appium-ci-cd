package screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    AndroidDriver driver;

    public HomePage(AndroidDriver driver){
        this.driver = driver;
    }
    List<WebElement> countElements;

    public int getCountOfElements(){
        countElements = driver.findElements(By.id("android:id/text1"));
        return countElements.size();

    }

    public void clickOnViews(){
        driver.findElement(AppiumBy.accessibilityId("")).click();

    }
}
