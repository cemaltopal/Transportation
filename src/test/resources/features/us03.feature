@us03Nermin
Feature:
  Background:
    Given kullanici "url" sayfasina gider
    Then Cikan pop-up’i kapatir
    But kullanici 1 saniye bekler
    And Dashboard’daki Is Ortagimiz Olun Yazisinin Uzerine Gelir ve Seceneklerin Acildigini Gorur
    But kullanici 1 saniye bekler
    And Acilan seceneklerden Acentemiz Olun butonuna tiklar
    But kullanici 1 saniye bekler
    And Acentemiz Olun sayfasinin acildigini dogrular
    But kullanici 1 saniye bekler
    And Acilan sayfada Hemen Basvur butonuna tiklar
    But kullanici 1 saniye bekler
    And Acente Basvuru Formu kismina geldigini dogrular
    But kullanici 1 saniye bekler
    And Basvuru ilinizi secin-yazin kismina tiklar
    But kullanici 1 saniye bekler

  Scenario: TC01 Acentemiz Olun – Basarili Basvuru Islemi

    And Basvuru ilini secer-yazar Adana
    But kullanici 1 saniye bekler
    And Lokasyon Ekle butonuna tiklar
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz isim kismina "<isim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz soyisim kismina "<soyisim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz yas kismina "<yas>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz telefon numarasi kismina "<telefon numarasi>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz eposta kismina "<email>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kisminda egitim durumu Lisans Ustu secer
    But kullanici 10 saniye bekler
    And Basvurunu Gonder butonuna tiklar
    But kullanici 10 saniye bekler
    And Basvurunuz ilgili ekiplerimiz ile paylasilmistir, tesekkur ederiz yazisini goruntuler
    But kullanici 1 saniye bekler
    And Basarili bir sekilde basvuru yapildigini dogrular
    And sayfayi kapatir


  @tc02
  Scenario: TC02 Acentemiz Olun – Basarisiz Basvuru Islemi

    And Basvuru ilini secer-yazar Ankara
    But kullanici 1 saniye bekler
    And Lokasyon Ekle butonuna tiklar
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kismina isim girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz soyisim kismina "<soyisim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz yas kismina "<yas>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz telefon numarasi kismina "<telefon numarasi>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz eposta kismina "<email>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kisminda egitim durumu Lisans secer
    But kullanici 1 saniye bekler
    And Basvurunu Gonder butonuna tiklar
    But kullanici 1 saniye bekler
    And Lutfen gerekli-hatali alanlari kontrol ediniz yazili hata mesajini alir
    But kullanici 5 saniye bekler
    And Minimum 2 karakter olmalidir yazili hata mesajini gorur
    But kullanici 5 saniye bekler
    And Basvuru isleminin tamamlanmadigini dogrular
    And sayfayi kapatir

  Scenario: TC03 Acentemiz Olun – Basarisiz Basvuru Islemi

    And Basvuru ilini secer-yazar Denizli
    But kullanici 1 saniye bekler
    And Lokasyon Ekle butonuna tiklar
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz isim kismina "<isim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kismina soyisim girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz yas kismina "<yas>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz telefon numarasi kismina "<telefon numarasi>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz eposta kismina "<email>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kisminda egitim durumu On Lisans secer
    But kullanici 1 saniye bekler
    And Basvurunu Gonder butonuna tiklar
    But kullanici 1 saniye bekler
    And Lutfen gerekli-hatali alanlari kontrol ediniz yazili hata mesajini alir
    But kullanici 1 saniye bekler
    And Minimum 2 karakter olmalidir yazili hata mesajini gorur
    But kullanici 1 saniye bekler
    And Basvuru isleminin tamamlanmadigini dogrular
    And sayfayi kapatir

  Scenario: TC04 Acentemiz Olun – Basarisiz Basvuru Islemi

    And Basvuru ilini secer-yazar Eskisehir
    But kullanici 1 saniye bekler
    And Lokasyon Ekle butonuna tiklar
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz isim kismina "<isim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz soyisim kismina "<soyisim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kismina yas girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz telefon numarasi kismina "<telefon numarasi>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz eposta kismina "<email>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kisminda egitim durumu Ortaokul-Lise secer
    But kullanici 1 saniye bekler
    And Basvurunu Gonder butonuna tiklar
    But kullanici 1 saniye bekler
    And Lutfen gerekli-hatali alanlari kontrol ediniz yazili hata mesajini alir
    But kullanici 1 saniye bekler
    And Minimum 18 karakter olmalidir yazili hata mesajini gorur
    But kullanici 1 saniye bekler
    And Basvuru isleminin tamamlanmadigini dogrular
    And sayfayi kapatir

  Scenario: TC05 Acentemiz Olun – Basarisiz Basvuru Islemi

    And Basvuru ilini secer-yazar Istanbul
    But kullanici 1 saniye bekler
    And Lokasyon Ekle butonuna tiklar
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz isim kismina "<isim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz soyisim kismina "<soyisim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz yas kismina "<yas>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kismina telefon numarasi girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz eposta kismina "<email>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kisminda egitim durumu Ortaokul-Lise secer
    But kullanici 1 saniye bekler
    And Basvurunu Gonder butonuna tiklar
    But kullanici 1 saniye bekler
    And Lutfen gerekli-hatali alanlari kontrol ediniz yazili hata mesajini alir
    But kullanici 1 saniye bekler
    And Lutfen gecerli bir cep telefonu numarasi giriniz yazili hata mesajini gorur
    But kullanici 1 saniye bekler
    And Basvuru isleminin tamamlanmadigini dogrular
    And sayfayi kapatir


  Scenario: TC06 Acentemiz Olun – Basarisiz Basvuru Islemi

    And Basvuru ilini secer-yazar Izmir
    But kullanici 1 saniye bekler
    And Lokasyon Ekle butonuna tiklar
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz isim kismina "<isim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz soyisim kismina "<soyisim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz yas kismina "<yas>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz telefon numarasi kismina "<telefon numarasi>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kismina email girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kisminda egitim durumu Ortaokul-Lise secer
    But kullanici 1 saniye bekler
    And Basvurunu Gonder butonuna tiklar
    But kullanici 1 saniye bekler
    And Lutfen gerekli-hatali alanlari kontrol ediniz yazili hata mesajini alir
    But kullanici 1 saniye bekler
    And Lutfen gecerli bir mail adresi giriniz yazili hata mesajini gorur
    But kullanici 1 saniye bekler
    And Basvuru isleminin tamamlanmadigini dogrular
    And sayfayi kapatir

  Scenario: TC07 Acentemiz Olun – Basarisiz Basvuru Islemi

    And Basvuru ilini secer-yazar Tekirdag
    But kullanici 1 saniye bekler
    And Lokasyon Ekle butonuna tiklar
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz isim kismina "<isim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz soyisim kismina "<soyisim>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz yas kismina "<yas>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz telefon numarasi kismina "<telefon numarasi>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz eposta kismina "<email>" girer
    But kullanici 1 saniye bekler
    And Kisisel Bilgileriniz kisminda egitim durumu Ortaokul-Lise secer
    But kullanici 1 saniye bekler
    And Basvurunu Gonder butonuna tiklar
    But kullanici 1 saniye bekler
    And Lutfen gerekli-hatali alanlari kontrol ediniz yazili hata mesajini alir
    But kullanici 1 saniye bekler
    And Guvenlik kodu eksik ya da hatali yazili hata mesajini gorur
    And sayfayi kapatir
