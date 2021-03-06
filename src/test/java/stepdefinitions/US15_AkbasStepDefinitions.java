package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;


public class US15_AkbasStepDefinitions {

    MainPage mainPage = new MainPage();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("global_main_url"));

    }

    @When("user clicks cell phone tab from menu")
    public void user_clicks_cell_phone_tab_from_menu() {
        mainPage.cellPhoneTab.click();

    }

    @Then("user should see mobile phone option")
    public void user_should_see_mobile_phone_option() {
        String actualText = mainPage.mobilePhone.getText();
        Assert.assertTrue(actualText.contains("Mobile Phones"));


//    }
//
//    @When("User should reach mobile phone page")
//    public void user_should_reach_mobile_phone_page() {
//
//    }
//
//    @Then("should see all product")
//    public void should_see_all_product() {
//
//    }


    }
}
