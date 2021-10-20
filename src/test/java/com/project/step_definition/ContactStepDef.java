package com.project.step_definition;

import com.project.pages.DashboardPage;
import com.project.pages.LoginPage;
import com.project.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContactStepDef {
    WebDriverWait wait ;

    @When("the user navigates to {string} {string}")
    public void theUserNavigatesTo(String tab, String module) {

        new DashboardPage().navigateToModule(tab,module);
    }

    @Then("the title contains {string}")
    public void theTitleContains(String title) throws InterruptedException {
        Thread.sleep(3000);
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains(title));

    }

    @Then("the user should see following options")
    public void theUserShouldSeeFollowingOptions(List<String> tabOptions) throws InterruptedException {

        Thread.sleep(3);

        List<WebElement> tabList= new DashboardPage().tabs;
        List<String> tabListText = new ArrayList<>();

        for (WebElement tabElement : tabList) {
            Thread.sleep(2000);
            tabListText.add(tabElement.getText());
        }
        System.out.println("tabOptions = " + tabOptions);
        System.out.println("tabListText = " + tabListText);
        Assert.assertEquals(tabOptions,tabListText);
    }

    @When("the user logs following credentials")
    public void theUserLogsFollowingCredentials(Map<String,String> credentials) {

        String username = credentials.get("username");
        String password = credentials.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);


    }
}
