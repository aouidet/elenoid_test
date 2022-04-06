package org.selenide.examples.selenoid;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ResultPage {
private SelenideElement header = $(By.id("firstHeading"));
public SelenideElement getHeader() {
        return header;
    }
}