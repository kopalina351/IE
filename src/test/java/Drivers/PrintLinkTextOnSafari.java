package Drivers;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;


public class PrintLinkTextOnSafari {
    WebDriver driver = new SafariDriver();
    HomePage homePage = new HomePage(driver);

    public PrintLinkTextOnSafari() throws IOException {
    }

    @Test
    public void PrintLinkTextOnSafari() throws IOException {

        homePage.openBrowserAndHomePage();
        homePage.PrintLinkTextOfListElements();

    }

    @After
    public void tearDown() { homePage.closeBrowser();
    }
}