package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US03_US12_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;
import static utilities.Driver.driver;

public class US03_StepDef {

    US03_US12_Pages acentemizOlunPage = new US03_US12_Pages();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(url));
        Thread.sleep(10);
        SearchContext searchContext = Driver.getDriver().findElement(By.xpath("//efilli-layout-default[@class='efilli-layout-default']")).getShadowRoot();
        WebElement rejectButton = searchContext.findElement(By.className("banner__accept-button"));
        ReusableMethods.click(rejectButton);
    }

    @Then("Cikan pop-up’i kapatir")
    public void cikanPopUpIKapatir() {
        ReusableMethods.click(acentemizOlunPage.popUpKapatmaXButonu);
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {

        try {
            Thread.sleep(sayi * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Dashboard’daki Is Ortagimiz Olun Yazisinin Uzerine Gelir ve Seceneklerin Acildigini Gorur")
    public void dashboardDakiIsOrtagimizOlunYazisininUzerineGelirVeSeceneklerinAcildiginiGorur() {

        Actions actions = new Actions(driver);
        actions.moveToElement(acentemizOlunPage.isOrtagimizOlunButonu).perform();
        acentemizOlunPage.acentemizOlunButonu.isDisplayed();
    }

    @And("Acilan seceneklerden Acentemiz Olun butonuna tiklar")
    public void acilanSeceneklerdenAcentemizOlunButonunaTiklar() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(acentemizOlunPage.isOrtagimizOlunButonu).perform();
        ReusableMethods.click(acentemizOlunPage.acentemizOlunButonu);
    }

    @And("Acentemiz Olun sayfasinin acildigini dogrular")
    public void acentemizOlunSayfasininAcildiginiDogrular() {
        assertTrue(acentemizOlunPage.acentemizOlunSayfasi.isDisplayed());
    }

    @And("Acilan sayfada Hemen Basvur butonuna tiklar")
    public void acilanSayfadaHemenBasvurButonunaTiklar() {
        ReusableMethods.click(acentemizOlunPage.hemenBasvurButonu);
    }

    @And("Acente Basvuru Formu kismina geldigini dogrular")
    public void acenteBasvuruFormuKisminaGeldiginiDogrular() {
        assertTrue(acentemizOlunPage.acenteBasvuruFormu.isDisplayed());
    }

    @And("Basvuru ilinizi secin-yazin kismina tiklar")
    public void basvuruIliniziSecinYazinKisminaTiklar() {
        ReusableMethods.click(acentemizOlunPage.basvuruIliButonu);
    }

    @And("Basvuru ilini secer-yazar Adana")
    public void basvuruIliniSecerYazarAdana() {
        acentemizOlunPage.adanaIliButonu.click();
    }

    @And("Basvuru ilini secer-yazar Ankara")
    public void basvuruIliniSecerYazarAnkara() {
        acentemizOlunPage.ankaraIliButonu.click();
    }

    @And("Basvuru ilini secer-yazar Denizli")
    public void basvuruIliniSecerYazarDenizli() {
        acentemizOlunPage.denizliIliButonu.click();
    }

    @And("Basvuru ilini secer-yazar Eskisehir")
    public void basvuruIliniSecerYazarEskisehir() {
        acentemizOlunPage.eskisehirIliButonu.click();
    }

    @And("Basvuru ilini secer-yazar Istanbul")
    public void basvuruIliniSecerYazarIstanbul() {
        acentemizOlunPage.istanbulIliButonu.click();
    }

    @And("Basvuru ilini secer-yazar Izmir")
    public void basvuruIliniSecerYazarIzmir() {
        acentemizOlunPage.izmirIliButonu.click();
    }

    @And("Basvuru ilini secer-yazar Tekirdag")
    public void basvuruIliniSecerYazarTekirdag() {
        acentemizOlunPage.tekirdagIliButonu.click();
    }

    @And("Lokasyon Ekle butonuna tiklar")
    public void lokasyonEkleButonunaTiklar() {
        acentemizOlunPage.lokasyonEkleButonu.click();
    }

    @And("Kisisel Bilgileriniz isim kismina {string} girer")
    public void kisiselBilgilerinizIsimKisminaGirer(String isim) {
        acentemizOlunPage.isimEkleme.sendKeys("Cosmo");
        //acentemizOlunPage.isimEkleme.sendKeys(isim);
    }

    @And("Kisisel Bilgileriniz soyisim kismina {string} girer")
    public void kisiselBilgilerinizSoyisimKisminaGirer(String soyisim) {
        acentemizOlunPage.soyisimEkleme.sendKeys("Kayne");
        //acentemizOlunPage.soyisimEkleme.sendKeys(soyisim);
    }

    @And("Kisisel Bilgileriniz yas kismina {string} girer")
    public void kisiselBilgilerinizYasKisminaGirer(String yas) {
        acentemizOlunPage.yasEkleme.sendKeys("35");
        //acentemizOlunPage.yasEkleme.sendKeys(yas);
    }

    @And("Kisisel Bilgileriniz telefon numarasi kismina {string} girer")
    public void kisiselBilgilerinizTelefonNumarasiKisminaGirer(String telNo) {
        acentemizOlunPage.telefonNumarasiEkleme.sendKeys("0555 111 11 11");
        //acentemizOlunPage.telefonNumarasiEkleme.sendKeys(telNo);
    }

    @And("Kisisel Bilgileriniz eposta kismina {string} girer")
    public void kisiselBilgilerinizEPostaKisminaGirer(String email) {
        acentemizOlunPage.emailEkleme.sendKeys("gmail@gmail.com");
        //acentemizOlunPage.emailEkleme.sendKeys(email);
    }

    @And("Kisisel Bilgileriniz kisminda egitim durumu Lisans Ustu secer")
    public void kisiselBilgilerinizKismindaEgitimDurumuLisansUstuSecer() {
        acentemizOlunPage.egitimDurumuSecmeButonu.click();
        acentemizOlunPage.egitimDurumuSecmeLisansUstu.click();
    }

    @And("Basvurunu Gonder butonuna tiklar")
    public void basvurunuGonderButonunaTiklar() {
        acentemizOlunPage.basvurunuGonderButonu.click();
    }

    @And("Basvurunuz ilgili ekiplerimiz ile paylasilmistir, tesekkur ederiz yazisini goruntuler")
    public void basvurunuzIlgiliEkiplerimizIlePaylasilmistirTesekkurEderizYazisiniGoruntuler() {
        acentemizOlunPage.basvuruOnayUyariYazisi.isDisplayed();
    }

    @And("Basarili bir sekilde basvuru yapildigini dogrular")
    public void basariliBirSekildeBasvuruYapildiginiDogrular() {
        assertTrue(acentemizOlunPage.basariliBasvuruIslemi.isDisplayed());
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Kisisel Bilgileriniz kismina isim girer")
    public void kisiselBilgilerinizKisminaIsimGirer() {
        acentemizOlunPage.isimEkleme.sendKeys("A");
    }

    @And("Kisisel Bilgileriniz kisminda egitim durumu Lisans secer")
    public void kisiselBilgilerinizKismindaEgitimDurumuLisansSecer() {
        acentemizOlunPage.egitimDurumuSecmeButonu.click();
        acentemizOlunPage.egitimDurumuSecmeLisans.click();
    }

    @And("Lutfen gerekli-hatali alanlari kontrol ediniz yazili hata mesajini alir")
    public void lutfenGerekliHataliAlanlariKontrolEdinizYaziliHataMesajiniAlir() {
        acentemizOlunPage.lutfenGerekliAlanlariKontrolEdinizUyariYazisi.isDisplayed();
    }

    @And("Minimum {int} karakter olmalidir yazili hata mesajini gorur")
    public void minimumKarakterOlmalidirYaziliHataMesajiniGorur(int arg0) {
        acentemizOlunPage.min2karakterOlmalidirUyariYazisi.isDisplayed();
    }

    @And("Basvuru isleminin tamamlanmadigini dogrular")
    public void basvuruIslemininTamamlanmadiginiDogrular() {
        assertTrue(acentemizOlunPage.basarisizBasvuruIslemiDogrulama.isDisplayed());
    }

    @And("Kisisel Bilgileriniz kismina soyisim girer")
    public void kisiselBilgilerinizKisminaSoyisimGirer() {
        acentemizOlunPage.soyisimEkleme.sendKeys("K");
    }

    @And("Kisisel Bilgileriniz kisminda egitim durumu On Lisans secer")
    public void kisiselBilgilerinizKismindaEgitimDurumuOnLisansSecer() {
        acentemizOlunPage.egitimDurumuSecmeButonu.click();
        acentemizOlunPage.egitimDurumuSecmeOnLisans.click();
    }

    @And("Kisisel Bilgileriniz kismina yas girer")
    public void kisiselBilgilerinizKisminaYasGirer() {
        acentemizOlunPage.yasEkleme.sendKeys("17");
    }

    @And("Kisisel Bilgileriniz kisminda egitim durumu Ortaokul-Lise secer")
    public void kisiselBilgilerinizKismindaEgitimDurumuOrtaokulLiseSecer() {
        acentemizOlunPage.egitimDurumuSecmeButonu.click();
        acentemizOlunPage.egitimDurumuSecmeOrtokulLise.click();
    }

    @And("Kisisel Bilgileriniz kismina telefon numarasi girer")
    public void kisiselBilgilerinizKisminaTelefonNumarasiGirer() {
        acentemizOlunPage.telefonNumarasiEkleme.sendKeys("0000 111 11 11");
    }

    @And("Lutfen gecerli bir cep telefonu numarasi giriniz yazili hata mesajini gorur")
    public void lutfenGecerliBirCepTelefonuNumarasiGirinizYaziliHataMesajiniGorur() {
        acentemizOlunPage.gecerliTelNoGirinizUyariYazisi.isDisplayed();
    }

    @And("Kisisel Bilgileriniz kismina email girer")
    public void kisiselBilgilerinizKisminaEmailGirer() {
        acentemizOlunPage.emailEkleme.sendKeys("@gmail.com");
    }

    @And("Lutfen gecerli bir mail adresi giriniz yazili hata mesajini gorur")
    public void lutfenGecerliBirMailAdresiGirinizYaziliHataMesajiniGorur() {
        acentemizOlunPage.gecerliEmailGirinizUyariYazisi.isDisplayed();
    }

    @And("Guvenlik kodu eksik ya da hatali yazili hata mesajini gorur")
    public void guvenlikKoduEksikYaDaHataliYaziliHataMesajiniGorur() {
        acentemizOlunPage.guvenlikKoduEksikYaDaHataliUyariYazisi.isDisplayed();
    }

}

