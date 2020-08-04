package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
    private WebDriver driver;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "alias")
    private WebElement aliasInput;

    @FindBy(name = "company")
    private WebElement companyInput;

    @FindBy(name = "address1")
    private WebElement addressInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "postcode")
    private WebElement zipInput;

  //  @FindBy(name = "id_country")
  //  WebElement countryInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(xpath= "//*[@id=\"content\"]/div/div/form/footer/button")
    private WebElement submitButton;

    @FindBy(css = ".alert.alert-success")
    private WebElement successInformation;

    @FindBy(name = "id_country")
    private WebElement countrySelect;

    public void setAlias(String alias) {
        aliasInput.click();
        aliasInput.clear();
        aliasInput.sendKeys(alias);
    }

    public void setCompany(String company) {
        companyInput.click();
        companyInput.clear();
        companyInput.sendKeys(company);
    }

    public void setAddress(String address) {
        addressInput.click();
        addressInput.clear();
        addressInput.sendKeys(address);
    }
    public void setCity(String city) {
        cityInput.click();
        cityInput.clear();
        cityInput.sendKeys(city);
    }

    public void setZip(String zip) {
        zipInput.click();
        zipInput.clear();
        zipInput.sendKeys(zip);

    }
//spytac sie jak to bedzie z krajem??
    public void setCountry() {
        countrySelect.click();
        countrySelect.clear();
        countrySelect.isSelected();

    }
    public void setPhone(String phone) {
        phoneInput.click();
        phoneInput.clear();
        phoneInput.sendKeys(phone);

    }
    public void submitUserInfo() {
        submitButton.click();
    }

    public String getUpdateInformation() {
        return successInformation.getText();
    }

}
