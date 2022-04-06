package org.selenide.examples.selenoid;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement searchField = $(By.id("searchInput"));
    private final SelenideElement searchButton = $x("//*[@id='search-form']//button");

    public MainPage typeSearchData(String data) {
        searchField.shouldBe(visible);
        searchField.setValue(data);
        return this;
    }

    public ResultPage searchData() {
        searchButton.shouldBe(visible).click();
        return new ResultPage();
    }
}