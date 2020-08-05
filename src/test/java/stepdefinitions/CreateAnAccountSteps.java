package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CreateAnAccountSteps {
    private WebDriver driver;

    @Given("^an open browser with qloapps\\.coderslab\\.pl$")
    public void anOpenBrowserWithQloappsCoderslabPl() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/login?back=my-account");
    }

    @When("^User gives (.*) and click Create an account button$")
    public void userGivesEmailAndClickCreateAnAccountButton(String email) {
        WebElement element = driver.findElement(By.id("email_create"));
        element.clear();
        element.sendKeys(email);
        element.submit();


    }


    @And("^User pickup his gender$")
    public void userPickupHisGender() {
        try {
            Thread.sleep(2000); //usupiamy na 2sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement Gender = driver.findElement(By.id("id_gender1"));
        Gender.click();

//        Select select4 = new Select(driver.findElement(By.id("id_gender")));
//        select4.selectByValue("1"); // czemu nie dziala w tej metodzie?


    }

    @And("^User input \"([^\"]*)\"$")
    public void userInput(String firstName) {
        WebElement element = driver.findElement(By.id("customer_firstname"));
        element.clear();
        element.sendKeys(firstName);
    }

    @And("^User gives \"([^\"]*)\"$")
    public void userGives(String lastName) {
        WebElement element = driver.findElement(By.id("customer_lastname"));
        element.clear();
        element.sendKeys(lastName);
    }

    @And("^User to enter \"([^\"]*)\"$")
    public void userToEnter(String password) {
        WebElement element = driver.findElement(By.id("passwd"));
        element.clear();
        element.sendKeys(password);

    }

    @And("^User sets Birth$")
    public void userSetsBirth() {
        Select select1 = new Select(driver.findElement(By.id("days")));
        select1.selectByIndex(3);
        Select select2 = new Select(driver.findElement(By.id("months")));
        select2.selectByIndex(3);
        Select select3 = new Select(driver.findElement(By.id("years")));
        select3.selectByValue("2000");
    }

    @And("^User signs for a newsletter$")
    public void userSignsForANewsletter() {
        WebElement Newsletter = driver.findElement(By.name("newsletter"));
        Newsletter.click();
    }

    @And("^User signs for special offers$")
    public void userSignsForSpecialOffers() {
        WebElement Offers = driver.findElement(By.name("optin"));
        Offers.click();
    }


    @Then("^User registered$")
    public void userRegistered() {
        WebElement element = driver.findElement(By.id("submitAccount"));
        element.click();
    }

}
