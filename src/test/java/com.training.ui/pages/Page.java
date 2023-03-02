package com.training.ui.pages;

import groovyjarjarantlr.BaseAST;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {
    private final WebDriver driver;
    private final String baseUrl;

    public Page(WebDriver driver, String baseUrl){
        this.driver = driver;
        this.baseUrl = baseUrl;
        driver.get(baseUrl);
    }
    public WebDriver getDriver() {
        return this.driver;
    }

    public String getBaseUrl(){
        return this.baseUrl;
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

}
