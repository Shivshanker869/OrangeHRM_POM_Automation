package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DashboardPage {
    private WebDriver driver;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement headerDashboard;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isAtDashboard() {
        return headerDashboard.isDisplayed();
    }
}
