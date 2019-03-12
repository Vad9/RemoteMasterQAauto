package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class LoginPage extends ParentPage{
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
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
        try{
            webDriver.findElement(By.name("_username")).clear();
            webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info(login + "was inputted into Input");
        }catch (Exception e){
            logger.error("Can`t work with element");
            Assert.fail("Can`t work with element");
        }
    }
    public void enterPassword(String passWord) {
        try{
            webDriver.findElement(By.name("_password")).clear();
            webDriver.findElement(By.name("_password")).sendKeys(passWord);
            logger.info(passWord + "was inputted into Input");
        }catch (Exception e){
            logger.error("Can`t work with element");
            Assert.fail("Can`t work with element");
        }
    }
}
