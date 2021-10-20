package com.project.pages;

import com.project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public abstract class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> tabs;



    public void navigateToModule(String tab, String module){

        String tabLocator="//span[normalize-space()='"+tab+"'][contains(@class, 'title title-level-1')]";
        String moduleLocator="//span[@class='title title-level-2'][text()='"+module+"']";

        WebElement elementTab = Driver.get().findElement(By.xpath(tabLocator));
        WebElement elementModule = Driver.get().findElement(By.xpath(moduleLocator));


        WebDriverWait wait = new WebDriverWait(Driver.get(),3);
        wait.until(ExpectedConditions.elementToBeClickable(elementTab));
        new Actions(Driver.get()).moveToElement(elementTab).pause(4000).moveToElement(elementModule).click().build().perform();

    }



}
