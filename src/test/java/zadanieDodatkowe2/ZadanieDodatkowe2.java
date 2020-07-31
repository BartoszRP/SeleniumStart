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
        //wyszukiwanie elementow na stronie
        WebElement Firstname = driver.findElement(By.name("firstname"));
        WebElement Lastname = driver.findElement(By.name("lastname"));
        WebElement Email = driver.findElement(By.name("email"));
        WebElement Password = driver.findElement(By.name("password"));
        WebElement Birth = driver.findElement(By.name("birthday"));
        WebElement Offers = driver.findElement(By.name("optin"));
        WebElement Newsletter = driver.findElement(By.name("newsletter"));

        //przygotowanie tablic z informacjami potrzebnymi do wypelnienia formularza
        String[] TFirstName = {"Marek", "Karol", "Darek"};
        String[] TLastName = {"Kowalski", "Kat", "Mak"};
        String[] TEmail = {"Kowalsk1345@gmmm.com", "Kat154@gmmm.com", "Mak1534@gmmm.com", "Kowalski1534@gmmm.com", "Kat1534@gmmm.com", "Mak543@gmmm.com"};
        String[] TPassword = {"123g", "gg123", "tre333"};
        String[] TBirth = {"12/05/1980", "15/08/1983", "21/03/1981"};

        //losowy generator czerpiacy dane z poszczegolnych list
        Random random = new Random();
        int randomFirstName = random.nextInt(3);
        int randomLastName = random.nextInt(3);
        int randomEmail = random.nextInt(6);
        int randomPassword = random.nextInt(3);
        int randomBirth = random.nextInt(3);

        //wpisaywanie atrybutow do wskazanaych miejsc

        Firstname.sendKeys(TFirstName[randomFirstName]);
        Lastname.sendKeys(TLastName[randomLastName]);
        Email.sendKeys(TEmail[randomEmail]);
        Password.sendKeys(TPassword[randomPassword]);
        Birth.sendKeys(TBirth[randomBirth]);
        Offers.click();
        Newsletter.click();
        //zakonczenie formularza i zatwerdzenie
        Newsletter.submit();

        // Przejdź do strony z formularzem
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");


        // nie jestem pewien czy mam isc bezposrednio do strony jak link wyzej czy probowac przez klikniecie
        // nie moge znalezc odpowiedniego elementu do wskazania

        //  WebElement User = driver.findElement(By.cssSelector("hidden-sm-down"));


        //wszystkie operacje jak wyzej

        WebElement Alias = driver.findElement(By.name("alias"));
        WebElement Company = driver.findElement(By.name("company"));
        WebElement Adres = driver.findElement(By.name("address1"));
        WebElement Postcode = driver.findElement(By.name("postcode"));
        WebElement City = driver.findElement(By.name("city"));
        WebElement Phone = driver.findElement(By.name("phone"));

        String[] TAlias = {"ted", "maks", "guci"};
        String[] TCompany = {"Micro", "Makro", "Takro"};
        String[] TAdres = {"ul.Kasztanowa", "ul.Buraczana", "ul.Zgorzkniala"};
        String[] TPostcode = {"25-325", "11-346", "65-347"};
        String[] TCity = {"Gdynia", "Krynica", "Krakow"};
        String[] TPhone = {"600-501-502", "600-660-660", "600-758-585"};

        int randomAlias = random.nextInt(3);
        int randomCompany = random.nextInt(3);
        int randomAdres = random.nextInt(3);
        int randomPostcode = random.nextInt(3);
        int randomCity = random.nextInt(3);
        int randomPhone = random.nextInt(3);

        Alias.sendKeys(TAlias[randomAlias]);
        Company.sendKeys(TCompany[randomCompany]);
        Adres.sendKeys(TAdres[randomAdres]);
        Postcode.sendKeys(TPostcode[randomPostcode]);
        City.sendKeys(TCity[randomCity]);
        Phone.sendKeys(TPhone[randomPhone]);
        Phone.submit();
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}
