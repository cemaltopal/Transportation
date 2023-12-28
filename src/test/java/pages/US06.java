package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US06 {
    public US06(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@class='takip-form no-p']")
    public WebElement ucreti_hesapla_button;

    @FindBy(xpath = "//*[@class='active']")
    public WebElement yurtdisi_button;

    @FindBy(xpath = "//*[text()='Teslim süreleri ve ücret hesaplama']")
    public WebElement ucrethesaplama_text;

    @FindBy(xpath = "//*[@class='mat-form-field-infix ng-tns-c2842056177-54']")
    public WebElement nereden_button;

    @FindBy(xpath = "//*[@class='mat-form-field-infix ng-tns-c2842056177-55']")
    public WebElement nereye_button;

    @FindBy(xpath = "(//*[@class='selectable-box_title'])[1])")
    public WebElement kutu_koli_button;

    @FindBy(xpath = "(//*[@class='selectable-box_title'])[2]")
    public WebElement dosya_evrak_button;

    @FindBy(xpath = "//*[@id='mat-input-51']")
    public WebElement agirlik_input;

    @FindBy(xpath = "//*[@id='mat-input-52']")
    public WebElement boy_input;

    @FindBy(xpath = "//*[@id='mat-input-53']")
    public WebElement yukselik_input;

    @FindBy(xpath = "//*[@id='mat-input-54']")
    public WebElement en_input;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement desi_hesapla;

    @FindBy(xpath = "//*[@class='info-box__title']")
    public WebElement gonderi_detayi;

    @FindBy(xpath = "//*[@class='item-total-price']")
    public WebElement toplam_ucret;

    @FindBy(xpath = "//*[@class='error-block ng-star-inserted']")
    public WebElement eror_text;

    @FindBy(xpath = "//*[text()='Sonuç bulunamadı. Girdiğiniz bilgileri kontrol ediniz.']")
    public WebElement popup_sonucbulunamadi;

    @FindBy(xpath = "//*[text()='Yeni Hesaplama Yap']")
    public WebElement yenihesaplamayap_text;



}
