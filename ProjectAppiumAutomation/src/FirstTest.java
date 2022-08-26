import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class FirstTest {
    private AppiumDriver driver;

    @Before

    public void setUp() throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","AndroidTestDevice");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","org.wikipedia");
        capabilities.setCapability("appActivity",".main.MainActivity");
        capabilities.setCapability("app","C:\\Users\\Irula\\OneDrive\\Desktop\\ProjectAppiumAutomation\\ProjectAppiumAutomation\\apks\\org.wikipedia_50417_apps.evozi.com.apk");
        //capabilities.setCapability("remoteAdbHost","d5cbop-apc005lk.corp.dev.vtb");
        //capabilities.setCapability("adbPort","7401");


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }
    @After
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    public void firstTest()
    {

        WebElement element_cont1 = driver.findElementById("org.wikipedia:id/fragment_onboarding_forward_button");
        element_cont1.click();
        WebElement element_cont2 = driver.findElementById("org.wikipedia:id/fragment_onboarding_forward_button");
        element_cont2.click();
        WebElement element_cont3 = driver.findElementById("org.wikipedia:id/fragment_onboarding_forward_button");
        element_cont3.click();
        WebElement element_start = driver.findElementById("org.wikipedia:id/fragment_onboarding_done_button");
        element_start.click();
        WebElement element_to_init_search = driver.findElementByXPath("//*[contains(@text,'Search Wikipedia')]");
        element_to_init_search.click();
        //WebElement element_to_enter_search = driver.findElementByXPath("//*[contains(@text,'Search')]");
        //element_to_enter_search.click();
        //element_to_init_search.sendKeys("Test");
        //element_to_input_search.click();
        System.out.println("First test passed");
    }

}



