package stepDefinitions;

import pages.US01_Dashboard_Pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_01 {
    US01_Dashboard_Pages dashboardPages = new US01_Dashboard_Pages();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici_Anasayfaya_Gider")
    public void kullanici_anasayfaya_gider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(5);
        SearchContext searchContext = Driver.getDriver().findElement(By.xpath("//efilli-layout-default[@class='efilli-layout-default']")).getShadowRoot();
        WebElement rejectButton = searchContext.findElement(By.className("banner__accept-button"));
        ReusableMethods.click(rejectButton);
    }
    @When("Kullanici_Bilgilendirme_Penceresini_Kapatir")
    public void kullanici_bilgilendirme_penceresini_kapatir() {
        if (dashboardPages.bilgilendirme.isDisplayed()) {
            ReusableMethods.click(dashboardPages.bilgilendirme);
        }
    }
    @Then("Kullanici_Hakkimizda_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular")
    public void kullanici_hakkimizda_sekmesinin_kullanilabilir_oldugunu_dogrular() {
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).sendKeys(Keys.ARROW_UP).perform();
        Assert.assertTrue(dashboardPages.hakkimizda.isEnabled());
    }
    @And("Kullanici_Hakkimizda_Sekmesine_Tiklar")
    public void kullanici_hakkimizda_sekmesine_tiklar() {
        ReusableMethods.click(dashboardPages.hakkimizda);
        ReusableMethods.waitFor(1);
    }
    @And ("Kullanici_Hakkimizda_Sayfasında_Oldugunu_Dogrular")
    public void kullanici_hakkimizda_sayfasında_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.hakkimizdaYazisi.isDisplayed());
    }


    @Then("Kullanici_Hizmetlerimiz_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular")
    public void kullanici_hizmetlerimiz_sekmesinin_kullanilabilir_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.hizmetlerimiz.isEnabled());
    }

    @And("Kullanici_Hizmetlerimiz_Sekmesine_Tiklar")
    public void kullanici_hizmetlerimiz_sekmesine_tiklar() {
        ReusableMethods.click(dashboardPages.hizmetlerimiz);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici_Hizmetlerimiz_Sayfasinda_Oldugunu_Dogrular")
    public void kullanici_hizmetlerimiz_sayfasinda_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.hizmetlerimizYazisi.isDisplayed());
    }

    @Then("Kullanici_Kariyer_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular")
    public void kullanici_kariyer_sekmesinin_kullanilabilir_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.kariyer.isEnabled());
    }

    @And("Kullanici_Kariyer_Sekmesine_Tiklar")
    public void kullanici_kariyer_sekmesine_tiklar() {
        ReusableMethods.click(dashboardPages.kariyer);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici_Kariyer_Sayfasinda_Oldugunu_Dogrular")
    public void kullanici_kariyer_sayfasinda_oldugunu_dogrular() {
        String actualKariyerTitle = Driver.getDriver().getTitle();
        String expectedKariyerTitle = "Kariyer | Aras Kargo";
        Assert.assertEquals(actualKariyerTitle,expectedKariyerTitle);
    }

    @Then("Kullanici_Sürdürülebilirlik_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular")
    public void kullanici_surdurulebilirlik_sekmesinin_kullanilabilir_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.sürdrlblrlk.isEnabled());
    }

    @And("Kullanici_Sürdürülebilirlik_Sekmesine_Tiklar")
    public void kullanici_surdurulebilirlik_sekmesine_tiklar() {
        ReusableMethods.click(dashboardPages.sürdrlblrlk);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici_Sürdürülebilirlik_Sayfasinda_Oldugunu_Dogrular")
    public void kullanici_surdurulebilirlik_sayfasinda_oldugunu_dogrular() {
        String ActualSrdrlbTitle = Driver.getDriver().getTitle();
        String ExpectedSrdrbTitle = "Sürdürülebilirlik | Aras Kargo";
        Assert.assertEquals(ActualSrdrlbTitle,ExpectedSrdrbTitle);
    }

    @Then("Kullanici_IsOrtagimizOlun_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular")
    public void kullanici_ısortagimizolun_sekmesinin_kullanilabilir_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.isOrtagimiz.isEnabled());
    }

    @And("Kullanici_IsOrtagimizOlun_Sekmesine_Tiklar")
    public void kullanici_ısortagimizolun_sekmesine_tiklar() {
        ReusableMethods.click(dashboardPages.isOrtagimiz);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici_IsOrtagimizOlun_Sayfasinda_Oldugunu_Dogrular")
    public void kullanici_ısortagimizolun_sayfasinda_oldugunu_dogrular() {
        String actualİsOrtakligiTitle = Driver.getDriver().getTitle();
        String expectedİsOrtakligiTitle = "İş Ortaklığı Sık Sorulan Sorular | Aras Kargo";
        Assert.assertEquals(actualİsOrtakligiTitle,expectedİsOrtakligiTitle);
    }

    @Then("Kullanici_MusteriIliskileri_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular")
    public void kullanici_musteriıliskileri_sekmesinin_kullanilabilir_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.musteriIliskileri.isEnabled());
    }

    @And("Kullanici_MusteriIliskileri_Sekmesine_Tiklar")
    public void kullanici_musteriıliskileri_sekmesine_tiklar() {
        ReusableMethods.click(dashboardPages.musteriIliskileri);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici_MusteriIliskileri_Sayfasinda_Oldugunu_Dogrular")
    public void kullanici_musteriıliskileri_sayfasinda_oldugunu_dogrular() {
        String actualMustIlskTitle = Driver.getDriver().getTitle();
        String expectedMustIlsTitle = "Müşteri İlişkileri | Aras Kargo";
        Assert.assertEquals(actualMustIlskTitle,expectedMustIlsTitle);
    }

    @Then("Kullanici_AKSK_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular")
    public void kullanici_aksk_sekmesinin_kullanilabilir_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.AKSK.isEnabled());
    }

    @And("Kullanici_AKSK_Sekmesine_Tiklar")
    public void kullanici_aksk_sekmesine_tiklar() {
        ReusableMethods.click(dashboardPages.AKSK);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici_AKSK_Sayfasinda_Oldugunu_Dogrular")
    public void kullanici_aksk_sayfasinda_oldugunu_dogrular() {
        String actualAKSKTitle = Driver.getDriver().getTitle();
        String expectedAKSKTitle = "Aras Kargo Spor Kulübü | Aras Kargo";
        Assert.assertEquals(actualAKSKTitle,expectedAKSKTitle);
    }

    @Then("Kullanici_BizeUlasin_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular")
    public void kullanici_bizeulasin_sekmesinin_kullanilabilir_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.bizeUlasin.isEnabled());
    }

    @And("Kullanici_BizeUlasin_Sekmesine_Tiklar")
    public void kullanici_bizeulasin_sekmesine_tiklar() {
        ReusableMethods.click(dashboardPages.bizeUlasin);
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici_BizeUlasin_Sayfasinda_Oldugunu_Dogrular")
    public void kullanici_bizeulasin_sayfasinda_oldugunu_dogrular() {
        Assert.assertTrue(dashboardPages.AKGMYazisi.isDisplayed());
    }
}
