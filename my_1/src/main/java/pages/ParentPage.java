package pages;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract public class ParentPage {   //abstract- смотреть можно , а создавать обьекти нельзя
    WebDriver webDriver;
    Logger logger;
//    Logger logger = Logger.getLogger(getClass()); //appacher - must
    ActionsWithOurElements actionsWithOurElements;

    public ParentPage(WebDriver webDriver) { // alt+insert
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        logger = Logger.getLogger(getClass());
    }
}
