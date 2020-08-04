package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    private WebElement loginInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit-login")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@class='account']")
    private WebElement userName;

    public void loginAs(String email, String password) {
        //  WebElement loginInput = driver.findElement(By.name("email")); // PageFactory(@Find... - wtedy to wywallamy i tu zmieniamy raz a nie klilka razy bezposrednio w LogintTEST
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);

        //  WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        //   WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
    }

    public String getLoggedUsername() {
        //   WebElement userName = driver.findElement(By.xpath("//a[@class='account']"));
        return userName.getText();
    }

}
