package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US03_US12_Pages {
    public US03_US12_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement popUpKapatmaXButonu;

    @FindBy(xpath = "(//*[text()='İş Ortağımız Olun'])[1]")
    public WebElement isOrtagimizOlunButonu;

    @FindBy(xpath = "//*[text()='Acentemiz Olun']")
    public WebElement acentemizOlunButonu;

    @FindBy(xpath = "//*[@class='detail-pages-hero__title']")
    public WebElement acentemizOlunSayfasi;

    @FindBy(xpath = "(//*[@class='small-btn'])[2]") //  //*[text()=' Hemen Başvur ']
    public WebElement hemenBasvurButonu;

    @FindBy(xpath = "//*[@class='large-form_group_titlebig']") //   //*[text()=' Acente Başvuru Formu ']
    public WebElement acenteBasvuruFormu;

    @FindBy(xpath = "//*[@id='mat-input-1']")
    public WebElement basvuruIliButonu;

    @FindBy(xpath = "//*[text()=' ADANA - ADANA (1) ']")
    public WebElement adanaIliButonu;

    @FindBy(xpath = "//*[text()=' ANKARA - ÇANKAYA (16) ']")
    public WebElement ankaraIliButonu;

    @FindBy(xpath = "//*[text()=' DENİZLİ - DENİZLİ (1) ']")
    public WebElement denizliIliButonu;

    @FindBy(xpath = "//*[text()=' ESKİŞEHİR - ESKİŞEHİR (3) ']")
    public WebElement eskisehirIliButonu;

    @FindBy(xpath = "//*[text()=' İSTANBUL - KARTAL (2) ']")
    public WebElement istanbulIliButonu;

    @FindBy(xpath = "//*[text()=' İZMİR - ÇİĞLİ (1) ']")
    public WebElement izmirIliButonu;

    @FindBy(xpath = "//*[text()=' TEKİRDAĞ - ÇORLU (3) ']")
    public WebElement tekirdagIliButonu;
    @FindBy(xpath = "(//*[@class='col-md-6'])[3]")
    public WebElement lokasyonEkleButonu;

    @FindBy(xpath = "//*[@id='mat-input-6']") //    //*[@class='mat-form-field-flex ng-tns-c2842056177-15']
    public WebElement isimEkleme;

    @FindBy(xpath = "//*[@id='mat-input-7']")
    public WebElement soyisimEkleme;

    @FindBy(xpath = "//*[@id='mat-input-8']")
    public WebElement yasEkleme;

    @FindBy(xpath = "//*[@id='mat-input-9']")
    public WebElement telefonNumarasiEkleme;

    @FindBy(xpath = "//*[@id='mat-input-10']")
    public WebElement emailEkleme;

    @FindBy(xpath = "//*[@id='mat-select-value-1']") //   //*[@id='mat-select-0']
    public WebElement egitimDurumuSecmeButonu;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[1]")
    public WebElement egitimDurumuSecmeOrtokulLise;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[2]")
    public WebElement egitimDurumuSecmeOnLisans;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[3]")
    public WebElement egitimDurumuSecmeLisans;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[4]")
    public WebElement egitimDurumuSecmeLisansUstu;

    @FindBy(xpath = "//*[@type='submit']") //   (//*[@class='small-btn'])[3]
    public WebElement basvurunuGonderButonu;

    @FindBy(xpath = "//*[@class='form form-result__dialog']")
    public WebElement basvuruOnayUyariYazisi;

    @FindBy(xpath = "(//*[@type='button'])[4]")
    public WebElement basariliBasvuruIslemi;

    @FindBy(xpath = "(//*[@class='error-block ng-star-inserted'])[1]")
    public WebElement min2karakterOlmalidirUyariYazisi;

    @FindBy(xpath = "//*[@class='mat-simple-snack-bar-content']") //    //*[text()='Lütfen gerekli / hatalı alanları kontrol ediniz']
    public WebElement lutfenGerekliAlanlariKontrolEdinizUyariYazisi;

    @FindBy(xpath = "(//*[@class='error-block ng-star-inserted'])[1]")
    public WebElement basarisizBasvuruIslemiDogrulama;

    @FindBy(xpath = "(//*[@class='error-block ng-star-inserted'])[1]")
    public WebElement gecerliTelNoGirinizUyariYazisi;

    @FindBy(xpath = "(//*[@class='error-block ng-star-inserted'])[1]")
    public WebElement gecerliEmailGirinizUyariYazisi;

    @FindBy(xpath = "//*[@class='captcha-error ng-star-inserted']")
    public WebElement guvenlikKoduEksikYaDaHataliUyariYazisi;

    @FindBy(xpath = "(//*[@class='menu-item ng-tns-c588362358-0 ng-star-inserted'])[6]")
    public WebElement musteriIliskileriButonu;

    @FindBy(xpath = "//*[text()='SSS']")
    public WebElement sssButonu;

    @FindBy(xpath = "//*[@class='detail-pages-hero__title']") //    (//*[text()='Sık Sorulan Sorular'])[2]
    public WebElement sssSayfasi;

    @FindBy(xpath = "//*[text()='Kargom ne zaman gelir?']") //    //*[@id='mat-expansion-panel-header-0']
    public WebElement kargomNeZamanGelirYazisi;

    @FindBy(xpath = "(//*[@class='customer-relationship-pages__subtitle'])[1]")
    public WebElement kargomNeZamanGelirYazisiAcilmaPaneli;
    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-24']") //    //*[text()='Kargom nerede, nasıl öğrenebilirim?']
    public WebElement kargomNeredeNasilOgrenebilirimYazisi;
    @FindBy(xpath = "(//*[text()='Web Sitesi:'])[1]")
    public WebElement kargomNeredeNasilOgrenebilirimYazisiAcilmaPaneli;

    @FindBy(xpath = "//*[text()=' Aras Tahsilatlı ile İlgili Sıkça Sorulan Sorular ']")
    public WebElement arasTahsilatliIleIlgiliSorulanSorularYazisi;

    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-27']") //  //*[text()='Aras Tahsilatlı nedir?']
    public WebElement arasTahsilatliNedirYazisi;

    @FindBy(xpath = "(//*[@class='customer-relationship-pages__subtitle'])[5]")
    public WebElement arasTahsilatliNedirYazisiAcilmaPaneli;

    @FindBy(xpath = "//*[text()='Aras Tahsilatlı’yı kimler kullanabilir?']") //  //*[@id='mat-expansion-panel-header-32']
    public WebElement arasTahsilatliKimlerKullanabilirYazisi;

    @FindBy(xpath = "//*[@id='cdk-accordion-child-32']")
    public WebElement arasTahsilatliKimlerKullanabilirYazisiAcilmaPaneli;

    @FindBy(xpath = "//*[text()=' E-Ödeme ile İlgili Sıkça Sorulan Sorular ']")
    public WebElement eOdemeIleIlgiliSorulanSorularYazisi;

    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-34']")//   //*[text()='Aras e-ödeme nedir?']
    public WebElement arasEOdemeNedirYazisi;
    @FindBy(xpath = "//*[@id='cdk-accordion-child-34']")
    public WebElement arasEOdemeNedirYazisiAcilmaPaneli;

    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-47']")//   //*[text()='Otomatik ödeme talimatı verebilir miyim?']
    public WebElement otomatikOdemeTalimatiVerebilirMiyimYazisi;
    @FindBy(xpath = "//*[@id='cdk-accordion-child-47']")
    public WebElement otomatikOdemeTalimatiVerebilirMiyimYazisiAcilmaPaneli;
    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-44']")
    public WebElement otomatikOdemeTalimatiVerebilirMiyimEkrani;
}

