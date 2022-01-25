package StepDefinitions;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static StepDefinitions.Appium.buildAppiumDriver;
import static StepDefinitions.Appium.driver;

public class productdetailssteps {
    @Given("user open app happy fresh")
    public void user_open_app_happy_fresh() throws MalformedURLException, InterruptedException {
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
    @When("User select the product")
    public void user_select_the_product() throws InterruptedException {
        MobileElement search = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_input_product_find_product_edittext"));
        search.sendKeys("Ayam");
        Thread.sleep(5000);
        MobileElement list1 = driver.findElement(By.xpath("//android.widget.TextView[contains(text(),'Pedigree All-in-One Nutrition Chicken & Egg 3 - 12 Months Puppy')]"));
        list1.click();
    }
    @Then("User should can see the detail of product")
    public void user_should_can_see_the_detail_of_product() throws InterruptedException {
        Thread.sleep(7000);
        MobileElement productname = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_name_textview"));
        String name = productname.getText();
        System.out.println(name);
        MobileElement productweight = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_weight_textview"));
        String weight = productweight.getText();
        System.out.println(weight);
        MobileElement productprice = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_price_textview"));
        String price = productprice.getText();
        System.out.println(price);
    }

}
