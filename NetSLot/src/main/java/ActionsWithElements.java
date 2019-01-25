
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithElements {
    WebDriver webDriver;
    WebDriverWait waitForElement;


    public ActionsWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        waitForElement = new WebDriverWait(webDriver, 10);

    }

    public void clickOnElement(WebElement element) {

        try {
            element.click();
            waitForElement.until(ExpectedConditions.visibilityOf(element));
            waitForElement.until(ExpectedConditions.not(ExpectedConditions.attributeContains(element, "class", "disabled")));
        } catch (Exception e) {
            Assert.fail("Can not click the element" + e);
        }
    }


}
