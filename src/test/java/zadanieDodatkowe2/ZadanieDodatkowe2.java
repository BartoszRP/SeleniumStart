package zadanieDodatkowe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class ZadanieDodatkowe2 {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do strony z formularzem
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1");
    }

    @Test
    public void testGoogleSearch() {

        // Znajdź element FirstName
        WebElement Firstname = driver.findElement(By.name("firstname"));
        WebElement Lastname = driver.findElement(By.name("lastname"));

        String[] FirstName = {"Marek","Karol", "Darek"};
        String[] LastName = {"Kowalski","Kat", "Mak"};



        Random random = new Random();
        int randomFirstName = random.nextInt(3);
        int randomLastName = random.nextInt(3);

        Firstname.sendKeys(FirstName[randomFirstName]);
        Lastname.sendKeys(LastName[randomLastName]);

    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}
