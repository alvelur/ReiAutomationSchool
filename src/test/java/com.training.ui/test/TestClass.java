package com.training.ui.test;

import com.training.ui.pages.ToDoPage;
import com.training.ui.utilities.DriverFactory;
import com.training.ui.utilities.TestUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class TestClass {
    private WebDriver driver;
    @Before
    public void setDriver() throws IOException {
        this.driver = DriverFactory.getDriver(TestUtils.setUpBrowser());
    }

    @Test
    public void getPage() throws IOException {
        ToDoPage toDoPage = new ToDoPage(this.driver, TestUtils.setUpBaseUrl());
    }

    @After
    public void closeDriver(){
        this.driver.close();
    }

}
