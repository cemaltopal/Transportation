package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US08 {
    public US08(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[@href='/musteri-iliskileri'])[1]")
    public WebElement musteriIliskileriButonu;

    @FindBy(xpath = "(//a[@href=\"/musteri-iliskileri/geri-bildirim-formu\"])[1]")
    public WebElement musteriIliskileriBildirimFormu;

    @FindBy(xpath = "//span[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c84697453-15 ng-star-inserted\"]")
    public WebElement kategoriSecme;

    @FindBy(xpath = "//*[@id=\"mat-option-7\"]")
    public WebElement bilgiButonu;

    @FindBy(xpath = "//*[@id=\"mat-option-8\"]")
    public WebElement islemTalep;

    @FindBy(xpath = "//*[@id=\"mat-option-9”]")
    public WebElement oneriButonu;

    @FindBy(xpath = "//*[@id=\"mat-option-10”]")
    public WebElement sikayetButonu;

    @FindBy(xpath = "//*[@id=\"mat-option-11”]")
    public WebElement tesekkurButonu;
     @FindBy(xpath = "//*[@id=\"mat-select-value-1\"]")
    public WebElement butonDogrulama;















}

