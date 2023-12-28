@us12Nermin
Feature:
  Background:
    Given kullanici "url" sayfasina gider
    Then Cikan pop-up’i kapatir
    But kullanici 1 saniye bekler
    And Dashboard’daki Musteri Iliskileri Yazisinin Uzerine Gelir ve Seceneklerin Acildigini Gorur
    But kullanici 1 saniye bekler
    And Acilan seceneklerden SSS butonuna tiklar
    But kullanici 1 saniye bekler
    And Sik Sorulan Sorular sayfasinin acildigini dogrular
    But kullanici 1 saniye bekler

  Scenario: TC01 Musteri Iliskileri sekmesindeki SSS ulasabilme islemi

    And Kargom ne zaman gelir? butonunun uzerine tiklar
    But kullanici 1 saniye bekler
    And Acilan cevapta Kargom ne zaman gelir? sorusuna cevap verildigini dogrular
    But kullanici 1 saniye bekler
    And sayfayi kapatir


  Scenario: TC02 Musteri Iliskileri sekmesindeki SSS ulasabilme islemi

    And Kargom nerede, nasil ogrenebilirim? butonunun uzerine tiklar
    But kullanici 1 saniye bekler
    And Acilan cevapta Kargom nerede, nasil ogrenebilirim? sorusuna cevap verildigini dogrular
    But kullanici 1 saniye bekler
    And sayfayi kapatir

  Scenario: TC03 Musteri Iliskileri sekmesindeki SSS ulasabilme islemi

    And Aras Tahsilatli ile ilgili Sikca Sorulan Sorular kismina gelir
    But kullanici 1 saniye bekler
    And Aras Tahsilatli nedir? butonunun uzerine tiklar
    But kullanici 1 saniye bekler
    And Acilan cevapta Aras Tahsilatli nedir? sorusuna cevap verildigini dogrular
    But kullanici 1 saniye bekler
    And sayfayi kapatir

  Scenario: TC04 Musteri Iliskileri sekmesindeki SSS ulasabilme islemi

    And Aras Tahsilatli ile ilgili Sikca Sorulan Sorular kismina gelir
    But kullanici 1 saniye bekler
    And Aras Tahsilatli’yi kimler kullanabilir? butonunun uzerine tiklar
    But kullanici 1 saniye bekler
    And Acilan cevapta Aras Tahsilatli’yi kimler kullanabilir? sorusuna cevap verildigini dogrular
    But kullanici 1 saniye bekler
    And sayfayi kapatir

  Scenario: TC05 Musteri Iliskileri sekmesindeki SSS ulasabilme islemi

    And E-Odeme ile ilgili Sikca Sorulan Sorular kismina gelir
    But kullanici 1 saniye bekler
    And Aras e-odeme nedir? butonunun uzerine tiklar
    But kullanici 1 saniye bekler
    And Acilan cevapta Aras e-odeme nedir? sorusuna cevap verildigini dogrular
    But kullanici 1 saniye bekler
    And sayfayi kapatir

  Scenario: TC06 Musteri Iliskileri sekmesindeki SSS ulasabilme islemi

    And E-Odeme ile ilgili Sikca Sorulan Sorular kismina gelir
    But kullanici 1 saniye bekler
    And Otomatik odeme talimati verebilir miyim? butonunun uzerine tiklar
    But kullanici 3 saniye bekler
    And Acilan cevapta Otomatik odeme talimati verebilir miyim? sorusuna cevap verildigini dogrular
    But kullanici 3 saniye bekler
    And sayfayi kapatir
