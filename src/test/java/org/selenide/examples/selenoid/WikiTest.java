package org.selenide.examples.selenoid;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.*;

public class WikiTest {

    @BeforeClass
    public void setUp() {
        final DesiredCapabilities capabilities = new DesiredCapabilities();
        baseUrl = "https://www.wikipedia.org/";
        remote = "http://localhost:4444/wd/hub";
        browser = "chrome";
        browserVersion = "79.0";
        browserCapabilities = capabilities;
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        capabilities.setCapability("videoName", "test_video.mp4");
        capabilities.setPlatform(Platform.ANY);
        System.setProperty("selenide.browser", "chrome");
        startMaximized = true;
        browserSize = "1920x1080";
    }

    @Test
    public void CheckSearch() throws InterruptedException {
        MainPage mainPage = new MainPage();
        Selenide.open(baseUrl);
        SelenideElement header = mainPage.typeSearchData("test").searchData().getHeader();
        Thread.sleep(4000);
        header.shouldBe(visible);
        String headText = header.getText();
        Assert.assertEquals(headText, "Test");

    }
}