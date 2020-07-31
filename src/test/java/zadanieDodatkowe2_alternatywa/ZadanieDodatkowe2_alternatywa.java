package zadanieDodatkowe2_alternatywa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class ZadanieDodatkowe2_alternatywa {
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

        Random random = new Random();

        //generuje z alfabetu losowe litery
        String abc = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnoprstuvwxyz");

        String FirstName = String.valueOf(abc.charAt(random.nextInt(abc.length())));
        String LastName = String.valueOf(abc.charAt(random.nextInt(abc.length())));

        //generuje liczbe i wsadza w srodek tworzac unikowy emial
        String UserEmail = "email" + random.nextInt() + "@gmail.com";
        String PasswordG = "Pass" + random.nextInt();

        //zwarca obecna date
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String BirthG = dateFormat.format(date).toString();

        Firstname.sendKeys(FirstName);
        Lastname.sendKeys(LastName);
        Email.sendKeys(UserEmail);
        Password.sendKeys(PasswordG);
        Birth.sendKeys(BirthG);
        Offers.click();
        Newsletter.click();
        Newsletter.submit();

        //proba klikniecia w przycisk ADDRESSES - nie wychodzi

       // WebElement User = driver.findElement(By.xpath("/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a[2]"));
       // WebElement AddFirstAddress = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/a[2]"));
       // User.click();
       // AddFirstAddress.click();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");

        WebElement Alias = driver.findElement(By.name("alias"));
        WebElement Company = driver.findElement(By.name("company"));
        WebElement VatNumber = driver.findElement(By.name("vat_number"));
        WebElement Address = driver.findElement(By.name("address1"));
        WebElement PostCode = driver.findElement(By.name("postcode"));
        WebElement City = driver.findElement(By.name("city"));
        WebElement Phone = driver.findElement(By.name("phone"));

        //WebElement Country = driver.findElement(By.id("id_country")); //nie udalo sie jeszcze

        String AliasG = String.valueOf(abc.charAt(random.nextInt(abc.length())));
        String CompanyG = String.valueOf(abc.charAt(random.nextInt(abc.length())));
        String VatNumberG =  "Vat" + random.nextInt();
        String AddressG = "Address" + String.valueOf(abc.charAt(random.nextInt(abc.length())));

        //String PosCodeG = String.valueOf(random.nextInt()); //zly format
        int numer1 = random.nextInt(10)+10;
        int numer2 = random.nextInt(10)+10;
        int setNumer3= random.nextInt(899)+100;
        String PosCodeG = numer1+numer2  + "-" + setNumer3;

        String CityG = "City" + String.valueOf(abc.charAt(random.nextInt(abc.length())));
        String PhoneG = "00" + String.valueOf(random.nextInt());

        Alias.sendKeys(AliasG);
        Company.sendKeys(CompanyG);
        VatNumber.sendKeys(VatNumberG);
        Address.sendKeys(AddressG);
        PostCode.sendKeys(PosCodeG);
        City.sendKeys(CityG);
        Phone.sendKeys(PhoneG);
       // Country.isSelected(); //nie udalo sie jeszcze
        Phone.submit();
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        driver.quit();
    }
}
