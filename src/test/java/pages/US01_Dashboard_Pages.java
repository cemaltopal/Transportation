package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01_Dashboard_Pages {

    public US01_Dashboard_Pages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='popup-close']")
    public static WebElement bilgilendirme;
    @FindBy(xpath = "//ul/li/a[text()='Hakkımızda']")
    public WebElement hakkimizda;
    @FindBy(xpath = "//h1[text()='Hakkımızda']")
    public WebElement hakkimizdaYazisi;

    @FindBy(xpath = "//ul/li/a[text()='Hizmetlerimiz']")
    public WebElement hizmetlerimiz;
    @FindBy(xpath = "//*[@class='pages-hero__title']")
    public WebElement hizmetlerimizYazisi;

    @FindBy(xpath = "//ul/li/a[text()='Kariyer']")
    public WebElement kariyer;

    @FindBy(xpath = "//ul/li/a[text()='Sürdürülebilirlik']")
    public WebElement sürdrlblrlk;

    @FindBy(xpath = "//ul/li/a[text()='İş Ortağımız Olun']")
    public WebElement isOrtagimiz;

    @FindBy(xpath = "//ul/li/a[text()='Müşteri İlişkileri']")
    public WebElement musteriIliskileri;

    @FindBy(xpath = "(//*[@href='/aras-kargo-spor-kulubu'  and @class='ng-tns-c588362358-0'])[1]")
    public WebElement AKSK;

    @FindBy(xpath = "//ul/li/a[text()='Bize Ulaşın']")
    public WebElement bizeUlasin;

    @FindBy(xpath = "//*[@class='detail-pages-hero__title']")
    public WebElement AKGMYazisi;

}
