package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Zad_8_AddressPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Zad_8_AddressStepDefinitions {

    private WebDriver driver;
    private Zad_8_AddressPage zad8AddressPage;

    @Given("^User is logged in to CodersLab_shop$")
    public void userIsLoggedInToCodersLab_shop() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");
    }

    @When("^User goes to user address page$")
    public void userGoesToUserAddressPage() {
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");
    }
//Spytac sie jak to jest z AND jak mam wiele?

    @And("^User enters \"([^\"]*)\"$")
    public void userEntersAlias(String alias) {
        zad8AddressPage = new Zad_8_AddressPage(driver);
        zad8AddressPage.setAlias(alias);
    }

    @And("^User enters 1 \"([^\"]*)\"$")
   public void userEntersCompany(String company) {
        zad8AddressPage.setCompany(company);
   }

    @And("^User enters 2 \"([^\"]*)\"$")
    public void userEntersAddress(String address) {
        zad8AddressPage.setAddress(address);
    }

    @And("^User enters 3 \"([^\"]*)\"$")
    public void userEntersCity(String city) {
        zad8AddressPage.setCity(city);
    }

    @And("^User enters 4 \"([^\"]*)\"$")
    public void userEntersZip(String zip) {
        zad8AddressPage.setZip(zip);
    }

    @And("^User enters (\\d+) Country$")
    public void userEntersCountry(int arg0) {
    }

    @And("^User enters 6 \"([^\"]*)\"$")
    public void userEntersPhone(String phoneNumber) {
        zad8AddressPage.setPhone(phoneNumber);
    }

//        public void userEnters(String alias, String company, String address, String city, String zip, String phoneNumber) throws Throwable {


    @And("^User saves Address information$")
    public void userSavesAddressInformation() {
       zad8AddressPage.submitUserInfo();

    }

    @Then("^User sees info \"([^\"]*)\"$")
    public void userSeesInfo(String expectedText) throws Throwable {
        String actualText = zad8AddressPage.getUpdateInformation();
        Assert.assertEquals(expectedText, actualText);

    }


}
