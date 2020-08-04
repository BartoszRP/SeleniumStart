package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class CreateAnAccountSteps {
    private WebDriver driver;

    @Given("^an open browser with qloapps\\.coderslab\\.pl$")
    public void anOpenBrowserWithQloappsCoderslabPl() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do strony
        driver.get("https://qloapps.coderslab.pl/en/login?back=my-account");

    }


    @When("^User gives (.*) and click Create an account button$")
    public void userGivesEmailAndClickCreateAnAccountButton(String keyword) {
        WebElement element = driver.findElement(By.id("email_create"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(keyword);
        // Prześlij formularz
        element.submit();
        //Assert.fail(); - do srawdzenia ze test failed
    }

    @Then("^User fills up the form$")
    public void userFillsUpTheForm() {
        //tu bedzie wypisywanie po kolei co
//        WebElement Firstname = driver.findElement(By.id("customer_firstname"));
//        Firstname.clear();
        WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        // WebElement Email = driver.findElement(By.name("email"));
        WebElement Password = driver.findElement(By.id("passwd"));

//       String[] TFirstName = {"Marek", "Karol", "Darek"};
        String[] TLastName = {"Kowalski", "Kat", "Mak"};
        // String[] TEmail = {"Kowalsk545@gmmm.com", "Kat7548@gmmm.com", "Mak782278@gmmm.com", "Kowalski82275@gmmm.com", "Kat78228@gmmm.com", "Mak4512@gmmm.com"};
        String[] TPassword = {"123g4", "gg123", "tre333"};

        Random random = new Random();
//        int randomFirstName = random.nextInt(3);
        int randomLastName = random.nextInt(3);
        // int randomEmail = random.nextInt(6);
        int randomPassword = random.nextInt(3);

//       Firstname.sendKeys(TFirstName[randomFirstName]);
        Lastname.sendKeys(TLastName[randomLastName]);
        //   Email.sendKeys(TEmail[randomEmail]);
        Password.sendKeys(TPassword[randomPassword]);
    }


    @And("^close the browser$")
    public void closeTheBrowser() {
        //driver.quit();
    }
}
