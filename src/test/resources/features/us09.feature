Feature:US_01_Dashboard_Elemanlarını_Kullanma

  @TC_09
Scenario:Hakkimizda_Sekmesi
  Given Kullanici_Anasayfaya_Gider
    When Kullanici_Bilgilendirme_Penceresini_Kapatir
    Then Kullanici_Hakkimizda_Sekmesinin_Kullanilabilir_Oldugunu_Dogrular
