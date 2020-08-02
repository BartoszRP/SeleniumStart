package Funkcje_przyklady;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

public class Funkcje_1 {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        driver.get("https://pl.wikipedia.org/");

    }

    @Test
    public void testGoogleSearch() {

        //  WebElement element = driver.findElement(By.id("main-page-column1"));
        //  System.out.println(element.getText());

        //  String atrybut = driver.findElement(By.id("main-page-content")).getAttribute("class");
        //  System.out.println(atrybut);

        //  String tag = driver.findElement(By.id("main-page-content")).getTagName();
        //  System.out.println(tag);

        //WebElement search = driver.findElement(By.id("searchInput"));
        //if (search.isEnabled()) {
        //    search.sendKeys("Selenium");
        //    search.submit();
        //} else {
        //    Assert.fail();

        WebElement search = driver.findElement(By.id("searchInput"));
        if (search.isDisplayed()) {
            search.sendKeys("Selenium");
            search.submit();
        } else {
            Assert.fail();

        }

    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        // driver.quit();
    }
}
