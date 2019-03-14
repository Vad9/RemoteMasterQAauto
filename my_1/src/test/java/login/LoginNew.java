package login;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import parenTest.ParentTest;

public class LoginNew extends ParentTest {

    @Test
    public void validLogin(){
        loginPage.openLoginPage();
        loginPage.enterLogin("Student"); // alt+enter=method
        loginPage.enterPassword("909090");
        loginPage.clickButtonVhod();


        Assert.assertTrue("Avatar is mot present", homePage.isAvatarPresent());
    }
}