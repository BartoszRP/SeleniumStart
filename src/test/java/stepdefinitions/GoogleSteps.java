package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSteps {

    private WebDriver driver;

    @Given("^an open browser with google\\.com$")
    public void anOpenBrowserWithGoogleCom() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("http://www.google.com");

    }

    @When("^a keyword (.*) is entered in input field$")
    public void aKeywordSeleniumIsEnteredInInputField(String keyword) {

        WebElement element = driver.findElement(By.name("q"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(keyword);
        // Prześlij formularz
        element.submit();
        //Assert.fail(); - di psrawdzenia ze test failed
    }


    @Then("^the first one should contain (.*)$")
    public void theFirstOneShouldContainSelenium(String expectedText) {
        System.out.println(expectedText);
    }


    @And("^close browser$")
    public void closeBrowser() {
        driver.quit();
    }
}
