package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

abstract public class ParentPage {   //abstract- смотреть можно , а создавать обьекти нельзя
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass()); //appacher - must

    public ParentPage(WebDriver webDriver) { // alt+insert
        this.webDriver = webDriver;
    }
}
