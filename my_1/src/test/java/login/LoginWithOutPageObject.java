package login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginWithOutPageObject {
    WebDriver webDriver;


    @Before
    public void setUp(){
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();// на весь екран
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // виполнять на протяжении 10 секунд
    }

    @Test
    public void validLoginIn() {
        webDriver.get("http://v3.test.itpmgroup.com/"); // stranica

        webDriver.findElement(By.name("_username")).clear();
        webDriver.findElement(By.name("_username")).sendKeys("Student");

        webDriver.findElement(By.id("password")).clear();
        webDriver.findElement(By.id("password")).sendKeys("909090");

        webDriver.findElement(By.tagName("button")).click();

        Assert.assertTrue("Avatar is not present",isAvatarPresent());// проверка
    }
        private boolean isAvatarPresent(){
            try {
                return webDriver.findElement(By.xpath(".//*[@class='pull-left image']")).isDisplayed(); // проверка
            } catch (Exception e) {
                return false;
            }
        }

    @After
    public void tearDown(){
        webDriver.quit();
    }
}
