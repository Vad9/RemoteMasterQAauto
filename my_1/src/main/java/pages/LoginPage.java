package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage{
    @FindBy(name = "_username")
    WebElement inputLogin;

    @FindBy (name = "_password")
    WebElement inputPassWord;

    @FindBy (tagName = "button")
    WebElement buttonVhod;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public  void clickButtonVhod() {
        actionsWithOurElements.clickOnElement(buttonVhod);
    }

    public void openLoginPage(){
        try{
            webDriver.get("http://v3.test.itpmgroup.com/");
            logger.info("Login page was opened");

        }catch (Exception e){
            logger.error("Can`t open Login page");
            Assert.fail("Can`t open Login Page");
        }
    }

    public void enterLogin(String login) {
        actionsWithOurElements.enterTextInToElement(inputLogin, login);
        // тоже написано ниже
//        try{
//            inputLogin.clear();             // тоже что и webDriver.findElement(By.name("_username")).clear();
//            inputLogin.sendKeys();          // тоже что и  webDriver.findElement(By.name("_username")).sendKeys(login);
//            logger.info(login + "was inputted into Input");
//        }catch (Exception e){
//            logger.error("Can`t work with element");
//            Assert.fail("Can`t work with element");
//        }
    }
    public void enterPassword(String passWord) {
        actionsWithOurElements.enterTextInToElement(inputPassWord, passWord);
        // тоже написано ниже
//        try{
//            inputPassWord.clear();                  // тоже что и webDriver.findElement(By.name("_password")).clear();
//            inputPassWord.sendKeys(passWord);      // тоже что и;webDriver.findElement(By.name("_password")).sendKeys(passWord);
//            logger.info(passWord + "was inputted into Input");
//        }catch (Exception e){
//            logger.error("Can`t work with element");
//            Assert.fail("Can`t work with element");
//        }
    }
}
