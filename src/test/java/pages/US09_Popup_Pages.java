package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US09_Popup_Pages {

    public US09_Popup_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[text()=' Size nasıl yardımcı olabilirim? '])[1]")
    public static WebElement popup;

    @FindBy(xpath = "//div/a[starts-with(@href, 'https://bot.')]")
    public static WebElement devam;

    @FindBy(id = "pisano-text-input-9611e55f-7b0e-436b-9c29-88d7abd03910")
    public static WebElement adSoyadTextbox;

    @FindBy(id = "//button[@class='pisano-send-button margin-top-5']")
    public static WebElement gönder;

    @FindBy(id = "pisano-text-input-7788fbbc-3d63-4b29-b934-79868db3ae52")
    public static WebElement phonetextbox;






}
