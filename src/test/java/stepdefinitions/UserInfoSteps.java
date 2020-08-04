package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.helpers.AttributesImpl;
import pages.LoginPage;
import pages.UserInfoPage;

import java.util.concurrent.TimeUnit;

public class UserInfoSteps {

    private WebDriver driver;
    private UserInfoPage userInfoPage;


    @Given("^User is logged in to CodersLab shop$")
    public void userIsLoggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");
    }

    @When("^User goes to user information page$")
    public void userGoesToUserInformationPage() {
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=identity");
    }

    @And("^User signs up for our newsletter$")
    public void userSignsUpForOurNewsletter() {
        userInfoPage = new UserInfoPage(driver);
        userInfoPage.signInForNewsletter();
    }

    @And("^User changes his gender$")
    public void userChangesHisGender() {
        userInfoPage.changeHisGender();
    }

    @And("^Sets birthday date to \"([^\"]*)\"$")
    public void userChangesHisBirthdayTo(String birthDate) {
        userInfoPage.setBirthdate(birthDate);
    }

    @And("^User saves information$")
    public void userSavesInformation() {
        userInfoPage.submitUserInfo();
    }

    @Then("^User sees \"([^\"]*)\"$")
    public void userSees(String expectedText) throws Throwable {
        String actualText = userInfoPage.getUpdateInformation();
        Assert.assertEquals(expectedText, actualText);
    }
}
