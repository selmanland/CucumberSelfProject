package com.project.step_definition;

import com.project.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

    //Tagged hooks will only run before/after scenario(s) with that given tag.
    @Before("@db")// --> custom hooks
    public void setUpdb(){
        System.out.println("\tconnecting to database...");
    }

    @After("@db") // --> custom hooks
    public void closeDb(){
        System.out.println("\tdisconnecting to database...");

    }




}
