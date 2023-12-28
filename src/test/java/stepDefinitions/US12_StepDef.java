package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import pages.US03_US12_Pages;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;

public class US12_StepDef {

    US03_US12_Pages musteriIliskileriSSS = new US03_US12_Pages();
    @And("Dashboard’daki Musteri Iliskileri Yazisinin Uzerine Gelir ve Seceneklerin Acildigini Gorur")
    public void dashboardDakiMusteriIliskileriYazisininUzerineGelirVeSeceneklerinAcildiginiGorur() {
        Actions actions = new Actions(driver);
        actions.moveToElement(musteriIliskileriSSS.musteriIliskileriButonu).perform();
        musteriIliskileriSSS.sssButonu.isDisplayed();
    }

    @And("Acilan seceneklerden SSS butonuna tiklar")
    public void acilanSeceneklerdenSSSButonunaTiklar() {
        ReusableMethods.click(musteriIliskileriSSS.sssButonu);
    }

    @And("Sik Sorulan Sorular sayfasinin acildigini dogrular")
    public void sikSorulanSorularSayfasininAcildiginiDogrular() {
        assertTrue(musteriIliskileriSSS.sssSayfasi.isDisplayed());
    }

    @And("Kargom ne zaman gelir? butonunun uzerine tiklar")
    public void kargomNeZamanGelirButonununUzerineTiklar() {
        ReusableMethods.click(musteriIliskileriSSS.kargomNeZamanGelirYazisi);
    }

    @And("Acilan cevapta Kargom ne zaman gelir? sorusuna cevap verildigini dogrular")
    public void acilanCevaptaKargomNeZamanGelirSorusunaCevapVerildiginiDogrular() {
        assertTrue(musteriIliskileriSSS.kargomNeZamanGelirYazisiAcilmaPaneli.isDisplayed());
    }

    @And("Kargom nerede, nasil ogrenebilirim? butonunun uzerine tiklar")
    public void kargomNeredeNasilOgrenebilirimButonununUzerineTiklar() {
        ReusableMethods.click(musteriIliskileriSSS.kargomNeredeNasilOgrenebilirimYazisi);
    }

    @And("Acilan cevapta Kargom nerede, nasil ogrenebilirim? sorusuna cevap verildigini dogrular")
    public void acilanCevaptaKargomNeredeNasilOgrenebilirimSorusunaCevapVerildiginiDogrular() {
        assertTrue(musteriIliskileriSSS.kargomNeredeNasilOgrenebilirimYazisiAcilmaPaneli.isDisplayed());
    }

    @And("Aras Tahsilatli ile ilgili Sikca Sorulan Sorular kismina gelir")
    public void arasTahsilatliIleIlgiliSikcaSorulanSorularKisminaGelir() {
        ReusableMethods.scroll("", musteriIliskileriSSS.arasTahsilatliIleIlgiliSorulanSorularYazisi);
    }

    @And("Aras Tahsilatli nedir? butonunun uzerine tiklar")
    public void arasTahsilatliNedirButonununUzerineTiklar() {
        ReusableMethods.click(musteriIliskileriSSS.arasTahsilatliNedirYazisi);
    }

    @And("Acilan cevapta Aras Tahsilatli nedir? sorusuna cevap verildigini dogrular")
    public void acilanCevaptaArasTahsilatliNedirSorusunaCevapVerildiginiDogrular() {
        assertTrue(musteriIliskileriSSS.arasTahsilatliNedirYazisiAcilmaPaneli.isDisplayed());
    }

    @And("Aras Tahsilatli’yi kimler kullanabilir? butonunun uzerine tiklar")
    public void arasTahsilatliYiKimlerKullanabilirButonununUzerineTiklar() {
        ReusableMethods.click(musteriIliskileriSSS.arasTahsilatliKimlerKullanabilirYazisi);
    }

    @And("Acilan cevapta Aras Tahsilatli’yi kimler kullanabilir? sorusuna cevap verildigini dogrular")
    public void acilanCevaptaArasTahsilatliYiKimlerKullanabilirSorusunaCevapVerildiginiDogrular() {
        assertTrue(musteriIliskileriSSS.arasTahsilatliKimlerKullanabilirYazisiAcilmaPaneli.isDisplayed());
    }

    @And("E-Odeme ile ilgili Sikca Sorulan Sorular kismina gelir")
    public void eOdemeIleIlgiliSikcaSorulanSorularKisminaGelir() {
        ReusableMethods.scroll("", musteriIliskileriSSS.eOdemeIleIlgiliSorulanSorularYazisi);
    }

    @And("Aras e-odeme nedir? butonunun uzerine tiklar")
    public void arasEOdemeNedirButonununUzerineTiklar() {
        ReusableMethods.click(musteriIliskileriSSS.arasEOdemeNedirYazisi);
    }

    @And("Acilan cevapta Aras e-odeme nedir? sorusuna cevap verildigini dogrular")
    public void acilanCevaptaArasEOdemeNedirSorusunaCevapVerildiginiDogrular() {
        assertTrue(musteriIliskileriSSS.arasEOdemeNedirYazisiAcilmaPaneli.isDisplayed());
    }

    @And("Otomatik odeme talimati verebilir miyim? butonunun uzerine tiklar")
    public void otomatikOdemeTalimatiVerebilirMiyimButonununUzerineTiklar() {
        ReusableMethods.click(musteriIliskileriSSS.otomatikOdemeTalimatiVerebilirMiyimYazisi);
    }

    @And("Acilan cevapta Otomatik odeme talimati verebilir miyim? sorusuna cevap verildigini dogrular")
    public void acilanCevaptaOtomatikOdemeTalimatiVerebilirMiyimSorusunaCevapVerildiginiDogrular() {
        ReusableMethods.scroll("", musteriIliskileriSSS.otomatikOdemeTalimatiVerebilirMiyimEkrani);
        assertTrue(musteriIliskileriSSS.otomatikOdemeTalimatiVerebilirMiyimYazisiAcilmaPaneli.isDisplayed());

    }
}

