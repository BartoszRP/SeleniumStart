package zadanie2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFormularza_2 {
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
        // Znajdź element wprowadzania tekstu na podstawie jego id/xpath
        WebElement FirstName = driver.findElement(By.id("first-name"));
        WebElement LastName = driver.findElement(By.id("last-name"));
        WebElement Gender = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        WebElement DateBirth = driver.findElement(By.id("dob"));
        WebElement Adres = driver.findElement(By.id("address"));

        FirstName.sendKeys("Karol");
        LastName.sendKeys("Kowalski");
        Gender.click();
        DateBirth.sendKeys("05/22/2010");
        Adres.sendKeys("Prosta 51");
        Adres.submit();

        WebElement Email = driver.findElement(By.id("email"));
        WebElement Password = driver.findElement(By.id("password"));
        WebElement Company = driver.findElement(By.id("company"));
        WebElement Comment = driver.findElement(By.id("comment"));

        Email.sendKeys("karol.kowalski@mailinator.com");
        Password.sendKeys("Pass123");
        Company.sendKeys("Coders Lab");
        Comment.sendKeys("To jest mój pierwszy automat testowy");
        Comment.submit();
    }

    @After
    public void tearDown() throws Exception {
        //Zamknij przeglądarkę
        driver.quit();
    }
}
