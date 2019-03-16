package pages;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract public class ParentPage {   //abstract- смотреть можно , а создавать обьекти нельзя
    WebDriver webDriver;
    Logger logger;
//    Logger logger = Logger.getLogger(getClass()); //appacher - must
    ActionsWithOurElements actionsWithOurElements;
    String baseUrl = "http://v3.test.itpmgroup.com";
    String expectedUrl;


    public ParentPage(WebDriver webDriver, String relativeUrl) { // alt+insert
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        logger = Logger.getLogger(getClass());
        this.expectedUrl = baseUrl + relativeUrl;
    }

    public String getCurrentUrl(){
        return webDriver.getCurrentUrl();
    }

    public void checkUrl(){
        try{
            Assert.assertEquals("Url is not expected", expectedUrl, getCurrentUrl());
        }catch (Exception e){
            logger.error("Can`t work with Url");
            Assert.fail("Can`t work with Url");
        }
    }
}
