package com.cybertek.step_definitions;

import com.cybertek.pages.loginLibrary;
import com.cybertek.utilities.BrowserUtils7;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class login_Definitions {

    loginLibrary loginPage = new loginLibrary();

    @Given("the user login as a {string} and {string}")
    public void the_user_login_as_a_and(String string, String string2) {

        String urlLibrary = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(urlLibrary);

        loginPage.username.sendKeys(string);
        loginPage.password.sendKeys(string2);
        loginPage.signInButton.click();

    }

    @Then("the {string}")
    public void the_on(String string) {

        BrowserUtils7.wait(5);
        String actualTitle = Driver.getDriver().getCurrentUrl();
        String expectedUrl = string;
        Assert.assertTrue(actualTitle.contains(expectedUrl));

    }
}
