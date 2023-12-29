Feature:US_01_Dashboard_Elemanlarını_Kullanma

  @TC_01
Scenario:Dashboard_Sekmeleri
  Given Kullanici_Anasayfaya_Gider
    When Kullanici_Bilgilendirme_Penceresini_Kapatir
    Then Kullanici_Hakkimizda_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular
    And Kullanici_Hakkimizda_Sekmesine_Tiklar
    And Kullanici_Hakkimizda_Sayfasında_Oldugunu_Dogrular

    Then Kullanici_Hizmetlerimiz_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular
    And Kullanici_Hizmetlerimiz_Sekmesine_Tiklar
    And Kullanici_Hizmetlerimiz_Sayfasinda_Oldugunu_Dogrular

    Then Kullanici_Kariyer_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular
    And Kullanici_Kariyer_Sekmesine_Tiklar
    And Kullanici_Kariyer_Sayfasinda_Oldugunu_Dogrular

    Then Kullanici_Sürdürülebilirlik_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular
    And Kullanici_Sürdürülebilirlik_Sekmesine_Tiklar
    And Kullanici_Sürdürülebilirlik_Sayfasinda_Oldugunu_Dogrular

    Then Kullanici_IsOrtagimizOlun_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular
    And Kullanici_IsOrtagimizOlun_Sekmesine_Tiklar
    And Kullanici_IsOrtagimizOlun_Sayfasinda_Oldugunu_Dogrular

    Then Kullanici_MusteriIliskileri_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular
    And Kullanici_MusteriIliskileri_Sekmesine_Tiklar
    And Kullanici_MusteriIliskileri_Sayfasinda_Oldugunu_Dogrular

    Then Kullanici_AKSK_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular
    And Kullanici_AKSK_Sekmesine_Tiklar
    And Kullanici_AKSK_Sayfasinda_Oldugunu_Dogrular

    Then Kullanici_BizeUlasin_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular
    And Kullanici_BizeUlasin_Sekmesine_Tiklar
    And Kullanici_BizeUlasin_Sayfasinda_Oldugunu_Dogrular

