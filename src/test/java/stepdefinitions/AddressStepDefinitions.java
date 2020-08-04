package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddressPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class AddressStepDefinitions {

    private WebDriver driver;
    private AddressPage addressPage;

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
        addressPage = new AddressPage(driver);
        addressPage.setAlias(alias);
    }

    @And("^User enters 1 \"([^\"]*)\"$")
   public void userEntersCompany(String company) {
        addressPage.setCompany(company);
   }

    @And("^User enters 2 \"([^\"]*)\"$")
    public void userEntersAddress(String address) {
        addressPage.setAddress(address);
    }

    @And("^User enters 3 \"([^\"]*)\"$")
    public void userEntersCity(String city) {
        addressPage.setCity(city);
    }

    @And("^User enters 4 \"([^\"]*)\"$")
    public void userEntersZip(String zip) {
        addressPage.setZip(zip);
    }

    @And("^User enters (\\d+) Country$")
    public void userEntersCountry(int arg0) {
    }

    @And("^User enters 6 \"([^\"]*)\"$")
    public void userEntersPhone(String phoneNumber) {
        addressPage.setPhone(phoneNumber);
    }

//        public void userEnters(String alias, String company, String address, String city, String zip, String phoneNumber) throws Throwable {


    @And("^User saves Address information$")
    public void userSavesAddressInformation() {
       addressPage.submitUserInfo();

    }

    @Then("^User sees info \"([^\"]*)\"$")
    public void userSeesInfo(String expectedText) throws Throwable {
        String actualText = addressPage.getUpdateInformation();
        Assert.assertEquals(expectedText, actualText);

    }


}
