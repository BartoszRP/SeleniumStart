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

        WebElement Firstname = driver.findElement(By.name("firstname"));
        WebElement Lastname = driver.findElement(By.name("lastname"));
        WebElement Email = driver.findElement(By.name("email"));
        WebElement Password = driver.findElement(By.name("password"));
        WebElement Birth = driver.findElement(By.name("birthday"));
        WebElement Offers = driver.findElement(By.name("optin"));
        WebElement Newsletter = driver.findElement(By.name("newsletter"));


        String[] TFirstName = {"Marek", "Karol", "Darek"};
        String[] TLastName = {"Kowalski", "Kat", "Mak"};
        String[] TEmail = {"Kowalski4@gmmm.com", "Kat4@gmmm.com", "Mak4@gmmm.com"};
        String[] TPassword = {"123g", "gg123", "tre333"};
        String[] TBirth = {"12/05/1980", "15/08/1983", "21/03/1981"};


        Random random = new Random();
        int randomFirstName = random.nextInt(3);
        int randomLastName = random.nextInt(3);
        int randomEmail = random.nextInt(3);
        int randomPassword = random.nextInt(3);
        int randomBirth = random.nextInt(3);

        Firstname.sendKeys(TFirstName[randomFirstName]);
        Lastname.sendKeys(TLastName[randomLastName]);
        Email.sendKeys(TEmail[randomEmail]);
        Password.sendKeys(TPassword[randomPassword]);
        Birth.sendKeys(TBirth[randomBirth]);
        Offers.click();
        Newsletter.click();
        Newsletter.submit();

        //driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");

      //  WebElement User = driver.findElement(By.cssSelector("hidden-sm-down"));

      //  WebElement Alias = driver.findElement(By.name("alias"));
      //  WebElement Company = driver.findElement(By.name("company"));
      //  WebElement Adres = driver.findElement(By.name("adress1"));
      //  WebElement Postcode = driver.findElement(By.name("postcode"));
      //  WebElement City = driver.findElement(By.name("city"));

      //  String[] TAlias = {"ted", "maks", "guci"};
      //  String[] TCompany = {"Micro", "Makro", "Takro"};
      //  String[] TAdres = {"ul.x", "ul.y", "ul.z"};
      //  String[] TPostcode = {"345", "346", "347"};
      //  String[] TCity = {"Gdynia", "Krynica", "Krakow"};

      //  int randomAlias = random.nextInt(3);
      //  int randomCompany = random.nextInt(3);
      //  int randomAdres = random.nextInt(3);
      //  int randomPostcode = random.nextInt(3);
      //  int randomCity = random.nextInt(3);

      //  User.click();

      //  Alias.sendKeys(TAlias[randomAlias]);
      //  Company.sendKeys(TCompany[randomCompany]);
      //  Adres.sendKeys(TAdres[randomAdres]);
      //  Postcode.sendKeys(TPostcode[randomPostcode]);
      //  City.sendKeys(TCity[randomCity]);


    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}
