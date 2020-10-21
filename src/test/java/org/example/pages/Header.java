package org.example.pages;

//import org.hospitalproy.core.ui.AbstractPage;
import org.example.core.ui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractPage {

    private static final String HEADER_TAB = "//a[@title='%s']";
    private static final String SUB_HEADER_TAB = "//span[text()='%s']";
    private static final String USERNAME = "//span[text()='%s']";

    @FindBy(xpath = "//span[@class='username']")
    private WebElement username;

    public void clickOnTab(final String tab) {
        action.click(By.xpath(String.format(HEADER_TAB, tab)));
    }

    public void clickOnSubTab(final String subtabname) {
        action.click(By.xpath(String.format(SUB_HEADER_TAB, subtabname)));
    }


    public String getFieldValue() {
        return action.getText(username);
    }
}
