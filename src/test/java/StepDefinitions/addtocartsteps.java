package StepDefinitions;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.lang.management.MonitorInfo;
import java.net.MalformedURLException;

public class addtocartsteps extends Appium {
    @Given("user open app happy fresh and select market")
    public void user_open_app_happy_fresh_and_select_market() throws MalformedURLException, InterruptedException {
        buildAppiumDriver();

        MobileElement indonesia = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_address_info_address_textview"));
        indonesia.click();

        MobileElement deliver = driver.findElement(By.id("com.happyfresh.staging:id/search_src_text"));
        deliver.sendKeys("Kost U27B");
        Thread.sleep(5000);
        MobileElement kost = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_suggestion_address_location_secondary"));
        kost.click();
        MobileElement confirmadd = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_popup_dialog_primary_action_button"));
        confirmadd.click();
        Thread.sleep(5000);
        MobileElement lottemart = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_supplier_imageview"));
        lottemart.click();
        Thread.sleep(5000);
        MobileElement FreshProduce = driver.findElement(By.xpath("//android.widget.TextView[contains(text(),'Fresh Produce')]"));
        FreshProduce.click();


    }

    @When("user add some product to cart")
    public void user_add_some_product_to_cart() throws InterruptedException {
        Thread.sleep(5000);
        MobileElement add = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_list_add_to_cart_button"));
        add.click();

    }

    @Then("user should see the product in shopping cart")
    public void user_should_see_the_product_in_shopping_cart() {
        MobileElement cart = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_cart_menu_icon"));
        cart.click();
        MobileElement result = driver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_cart_name_textview"));
        String prodtext = result.getText();
        Assert.assertEquals("Peled Batu Pineaple",prodtext);
    }

}
