package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ActionsWithOurElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterTextInToElement(WebElement element, String text) {
        try{
            element.clear();         // тоже что и webDriver.findElement(By.name("_password")).clear();
            element.sendKeys(text);      // тоже что и;webDriver.findElement(By.name("_password")).sendKeys(passWord);
            logger.info(text + "was inputted into Input");
        }catch (Exception e){
            logger.error("Can`t work with element" + e);
            Assert.fail("Can`t work with element" + e);
        }
    }

    public void clickOnElement(WebElement element) {
        try{
            element.click();
            logger.info("element was clicked");
        }catch (Exception e){
            logger.error("Can`t work with element" + e);
            Assert.fail("Can`t work with element" + e);
        }
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void selectTextInDD(WebElement element, String text) {
        try {
            Select select = new Select(element);
            select.selectByVisibleText(text);
            logger.info(text + "was selected in DD");
        }catch (Exception e){
            logger.error("Can`t work with element" + e);
            Assert.fail("Can`t work with element" + e);
        }
    }
}
