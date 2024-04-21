package WebTesting;

import factory.Header;
import factory.LoginPage;
import factory.PostPage;
import factory.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class ProfilePictureTest extends TestObject {
    @DataProvider(name="getUser")
    public Object[][] getUsers(){
        File profilePicture = new File("src\\test\\resources\\upload\\testProfilePicture.jpg");
                return new Object[][]{
                {"Vasil2","Proba71", "5469", profilePicture},
        };
    }
    @Test(dataProvider = "getUser")
    public void testProfilePicture (String username, String password, String userId, File profilePicture){
        WebDriver webDriver = super.getWebDriver();
        Header header = new Header(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        ProfilePage profilePage = new ProfilePage(webDriver);

        loginPage.navigateTo();
        Assert.assertTrue(loginPage.isUrlLoaded(), "Current page is not Login");

        loginPage.completeSingIn(username,password);
        header.clickProfile();
        Assert.assertTrue(profilePage.isUrlLoaded(userId), "Current page is not profile page for " + userId + " user");

        profilePage.clickProfilePicture();
        profilePage.uploadProfilePicture(profilePicture);
        Assert.assertTrue(webDriver.findElement(By.id("toast-container")).isDisplayed(), "Confirmation does not appear.");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
