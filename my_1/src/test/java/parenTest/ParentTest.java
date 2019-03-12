package parenTest;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;

    @Before
    public void setUp(){
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();// на весь екран
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // виполнять на протяжении 10 секунд
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);

    }

    @After
    public void tearDown(){
        webDriver.quit();
    }
}