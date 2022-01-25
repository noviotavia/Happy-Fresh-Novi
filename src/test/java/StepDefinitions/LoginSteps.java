package StepDefinitions;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends Appium {

    @Given("user is on login screen")
    public void user_is_on_login_screen() throws MalformedURLException, InterruptedException {
        buildAppiumDriver();
        System.out.println("user in homepage");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        System.out.println("First Current context:"+driver.getContext());
        MobileElement account1 = driver.findElementByAccessibilityId("Account");
        account1.click();
        MobileElement clogin = driver.findElement(By.id("com.happyfresh.staging:id/smallLabel"));
        clogin.click();
        MobileElement login = driver.findElement(By.id("com.happyfresh.staging:id/login"));
        login.click();
        // Assert.assertTrue("Menu account is not display", driver.findElement(By.xpath("//android.widget.TextView[@text='Account']")).isDisplayed());
        System.out.println("user in login screen");
    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(5000);
        MobileElement email = driver.findElement(By.id("com.happyfresh.staging:id/login"));
        email.sendKeys("bomyeom@gmail.com");

        MobileElement pass = driver.findElement(By.id("com.happyfresh.staging:id/password"));
        pass.sendKeys("1234567");
        System.out.println("user enters valid username and password");
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() throws InterruptedException {
        Thread.sleep(5000);
        MobileElement email = driver.findElement(By.id("com.happyfresh.staging:id/login"));
        email.sendKeys("kikanaya3@gmail.com");

        MobileElement pass = driver.findElement(By.id("com.happyfresh.staging:id/password"));
        pass.sendKeys("1234567");
        System.out.println("user enters valid username and password");
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        MobileElement log_in = driver.findElement(By.id("com.happyfresh.staging:id/login"));
        log_in.click();
        System.out.println("user click on login button");
    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("user is navigated to home page");
    }

    @Then("error message shows")
    public void error_message_shows() {
        System.out.println("error message");
    }
}
