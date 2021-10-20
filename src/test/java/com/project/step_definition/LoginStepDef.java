package com.project.step_definition;

import com.project.pages.LoginPage;
import com.project.utilities.ConfigurationReader;
import com.project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDef {
    LoginPage loginPage;


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));


    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {
        loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("driver_username"), ConfigurationReader.get("driver_password"));

    }


    @When("the user enter login information {string} and {string}")
    public void theUserEnterLoginInformationAnd(String username, String password) {
        loginPage = new LoginPage();
        loginPage.login(username, password);


    }


    @Then("the user should be able to login")
    public void theUserShouldBeAbleToLogin() {

        String title = Driver.get().getTitle();
        System.out.println(title);

    }

    @And("the title is {string}")
    public void theTitleIs(String titleName) throws InterruptedException {
        Thread.sleep(3000);
        String expectedTitle = titleName;
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);

    }

    @Given("the user logged in as {string}")
    public void theUserLoggedInAs(String usertype) {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = null;
        String password = null;

        switch (usertype) {
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;

            case "sales manager":
                username = ConfigurationReader.get("sales_manager_username");
                password = ConfigurationReader.get("sales_manager_password");
                break;

            case "store manager":
                username = ConfigurationReader.get("store_manager_username");
                password = ConfigurationReader.get("store_manager_password");
                break;
        }
        loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @Given("the user logged in following accounts")
    public void theUserLoggedInFollowingAccounts(Map<String, String> userinfo) {
        new LoginPage().login(userinfo.get("username"),userinfo.get("password"));

    }















}
