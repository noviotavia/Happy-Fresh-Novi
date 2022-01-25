package StepDefinitions;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class productliststeps extends Appium {
    @Given("user open app happy fresh and choose address")
    public void user_open_app_happy_fresh_and_choose_address() throws MalformedURLException, InterruptedException {
        buildAppiumDriver();
        System.out.println("user in homepage");
        MobileElement indonesia = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_address_info_address_textview"));
        indonesia.click();
        MobileElement deliver = driver.findElement(By.id("com.happyfresh.staging:id/search_src_text"));
        deliver.sendKeys("Kost U27B");
        Thread.sleep(5000);
        MobileElement kost = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_suggestion_address_location_secondary"));
        kost.click();
        MobileElement confirmadd = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_popup_dialog_primary_action_button"));
        confirmadd.click();

    }
    @When("User request the product list")
    public void user_request_the_product_list() {
        MobileElement search = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_input_product_find_product_edittext"));
        search.sendKeys("Ayam");
    }
    @Then("User should receive product lists")
    public void user_should_receive_product_lists() throws InterruptedException {
        Thread.sleep(7000);
        MobileElement list1 = driver.findElement(By.xpath("//android.widget.TextView[contains(text(),'Pedigree All-in-One Nutrition Chicken & Egg 3 - 12 Months Puppy')]"));
        list1.isDisplayed();
        MobileElement list2 = driver.findElement(By.xpath("//android.widget.TextView[contains(text(),'Promina Steamed Rice with Chicken Carrot and Tomato Flavor 12+ months')]"));
        list2.isDisplayed();
        MobileElement list3 = driver.findElement(By.xpath("//android.widget.TextView[contains(text(),'Promina Brown Rice and Chicken Baby Porridge 6+ Months')]"));
        list3.isDisplayed();
        MobileElement list4 = driver.findElement(By.xpath("//android.widget.TextView[contains(text(),'Purrfect Tuna Red Meat in Gravy with Chicken and Tuna Liver')]"));
        list4.isDisplayed();


    }

}
