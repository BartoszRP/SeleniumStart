package zadanieDodatkowe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class ZadanieDodatkowe1 {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do strony z formularzem
        driver.get("https://prod-kurs.coderslab.pl");
    }

    @Test
    public void testGoogleSearch() {
        // Znajdź element FirstName
        WebElement element = driver.findElement(By.name("s"));
        // Wyczyść teskst zapisany w elemencie
        element.clear();
        //stworz tablice z produktami do wyboru
        String[] products = {"HUMMINGBIRD PRINTED T-SHIRT",
                "FRAMED POSTER", "MUG THE BEST",
                "MOUNTAIN FOX CUSHION", "MOUNTAIN FOX NOTEBOOK", "Notebook",
                "Mug", "HUMMINGBIRD PRINTED SWEATER"
        };
        // Wpisz informacje do wyszukania
        Random random = new Random();
        int randomInteger = random.nextInt(8);

        //wybralem ta to zamiast propowanego na dole
        element.sendKeys(products[randomInteger]);

        // int wynik_dzielenia = randomInteger % products.length;
        //element.sendKeys(products[wynik_dzielenia]);

        // Prześlij formularz
        element.submit();
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}
