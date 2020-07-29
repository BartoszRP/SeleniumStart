package zadanie2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class TestFormularza {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void testGoogleSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement FirstName = driver.findElement(By.id("first-name"));
        // Wyczyść teskst zapisany w elemencie
        FirstName.clear();
        // Wpisz informacje do pola FirstName
        FirstName.sendKeys("Karol");


        WebElement LastName = driver.findElement(By.id("last-name"));
        // Wyczyść teskst zapisany w elemencie
        LastName.clear();
        // Wpisz informacje do pola LastName
        LastName.sendKeys("Kowalski");

// tutaj zobaczcy nagranie zeby zrobic

        WebElement Gender = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        Gender.click();

        WebElement DateBirth = driver.findElement(By.id("dob"));
        // Wyczyść teskst zapisany w elemencie
        DateBirth.clear();
        // Wpisz informacje do pola DateBirth
        DateBirth.sendKeys("05/22/2010");

        WebElement Adres = driver.findElement(By.id("address"));
        // Wyczyść teskst zapisany w elemencie
        Adres.clear();
        // Wpisz informacje do pola Adres
        Adres.sendKeys("Prosta 51");
        // Prześlij formularz
        Adres.submit();

        WebElement Email = driver.findElement(By.id("email"));
        // Wyczyść teskst zapisany w elemencie
        Email.clear();
        // Wpisz informacje do pola Email
        Email.sendKeys("karol.kowalski@mailinator.com");
        // Prześlij formularz
        Email.submit();

        WebElement Password = driver.findElement(By.id("password"));
        // Wyczyść teskst zapisany w elemencie
        Password.clear();
        // Wpisz informacje do pola Password
        Password.sendKeys("Pass123");
        // Prześlij formularz
        Password.submit();

        WebElement Company = driver.findElement(By.id("company"));
        // Wyczyść teskst zapisany w elemencie
        Company.clear();
        // Wpisz informacje do pola Company
        Company.sendKeys("Coders Lab");
        // Prześlij formularz
        Company.submit();

        WebElement Comment = driver.findElement(By.id("comment"));
        // Wyczyść teskst zapisany w elemencie
        Comment.clear();
        // Wpisz informacje do pola Company
        Comment.sendKeys("To jest mój pierwszy automat testowy");
        // Prześlij formularz
        Comment.submit();
    }

    @After
    public void tearDown() throws Exception {
        //Zamknij przeglądarkę
        driver.quit();
    }
}
