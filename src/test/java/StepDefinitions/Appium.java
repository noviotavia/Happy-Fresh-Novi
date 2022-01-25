package StepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Appium {


    static AppiumDriver<MobileElement> driver;
    public static void main (String[] args){

          try {
                   buildAppiumDriver();
          }catch (Exception exp){
          System.out.println(exp.getCause());
          System.out.println(exp.getMessage());
          exp.printStackTrace();
          }
    }

    public static void buildAppiumDriver() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","emulator-5554");
       // cap.setCapability("udid","192.168.155.102:5555");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","9");
        cap.setCapability("app","/Users/CICIL/Documents/apk_happyfresh/app-staging-debug (1).apk");
        cap.setCapability("appPackage","com.happyfresh.staging");
        cap.setCapability("appWaitActivity","*");
        cap.setCapability("appWaitPackage","com.happyfresh.staging");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Application started...");

        Thread.sleep(7000);
        MobileElement agree = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_privacy_policy_button_agree"));
        agree.click();
        System.out.println("agree clickable");
        Thread.sleep(20000);
        MobileElement one = driver.findElementByXPath("//android.widget.Button[@text='Next']");
        one.click();
        Thread.sleep(5000);
        MobileElement two = driver.findElementByXPath("//android.widget.Button[@text='Next']");
        two.click();
        Thread.sleep(5000);
        MobileElement three = driver.findElementByXPath("//android.widget.Button[@text='Next']");
        three.click();
        Thread.sleep(7000);
        MobileElement four = driver.findElement(By.className("android.widget.Button"));
        four.click();
        System.out.println("Onboard success");
        Thread.sleep(7000);
        MobileElement allow = driver.findElementByXPath("//android.widget.Button[@text='ALLOW']");
        allow.click();
        System.out.println("Allow app");
    }


}
